package com.google.android.apps.gsa.staticplugins.p8774u.p8775a;

import com.google.android.apps.gsa.search.core.p6884y.p6889e.p6894e.C87306ae;
import com.google.android.apps.gsa.search.core.p6884y.p6889e.p6894e.C87307af;
import com.google.android.apps.gsa.search.core.p6884y.p6889e.p6894e.C87321d;
import com.google.android.libraries.gsa.monet.internal.service.C23028x;
import com.google.android.libraries.gsa.monet.service.C23052c;
import com.google.android.libraries.gsa.monet.service.C23054e;
import java.util.Iterator;

/* renamed from: com.google.android.apps.gsa.staticplugins.u.a.n */
/* compiled from: PG */
final class C117478n implements C23054e {

    /* renamed from: a */
    final /* synthetic */ C23052c f326076a;

    /* renamed from: b */
    final /* synthetic */ C117480p f326077b;

    public C117478n(C117480p pVar, C23052c cVar) {
        this.f326077b = pVar;
        this.f326076a = cVar;
    }

    /* renamed from: b */
    public final /* synthetic */ void mo28489b(C23028x xVar) {
    }

    /* renamed from: c */
    public final /* synthetic */ void mo28490c() {
    }

    /* renamed from: g */
    public final void mo28491g() {
        this.f326076a.mo28434y(this);
        C117480p pVar = this.f326077b;
        C23052c cVar = this.f326076a;
        if (pVar.f326083f) {
            C117473i iVar = pVar.f326079b.f326091a;
            if (iVar != null) {
                if (iVar.f326062c.mo80960f() == cVar) {
                    pVar.mo103326k(7);
                }
            } else {
                return;
            }
        }
        C117473i iVar2 = pVar.f326082e;
        if (iVar2 != null) {
            C87321d dVar = iVar2.f326062c;
            if (dVar.mo80960f() == cVar) {
                dVar.mo80958d().mo80952a(new C87307af(C87306ae.REQUESTING_SHEET_FEATURE_DESTROYED));
                pVar.f326082e = null;
            }
        }
        Iterator it = pVar.f326081d.iterator();
        while (it.hasNext()) {
            C117473i iVar3 = (C117473i) it.next();
            if (iVar3.f326062c.mo80960f() == cVar) {
                iVar3.f326062c.mo80958d().mo80952a(new C87307af(C87306ae.REQUESTING_SHEET_FEATURE_DESTROYED));
                it.remove();
            }
        }
    }
}
