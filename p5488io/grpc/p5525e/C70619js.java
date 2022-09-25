package p5488io.grpc.p5525e;

import p5488io.grpc.C70334de;
import p5488io.grpc.Status;

/* renamed from: io.grpc.e.js */
/* compiled from: PG */
final class C70619js implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Status f188226a;

    /* renamed from: b */
    final /* synthetic */ C70373ap f188227b;

    /* renamed from: c */
    final /* synthetic */ C70334de f188228c;

    /* renamed from: d */
    final /* synthetic */ C70622jv f188229d;

    public C70619js(C70622jv jvVar, Status status, C70373ap apVar, C70334de deVar) {
        this.f188229d = jvVar;
        this.f188226a = status;
        this.f188227b = apVar;
        this.f188228c = deVar;
    }

    public final void run() {
        C70625jy jyVar = this.f188229d.f188234b;
        jyVar.f188250D = true;
        jyVar.f188270z.mo62080a(this.f188226a, this.f188227b, this.f188228c);
    }
}
