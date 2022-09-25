package p5488io.grpc.p5525e;

import p5488io.grpc.C70898m;
import p5488io.grpc.Status;

/* renamed from: io.grpc.e.bl */
/* compiled from: PG */
final class C70396bl implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Status f187606a;

    /* renamed from: b */
    final /* synthetic */ C70407bw f187607b;

    public C70396bl(C70407bw bwVar, Status status) {
        this.f187607b = bwVar;
        this.f187606a = status;
    }

    public final void run() {
        C70898m mVar = this.f187607b.f187629b;
        Status status = this.f187606a;
        mVar.mo27480d(status.getDescription(), status.f186920q);
    }
}
