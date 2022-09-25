package androidx.camera.core;

import androidx.camera.core.p069a.C1330bq;
import androidx.camera.core.p069a.C1331br;
import androidx.p104d.p105a.C2164c;

/* renamed from: androidx.camera.core.aw */
/* compiled from: PG */
public final /* synthetic */ class C1422aw implements C1330bq {

    /* renamed from: a */
    public final /* synthetic */ C2164c f3978a;

    public /* synthetic */ C1422aw(C2164c cVar) {
        this.f3978a = cVar;
    }

    /* renamed from: a */
    public final void mo4018a(C1331br brVar) {
        C2164c cVar = this.f3978a;
        int i = C1470bp.f4052o;
        try {
            C1473bs f = brVar.mo4203f();
            if (f == null) {
                cVar.mo5439d(new IllegalStateException("Unable to acquire image"));
            } else if (!cVar.mo5437b(f)) {
                f.close();
            }
        } catch (IllegalStateException e) {
            cVar.mo5439d(e);
        }
    }
}
