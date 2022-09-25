package p5488io.grpc.p5525e;

import p5488io.grpc.Status;

/* renamed from: io.grpc.e.bi */
/* compiled from: PG */
final class C70393bi implements Runnable {

    /* renamed from: a */
    final /* synthetic */ StringBuilder f187600a;

    /* renamed from: b */
    final /* synthetic */ C70407bw f187601b;

    public C70393bi(C70407bw bwVar, StringBuilder sb) {
        this.f187601b = bwVar;
        this.f187600a = sb;
    }

    public final void run() {
        this.f187601b.mo62121e(Status.f186907e.withDescription(this.f187600a.toString()), true);
    }
}
