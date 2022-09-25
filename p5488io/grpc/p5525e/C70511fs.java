package p5488io.grpc.p5525e;

import java.util.HashSet;
import p5488io.grpc.C70148al;
import p5488io.grpc.C70334de;
import p5488io.grpc.C70338di;
import p5488io.grpc.C70851i;
import p5488io.grpc.C70904s;
import p5488io.grpc.C70906u;
import p5488io.grpc.Status;

/* renamed from: io.grpc.e.fs */
/* compiled from: PG */
final class C70511fs extends C70625jy {

    /* renamed from: a */
    final /* synthetic */ C70338di f187890a;

    /* renamed from: b */
    final /* synthetic */ C70851i f187891b;

    /* renamed from: c */
    final /* synthetic */ C70148al f187892c;

    /* renamed from: d */
    final /* synthetic */ C70512ft f187893d;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C70511fs(p5488io.grpc.p5525e.C70512ft r15, p5488io.grpc.C70338di r16, p5488io.grpc.C70334de r17, p5488io.grpc.C70851i r18, p5488io.grpc.p5525e.C70626jz r19, p5488io.grpc.p5525e.C70461dw r20, p5488io.grpc.p5525e.C70624jx r21, p5488io.grpc.C70148al r22) {
        /*
            r14 = this;
            r13 = r14
            r0 = r15
            r1 = r18
            r13.f187893d = r0
            r2 = r16
            r13.f187890a = r2
            r13.f187891b = r1
            r3 = r22
            r13.f187892c = r3
            io.grpc.e.gw r3 = r0.f187894a
            io.grpc.e.jg r4 = r3.f187983R
            long r5 = r3.f187984S
            long r7 = r3.f187985T
            java.util.concurrent.Executor r9 = r3.mo62275i(r1)
            io.grpc.e.gw r0 = r0.f187894a
            io.grpc.e.at r0 = r0.f188005j
            java.util.concurrent.ScheduledExecutorService r10 = r0.mo57961b()
            r0 = r14
            r1 = r16
            r2 = r17
            r3 = r4
            r4 = r5
            r6 = r7
            r8 = r9
            r9 = r10
            r10 = r19
            r11 = r20
            r12 = r21
            r0.<init>(r1, r2, r3, r4, r6, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p5488io.grpc.p5525e.C70511fs.<init>(io.grpc.e.ft, io.grpc.di, io.grpc.de, io.grpc.i, io.grpc.e.jz, io.grpc.e.dw, io.grpc.e.jx, io.grpc.al):void");
    }

    /* renamed from: p */
    public final Status mo62231p() {
        C70541gv gvVar = this.f187893d.f187894a.f187967B;
        synchronized (gvVar.f187954a) {
            Status status = gvVar.f187956c;
            if (status != null) {
                return status;
            }
            gvVar.f187955b.add(this);
            return null;
        }
    }

    /* renamed from: q */
    public final C70372ao mo62232q(C70334de deVar, C70904s sVar, int i, boolean z) {
        C70851i f = this.f187891b.mo62570f(sVar);
        C70906u[] m = C70460dv.m102885m(f, i, z);
        C70375ar a = this.f187893d.mo62234a(new C70576ic(this.f187890a, deVar, f));
        C70148al a2 = this.f187892c.mo61696a();
        try {
            return a.mo61824e(this.f187890a, deVar, f, m);
        } finally {
            this.f187892c.mo61702f(a2);
        }
    }

    /* renamed from: r */
    public final void mo62233r() {
        Status status;
        C70541gv gvVar = this.f187893d.f187894a.f187967B;
        synchronized (gvVar.f187954a) {
            gvVar.f187955b.remove(this);
            if (gvVar.f187955b.isEmpty()) {
                status = gvVar.f187956c;
                gvVar.f187955b = new HashSet();
            } else {
                status = null;
            }
        }
        if (status != null) {
            gvVar.f187957d.f187966A.mo61831l(status);
        }
    }
}
