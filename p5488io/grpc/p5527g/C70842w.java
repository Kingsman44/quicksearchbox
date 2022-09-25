package p5488io.grpc.p5527g;

/* renamed from: io.grpc.g.w */
/* compiled from: PG */
final class C70842w implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C70844y f188962a;

    public C70842w(C70844y yVar) {
        this.f188962a = yVar;
    }

    public final void run() {
        C70844y yVar = this.f188962a;
        yVar.f188990l.execute(yVar.f188992n);
        synchronized (this.f188962a.f188988j) {
            C70844y yVar2 = this.f188962a;
            yVar2.f189000v = Integer.MAX_VALUE;
            yVar2.mo62559r();
        }
    }
}
