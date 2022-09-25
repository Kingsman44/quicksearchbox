package p5488io.grpc.p5525e;

/* renamed from: io.grpc.e.jj */
/* compiled from: PG */
final class C70610jj implements Runnable {

    /* renamed from: a */
    final C70608jh f188201a;

    /* renamed from: b */
    final /* synthetic */ C70625jy f188202b;

    public C70610jj(C70625jy jyVar, C70608jh jhVar) {
        this.f188202b = jyVar;
        this.f188201a = jhVar;
    }

    public final void run() {
        this.f188202b.f188254j.execute(new C70609ji(this));
    }
}
