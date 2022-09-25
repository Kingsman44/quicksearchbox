package com.google.apps.tiktok.tracing;

import java.util.WeakHashMap;

/* renamed from: com.google.apps.tiktok.tracing.y */
/* compiled from: PG */
public final class C47865y {

    /* renamed from: a */
    public static final /* synthetic */ int f123933a = 0;

    /* renamed from: b */
    private static final WeakHashMap f123934b = new WeakHashMap();

    static {
        new WeakHashMap();
    }

    /* renamed from: a */
    public static void m85085a(Throwable th) {
        WeakHashMap weakHashMap = f123934b;
        synchronized (weakHashMap) {
            weakHashMap.put(th, true);
        }
    }
}
