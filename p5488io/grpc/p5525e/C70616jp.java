package p5488io.grpc.p5525e;

import p5488io.grpc.C70334de;
import p5488io.grpc.Status;

/* renamed from: io.grpc.e.jp */
/* compiled from: PG */
final class C70616jp implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Status f188216a;

    /* renamed from: b */
    final /* synthetic */ C70373ap f188217b;

    /* renamed from: c */
    final /* synthetic */ C70334de f188218c;

    /* renamed from: d */
    final /* synthetic */ C70622jv f188219d;

    public C70616jp(C70622jv jvVar, Status status, C70373ap apVar, C70334de deVar) {
        this.f188219d = jvVar;
        this.f188216a = status;
        this.f188217b = apVar;
        this.f188218c = deVar;
    }

    public final void run() {
        C70625jy jyVar = this.f188219d.f188234b;
        jyVar.f188250D = true;
        jyVar.f188270z.mo62080a(this.f188216a, this.f188217b, this.f188218c);
    }
}
