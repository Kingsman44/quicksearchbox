package com.google.android.libraries.p1963i;

import android.os.Binder;
import android.os.Build;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.libraries.i.o */
/* compiled from: PG */
final class C23911o extends ThreadPoolExecutor {
    public C23911o(int i, int i2, long j, TimeUnit timeUnit, BlockingQueue blockingQueue, ThreadFactory threadFactory) {
        super(i, i2, j, timeUnit, blockingQueue, threadFactory);
    }

    /* access modifiers changed from: protected */
    public final void afterExecute(Runnable runnable, Throwable th) {
        super.afterExecute(runnable, th);
        if (Build.VERSION.SDK_INT < 31) {
            Binder.flushPendingCommands();
        }
    }
}
