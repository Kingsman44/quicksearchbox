package com.google.android.apps.gsa.staticplugins.recently.p8679b;

import android.util.LruCache;

/* renamed from: com.google.android.apps.gsa.staticplugins.recently.b.a */
/* compiled from: PG */
public final class C116025a {

    /* renamed from: c */
    private static C116025a f321717c;

    /* renamed from: a */
    public final LruCache f321718a = new LruCache(20);

    /* renamed from: b */
    public final LruCache f321719b = new LruCache(5);

    private C116025a() {
    }

    /* renamed from: a */
    public static C116025a m192378a() {
        if (f321717c == null) {
            f321717c = new C116025a();
        }
        return f321717c;
    }
}
