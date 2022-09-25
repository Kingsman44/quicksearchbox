package com.google.android.gms.analytics;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.gms.analytics.o */
/* compiled from: PG */
final class C142762o implements ThreadFactory {

    /* renamed from: a */
    private static final AtomicInteger f387397a = new AtomicInteger();

    public final Thread newThread(Runnable runnable) {
        int incrementAndGet = f387397a.incrementAndGet();
        return new C142763p(runnable, "measurement-" + incrementAndGet);
    }
}
