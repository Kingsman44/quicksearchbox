package com.google.assistant.p4016z;

/* renamed from: com.google.assistant.z.bl */
/* compiled from: PG */
public enum C53714bl {
    INFERENCE_START,
    SCREEN_STATE,
    LOCATION_UPDATE,
    HEADSET_STATE,
    RESET,
    FLASHLIGHT_STATE,
    LAUNCHER_VISIBILITY,
    SEMANTIC_LOCATION,
    PCP_EVENT,
    CSL_STATE,
    SETTINGS_CHANGE,
    EVENT_NOT_SET;

    /* renamed from: a */
    public static C53714bl m86892a(int i) {
        switch (i) {
            case 0:
                return EVENT_NOT_SET;
            case 1:
                return INFERENCE_START;
            case 2:
                return SCREEN_STATE;
            case 3:
                return LOCATION_UPDATE;
            case 4:
                return HEADSET_STATE;
            case 7:
                return RESET;
            case 9:
                return FLASHLIGHT_STATE;
            case 10:
                return LAUNCHER_VISIBILITY;
            case 12:
                return SEMANTIC_LOCATION;
            case 13:
                return PCP_EVENT;
            case 14:
                return CSL_STATE;
            case 15:
                return SETTINGS_CHANGE;
            default:
                return null;
        }
    }
}
