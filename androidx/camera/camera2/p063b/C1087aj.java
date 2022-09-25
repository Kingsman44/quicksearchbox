package androidx.camera.camera2.p063b;

import androidx.core.p097i.C1974i;

/* renamed from: androidx.camera.camera2.b.aj */
/* compiled from: PG */
public final /* synthetic */ class C1087aj implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C1088ak f3232a;

    public /* synthetic */ C1087aj(C1088ak akVar) {
        this.f3232a = akVar;
    }

    public final void run() {
        C1088ak akVar = this.f3232a;
        if (!akVar.f3233a) {
            C1974i.m5315c(akVar.f3234b.f3238c.f3253l == 6, (String) null);
            C1089al alVar = akVar.f3234b;
            if (alVar.mo3806c()) {
                alVar.f3238c.mo3832r(true);
            } else {
                alVar.f3238c.mo3833s(true);
            }
        }
    }
}
