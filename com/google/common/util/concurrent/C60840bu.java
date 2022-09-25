package com.google.common.util.concurrent;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.common.util.concurrent.bu */
/* compiled from: PG */
final class C60840bu extends C60838bs {

    /* renamed from: a */
    private final C60870cx f164925a;

    public C60840bu(C60870cx cxVar) {
        cxVar.getClass();
        this.f164925a = cxVar;
    }

    /* renamed from: b */
    public final void mo4106b(Runnable runnable, Executor executor) {
        this.f164925a.mo4106b(runnable, executor);
    }

    public final boolean cancel(boolean z) {
        return this.f164925a.cancel(z);
    }

    public final Object get() {
        return this.f164925a.get();
    }

    public final boolean isCancelled() {
        return this.f164925a.isCancelled();
    }

    public final boolean isDone() {
        return this.f164925a.isDone();
    }

    public final String toString() {
        return this.f164925a.toString();
    }

    public final Object get(long j, TimeUnit timeUnit) {
        return this.f164925a.get(j, timeUnit);
    }
}
