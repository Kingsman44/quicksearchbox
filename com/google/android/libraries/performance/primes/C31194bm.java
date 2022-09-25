package com.google.android.libraries.performance.primes;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.libraries.performance.primes.bm */
/* compiled from: PG */
final class C31194bm implements ThreadFactory {

    /* renamed from: a */
    public final int f84099a;

    /* renamed from: b */
    private final AtomicInteger f84100b = new AtomicInteger(1);

    /* renamed from: c */
    private final String f84101c;

    public C31194bm(int i) {
        this.f84099a = i;
        this.f84101c = "Primes";
    }

    public final Thread newThread(Runnable runnable) {
        C31193bl blVar = new C31193bl(this, runnable);
        String str = this.f84101c;
        int andIncrement = this.f84100b.getAndIncrement();
        Thread thread = new Thread(blVar, str + "-" + andIncrement);
        if (thread.isDaemon()) {
            thread.setDaemon(false);
        }
        return thread;
    }
}
