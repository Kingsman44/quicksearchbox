package p5488io.p5490b.p5497e.p5510g;

import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import p5488io.p5490b.C70127s;
import p5488io.p5490b.p5494b.C69803b;
import p5488io.p5490b.p5497e.p5498a.C69826b;
import p5488io.p5490b.p5497e.p5498a.C69829e;
import p5488io.p5490b.p5517i.C70101a;

/* renamed from: io.b.e.g.t */
/* compiled from: PG */
public class C70067t extends C70127s implements C69803b {

    /* renamed from: b */
    public final ScheduledExecutorService f186782b;

    /* renamed from: c */
    public volatile boolean f186783c;

    public C70067t(ThreadFactory threadFactory) {
        this.f186782b = C70041ab.m101891a(threadFactory);
    }

    /* renamed from: a */
    public final C69803b mo61591a(Runnable runnable) {
        return mo61456b(runnable, 0, (TimeUnit) null);
    }

    /* renamed from: b */
    public final C69803b mo61456b(Runnable runnable, long j, TimeUnit timeUnit) {
        if (this.f186783c) {
            return C69829e.INSTANCE;
        }
        return mo61613h(runnable, j, timeUnit, (C69826b) null);
    }

    public final void dispose() {
        if (!this.f186783c) {
            this.f186783c = true;
            this.f186782b.shutdownNow();
        }
    }

    /* renamed from: e */
    public final boolean mo25859e() {
        throw null;
    }

    /* renamed from: f */
    public final C69803b mo61611f(Runnable runnable, long j, TimeUnit timeUnit) {
        Future future;
        C70071x xVar = new C70071x(C70101a.m102022d(runnable));
        if (j <= 0) {
            try {
                future = this.f186782b.submit(xVar);
            } catch (RejectedExecutionException e) {
                C70101a.m102023e(e);
                return C69829e.INSTANCE;
            }
        } else {
            future = this.f186782b.schedule(xVar, j, timeUnit);
        }
        xVar.mo61584a(future);
        return xVar;
    }

    /* renamed from: g */
    public final C69803b mo61612g(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        Future future;
        Runnable d = C70101a.m102022d(runnable);
        if (j2 <= 0) {
            C70061n nVar = new C70061n(d, this.f186782b);
            if (j <= 0) {
                try {
                    future = this.f186782b.submit(nVar);
                } catch (RejectedExecutionException e) {
                    C70101a.m102023e(e);
                    return C69829e.INSTANCE;
                }
            } else {
                future = this.f186782b.schedule(nVar, j, timeUnit);
            }
            nVar.mo61607a(future);
            return nVar;
        }
        C70070w wVar = new C70070w(d);
        try {
            wVar.mo61584a(this.f186782b.scheduleAtFixedRate(wVar, j, j2, timeUnit));
            return wVar;
        } catch (RejectedExecutionException e2) {
            C70101a.m102023e(e2);
            return C69829e.INSTANCE;
        }
    }

    /* renamed from: h */
    public final C70072y mo61613h(Runnable runnable, long j, TimeUnit timeUnit, C69826b bVar) {
        Future future;
        C70072y yVar = new C70072y(C70101a.m102022d(runnable), bVar);
        if (bVar != null && !bVar.mo61462b(yVar)) {
            return yVar;
        }
        if (j <= 0) {
            try {
                future = this.f186782b.submit(yVar);
            } catch (RejectedExecutionException e) {
                if (bVar != null) {
                    bVar.mo61464f(yVar);
                }
                C70101a.m102023e(e);
            }
        } else {
            future = this.f186782b.schedule(yVar, j, timeUnit);
        }
        yVar.mo61618a(future);
        return yVar;
    }
}
