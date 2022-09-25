package org.chromium.net.p5647a;

import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;

/* renamed from: org.chromium.net.a.m */
/* compiled from: PG */
final class C72429m implements Executor {

    /* renamed from: a */
    public boolean f192645a;

    /* renamed from: b */
    private final BlockingQueue f192646b = new LinkedBlockingQueue();

    /* renamed from: c */
    private boolean f192647c;

    /* renamed from: d */
    private InterruptedIOException f192648d;

    /* renamed from: e */
    private RuntimeException f192649e;

    /* renamed from: b */
    private final Runnable m107117b(boolean z, long j) {
        Runnable runnable;
        if (!z) {
            try {
                runnable = (Runnable) this.f192646b.take();
            } catch (InterruptedException e) {
                InterruptedIOException interruptedIOException = new InterruptedIOException();
                interruptedIOException.initCause(e);
                throw interruptedIOException;
            }
        } else {
            runnable = (Runnable) this.f192646b.poll(j, TimeUnit.NANOSECONDS);
        }
        if (runnable != null) {
            return runnable;
        }
        throw new SocketTimeoutException();
    }

    /* renamed from: a */
    public final void mo64156a(int i) {
        long nanoTime = System.nanoTime();
        long convert = TimeUnit.NANOSECONDS.convert((long) i, TimeUnit.MILLISECONDS);
        if (this.f192647c) {
            InterruptedIOException interruptedIOException = this.f192648d;
            if (interruptedIOException != null) {
                throw interruptedIOException;
            }
            throw this.f192649e;
        } else if (!this.f192645a) {
            this.f192645a = true;
            while (this.f192645a) {
                if (i == 0) {
                    try {
                        m107117b(false, 0).run();
                    } catch (InterruptedIOException e) {
                        this.f192645a = false;
                        this.f192647c = true;
                        this.f192648d = e;
                        throw e;
                    } catch (RuntimeException e2) {
                        this.f192645a = false;
                        this.f192647c = true;
                        this.f192649e = e2;
                        throw e2;
                    }
                } else {
                    m107117b(true, (convert - System.nanoTime()) + nanoTime).run();
                }
            }
        } else {
            throw new IllegalStateException("Cannot run loop when it is already running.");
        }
    }

    public final void execute(Runnable runnable) {
        if (runnable != null) {
            try {
                this.f192646b.put(runnable);
            } catch (InterruptedException e) {
                throw new RejectedExecutionException(e);
            }
        } else {
            throw new IllegalArgumentException();
        }
    }
}
