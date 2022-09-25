package p5488io.grpc.p5525e;

import p5488io.grpc.C70334de;
import p5488io.grpc.Status;

/* renamed from: io.grpc.e.jd */
/* compiled from: PG */
final class C70604jd implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Status f188191a;

    /* renamed from: b */
    final /* synthetic */ C70625jy f188192b;

    public C70604jd(C70625jy jyVar, Status status) {
        this.f188192b = jyVar;
        this.f188191a = status;
    }

    public final void run() {
        C70625jy jyVar = this.f188192b;
        jyVar.f188250D = true;
        jyVar.f188270z.mo62080a(this.f188191a, C70373ap.PROCESSED, new C70334de());
    }
}
