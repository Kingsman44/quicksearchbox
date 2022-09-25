package com.google.assistant.p3886c;

/* renamed from: com.google.assistant.c.ck */
/* compiled from: PG */
public final class C50787ck {
    /* renamed from: a */
    public static /* synthetic */ String m85932a(int i) {
        switch (i) {
            case 1:
                return "UNDEFINED";
            case 2:
                return "USER_INITIATE_DISMISS";
            case 3:
                return "AA_SETTING";
            case 4:
                return "SEND_FEEDBACK";
            case 5:
                return "THUMB_UP";
            case 6:
                return "THUMB_DOWN";
            default:
                return "null";
        }
    }

    /* renamed from: b */
    public static int m85933b(int i) {
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
        if (i != 4) {
            return i != 5 ? 0 : 6;
        }
        return 5;
    }
}
