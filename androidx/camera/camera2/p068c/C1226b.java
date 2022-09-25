package androidx.camera.camera2.p068c;

import androidx.camera.core.C1564n;
import androidx.p104d.p105a.C2164c;

/* renamed from: androidx.camera.camera2.c.b */
/* compiled from: PG */
public final /* synthetic */ class C1226b implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C1231g f3606a;

    /* renamed from: b */
    public final /* synthetic */ boolean f3607b;

    public /* synthetic */ C1226b(C1231g gVar, boolean z) {
        this.f3606a = gVar;
        this.f3607b = z;
    }

    public final void run() {
        C1231g gVar = this.f3606a;
        boolean z = this.f3607b;
        if (gVar.f3613a != z) {
            gVar.f3613a = z;
            if (!z) {
                C2164c cVar = gVar.f3618f;
                if (cVar != null) {
                    cVar.mo5439d(new C1564n("The camera control has became inactive."));
                    gVar.f3618f = null;
                }
            } else if (gVar.f3614b) {
                gVar.mo4061c();
            }
        }
    }
}
