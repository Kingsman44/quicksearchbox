package com.google.android.libraries.assistant.accessory.p618b;

import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.libraries.assistant.accessory.b.l */
/* compiled from: PG */
public final class C11007l extends ThreadPoolExecutor implements C60887da {
    public C11007l(TimeUnit timeUnit) {
        super(1, 1, 0, timeUnit, new PriorityBlockingQueue(100));
    }

    /* renamed from: a */
    public final C60870cx mo19398a(Runnable runnable) {
        return (C60870cx) super.submit(runnable);
    }

    /* renamed from: b */
    public final C60870cx mo19399b(Callable callable) {
        return (C60870cx) super.submit(callable);
    }

    /* renamed from: c */
    public final C60870cx mo19400c(Runnable runnable, Object obj) {
        return (C60870cx) super.submit(runnable, obj);
    }

    /* access modifiers changed from: protected */
    public final RunnableFuture newTaskFor(Runnable runnable, Object obj) {
        if (runnable instanceof C11006k) {
            return (C11006k) runnable;
        }
        return new C11006k(runnable, (Integer) 100);
    }

    public final /* synthetic */ Future submit(Runnable runnable) {
        return (C60870cx) super.submit(runnable);
    }

    public final /* synthetic */ Future submit(Runnable runnable, Object obj) {
        return (C60870cx) super.submit(runnable, obj);
    }

    public final /* synthetic */ Future submit(Callable callable) {
        return (C60870cx) super.submit(callable);
    }

    /* access modifiers changed from: protected */
    public final RunnableFuture newTaskFor(Callable callable) {
        return new C11006k(callable, (Integer) 100);
    }
}
