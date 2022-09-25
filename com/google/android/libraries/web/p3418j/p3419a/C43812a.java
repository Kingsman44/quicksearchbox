package com.google.android.libraries.web.p3418j.p3419a;

import com.google.android.libraries.web.lifecycle.C43876a;
import com.google.android.libraries.web.p3418j.C43839d;
import com.google.android.libraries.web.p3418j.C43840e;
import com.google.android.libraries.web.p3418j.C43851p;
import com.google.android.libraries.web.p3418j.C43852q;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.web.j.a.a */
/* compiled from: PG */
public final /* synthetic */ class C43812a implements C43876a {

    /* renamed from: a */
    public final /* synthetic */ C43824m f114233a;

    public /* synthetic */ C43812a(C43824m mVar) {
        this.f114233a = mVar;
    }

    /* renamed from: a */
    public final void mo46836a(Object obj) {
        C43824m mVar = this.f114233a;
        C43852q qVar = (C43852q) obj;
        Optional g = mVar.mo46843g();
        C43814c cVar = new C43814c(mVar);
        C43840e eVar = null;
        C43840e eVar2 = (C43840e) Optional.ofNullable(mVar.f114252e).orElse(null);
        if (eVar2 != null) {
            ((C43839d) C43851p.m77391a(eVar2)).mo46839b(mVar);
        }
        if (qVar != null) {
            eVar = C43851p.m77391a(qVar.mo46413f(mVar.f114248a, mVar.f114249b));
            if (eVar instanceof C43824m) {
                ((C43824m) eVar).mo46844h(mVar, new C43815d(cVar));
            } else {
                ((C43839d) C43851p.m77391a(eVar)).mo46838a(mVar, new C43816e(cVar));
            }
        }
        mVar.f114252e = eVar;
        if (eVar2 != null || eVar == null || !(eVar instanceof C43824m) || ((C43824m) eVar).f114252e != null) {
            cVar.accept(g);
        }
    }
}
