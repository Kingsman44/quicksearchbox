package com.google.android.apps.gsa.staticplugins.search.session.p8719i;

import com.google.android.apps.gsa.search.core.p6884y.p6889e.p6902k.C87350a;
import com.google.android.apps.gsa.staticplugins.search.session.state.C116766ho;
import com.google.android.libraries.gsa.monet.internal.service.C23028x;
import com.google.android.libraries.gsa.monet.service.C23054e;
import com.google.common.base.C58893dc;

/* renamed from: com.google.android.apps.gsa.staticplugins.search.session.i.a */
/* compiled from: PG */
final class C116554a implements C23054e {

    /* renamed from: a */
    final /* synthetic */ C87350a f323196a;

    /* renamed from: b */
    final /* synthetic */ C116557d f323197b;

    public C116554a(C116557d dVar, C87350a aVar) {
        this.f323197b = dVar;
        this.f323196a = aVar;
    }

    /* renamed from: b */
    public final /* synthetic */ void mo28489b(C23028x xVar) {
    }

    /* renamed from: c */
    public final /* synthetic */ void mo28490c() {
    }

    /* renamed from: g */
    public final void mo28491g() {
        C116557d dVar = this.f323197b;
        C116555b bVar = (C116555b) dVar.f323202b.remove(this.f323196a);
        if (bVar != null) {
            bVar.f323198a.mo28434y(bVar.f323199b);
            if (dVar.f323202b.isEmpty()) {
                C116766ho hoVar = dVar.f323203c;
                C116556c cVar = dVar.f323205e;
                C58893dc.m90996a(cVar);
                hoVar.mo80761o(cVar);
                dVar.f323205e = null;
            }
        }
    }
}
