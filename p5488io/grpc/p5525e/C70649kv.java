package p5488io.grpc.p5525e;

import p5488io.grpc.Status;

/* renamed from: io.grpc.e.kv */
/* compiled from: PG */
final class C70649kv implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C70651kx f188333a;

    public C70649kv(C70651kx kxVar) {
        this.f188333a = kxVar;
    }

    public final void run() {
        this.f188333a.f188336a.mo61838m(Status.f186904b.withDescription("Handshake timeout exceeded"));
    }
}
