package com.google.android.libraries.storage.p3304a.p3307c;

import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.Semaphore;
import p3186j$.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.libraries.storage.a.c.p */
/* compiled from: PG */
public final class C42763p {

    /* renamed from: a */
    private final ConcurrentMap f112023a;

    @Deprecated
    public C42763p() {
        this.f112023a = new ConcurrentHashMap();
    }

    public C42763p(ConcurrentMap concurrentMap) {
        this.f112023a = concurrentMap;
    }

    /* renamed from: a */
    public final Semaphore mo45866a(String str) {
        Semaphore semaphore = (Semaphore) this.f112023a.get(str);
        if (semaphore != null) {
            return semaphore;
        }
        this.f112023a.putIfAbsent(str, new Semaphore(1));
        return (Semaphore) this.f112023a.get(str);
    }
}
