package p5488io.grpc.p5525e;

import p5488io.grpc.C70334de;
import p5488io.grpc.Status;

/* renamed from: io.grpc.e.b */
/* compiled from: PG */
final class C70384b implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Status f187583a;

    /* renamed from: b */
    final /* synthetic */ C70373ap f187584b;

    /* renamed from: c */
    final /* synthetic */ C70334de f187585c;

    /* renamed from: d */
    final /* synthetic */ C70411c f187586d;

    public C70384b(C70411c cVar, Status status, C70373ap apVar, C70334de deVar) {
        this.f187586d = cVar;
        this.f187583a = status;
        this.f187584b = apVar;
        this.f187585c = deVar;
    }

    public final void run() {
        this.f187586d.mo62129h(this.f187583a, this.f187584b, this.f187585c);
    }
}
