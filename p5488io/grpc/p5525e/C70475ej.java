package p5488io.grpc.p5525e;

import p5488io.grpc.C70137aa;

/* renamed from: io.grpc.e.ej */
/* compiled from: PG */
final class C70475ej implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C70493fa f187824a;

    public C70475ej(C70493fa faVar) {
        this.f187824a = faVar;
    }

    public final void run() {
        if (this.f187824a.f187868p.f186972a == C70137aa.IDLE) {
            this.f187824a.f187856d.mo62076a(2, "CONNECTING as requested");
            this.f187824a.mo62211d(C70137aa.CONNECTING);
            this.f187824a.mo62216i();
        }
    }
}
