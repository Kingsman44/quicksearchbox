package com.google.common.util.concurrent;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.common.util.concurrent.dd */
/* compiled from: PG */
public final class C60890dd extends C60919g {

    /* renamed from: a */
    private final Object f164991a = new Object();

    /* renamed from: b */
    private int f164992b = 0;

    /* renamed from: c */
    private boolean f164993c = false;

    /* renamed from: d */
    private final void m92989d() {
        synchronized (this.f164991a) {
            int i = this.f164992b - 1;
            this.f164992b = i;
            if (i == 0) {
                this.f164991a.notifyAll();
            }
        }
    }

    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        long nanos = timeUnit.toNanos(j);
        synchronized (this.f164991a) {
            while (true) {
                if (this.f164993c && this.f164992b == 0) {
                    return true;
                }
                if (nanos <= 0) {
                    return false;
                }
                long nanoTime = System.nanoTime();
                TimeUnit.NANOSECONDS.timedWait(this.f164991a, nanos);
                nanos -= System.nanoTime() - nanoTime;
            }
        }
    }

    public final void execute(Runnable runnable) {
        synchronized (this.f164991a) {
            if (!this.f164993c) {
                this.f164992b++;
            } else {
                throw new RejectedExecutionException("Executor already shutdown");
            }
        }
        try {
            runnable.run();
        } finally {
            m92989d();
        }
    }

    public final boolean isShutdown() {
        boolean z;
        synchronized (this.f164991a) {
            z = this.f164993c;
        }
        return z;
    }

    public final boolean isTerminated() {
        boolean z;
        synchronized (this.f164991a) {
            z = false;
            if (this.f164993c && this.f164992b == 0) {
                z = true;
            }
        }
        return z;
    }

    public final void shutdown() {
        synchronized (this.f164991a) {
            this.f164993c = true;
            if (this.f164992b == 0) {
                this.f164991a.notifyAll();
            }
        }
    }

    public final List shutdownNow() {
        shutdown();
        return Collections.emptyList();
    }
}
