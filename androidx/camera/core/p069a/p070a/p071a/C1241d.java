package androidx.camera.core.p069a.p070a.p071a;

/* renamed from: androidx.camera.core.a.a.a.d */
/* compiled from: PG */
final class C1241d implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C1242e f3630a;

    public C1241d(C1242e eVar) {
        this.f3630a = eVar;
    }

    public final void run() {
        if (this.f3630a.f3633c.f3634a.getAndSet((Object) null) != null) {
            C1242e eVar = this.f3630a;
            eVar.f3631a.removeCallbacks(eVar.f3633c);
        }
    }
}
