package p5488io.grpc.p5525e;

import p5488io.grpc.C70137aa;

/* renamed from: io.grpc.e.ex */
/* compiled from: PG */
final class C70489ex implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C70490ey f187848a;

    public C70489ex(C70490ey eyVar) {
        this.f187848a = eyVar;
    }

    public final void run() {
        C70490ey eyVar = this.f187848a;
        eyVar.f187851c.f187864l.remove(eyVar.f187849a);
        if (this.f187848a.f187851c.f187868p.f186972a == C70137aa.SHUTDOWN && this.f187848a.f187851c.f187864l.isEmpty()) {
            this.f187848a.f187851c.mo62213f();
        }
    }
}
