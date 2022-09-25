package com.android.launcher3;

import android.os.Handler;
import android.os.Looper;
import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
public final class MainThreadExecutor extends AbstractExecutorService {
    private final Handler mHandler = new Handler(Looper.getMainLooper());

    @Deprecated
    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    public final void execute(Runnable runnable) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            runnable.run();
        } else {
            this.mHandler.post(runnable);
        }
    }

    public final boolean isShutdown() {
        return false;
    }

    public final boolean isTerminated() {
        return false;
    }

    @Deprecated
    public final void shutdown() {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final List shutdownNow() {
        throw new UnsupportedOperationException();
    }
}
