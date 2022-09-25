package com.google.android.apps.search.assistant.platform.p9080f.p9123l;

/* renamed from: com.google.android.apps.search.assistant.platform.f.l.c */
/* compiled from: PG */
public final class C120810c {
    /* renamed from: a */
    public static /* synthetic */ String m200012a(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "null" : "PREFETCH_NOT_SET" : "SINGLE_SHOT" : "SPEECH";
    }

    /* renamed from: b */
    public static int m200013b(int i) {
        if (i == 0) {
            return 3;
        }
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                return 0;
            }
        }
        return i2;
    }
}
