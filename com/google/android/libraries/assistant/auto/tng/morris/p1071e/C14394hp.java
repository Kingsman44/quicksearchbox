package com.google.android.libraries.assistant.auto.tng.morris.p1071e;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.e.hp */
/* compiled from: PG */
public enum C14394hp {
    ASSISTANT_EVENT,
    PHONE_EVENT,
    MESSAGE_EVENT,
    MEDIA_EVENT,
    EXPERIENCE_LAUNCHER_EVENT,
    MEDIA_BROWSE_EVENT,
    MEDIA_PIVOT_EVENT,
    CALL_CENTER_EVENT,
    MESSAGE_CENTER_EVENT,
    SETTINGS_EVENT,
    SUGGESTIONS_EVENT,
    HOME_EVENT,
    CAR_MODE_EVENT,
    DND_EVENT,
    HOST_EVENT,
    BUBBLE_EVENT,
    FEATUREEVENT_NOT_SET;

    /* renamed from: a */
    public static C14394hp m30615a(int i) {
        if (i == 0) {
            return FEATUREEVENT_NOT_SET;
        }
        if (i == 3) {
            return ASSISTANT_EVENT;
        }
        if (i == 4) {
            return PHONE_EVENT;
        }
        if (i == 5) {
            return MESSAGE_EVENT;
        }
        if (i == 6) {
            return MEDIA_EVENT;
        }
        if (i == 7) {
            return EXPERIENCE_LAUNCHER_EVENT;
        }
        switch (i) {
            case 14:
                return MEDIA_BROWSE_EVENT;
            case 15:
                return CALL_CENTER_EVENT;
            case 16:
                return MESSAGE_CENTER_EVENT;
            case 17:
                return SETTINGS_EVENT;
            case 18:
                return SUGGESTIONS_EVENT;
            case 19:
                return HOME_EVENT;
            case 20:
                return MEDIA_PIVOT_EVENT;
            case 21:
                return CAR_MODE_EVENT;
            case 22:
                return DND_EVENT;
            case 23:
                return HOST_EVENT;
            case 24:
                return BUBBLE_EVENT;
            default:
                return null;
        }
    }
}
