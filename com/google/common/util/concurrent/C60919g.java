package com.google.common.util.concurrent;

import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.RunnableFuture;

/* renamed from: com.google.common.util.concurrent.g */
/* compiled from: PG */
public abstract class C60919g extends AbstractExecutorService implements C60887da {
    /* renamed from: a */
    public C60870cx submit(Runnable runnable) {
        return (C60870cx) super.submit(runnable);
    }

    /* renamed from: b */
    public C60870cx submit(Callable callable) {
        return (C60870cx) super.submit(callable);
    }

    /* renamed from: c */
    public C60870cx submit(Runnable runnable, Object obj) {
        return (C60870cx) super.submit(runnable, obj);
    }

    /* access modifiers changed from: protected */
    public final RunnableFuture newTaskFor(Runnable runnable, Object obj) {
        return C60915eb.m93031e(runnable, obj);
    }

    /* access modifiers changed from: protected */
    public final RunnableFuture newTaskFor(Callable callable) {
        return new C60915eb(callable);
    }
}
