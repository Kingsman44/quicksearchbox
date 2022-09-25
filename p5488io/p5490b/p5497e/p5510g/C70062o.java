package p5488io.p5490b.p5497e.p5510g;

import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import p5488io.p5490b.p5494b.C69802a;

/* renamed from: io.b.e.g.o */
/* compiled from: PG */
final class C70062o implements Runnable {

    /* renamed from: a */
    public final long f186761a;

    /* renamed from: b */
    public final ConcurrentLinkedQueue f186762b;

    /* renamed from: c */
    final C69802a f186763c;

    /* renamed from: d */
    public final ThreadFactory f186764d;

    /* renamed from: e */
    private final ScheduledExecutorService f186765e;

    /* renamed from: f */
    private final Future f186766f;

    public C70062o(long j, TimeUnit timeUnit, ThreadFactory threadFactory) {
        ScheduledFuture<?> scheduledFuture;
        ScheduledExecutorService scheduledExecutorService;
        long nanos = timeUnit != null ? timeUnit.toNanos(j) : 0;
        this.f186761a = nanos;
        this.f186762b = new ConcurrentLinkedQueue();
        this.f186763c = new C69802a();
        this.f186764d = threadFactory;
        if (timeUnit != null) {
            scheduledExecutorService = Executors.newScheduledThreadPool(1, C70065r.f186773c);
            scheduledFuture = scheduledExecutorService.scheduleWithFixedDelay(this, nanos, nanos, TimeUnit.NANOSECONDS);
        } else {
            scheduledExecutorService = null;
            scheduledFuture = null;
        }
        this.f186765e = scheduledExecutorService;
        this.f186766f = scheduledFuture;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo61609a() {
        this.f186763c.dispose();
        Future future = this.f186766f;
        if (future != null) {
            future.cancel(true);
        }
        ScheduledExecutorService scheduledExecutorService = this.f186765e;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdownNow();
        }
    }

    public final void run() {
        if (!this.f186762b.isEmpty()) {
            long nanoTime = System.nanoTime();
            Iterator it = this.f186762b.iterator();
            while (it.hasNext()) {
                C70064q qVar = (C70064q) it.next();
                if (qVar.f186771a > nanoTime) {
                    return;
                }
                if (this.f186762b.remove(qVar)) {
                    this.f186763c.mo61464f(qVar);
                }
            }
        }
    }
}
