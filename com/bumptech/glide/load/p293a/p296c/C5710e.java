package com.bumptech.glide.load.p293a.p296c;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* renamed from: com.bumptech.glide.load.a.c.e */
/* compiled from: PG */
public final class C5710e implements ExecutorService {

    /* renamed from: a */
    public static final long f17198a = TimeUnit.SECONDS.toMillis(10);

    /* renamed from: b */
    private static volatile int f17199b;

    /* renamed from: c */
    private final ExecutorService f17200c;

    public C5710e(ExecutorService executorService) {
        this.f17200c = executorService;
    }

    /* renamed from: a */
    public static int m14790a() {
        if (f17199b == 0) {
            f17199b = Math.min(4, Runtime.getRuntime().availableProcessors());
        }
        return f17199b;
    }

    /* renamed from: b */
    public static C5706a m14791b() {
        C5706a aVar = new C5706a(false);
        int a = m14790a();
        aVar.f17189a = a;
        aVar.f17190b = a;
        aVar.f17191c = "source";
        return aVar;
    }

    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        return this.f17200c.awaitTermination(j, timeUnit);
    }

    public final void execute(Runnable runnable) {
        this.f17200c.execute(runnable);
    }

    public final List invokeAll(Collection collection) {
        return this.f17200c.invokeAll(collection);
    }

    public final Object invokeAny(Collection collection) {
        return this.f17200c.invokeAny(collection);
    }

    public final boolean isShutdown() {
        return this.f17200c.isShutdown();
    }

    public final boolean isTerminated() {
        return this.f17200c.isTerminated();
    }

    public final void shutdown() {
        this.f17200c.shutdown();
    }

    public final List shutdownNow() {
        return this.f17200c.shutdownNow();
    }

    public final Future submit(Runnable runnable) {
        return this.f17200c.submit(runnable);
    }

    public final String toString() {
        return this.f17200c.toString();
    }

    public final List invokeAll(Collection collection, long j, TimeUnit timeUnit) {
        return this.f17200c.invokeAll(collection, j, timeUnit);
    }

    public final Object invokeAny(Collection collection, long j, TimeUnit timeUnit) {
        return this.f17200c.invokeAny(collection, j, timeUnit);
    }

    public final Future submit(Runnable runnable, Object obj) {
        return this.f17200c.submit(runnable, obj);
    }

    public final Future submit(Callable callable) {
        return this.f17200c.submit(callable);
    }
}
