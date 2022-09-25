package androidx.camera.core;

/* renamed from: androidx.camera.core.da */
/* compiled from: PG */
public final /* synthetic */ class C1524da implements C1413an {

    /* renamed from: a */
    public final /* synthetic */ C1526dc f4205a;

    public /* synthetic */ C1524da(C1526dc dcVar) {
        this.f4205a = dcVar;
    }

    /* renamed from: k */
    public final void mo4299k(C1473bs bsVar) {
        C1526dc dcVar = this.f4205a;
        synchronized (dcVar.f4208a) {
            int i = dcVar.f4209b - 1;
            dcVar.f4209b = i;
            if (dcVar.f4210c && i == 0) {
                dcVar.mo4206i();
            }
        }
    }
}
