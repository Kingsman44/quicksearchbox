package p5488io.grpc.p5525e;

import com.google.common.base.C58838bb;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import p5488io.grpc.C70249bt;
import p5488io.grpc.C70334de;
import p5488io.grpc.C70338di;
import p5488io.grpc.C70769g;
import p5488io.grpc.C70851i;
import p5488io.grpc.C70906u;
import p5488io.grpc.Status;

/* renamed from: io.grpc.e.x */
/* compiled from: PG */
public final class C70693x extends C70449dk {

    /* renamed from: a */
    public final C70387bc f188431a;

    /* renamed from: b */
    public final String f188432b;

    /* renamed from: c */
    public final AtomicInteger f188433c = new AtomicInteger(-2147483647);

    /* renamed from: d */
    final /* synthetic */ C70694y f188434d;

    /* renamed from: e */
    private volatile Status f188435e;

    /* renamed from: f */
    private Status f188436f;

    /* renamed from: g */
    private Status f188437g;

    /* renamed from: h */
    private final C70691v f188438h = new C70691v(this);

    public C70693x(C70694y yVar, C70387bc bcVar, String str) {
        this.f188434d = yVar;
        C58838bb.m90866a(bcVar, "delegate");
        this.f188431a = bcVar;
        C58838bb.m90866a(str, "authority");
        this.f188432b = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C70387bc mo62168a() {
        return this.f188431a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001a, code lost:
        if (r1 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001c, code lost:
        super.mo61832m(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0015, code lost:
        if (r0 == null) goto L_0x001a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0017, code lost:
        super.mo61831l(r0);
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo62428b() {
        /*
            r3 = this;
            monitor-enter(r3)
            java.util.concurrent.atomic.AtomicInteger r0 = r3.f188433c     // Catch:{ all -> 0x0020 }
            int r0 = r0.get()     // Catch:{ all -> 0x0020 }
            if (r0 == 0) goto L_0x000b
            monitor-exit(r3)     // Catch:{ all -> 0x0020 }
            return
        L_0x000b:
            io.grpc.Status r0 = r3.f188436f     // Catch:{ all -> 0x0020 }
            io.grpc.Status r1 = r3.f188437g     // Catch:{ all -> 0x0020 }
            r2 = 0
            r3.f188436f = r2     // Catch:{ all -> 0x0020 }
            r3.f188437g = r2     // Catch:{ all -> 0x0020 }
            monitor-exit(r3)     // Catch:{ all -> 0x0020 }
            if (r0 == 0) goto L_0x001a
            super.mo61831l(r0)
        L_0x001a:
            if (r1 == 0) goto L_0x001f
            super.mo61832m(r1)
        L_0x001f:
            return
        L_0x0020:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0020 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p5488io.grpc.p5525e.C70693x.mo62428b():void");
    }

    /* renamed from: e */
    public final C70372ao mo61824e(C70338di diVar, C70334de deVar, C70851i iVar, C70906u[] uVarArr) {
        C70372ao aoVar;
        Executor executor;
        C70769g gVar = iVar.f189018d;
        if (gVar == null) {
            gVar = null;
        }
        if (gVar != null) {
            C70565hs hsVar = new C70565hs(this.f188431a, diVar, deVar, iVar, this.f188438h, uVarArr);
            if (this.f188433c.incrementAndGet() > 0) {
                this.f188438h.mo62427a();
                return new C70444df(this.f188435e, C70373ap.PROCESSED, uVarArr);
            }
            C70692w wVar = new C70692w(this, diVar);
            try {
                if (!(gVar instanceof C70249bt) || !((C70249bt) gVar).mo61691b() || (executor = iVar.f189017c) == null) {
                    executor = this.f188434d.f188439a;
                }
                gVar.mo61690a(wVar, executor, hsVar);
            } catch (Throwable th) {
                hsVar.mo62072a(Status.f186910h.withDescription("Credentials should use fail() instead of throwing exceptions").mo61678e(th));
            }
            synchronized (hsVar.f188125g) {
                aoVar = hsVar.f188126h;
                if (aoVar == null) {
                    hsVar.f188128j = new C70432cu();
                    aoVar = hsVar.f188128j;
                    hsVar.f188126h = aoVar;
                }
            }
            return aoVar;
        } else if (this.f188433c.get() >= 0) {
            return new C70444df(this.f188435e, C70373ap.PROCESSED, uVarArr);
        } else {
            return this.f188431a.mo61824e(diVar, deVar, iVar, uVarArr);
        }
    }

    /* renamed from: l */
    public final void mo61831l(Status status) {
        C58838bb.m90866a(status, "status");
        synchronized (this) {
            if (this.f188433c.get() < 0) {
                this.f188435e = status;
                this.f188433c.addAndGet(Integer.MAX_VALUE);
                if (this.f188433c.get() != 0) {
                    this.f188436f = status;
                } else {
                    super.mo61831l(status);
                }
            }
        }
    }

    /* renamed from: m */
    public final void mo61832m(Status status) {
        C58838bb.m90866a(status, "status");
        synchronized (this) {
            if (this.f188433c.get() < 0) {
                this.f188435e = status;
                this.f188433c.addAndGet(Integer.MAX_VALUE);
            } else if (this.f188437g != null) {
                return;
            }
            if (this.f188433c.get() != 0) {
                this.f188437g = status;
            } else {
                super.mo61832m(status);
            }
        }
    }
}
