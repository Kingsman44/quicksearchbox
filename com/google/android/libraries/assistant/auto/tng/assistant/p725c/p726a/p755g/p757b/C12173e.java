package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p726a.p755g.p757b;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.a.g.b.e */
/* compiled from: PG */
public final class C12173e {
    /* renamed from: a */
    public static /* synthetic */ String m28082a(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "ONLINE_FALLBACK_TO_OFFLINE" : "OFFLINE_ONLY" : "ONLINE_ONLY" : "UNKNOWN";
    }

    /* renamed from: b */
    public static int m28083b(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i != 2) {
            return i != 3 ? 0 : 4;
        }
        return 3;
    }
}
