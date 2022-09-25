package p5488io.p5490b.p5497e.p5510g;

import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import p5488io.p5490b.C70127s;
import p5488io.p5490b.p5494b.C69802a;
import p5488io.p5490b.p5494b.C69803b;
import p5488io.p5490b.p5497e.p5498a.C69829e;
import p5488io.p5490b.p5517i.C70101a;

/* renamed from: io.b.e.g.ac */
/* compiled from: PG */
final class C70042ac extends C70127s {

    /* renamed from: a */
    final ScheduledExecutorService f186706a;

    /* renamed from: b */
    final C69802a f186707b = new C69802a();

    /* renamed from: c */
    volatile boolean f186708c;

    public C70042ac(ScheduledExecutorService scheduledExecutorService) {
        this.f186706a = scheduledExecutorService;
    }

    /* renamed from: b */
    public final C69803b mo61456b(Runnable runnable, long j, TimeUnit timeUnit) {
        Future future;
        if (this.f186708c) {
            return C69829e.INSTANCE;
        }
        C70072y yVar = new C70072y(C70101a.m102022d(runnable), this.f186707b);
        this.f186707b.mo61462b(yVar);
        if (j <= 0) {
            try {
                future = this.f186706a.submit(yVar);
            } catch (RejectedExecutionException e) {
                dispose();
                C70101a.m102023e(e);
                return C69829e.INSTANCE;
            }
        } else {
            future = this.f186706a.schedule(yVar, j, timeUnit);
        }
        yVar.mo61618a(future);
        return yVar;
    }

    public final void dispose() {
        if (!this.f186708c) {
            this.f186708c = true;
            this.f186707b.dispose();
        }
    }

    /* renamed from: e */
    public final boolean mo25859e() {
        throw null;
    }
}
