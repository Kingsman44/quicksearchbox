package p5488io.p5490b.p5497e.p5510g;

import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p5488io.p5490b.C70127s;
import p5488io.p5490b.C70128t;
import p5488io.p5490b.p5494b.C69803b;
import p5488io.p5490b.p5497e.p5498a.C69829e;
import p5488io.p5490b.p5517i.C70101a;

/* renamed from: io.b.e.g.ad */
/* compiled from: PG */
public final class C70043ad extends C70128t {

    /* renamed from: b */
    public static final C70069v f186709b = new C70069v("RxSingleScheduler", Math.max(1, Math.min(10, Integer.getInteger("rx2.single-priority", 5).intValue())), true);

    /* renamed from: c */
    static final ScheduledExecutorService f186710c;

    /* renamed from: d */
    final AtomicReference f186711d;

    static {
        ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(0);
        f186710c = newScheduledThreadPool;
        newScheduledThreadPool.shutdown();
    }

    public C70043ad() {
        throw null;
    }

    /* renamed from: a */
    public final C70127s mo61458a() {
        return new C70042ac((ScheduledExecutorService) this.f186711d.get());
    }

    /* renamed from: c */
    public final C69803b mo61459c(Runnable runnable, long j, TimeUnit timeUnit) {
        Future future;
        C70071x xVar = new C70071x(C70101a.m102022d(runnable));
        if (j <= 0) {
            try {
                future = ((ScheduledExecutorService) this.f186711d.get()).submit(xVar);
            } catch (RejectedExecutionException e) {
                C70101a.m102023e(e);
                return C69829e.INSTANCE;
            }
        } else {
            future = ((ScheduledExecutorService) this.f186711d.get()).schedule(xVar, j, timeUnit);
        }
        xVar.mo61584a(future);
        return xVar;
    }

    /* renamed from: d */
    public final C69803b mo61587d(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        Future future;
        Runnable d = C70101a.m102022d(runnable);
        if (j2 <= 0) {
            ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.f186711d.get();
            C70061n nVar = new C70061n(d, scheduledExecutorService);
            if (j <= 0) {
                try {
                    future = scheduledExecutorService.submit(nVar);
                } catch (RejectedExecutionException e) {
                    C70101a.m102023e(e);
                    return C69829e.INSTANCE;
                }
            } else {
                future = scheduledExecutorService.schedule(nVar, j, timeUnit);
            }
            nVar.mo61607a(future);
            return nVar;
        }
        C70070w wVar = new C70070w(d);
        try {
            wVar.mo61584a(((ScheduledExecutorService) this.f186711d.get()).scheduleAtFixedRate(wVar, j, j2, timeUnit));
            return wVar;
        } catch (RejectedExecutionException e2) {
            C70101a.m102023e(e2);
            return C69829e.INSTANCE;
        }
    }

    public C70043ad(ThreadFactory threadFactory) {
        AtomicReference atomicReference = new AtomicReference();
        this.f186711d = atomicReference;
        atomicReference.lazySet(C70041ab.m101891a(threadFactory));
    }
}
