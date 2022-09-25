package androidx.camera.core;

import androidx.camera.camera2.p063b.C1131c;
import androidx.camera.core.p069a.C1384k;
import androidx.camera.core.p073b.C1440c;

/* renamed from: androidx.camera.core.bz */
/* compiled from: PG */
final class C1480bz extends C1384k {

    /* renamed from: a */
    final /* synthetic */ C1497ca f4075a;

    public C1480bz(C1497ca caVar) {
        this.f4075a = caVar;
    }

    /* renamed from: c */
    public final void mo3870c(C1131c cVar) {
        C1497ca caVar = this.f4075a;
        synchronized (caVar.f4115a) {
            if (!caVar.f4118d) {
                caVar.f4120f.put(cVar.mo3892a(), new C1440c(cVar));
                caVar.mo4375n();
            }
        }
    }
}
