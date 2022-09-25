package p5488io.grpc.p5525e;

import p5488io.p5489a.C69792b;

/* renamed from: io.grpc.e.h */
/* compiled from: PG */
final class C70546h implements Runnable {

    /* renamed from: a */
    final /* synthetic */ int f188023a;

    /* renamed from: b */
    final /* synthetic */ C70573i f188024b;

    public C70546h(C70573i iVar, int i) {
        this.f188024b = iVar;
        this.f188023a = i;
    }

    public final void run() {
        int i = C69792b.f186180a;
        try {
            C70391bg bgVar = this.f188024b.f188140o;
            int i2 = this.f188023a;
            if (!((C70560hn) bgVar).mo62312b()) {
                ((C70560hn) bgVar).f188091e += (long) i2;
                ((C70560hn) bgVar).mo62311a();
            }
        } catch (Throwable th) {
            this.f188024b.mo61919b(th);
        }
    }
}
