package androidx.work.impl.utils;

/* renamed from: androidx.work.impl.utils.u */
/* compiled from: PG */
final class C4614u implements Runnable {

    /* renamed from: a */
    final C4615v f14505a;

    /* renamed from: b */
    final Runnable f14506b;

    public C4614u(C4615v vVar, Runnable runnable) {
        this.f14505a = vVar;
        this.f14506b = runnable;
    }

    public final void run() {
        try {
            this.f14506b.run();
            synchronized (this.f14505a.f14508b) {
                this.f14505a.mo9556a();
            }
        } catch (Throwable th) {
            synchronized (this.f14505a.f14508b) {
                this.f14505a.mo9556a();
                throw th;
            }
        }
    }
}
