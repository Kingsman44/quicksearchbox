package p5488io.grpc.p5525e;

import p5488io.grpc.C70334de;
import p5488io.grpc.Status;

/* renamed from: io.grpc.e.bt */
/* compiled from: PG */
final class C70404bt implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Status f187619a;

    /* renamed from: b */
    final /* synthetic */ C70334de f187620b;

    /* renamed from: c */
    final /* synthetic */ C70406bv f187621c;

    public C70404bt(C70406bv bvVar, Status status, C70334de deVar) {
        this.f187621c = bvVar;
        this.f187619a = status;
        this.f187620b = deVar;
    }

    public final void run() {
        this.f187621c.f187623a.mo27484b(this.f187619a, this.f187620b);
    }
}
