package androidx.camera.camera2.p063b;

/* renamed from: androidx.camera.camera2.b.z */
/* compiled from: PG */
public final /* synthetic */ class C1223z implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C1091an f3601a;

    /* renamed from: b */
    public final /* synthetic */ boolean f3602b;

    public /* synthetic */ C1223z(C1091an anVar, boolean z) {
        this.f3601a = anVar;
        this.f3602b = z;
    }

    public final void run() {
        C1091an anVar = this.f3601a;
        boolean z = this.f3602b;
        anVar.f3252k = z;
        if (z && anVar.f3253l == 2) {
            anVar.mo3832r(false);
        }
    }
}
