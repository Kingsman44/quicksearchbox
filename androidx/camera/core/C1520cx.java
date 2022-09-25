package androidx.camera.core;

/* renamed from: androidx.camera.core.cx */
/* compiled from: PG */
public final /* synthetic */ class C1520cx implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C1522cz f4189a;

    public /* synthetic */ C1520cx(C1522cz czVar) {
        this.f4189a = czVar;
    }

    public final void run() {
        C1522cz czVar = this.f4189a;
        synchronized (czVar.f4191a) {
            if (!czVar.f4192b) {
                czVar.f4193c.mo4205h();
                czVar.f4193c.mo4206i();
                czVar.f4194d.release();
                czVar.f4197g.mo4177c();
                czVar.f4192b = true;
            }
        }
    }
}
