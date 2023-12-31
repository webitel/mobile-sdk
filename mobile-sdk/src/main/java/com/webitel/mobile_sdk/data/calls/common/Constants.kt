package com.webitel.mobile_sdk.data.calls.common

internal interface Constants {
    val ACTION_MAKE_CALL: String
        get() = "action_make_call_w"
    val ACTION_INCOMING_CALL_PUSH: String
        get() = "action_incoming_call_w"
    val ACTION_ANSWER_CALL: String
        get() = "action_answer_call_w"
    val ACTION_HANGUP_CALL: String
        get() = "action_hangup_call_w"
    val ACTION_TRANSFER_CALL: String
        get() = "action_transfer_call_w"
    val ACTION_SEND_DTMF: String
        get() = "action_send_dtmf_w"
    val ACTION_TOGGLE_HOLD: String
        get() = "action_toggle_hold_w"
    val ACTION_TOGGLE_MUTE: String
        get() = "action_toggle_mute_w"
    val ACTION_TOGGLE_SPEAKER: String
        get() = "action_toggle_speaker_w"
    val ACTION_SEND_ALL_CALLS: String
        get() = "action_send_all_calls_w"
    val ACTION_LOGOUT_ACCOUNT: String
        get() = "action_logout_account_w"
    val ACTION_SEND_CALL_BY_ID: String
        get() = "action_send_call_by_id_w"

    val BR_CREATE_OUTGOIN_CALL_W: String
        get() = "br_create_outgoing_call_w"
    val BR_CREATE_INCOMING_CALL_W: String
        get() = "br_create_incoming_call_w"
    val BR_CREATE_OUTGOIN_CALL_FAILED_W: String
        get() = "br_create_outgoing_call_failed_w"
    val BR_CREATE_INCOMING_CALL_FAILED_W: String
        get() = "br_create_incoming_call_failed_w"
    val BR_CONNECTION_DESTROYED_W: String
        get() = "br_connection_destroyed_w"
    val BR_SEND_DTMF: String
        get() = "br_send_dtmf_w"
    val BR_CALL_STATE_W: String
        get() = "br_call_state_w"
    val BR_ALL_CALLS_W: String
        get() = "br_all_calls_w"
    val BR_ANSWER_CALL_W: String
        get() = "br_answer_call_w"
    val BR_MISSED_CALL_W: String
        get() = "br_missed_call_w"

    val PARAM_NUMBER: String
        get() = "param_number_w"
    val PARAM_NAME: String
        get() = "param_name_w"
    val PARAM_CALL_ID: String
        get() = "param_callId_w"
    val PARAM_DTMF: String
        get() = "param_dtmf_w"
    val PARAM_MESSAGE: String
        get() = "param_message_w"
    val PARAM_CALL_STATE: String
        get() = "param_call_state_w"
    val PARAM_HISTORY_DTMF: String
        get() = "param_history_dtmf_w"
    val PARAM_CALLS: String
        get() = "param_calls_w"
    val PARAM_PUSH_INFO: String
        get() = "param_push_info_w"
    val PARAM_OUTGOING_CALL_INFO: String
        get() = "param_outl_info_w"
    val PARAM_SETTINGS: String
        get() = "param_settings_w"
    val PARAM_SIP_CONFIG: String
        get() = "param_sip_config_w"
    val PARAM_CREDENTIALS: String
        get() = "param_credentials_w"
    val PARAM_AUTO_ANSWER: String
        get() = "param_auto_answer_w"
}