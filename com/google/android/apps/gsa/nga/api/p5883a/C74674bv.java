package com.google.android.apps.gsa.nga.api.p5883a;

/* renamed from: com.google.android.apps.gsa.nga.api.a.bv */
/* compiled from: PG */
public final class C74674bv {
    /* renamed from: a */
    public static /* synthetic */ String m120743a(int i) {
        switch (i) {
            case 2:
                return "UNKNOWN";
            case 3:
                return "ASSISTANT_QUERY_INTERRUPTED";
            case 4:
                return "ASSISTANT_QUERY_CANCELLED";
            case 5:
                return "ASSISTANT_QUERY_REJECTED_BY_LOCAL_ARBITRATION";
            case 6:
                return "ASSISTANT_QUERY_REJECTED_BY_SERVER_ARBITRATION";
            case 7:
                return "ASSISTANT_QUERY_REJECTED_NO_ROHAN_TOKEN";
            default:
                return "UNRECOGNIZED";
        }
    }

    /* renamed from: b */
    public static int m120744b(int i) {
        if (i == 0) {
            return 2;
        }
        if (i == 1) {
            return 3;
        }
        if (i == 2) {
            return 4;
        }
        if (i == 3) {
            return 5;
        }
        if (i != 4) {
            return i != 5 ? 0 : 7;
        }
        return 6;
    }
}
