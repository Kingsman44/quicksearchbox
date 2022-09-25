package com.google.android.libraries.assistant.auto.tng.morris.p1071e;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.e.ji */
/* compiled from: PG */
public enum C14441ji {
    CALL_STATE_CHANGED,
    CALL_AUDIO_STATE_CHANGED,
    CALL_AVAILABLE_AUDIO_ROUTES_CHANGED,
    USER_TRIGGERED_ACCEPT_CALL,
    USER_TRIGGERED_DECLINE_CALL,
    USER_TRIGGERED_DISMISS_CALL,
    USER_TRIGGERED_END_CALL,
    USER_TRIGGERED_DIAL_CALL,
    USER_TRIGGERED_TOGGLE_HOLD_CALL,
    USER_TRIGGERED_TOGGLE_MUTE_CALL,
    USER_TRIGGERED_TAP_AUDIO_ROUTE_BUTTON,
    USER_TRIGGERED_SET_AUDIO_ROUTE,
    USER_TRIGGERED_DIALER_NUMERIC_BUTTON,
    ANNOUNCE_CALL,
    RESTORE_RING,
    USER_TRIGGERED_COLLAPSE_TO_PHONE_ICON,
    USER_TRIGGERED_EXPAND_TO_PHONE_TASK,
    PHONE_ERROR_EVENT,
    TTS_STARTED,
    USER_TRIGGERED_CALL_VOICEMAIL,
    USER_TRIGGERED_HIDE_AUDIO_OUTPUT_PICKER_TASK,
    USER_TRIGGERED_SHOW_FULLSCREEN_CALL_CENTER,
    PHONEEVENT_NOT_SET;

    /* renamed from: a */
    public static C14441ji m30621a(int i) {
        switch (i) {
            case 0:
                return PHONEEVENT_NOT_SET;
            case 1:
                return CALL_STATE_CHANGED;
            case 2:
                return CALL_AUDIO_STATE_CHANGED;
            case 3:
                return USER_TRIGGERED_ACCEPT_CALL;
            case 4:
                return USER_TRIGGERED_DECLINE_CALL;
            case 5:
                return USER_TRIGGERED_END_CALL;
            case 6:
                return USER_TRIGGERED_DIAL_CALL;
            case 7:
                return USER_TRIGGERED_TOGGLE_HOLD_CALL;
            case 8:
                return USER_TRIGGERED_TOGGLE_MUTE_CALL;
            case 9:
                return USER_TRIGGERED_SET_AUDIO_ROUTE;
            case 10:
                return USER_TRIGGERED_DIALER_NUMERIC_BUTTON;
            case 11:
                return USER_TRIGGERED_TAP_AUDIO_ROUTE_BUTTON;
            case 12:
                return CALL_AVAILABLE_AUDIO_ROUTES_CHANGED;
            case 13:
                return ANNOUNCE_CALL;
            case 14:
                return USER_TRIGGERED_COLLAPSE_TO_PHONE_ICON;
            case 15:
                return USER_TRIGGERED_EXPAND_TO_PHONE_TASK;
            case 16:
                return PHONE_ERROR_EVENT;
            case 17:
                return TTS_STARTED;
            case 18:
                return RESTORE_RING;
            case 19:
                return USER_TRIGGERED_CALL_VOICEMAIL;
            case 20:
                return USER_TRIGGERED_DISMISS_CALL;
            case 21:
                return USER_TRIGGERED_HIDE_AUDIO_OUTPUT_PICKER_TASK;
            case 22:
                return USER_TRIGGERED_SHOW_FULLSCREEN_CALL_CENTER;
            default:
                return null;
        }
    }
}
