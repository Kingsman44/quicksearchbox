package p5488io.grpc.p5525e;

import p5488io.grpc.Status;

/* renamed from: io.grpc.e.ea */
/* compiled from: PG */
public final class C70466ea implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C70496fd f187811a;

    public C70466ea(C70496fd fdVar) {
        this.f187811a = fdVar;
    }

    public final void run() {
        this.f187811a.f187878a.f187879a.mo61832m(Status.f186916n.withDescription("Keepalive failed. The connection is likely gone"));
    }
}
