package com.google.android.libraries.surveys.internal.p3325d;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.libraries.surveys.internal.d.b */
/* compiled from: PG */
final class C43045b implements ThreadFactory {

    /* renamed from: a */
    private final AtomicInteger f112590a = new AtomicInteger(1);

    public final Thread newThread(Runnable runnable) {
        int andIncrement = this.f112590a.getAndIncrement();
        return new Thread(runnable, "Survey #" + andIncrement);
    }
}
