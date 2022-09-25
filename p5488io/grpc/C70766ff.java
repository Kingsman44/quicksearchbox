package p5488io.grpc;

import com.google.common.base.C58838bb;
import java.lang.Thread;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: io.grpc.ff */
/* compiled from: PG */
public final class C70766ff implements Executor {

    /* renamed from: a */
    private final Thread.UncaughtExceptionHandler f188582a;

    /* renamed from: b */
    private final Queue f188583b = new ConcurrentLinkedQueue();

    /* renamed from: c */
    private final AtomicReference f188584c = new AtomicReference();

    public C70766ff(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        C58838bb.m90866a(uncaughtExceptionHandler, "uncaughtExceptionHandler");
        this.f188582a = uncaughtExceptionHandler;
    }

    /* renamed from: a */
    public final C70765fe mo62444a(Runnable runnable, long j, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        C70764fd fdVar = new C70764fd(runnable);
        return new C70765fe(fdVar, scheduledExecutorService.schedule(new C70763fc(this, fdVar, runnable), j, timeUnit));
    }

    /* renamed from: b */
    public final void mo62445b() {
        do {
            AtomicReference atomicReference = this.f188584c;
            Thread currentThread = Thread.currentThread();
            while (!atomicReference.compareAndSet((Object) null, currentThread)) {
                if (atomicReference.get() != null) {
                    return;
                }
            }
            while (true) {
                try {
                    Runnable runnable = (Runnable) this.f188583b.poll();
                    if (runnable != null) {
                        runnable.run();
                    } else {
                        this.f188584c.set((Object) null);
                    }
                } catch (Throwable th) {
                    this.f188584c.set((Object) null);
                    throw th;
                }
            }
        } while (!this.f188583b.isEmpty());
    }

    /* renamed from: c */
    public final void mo62446c(Runnable runnable) {
        Queue queue = this.f188583b;
        C58838bb.m90866a(runnable, "runnable is null");
        queue.add(runnable);
    }

    /* renamed from: d */
    public final void mo62447d() {
        C58838bb.m90884s(Thread.currentThread() == this.f188584c.get(), "Not called from the SynchronizationContext");
    }

    public final void execute(Runnable runnable) {
        mo62446c(runnable);
        mo62445b();
    }
}
