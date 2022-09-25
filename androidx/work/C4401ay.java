package androidx.work;

/* renamed from: androidx.work.ay */
/* compiled from: PG */
final class C4401ay implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Worker f14048a;

    public C4401ay(Worker worker) {
        this.f14048a = worker;
    }

    public final void run() {
        try {
            this.f14048a.f13987a.mo9537e(this.f14048a.mo9300c());
        } catch (Throwable th) {
            this.f14048a.f13987a.mo9538f(th);
        }
    }
}
