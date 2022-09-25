package p5488io.p5490b.p5497e.p5510g;

import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import p5488io.p5490b.C70127s;
import p5488io.p5490b.p5494b.C69802a;
import p5488io.p5490b.p5494b.C69803b;
import p5488io.p5490b.p5497e.p5498a.C69828d;
import p5488io.p5490b.p5497e.p5498a.C69829e;
import p5488io.p5490b.p5497e.p5498a.C69831g;
import p5488io.p5490b.p5497e.p5509f.C70036b;
import p5488io.p5490b.p5517i.C70101a;

/* renamed from: io.b.e.g.k */
/* compiled from: PG */
public final class C70058k extends C70127s implements Runnable {

    /* renamed from: a */
    final Executor f186748a;

    /* renamed from: b */
    final C70036b f186749b;

    /* renamed from: c */
    volatile boolean f186750c;

    /* renamed from: d */
    final AtomicInteger f186751d = new AtomicInteger();

    /* renamed from: e */
    final C69802a f186752e = new C69802a();

    public C70058k(Executor executor) {
        this.f186748a = executor;
        this.f186749b = new C70036b();
    }

    /* renamed from: a */
    public final C69803b mo61591a(Runnable runnable) {
        if (this.f186750c) {
            return C69829e.INSTANCE;
        }
        C70056i iVar = new C70056i(C70101a.m102022d(runnable));
        this.f186749b.mo61477j(iVar);
        if (this.f186751d.getAndIncrement() == 0) {
            try {
                this.f186748a.execute(this);
            } catch (RejectedExecutionException e) {
                this.f186750c = true;
                this.f186749b.mo61475c();
                C70101a.m102023e(e);
                return C69829e.INSTANCE;
            }
        }
        return iVar;
    }

    /* renamed from: b */
    public final C69803b mo61456b(Runnable runnable, long j, TimeUnit timeUnit) {
        if (j <= 0) {
            return mo61591a(runnable);
        }
        if (this.f186750c) {
            return C69829e.INSTANCE;
        }
        C69831g gVar = new C69831g();
        C69831g gVar2 = new C69831g(gVar);
        C70072y yVar = new C70072y(new C70057j(this, gVar2, C70101a.m102022d(runnable)), this.f186752e);
        this.f186752e.mo61462b(yVar);
        Executor executor = this.f186748a;
        if (executor instanceof ScheduledExecutorService) {
            try {
                yVar.mo61618a(((ScheduledExecutorService) executor).schedule(yVar, j, timeUnit));
            } catch (RejectedExecutionException e) {
                this.f186750c = true;
                C70101a.m102023e(e);
                return C69829e.INSTANCE;
            }
        } else {
            yVar.mo61618a(new C70053f(C70059l.f186753b.mo61459c(yVar, j, timeUnit)));
        }
        C69828d.m101310g(gVar, yVar);
        return gVar2;
    }

    public final void dispose() {
        if (!this.f186750c) {
            this.f186750c = true;
            this.f186752e.dispose();
            if (this.f186751d.getAndIncrement() == 0) {
                this.f186749b.mo61475c();
            }
        }
    }

    /* renamed from: e */
    public final boolean mo25859e() {
        throw null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001e, code lost:
        if (r1 != 0) goto L_0x0003;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0020, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0011, code lost:
        if (r3.f186750c == false) goto L_0x0017;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0013, code lost:
        r0.mo61475c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0016, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0017, code lost:
        r1 = r3.f186751d.addAndGet(-r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r3 = this;
            io.b.e.f.b r0 = r3.f186749b
            r1 = 1
        L_0x0003:
            boolean r2 = r3.f186750c
            if (r2 != 0) goto L_0x002c
        L_0x0007:
            java.lang.Object r2 = r0.mo61479lN()
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            if (r2 != 0) goto L_0x0021
            boolean r2 = r3.f186750c
            if (r2 == 0) goto L_0x0017
            r0.mo61475c()
            return
        L_0x0017:
            java.util.concurrent.atomic.AtomicInteger r2 = r3.f186751d
            int r1 = -r1
            int r1 = r2.addAndGet(r1)
            if (r1 != 0) goto L_0x0003
            return
        L_0x0021:
            r2.run()
            boolean r2 = r3.f186750c
            if (r2 == 0) goto L_0x0007
            r0.mo61475c()
            return
        L_0x002c:
            r0.mo61475c()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p5488io.p5490b.p5497e.p5510g.C70058k.run():void");
    }
}
