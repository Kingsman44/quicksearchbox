package p5488io.grpc.p5525e;

import com.google.common.base.C58838bb;
import p5488io.grpc.C70137aa;

/* renamed from: io.grpc.e.ev */
/* compiled from: PG */
final class C70487ev implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C70490ey f187845a;

    public C70487ev(C70490ey eyVar) {
        this.f187845a = eyVar;
    }

    public final void run() {
        C70490ey eyVar = this.f187845a;
        C70493fa faVar = eyVar.f187851c;
        faVar.f187870r = null;
        if (faVar.f187869q != null) {
            C58838bb.m90884s(faVar.f187867o == null, "Unexpected non-null activeTransport");
            C70490ey eyVar2 = this.f187845a;
            eyVar2.f187849a.mo61831l(eyVar2.f187851c.f187869q);
            return;
        }
        C70387bc bcVar = faVar.f187866n;
        C70387bc bcVar2 = eyVar.f187849a;
        if (bcVar == bcVar2) {
            faVar.f187867o = bcVar2;
            C70493fa faVar2 = this.f187845a.f187851c;
            faVar2.f187866n = null;
            faVar2.mo62211d(C70137aa.READY);
        }
    }
}
