package p5488io.p5490b.p5497e.p5510g;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import p5488io.p5490b.C70127s;
import p5488io.p5490b.C70128t;
import p5488io.p5490b.p5494b.C69803b;
import p5488io.p5490b.p5496d.C69822d;
import p5488io.p5490b.p5497e.p5498a.C69828d;
import p5488io.p5490b.p5497e.p5498a.C69829e;
import p5488io.p5490b.p5517i.C70101a;
import p5488io.p5490b.p5518j.C70111i;

/* renamed from: io.b.e.g.l */
/* compiled from: PG */
public final class C70059l extends C70128t {

    /* renamed from: b */
    static final C70128t f186753b;

    /* renamed from: c */
    final Executor f186754c;

    static {
        C70128t tVar = C70111i.f186860a;
        C69822d dVar = C70101a.f186840h;
        f186753b = tVar;
    }

    public C70059l(Executor executor) {
        this.f186754c = executor;
    }

    /* renamed from: a */
    public final C70127s mo61458a() {
        return new C70058k(this.f186754c);
    }

    /* renamed from: b */
    public final C69803b mo61593b(Runnable runnable) {
        Runnable d = C70101a.m102022d(runnable);
        try {
            if (this.f186754c instanceof ExecutorService) {
                C70071x xVar = new C70071x(d);
                xVar.mo61584a(((ExecutorService) this.f186754c).submit(xVar));
                return xVar;
            }
            C70056i iVar = new C70056i(d);
            this.f186754c.execute(iVar);
            return iVar;
        } catch (RejectedExecutionException e) {
            C70101a.m102023e(e);
            return C69829e.INSTANCE;
        }
    }

    /* renamed from: c */
    public final C69803b mo61459c(Runnable runnable, long j, TimeUnit timeUnit) {
        Runnable d = C70101a.m102022d(runnable);
        if (this.f186754c instanceof ScheduledExecutorService) {
            try {
                C70071x xVar = new C70071x(d);
                xVar.mo61584a(((ScheduledExecutorService) this.f186754c).schedule(xVar, j, timeUnit));
                return xVar;
            } catch (RejectedExecutionException e) {
                C70101a.m102023e(e);
                return C69829e.INSTANCE;
            }
        } else {
            C70055h hVar = new C70055h(d);
            C69828d.m101310g(hVar.f186742a, f186753b.mo61459c(new C70054g(this, hVar), j, timeUnit));
            return hVar;
        }
    }

    /* renamed from: d */
    public final C69803b mo61587d(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        if (!(this.f186754c instanceof ScheduledExecutorService)) {
            return super.mo61587d(runnable, j, j2, timeUnit);
        }
        try {
            C70070w wVar = new C70070w(C70101a.m102022d(runnable));
            wVar.mo61584a(((ScheduledExecutorService) this.f186754c).scheduleAtFixedRate(wVar, j, j2, timeUnit));
            return wVar;
        } catch (RejectedExecutionException e) {
            C70101a.m102023e(e);
            return C69829e.INSTANCE;
        }
    }
}
