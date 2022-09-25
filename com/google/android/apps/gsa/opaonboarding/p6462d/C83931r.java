package com.google.android.apps.gsa.opaonboarding.p6462d;

/* renamed from: com.google.android.apps.gsa.opaonboarding.d.r */
/* compiled from: PG */
public final class C83931r {
    /* renamed from: a */
    public static /* synthetic */ String m133680a(int i) {
        switch (i) {
            case 1:
                return "UNSPECIFIED";
            case 2:
                return "UNSCOPED";
            case 3:
                return "OPA_ANDROID";
            case 4:
                return "ANDROID_SUW";
            case 5:
                return "BISTO";
            case 6:
                return "OPA_ANDROID_AUTO";
            default:
                return "null";
        }
    }

    /* renamed from: b */
    public static int m133681b(int i) {
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
