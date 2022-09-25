package p5488io.grpc.p5525e;

import p5488io.grpc.C70334de;
import p5488io.grpc.Status;

/* renamed from: io.grpc.e.jq */
/* compiled from: PG */
final class C70617jq implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Status f188220a;

    /* renamed from: b */
    final /* synthetic */ C70373ap f188221b;

    /* renamed from: c */
    final /* synthetic */ C70334de f188222c;

    /* renamed from: d */
    final /* synthetic */ C70622jv f188223d;

    public C70617jq(C70622jv jvVar, Status status, C70373ap apVar, C70334de deVar) {
        this.f188223d = jvVar;
        this.f188220a = status;
        this.f188221b = apVar;
        this.f188222c = deVar;
    }

    public final void run() {
        C70625jy jyVar = this.f188223d.f188234b;
        jyVar.f188250D = true;
        jyVar.f188270z.mo62080a(this.f188220a, this.f188221b, this.f188222c);
    }
}
