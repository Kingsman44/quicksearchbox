package com.google.android.apps.gsa.staticplugins.opa.p8189ak.p8196c.p8199c;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ak.c.c.m */
/* compiled from: PG */
public enum C106285m {
    INITIALIZE_QUERY_EVENT_DATA,
    UPDATE_RECOGNITION_EVENT_DATA,
    COMMIT_RECOGNITION_EVENT_DATA,
    CANCEL_QUERY_EVENT_DATA,
    HANDLE_CONVERSATION_DELTA_EVENT_DATA,
    DESTROY_CONNECTION_EVENT_DATA,
    UPDATE_ASSIST_DATA,
    OPEN_OPA_KEYBOARD_EVENT_DATA,
    OPEN_WARMER_WELCOME_EVENT_DATA,
    REQUEST_OPA_UI_SCREENSHOT_EVENT_DATA,
    OPEN_ZERO_STATE_EVENT_DATA,
    TRACKING_QUERY_REQUEST_ID,
    LOG_APP_FLOW_EVENT_DATA,
    NOTIFY_NGA_TO_OPA_CARD_STATE_EVENT_DATA,
    SPEECH_LEVEL_EVENT_DATA,
    PREWARM_OPA_ACTIVITY_EVENT_DATA,
    LISTENING_STATE_CHANGED_EVENT_DATA,
    OPEN_INTENT_LAUNCHER_EVENT_DATA,
    NGAENTRYPOINTEVENTDATA_NOT_SET;

    /* renamed from: a */
    public static C106285m m177064a(int i) {
        switch (i) {
            case 0:
                return NGAENTRYPOINTEVENTDATA_NOT_SET;
            case 1:
                return INITIALIZE_QUERY_EVENT_DATA;
            case 2:
                return UPDATE_RECOGNITION_EVENT_DATA;
            case 3:
                return COMMIT_RECOGNITION_EVENT_DATA;
            case 4:
                return CANCEL_QUERY_EVENT_DATA;
            case 5:
                return HANDLE_CONVERSATION_DELTA_EVENT_DATA;
            case 6:
                return DESTROY_CONNECTION_EVENT_DATA;
            case 9:
                return UPDATE_ASSIST_DATA;
            case 10:
                return OPEN_OPA_KEYBOARD_EVENT_DATA;
            case 12:
                return OPEN_WARMER_WELCOME_EVENT_DATA;
            case 15:
                return REQUEST_OPA_UI_SCREENSHOT_EVENT_DATA;
            case 16:
                return TRACKING_QUERY_REQUEST_ID;
            case 19:
                return OPEN_ZERO_STATE_EVENT_DATA;
            case 20:
                return LOG_APP_FLOW_EVENT_DATA;
            case 21:
                return NOTIFY_NGA_TO_OPA_CARD_STATE_EVENT_DATA;
            case 22:
                return SPEECH_LEVEL_EVENT_DATA;
            case 23:
                return PREWARM_OPA_ACTIVITY_EVENT_DATA;
            case 24:
                return LISTENING_STATE_CHANGED_EVENT_DATA;
            case 25:
                return OPEN_INTENT_LAUNCHER_EVENT_DATA;
            default:
                return null;
        }
    }
}
