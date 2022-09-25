package com.google.android.apps.gsa.staticplugins.opa;

import com.google.android.apps.gsa.staticplugins.opa.p8295aq.C107381e;
import com.google.android.apps.gsa.staticplugins.opa.p8295aq.C107382f;
import com.google.android.apps.gsa.staticplugins.opa.p8295aq.C107383g;
import com.google.android.libraries.gsa.p1876k.C22869e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.z */
/* compiled from: PG */
public final /* synthetic */ class C114531z implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C109040fj f317617a;

    /* renamed from: b */
    public final /* synthetic */ C107383g f317618b;

    public /* synthetic */ C114531z(C109040fj fjVar, C107383g gVar) {
        this.f317617a = fjVar;
        this.f317618b = gVar;
    }

    public final void run() {
        C109040fj fjVar = this.f317617a;
        C107383g gVar = this.f317618b;
        if (gVar.mo95997a() != C107382f.DISMISSED && gVar.mo95997a() != C107382f.DISMISSING) {
            C107383g gVar2 = (C107383g) fjVar.f303319bZ.mo56107c();
            C107382f a = gVar2.mo95997a();
            if (!(a == C107382f.DISMISSED || a == C107382f.DISMISSING)) {
                gVar2.f298866c.animate().setDuration(250).alpha(0.0f).setListener(new C107381e(gVar2)).start();
                gVar2.f298871h.mo5708l(C107382f.DISMISSING);
            }
            fjVar.mo97498bH(false, false, false, 16);
        }
    }
}
