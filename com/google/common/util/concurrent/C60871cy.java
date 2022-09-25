package com.google.common.util.concurrent;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.common.util.concurrent.cy */
/* compiled from: PG */
public final class C60871cy extends FutureTask implements C60870cx {

    /* renamed from: a */
    public final C60829bj f164961a = new C60829bj();

    public C60871cy(Runnable runnable) {
        super(runnable, (Object) null);
    }

    /* renamed from: b */
    public final void mo4106b(Runnable runnable, Executor executor) {
        this.f164961a.mo57297a(runnable, executor);
    }

    /* access modifiers changed from: protected */
    public final void done() {
        this.f164961a.mo57298b();
    }

    public final Object get(long j, TimeUnit timeUnit) {
        long nanos = timeUnit.toNanos(j);
        if (nanos <= 2147483647999999999L) {
            return super.get(j, timeUnit);
        }
        return super.get(Math.min(nanos, 2147483647999999999L), TimeUnit.NANOSECONDS);
    }

    public C60871cy(Callable callable) {
        super(callable);
    }
}
