package com.google.ads.interactivemedia.p367v3.internal;

import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.ads.interactivemedia.v3.internal.atj */
/* compiled from: PG */
public class atj extends AbstractExecutorService implements ats {

    /* renamed from: a */
    private final ExecutorService f21542a;

    public atj() {
    }

    /* renamed from: a */
    public final atr submit(Callable callable) {
        return (atr) super.submit(callable);
    }

    public boolean awaitTermination(long j, TimeUnit timeUnit) {
        return this.f21542a.awaitTermination(j, timeUnit);
    }

    public void execute(Runnable runnable) {
        this.f21542a.execute(runnable);
    }

    public boolean isShutdown() {
        return this.f21542a.isShutdown();
    }

    public boolean isTerminated() {
        return this.f21542a.isTerminated();
    }

    /* access modifiers changed from: protected */
    public final RunnableFuture newTaskFor(Runnable runnable, Object obj) {
        return atw.m19633q(runnable, obj);
    }

    public void shutdown() {
        this.f21542a.shutdown();
    }

    public List shutdownNow() {
        return this.f21542a.shutdownNow();
    }

    public final /* bridge */ /* synthetic */ Future submit(Runnable runnable) {
        return (atr) super.submit(runnable);
    }

    public final /* bridge */ /* synthetic */ Future submit(Runnable runnable, Object obj) {
        return (atr) super.submit(runnable, obj);
    }

    public atj(ExecutorService executorService) {
        this();
        aqd.m19282j(executorService);
        this.f21542a = executorService;
    }

    /* access modifiers changed from: protected */
    public final RunnableFuture newTaskFor(Callable callable) {
        return atw.m19632p(callable);
    }
}
