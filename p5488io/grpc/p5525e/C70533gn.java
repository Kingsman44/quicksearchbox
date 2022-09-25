package p5488io.grpc.p5525e;

import p5488io.grpc.C70766ff;

/* renamed from: io.grpc.e.gn */
/* compiled from: PG */
final class C70533gn implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Runnable f187929a;

    /* renamed from: b */
    final /* synthetic */ C70535gp f187930b;

    public C70533gn(C70535gp gpVar, Runnable runnable) {
        this.f187930b = gpVar;
        this.f187929a = runnable;
    }

    public final void run() {
        this.f187929a.run();
        C70535gp gpVar = this.f187930b;
        C70766ff ffVar = gpVar.f187935f.f187938c.f188009n;
        ffVar.mo62446c(new C70534go(gpVar));
        ffVar.mo62445b();
    }
}
