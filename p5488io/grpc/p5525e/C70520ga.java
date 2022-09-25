package p5488io.grpc.p5525e;

import p5488io.grpc.C70137aa;
import p5488io.grpc.C70280ci;

/* renamed from: io.grpc.e.ga */
/* compiled from: PG */
final class C70520ga implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C70542gw f187909a;

    public C70520ga(C70542gw gwVar) {
        this.f187909a = gwVar;
    }

    public final void run() {
        C70542gw gwVar = this.f187909a;
        if (gwVar.f188016u != null) {
            gwVar.mo62282p(true);
            gwVar.f187966A.mo62134a((C70280ci) null);
            gwVar.f187976K.mo62076a(2, "Entering IDLE state");
            gwVar.f188012q.mo62106a(C70137aa.IDLE);
            C70468ec ecVar = gwVar.f187987V;
            Object[] objArr = {gwVar.f188021z, gwVar.f187966A};
            for (int i = 0; i < 2; i++) {
                if (ecVar.f187818b.contains(objArr[i])) {
                    gwVar.mo62277k();
                    return;
                }
            }
        }
    }
}
