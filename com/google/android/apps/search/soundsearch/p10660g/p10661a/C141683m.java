package com.google.android.apps.search.soundsearch.p10660g.p10661a;

/* renamed from: com.google.android.apps.search.soundsearch.g.a.m */
/* compiled from: PG */
public final class C141683m {
    /* renamed from: a */
    public static /* synthetic */ String m229902a(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "CANCELLED" : "NO_MATCH" : "ERROR" : "SUCCESS" : "IN_PROGRESS" : "UNSPECIFIED";
    }

    /* renamed from: b */
    public static int m229903b(int i) {
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
