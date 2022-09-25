package com.bumptech.glide.load.p293a.p296c;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.bumptech.glide.load.a.c.d */
/* compiled from: PG */
public final class C5709d implements ThreadFactory {

    /* renamed from: a */
    final boolean f17195a;

    /* renamed from: b */
    private final String f17196b;

    /* renamed from: c */
    private final AtomicInteger f17197c = new AtomicInteger();

    public C5709d(String str, boolean z) {
        this.f17196b = str;
        this.f17195a = z;
    }

    public final Thread newThread(Runnable runnable) {
        C5707b bVar = new C5707b(new C5708c(this, runnable));
        String str = this.f17196b;
        int andIncrement = this.f17197c.getAndIncrement();
        bVar.setName("glide-" + str + "-thread-" + andIncrement);
        return bVar;
    }
}
