package com.google.android.apps.gsa.shared.util;

/* renamed from: com.google.android.apps.gsa.shared.util.au */
/* compiled from: PG */
public final class C90737au {
    /* renamed from: a */
    public static String m148206a(int i) {
        String str = "unknown state: " + i;
        switch (i) {
            case 0:
                return "STATE_UNDEFINED";
            case 1:
                return "STATE_INITIALIZING";
            case 2:
                return "STATE_LISTENING";
            case 3:
                return "STATE_RECORDING";
            case 4:
                return "STATE_RECOGNIZING";
            case 5:
                return "STATE_NOT_LISTENING";
            case 6:
                return "STATE_NON_RECOGNITION";
            case 7:
                return "STATE_ERROR";
            case 8:
                return "STATE_PAUSE";
            case 9:
                return "STATE_DONE";
            case 10:
                return "STATE_RECORDING_WITH_RECOGNIZED_TEXT";
            default:
                return str;
        }
    }
}
