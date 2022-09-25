package com.google.common.util.concurrent;

import com.google.common.p4522b.C58443ff;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.common.util.concurrent.bt */
/* compiled from: PG */
public abstract class C60839bt extends C58443ff implements ExecutorService {
    protected C60839bt() {
    }

    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        return mo29169i().awaitTermination(j, timeUnit);
    }

    public void execute(Runnable runnable) {
        mo29169i().execute(runnable);
    }

    /* access modifiers changed from: protected */
    /* renamed from: hU */
    public /* bridge */ /* synthetic */ Object mo5948hU() {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public abstract ExecutorService mo29169i();

    public final List invokeAll(Collection collection) {
        return mo29169i().invokeAll(collection);
    }

    public final Object invokeAny(Collection collection) {
        return mo29169i().invokeAny(collection);
    }

    public final boolean isShutdown() {
        return mo29169i().isShutdown();
    }

    public final boolean isTerminated() {
        return mo29169i().isTerminated();
    }

    public void shutdown() {
        mo29169i().shutdown();
    }

    public List shutdownNow() {
        return mo29169i().shutdownNow();
    }

    public Future submit(Runnable runnable) {
        return mo29169i().submit(runnable);
    }

    public final List invokeAll(Collection collection, long j, TimeUnit timeUnit) {
        return mo29169i().invokeAll(collection, j, timeUnit);
    }

    public final Object invokeAny(Collection collection, long j, TimeUnit timeUnit) {
        return mo29169i().invokeAny(collection, j, timeUnit);
    }

    public Future submit(Runnable runnable, Object obj) {
        return mo29169i().submit(runnable, obj);
    }

    public Future submit(Callable callable) {
        return mo29169i().submit(callable);
    }
}
