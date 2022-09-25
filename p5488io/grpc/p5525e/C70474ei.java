package p5488io.grpc.p5525e;

import p5488io.grpc.C70137aa;

/* renamed from: io.grpc.e.ei */
/* compiled from: PG */
final class C70474ei implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C70493fa f187823a;

    public C70474ei(C70493fa faVar) {
        this.f187823a = faVar;
    }

    public final void run() {
        C70493fa faVar = this.f187823a;
        faVar.f187861i = null;
        faVar.f187856d.mo62076a(2, "CONNECTING after backoff");
        this.f187823a.mo62211d(C70137aa.CONNECTING);
        this.f187823a.mo62216i();
    }
}
