package com.google.android.libraries.p1963i;

import java.util.concurrent.Callable;
import java.util.concurrent.RunnableScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;

/* renamed from: com.google.android.libraries.i.n */
/* compiled from: PG */
final class C23910n extends ScheduledThreadPoolExecutor {
    public C23910n(ThreadFactory threadFactory) {
        super(1, threadFactory);
    }

    /* access modifiers changed from: protected */
    public final RunnableScheduledFuture decorateTask(Runnable runnable, RunnableScheduledFuture runnableScheduledFuture) {
        return C23844as.m44394b(runnableScheduledFuture);
    }

    /* access modifiers changed from: protected */
    public final RunnableScheduledFuture decorateTask(Callable callable, RunnableScheduledFuture runnableScheduledFuture) {
        return C23844as.m44394b(runnableScheduledFuture);
    }
}
