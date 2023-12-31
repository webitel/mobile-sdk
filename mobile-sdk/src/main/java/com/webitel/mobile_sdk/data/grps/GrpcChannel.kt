package com.webitel.mobile_sdk.data.grps

import io.grpc.ManagedChannel
import io.grpc.ManagedChannelBuilder


internal class GrpcChannel(
    private val config: ChannelConfig
) {

    private val interceptor: GrpcInterceptor
    val channel: ManagedChannel


    init {
        interceptor = GrpcInterceptor(
            deviceId = config.deviceId,
            clientToken = config.clientToken
        )
        channel = ManagedChannelBuilder
            .forAddress(
                config.host, //"dev.webitel.com",
                config.port //443 // 8088 443
            )
            .userAgent(config.agent)
            .intercept(interceptor)
            .build()
    }


     fun isActive(): Boolean {
        return !channel.isShutdown && !channel.isTerminated
    }


    fun equal(c: ChannelConfig): Boolean {
        return config == c
    }


    fun setAccessToken(value: String) {
        interceptor.setAccessToken(value)
    }

    fun getAccessToken(): String {
        return interceptor.getAccessToken()
    }
}