package com.google.android.libraries.assistant.p1467d.p1472c.p1476c;

/* renamed from: com.google.android.libraries.assistant.d.c.c.n */
/* compiled from: PG */
public final class C17912n {
    /* renamed from: a */
    public static /* synthetic */ String m35109a(int i) {
        if (i == 101) {
            return "UNBIND_INTEGRATION_SERVICE";
        }
        switch (i) {
            case 1:
                return "UNKNOWN";
            case 2:
                return "NAVIGATION_STATE_CHANGED";
            case 3:
                return "NIGHT_MODE_STATUS_CHANGED";
            case 4:
                return "SEND_CLIENT_INPUT";
            case 5:
                return "UI_SUPPRESSION_LEVEL_CHANGED";
            case 6:
                return "KEYGUARD_DISMISS_STATUS_CHANGED";
            default:
                return "null";
        }
    }

    /* renamed from: b */
    public static int m35110b(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 3;
        }
        if (i == 3) {
            return 4;
        }
        if (i == 4) {
            return 5;
        }
        if (i != 5) {
            return i != 100 ? 0 : 101;
        }
        return 6;
    }
}
