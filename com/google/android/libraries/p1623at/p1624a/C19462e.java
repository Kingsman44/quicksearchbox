package com.google.android.libraries.p1623at.p1624a;

import p3186j$.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.libraries.at.a.e */
/* compiled from: PG */
final class C19462e implements C19460c {

    /* renamed from: a */
    private final ConcurrentHashMap f54411a = new ConcurrentHashMap();

    /* renamed from: a */
    public final Object mo24651a(Object obj) {
        Object obj2 = this.f54411a.get(obj);
        if (obj2 != null) {
            return obj2;
        }
        this.f54411a.putIfAbsent(obj, new Object());
        return this.f54411a.get(obj);
    }
}
