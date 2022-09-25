package p5488io.grpc.p5523c;

import p5488io.grpc.C70334de;
import p5488io.grpc.C70338di;
import p5488io.grpc.C70851i;
import p5488io.grpc.p5525e.C70373ap;
import p5488io.grpc.p5525e.C70670lp;

/* renamed from: io.grpc.c.l */
/* compiled from: PG */
final class C70268l implements Runnable {

    /* renamed from: a */
    final C70266j f187318a;

    /* renamed from: b */
    final /* synthetic */ String f187319b;

    /* renamed from: c */
    final /* synthetic */ C70334de f187320c;

    /* renamed from: d */
    final /* synthetic */ C70338di f187321d;

    /* renamed from: e */
    final /* synthetic */ C70670lp f187322e;

    /* renamed from: f */
    final /* synthetic */ C70851i f187323f;

    /* renamed from: g */
    final /* synthetic */ C70269m f187324g;

    public C70268l(C70269m mVar, String str, C70334de deVar, C70338di diVar, C70670lp lpVar, C70851i iVar) {
        C70269m mVar2 = mVar;
        this.f187324g = mVar2;
        String str2 = str;
        this.f187319b = str2;
        C70334de deVar2 = deVar;
        this.f187320c = deVar2;
        C70338di diVar2 = diVar;
        this.f187321d = diVar2;
        C70670lp lpVar2 = lpVar;
        this.f187322e = lpVar2;
        C70851i iVar2 = iVar;
        this.f187323f = iVar2;
        this.f187318a = new C70266j(str2, mVar2.f187325a, mVar2.f187329e, deVar2, mVar2, this, mVar2.f187327c, mVar2.f187330f, diVar2, lpVar2, iVar2, mVar2.f187331g);
    }

    public final void run() {
        synchronized (this.f187324g.f187327c) {
            C70269m mVar = this.f187324g;
            if (mVar.f187332h) {
                this.f187318a.f187314o.mo62131j(mVar.f187333i, C70373ap.PROCESSED, true, new C70334de());
            } else if (mVar.f187334j) {
                C70266j jVar = this.f187318a;
                mVar.f187328d.add(jVar);
                jVar.f187314o.f187296h.f187315p = mVar.f187335k;
            } else {
                throw new AssertionError("Transport is not started");
            }
        }
    }
}
