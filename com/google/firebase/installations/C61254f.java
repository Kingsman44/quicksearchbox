package com.google.firebase.installations;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.firebase.installations.f */
/* compiled from: PG */
final class C61254f implements ThreadFactory {

    /* renamed from: a */
    private final AtomicInteger f165683a = new AtomicInteger(1);

    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, String.format("firebase-installations-executor-%d", new Object[]{Integer.valueOf(this.f165683a.getAndIncrement())}));
    }
}
