package com.webitel.mobile_sdk.data.chats

import com.webitel.mobile_sdk.domain.DialogListener
import com.webitel.mobile_sdk.domain.Member
import com.webitel.mobile_sdk.domain.Message


internal class DialogListeners {
    private val listeners = arrayListOf<DialogListener>()


    fun onMemberAdded(member: Member) {
        listeners.forEach {
            //it.onMemberAdded(member)
        }
    }


    fun onMemberDeleted(member: Member) {
        listeners.forEach {
            //it.onMemberDeleted(member)
        }
    }


    fun onMessageAdded(message: Message) {
        listeners.forEach {
            it.onMessageAdded(message)
        }
    }


    fun onMessageUpdated(message: Message) {
        listeners.forEach {
            //it.onMessageUpdated(message)
        }
    }


    fun onMessageDeleted(message: Message) {
        listeners.forEach {
            //it.onMessageDeleted(message)
        }
    }


    @Synchronized
    fun addListener(l: DialogListener) {
        if (!listeners.contains(l)) {
            listeners.add(l)
        }
    }


    fun removeListener(l: DialogListener?) {
        listeners.remove(l)
    }


    fun removeAllListeners() {
        listeners.clear()
    }
}