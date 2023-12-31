package com.webitel.mobile_sdk.data.grps

import android.os.Handler
import android.os.HandlerThread
import android.os.Process
import android.util.Log
import com.google.protobuf.Any
import com.google.protobuf.ByteString
import com.webitel.mobile_sdk.data.auth.AccessToken
import com.webitel.mobile_sdk.data.auth.LoginResponse
import com.webitel.mobile_sdk.data.calls.VoiceApi
import com.webitel.mobile_sdk.data.calls.sip.SipConfig
import com.webitel.mobile_sdk.data.portal.UserSession
import com.webitel.mobile_sdk.domain.Member
import com.webitel.mobile_sdk.domain.User
import com.webitel.mobile_sdk.domain.CallbackListener
import com.webitel.mobile_sdk.domain.Code
import com.webitel.mobile_sdk.domain.Error
import com.webitel.mobile_sdk.domain.RegisterResult
import io.grpc.ConnectivityState
import io.grpc.StatusRuntimeException
import io.grpc.stub.StreamObserver
import webitel.portal.Account.Identity
import webitel.portal.Auth
import webitel.portal.Auth.TokenRequest
import webitel.portal.Connect
import webitel.portal.Connect.Echo
import webitel.portal.Connect.Request
import webitel.portal.Connect.Response
import webitel.portal.Connect.Update
import webitel.portal.CustomerGrpc
import webitel.portal.CustomerOuterClass
import webitel.portal.CustomerOuterClass.RegisterDeviceResponse
import webitel.portal.Messages
import webitel.portal.Push
import java.util.Timer
import java.util.TimerTask


internal class ClientGrpc(
    config: ChannelConfig
) : ChatApi, AuthApi, VoiceApi {

    private var chatListener: GrpcChatMessageListener? = null
    private var requestObserver: StreamObserver<Request>? = null
    private var timer: Timer? = null
    private var channel: GrpcChannel

    private val grpcListeners = GrpcListeners()

    private val thread: HandlerThread = HandlerThread(
        "grpc_webitel",
        Process.THREAD_PRIORITY_BACKGROUND
    )

    private val handler: Handler by lazy {
        Handler(thread.looper)
    }


    init {
        channel = GrpcUtils.getChannel(config)
        val connectivityStateWatcher = object : Runnable {
            override fun run() {
                val state = channel.channel.getState(false)

                when (state) {
                    ConnectivityState.CONNECTING -> {
                        //Log.e("state", "CONNECTING")
                    }

                    ConnectivityState.SHUTDOWN -> {
                        //Log.e("state", "SHUTDOWN")
                        return // DISCONNECTED state is final.
                    }

                    ConnectivityState.TRANSIENT_FAILURE -> {
                        //Log.e("state", "TRANSIENT_FAILURE")
                    }

                    ConnectivityState.READY -> {
                        //Log.e("state", "READY")
                        chatListener?.onConnectionReady()
                    }

                    ConnectivityState.IDLE -> {
                        //Log.e("state", "IDLE")
                    }

                    else -> {
                        //Log.e("state", "null")
                        // receive null
                    }
                }

                channel.channel.notifyWhenStateChanged(state, this)
            }
        }
        val state = channel.channel.getState(true)
        channel.channel.notifyWhenStateChanged(state, connectivityStateWatcher)
    }


    override fun inspect(
        callback: CallbackListener<UserSession>
    ) {
        make {
            inspectUnaryRequest(callback)
        }
    }

    override fun registerFcm(token: String, callback: CallbackListener<RegisterResult>) {
        make {
            registerFcmUnaryRequest(token, callback)
        }
    }


    override fun login(
        appToken: String,
        identity: Identity,
        callback: CallbackListener<LoginResponse>
    ) {
        make {
            try {
                resetBackoff()
                val stub = CustomerGrpc.newStub(channel.channel)
                val m = TokenRequest
                    .newBuilder()
                    .setGrantType("identity")
                    .addResponseType("user")
                    .addResponseType("token")
                    .addResponseType("chat")
                    .setAppToken(appToken)
                    .setIdentity(identity)
                    .build()

                stub.token(m, object : StreamObserver<Auth.AccessToken> {

                    override fun onNext(value: Auth.AccessToken?) {
                        if (value != null) {
                            setAccessToken(value.accessToken)
                            val s = buildSessionFromResponse(value)

                            val t = AccessToken(
                                token = value.accessToken,
                                expiresIn = value.expiresIn
                            )

                            callback.onSuccess(
                                LoginResponse(t,s)
                            )
                        } else {
                            callback.onError(
                                Error(
                                    "Auth.AccessToken not found",
                                    code = Code.DATA_LOSS
                                )
                            )
                        }
                    }

                    override fun onError(t: Throwable) {
                        Log.e("Login.onError", t.message.toString())
                        callback.onError(parseError(t))
                    }

                    override fun onCompleted() {}
                })

            } catch (e: Exception) {
                callback.onError(parseError(e))
            }
        }
    }


    override fun logout(
        callback: CallbackListener<Unit>
    ) {
        make {
            try {
                resetBackoff()
                val stub = CustomerGrpc.newStub(channel.channel)
                val m = CustomerOuterClass.LogoutRequest
                    .newBuilder()
                    .build()

                stub.logout(m, object : StreamObserver<Connect.UpdateSignedOut> {
                    override fun onNext(value: Connect.UpdateSignedOut?) {
                        channel.setAccessToken("")
                        callback.onSuccess(Unit)
                    }

                    override fun onError(t: Throwable) {
                        Log.e("Logout.onError", t.message.toString())
                        callback.onError(parseError(t))
                    }

                    override fun onCompleted() {}
                })

            } catch (e: Exception) {
                callback.onError(parseError(e))
            }
        }
    }


    override fun startPing() {
        make {
            startPinging()
        }
    }


    override fun stopPing() {
        make {
            stopPinging()
        }
    }


    override fun sendMessage(request: Request) {
        make {
            postData(request)
        }
    }


    override fun ping(callback: CallbackListener<Unit>) {
        make {
            try {
                resetBackoff()
                val stub = CustomerGrpc.newStub(channel.channel)
                val e = Echo
                    .newBuilder()
                    .build()

                stub.ping(e, object : StreamObserver<Echo> {
                    override fun onNext(value: Echo?) {
                        callback.onSuccess(Unit)
                    }

                    override fun onError(t: Throwable) {
                        callback.onError(parseError(t))
                    }

                    override fun onCompleted() {}
                })

            } catch (e: Exception) {
                callback.onError(parseError(e))
            }
        }
    }


    override fun isStreamOpened(): Boolean {
        val s = channel.channel.getState(true)
        val x = s == ConnectivityState.READY && requestObserver != null
        return x
    }


    override fun isStateReady(requestConnection: Boolean): Boolean {
        val s = channel.channel.getState(requestConnection)
        return s == ConnectivityState.READY
    }


    private fun resetBackoff() {
        val s = channel.channel.getState(true)
        if(s ==  ConnectivityState.TRANSIENT_FAILURE) {
            channel.channel.resetConnectBackoff()
        }
    }


    override fun getSipConfig(callback: CallbackListener<SipConfig>) {
        try {
            resetBackoff()
            val stub = CustomerGrpc.newStub(channel.channel)
            val m = CustomerOuterClass.InspectRequest
                .newBuilder()
                .build()

            stub.inspect(m, object : StreamObserver<Auth.AccessToken> {

                override fun onNext(value: Auth.AccessToken?) {
                    val sip = value?.call
                    if (sip != null) {

                        val s = SipConfig(
                            auth = sip.userId,
                            domain = sip.realm,
                            extension = sip.userId,
                            password = channel.getAccessToken(),
                            proxy = sip.proxy
                        )

                        callback.onSuccess(s)
                    } else {
                        callback.onError(
                            Error(
                                "SIP Config not found",
                                code = Code.DATA_LOSS
                            )
                        )
                    }
                }

                override fun onError(t: Throwable) {
                    Log.e("getSip.onError", t.message.toString())
                    callback.onError(parseError(t))
                }

                override fun onCompleted() {}
            })

        } catch (e: Exception) {
            callback.onError(parseError(e))
        }
    }


    fun setAccessToken(t: String) {
        channel.setAccessToken(t)
    }


    fun setChatListener(l: GrpcChatMessageListener) {
        this.chatListener = l
    }


    fun addListener(l: GrpcListener) {
        this.grpcListeners.addListener(l)
    }


    fun removeListener(l: GrpcListener) {
        this.grpcListeners.removeListener(l)
    }


    fun removeAllListeners() {
        this.grpcListeners.removeAllListeners()
    }


    fun openConnection() {
        checkAndOpenConnection()
    }


    @Synchronized
    private fun postData(request: Request) {
        checkAndOpenConnection()
        requestObserver?.onNext(request)
    }


    @Synchronized
    private fun checkAndOpenConnection() {
        if (requestObserver == null) {
            openBiDirectionalConnect()
        }
    }


    @Synchronized
    private fun stopStream() {
        make {
            val s = requestObserver
            requestObserver = null
            try {
                s?.onCompleted()
            } catch (_: Exception) {
            }
            timer?.cancel()
            timer = null
        }
    }


    private fun registerFcmUnaryRequest(token: String, callback: CallbackListener<RegisterResult>) {
        try {
            resetBackoff()
            val stub = CustomerGrpc.newStub(channel.channel)
            val d = Push.DevicePush.newBuilder().setFCM(token).build()
            val i = CustomerOuterClass.RegisterDeviceRequest
                .newBuilder()
                .setPush(d)
                .build()

            stub.registerDevice(i, object : StreamObserver<RegisterDeviceResponse> {

                override fun onNext(value: RegisterDeviceResponse?) {
                    callback.onSuccess(RegisterResult())
                }

                override fun onError(t: Throwable) {
                    callback.onError(parseError(t))
                }

                override fun onCompleted() {}
            })

        } catch (e: Exception) {
            callback.onError(
                Error(
                    e.message.toString(),
                    code = Code.UNKNOWN
                )
            )
        }
    }


    private fun inspectUnaryRequest(callback: CallbackListener<UserSession>) {
        try {
            resetBackoff()
            val stub = CustomerGrpc.newStub(channel.channel)
            val m = CustomerOuterClass.InspectRequest
                .newBuilder()

                .build()

            stub.inspect(m, object : StreamObserver<Auth.AccessToken> {

                override fun onNext(value: Auth.AccessToken?) {
                    if (value != null) {
                        val s = buildSessionFromResponse(value)
                        callback.onSuccess(s)
                    } else {
                        callback.onError(
                            Error(
                                "Auth.AccessToken not found",
                                code = Code.DATA_LOSS
                            )
                        )
                    }
                }

                override fun onError(t: Throwable) {
                    callback.onError(parseError(t))
                }

                override fun onCompleted() {}
            })

        } catch (e: Exception) {
            callback.onError(
                Error(
                    e.message.toString(),
                    code = Code.UNKNOWN
                )
            )
        }
    }


    private fun buildSessionFromResponse(value: Auth.AccessToken): UserSession {
        val chatAccount = if (value.chat != null && value.chat.user != null) {
            Member(
                id = value.chat.user.id,
                name = value.chat.user.name,
                type = value.chat.user.type
            )
        } else null

        val user = User.Builder(
            iss = value.user.identity.iss,
            sub = value.user.identity.sub,
            name = value.user.identity.name
        )
            .email(value.user.identity.email)
            .emailVerified(value.user.identity.emailVerified)
            .phoneNumber(value.user.identity.phoneNumber)
            .phoneNumberVerified(value.user.identity.phoneNumberVerified)
            .locale(value.user.identity.locale)
            .build()

        return UserSession(
            user = user,
            isChatAvailable = value.scopeList.contains("chat"),
            isVoiceAvailable = value.scopeList.contains("call"),
            chatAccount
        )
    }


    private fun openBiDirectionalConnect() {
        try {
            resetBackoff()
            val stub = CustomerGrpc.newStub(channel.channel)
            requestObserver?.onCompleted()
            requestObserver = stub.connect(object : StreamObserver<Update> {

                override fun onNext(value: Update?) {
                    if (value != null) {
                        parseUpdate(value)
                    }
                }

                override fun onError(t: Throwable) {
                    Log.e("Connect.onError", t.message.toString())
                    stopStream()

                    val e = parseError(t)

                    grpcListeners.onConnectionError(e)
                    chatListener?.onConnectionError(e)
                }


                override fun onCompleted() {
                    stopStream()
                }
            })
        } catch (e: Exception) {
            Log.e("Exception", e.message.toString())
        }
    }


    private fun parseError(t: Throwable): Error {
        return if (t is StatusRuntimeException) {
            Error(
                message = t.status.description ?: t.message.toString(),
                code = Code.forNumber(t.status.code.value())
            )
        } else {
            Error(
                message = t.message.toString(),
                code = Code.UNKNOWN
            )
        }
    }


    private fun parseUpdate(update: Update) {
        if (update.data.`is`(Response::class.java)) {
            val response = update.data.unpack(Response::class.java)
            response?.let {
                grpcListeners.onResponse(it)
                chatListener?.onResponse(it)
            }

        } else if (update.data.`is`(Messages.UpdateNewMessage::class.java)) {
            val message = update.data.unpack(Messages.UpdateNewMessage::class.java)
            message?.let {
                chatListener?.onNewMessage(it)
            }
        }
    }


    private fun startPinging() {
        timer?.cancel()
        timer = Timer()
        timer?.scheduleAtFixedRate(object : TimerTask() {
            override fun run() {
                ping()
            }
        }, 0, 2000)
    }


    private fun stopPinging() {
        timer?.cancel()
        timer = null
    }


    private var pingId = 0
    private fun ping() {
        pingId++
        val m = Echo
            .newBuilder()
            .setData(
                ByteString.copyFromUtf8("ping - $pingId")
            ).build()

        val request = Request.newBuilder()
            .setId(pingId.toString())
            .setPath(CustomerGrpc.getPingMethod().bareMethodName)
            .setData(Any.newBuilder().pack(m))
            .build()

        postData(request)
    }


    private fun make(job: Runnable) {
        if (!thread.isAlive) {
            thread.priority = Thread.MAX_PRIORITY
            thread.start()
        }

        handler.post(job)
    }
}


