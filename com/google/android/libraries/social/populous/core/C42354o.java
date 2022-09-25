package com.google.android.libraries.social.populous.core;

import android.util.Log;
import com.google.common.base.C58838bb;
import com.google.common.util.concurrent.C60856cj;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.libraries.social.populous.core.o */
/* compiled from: PG */
public final class C42354o extends ThreadPoolExecutor {
    private C42354o(int i, int i2, TimeUnit timeUnit, BlockingQueue blockingQueue, ThreadFactory threadFactory) {
        super(i, i2, 60, timeUnit, blockingQueue, threadFactory);
    }

    /* renamed from: a */
    public static C42354o m74607a(int i, TimeUnit timeUnit, ThreadFactory threadFactory) {
        C58838bb.m90869d(i > 0, "maxThreads == 0 is invalid. At least one thread must be created.");
        C42354o oVar = new C42354o(i, i, timeUnit, new LinkedBlockingQueue(), threadFactory);
        oVar.allowCoreThreadTimeOut(true);
        return oVar;
    }

    /* access modifiers changed from: protected */
    public final void afterExecute(Runnable runnable, Throwable th) {
        super.afterExecute(runnable, th);
        if (th == null && (runnable instanceof Future)) {
            Future future = (Future) runnable;
            if (future.isDone()) {
                try {
                    C60856cj.m92909r(future);
                } catch (ExecutionException e) {
                    th = e.getCause();
                } catch (CancellationException unused) {
                    th = null;
                }
            }
        }
        if (th != null) {
            Log.e("PopulousExecutor", "Uncaught exception during Runnable execution.", th);
        }
    }
}
