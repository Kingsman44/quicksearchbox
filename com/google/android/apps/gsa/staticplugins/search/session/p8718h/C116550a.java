package com.google.android.apps.gsa.staticplugins.search.session.p8718h;

import com.google.android.apps.gsa.staticplugins.p7855dr.p7857b.C99998af;
import com.google.android.apps.gsa.staticplugins.search.session.state.C116766ho;
import com.google.android.libraries.gsa.monet.internal.service.C23028x;
import com.google.android.libraries.gsa.monet.service.C23054e;
import com.google.common.base.C58893dc;

/* renamed from: com.google.android.apps.gsa.staticplugins.search.session.h.a */
/* compiled from: PG */
final class C116550a implements C23054e {

    /* renamed from: a */
    final /* synthetic */ C116553d f323185a;

    /* renamed from: b */
    final /* synthetic */ C99998af f323186b;

    public C116550a(C116553d dVar, C99998af afVar) {
        this.f323185a = dVar;
        this.f323186b = afVar;
    }

    /* renamed from: b */
    public final /* synthetic */ void mo28489b(C23028x xVar) {
    }

    /* renamed from: c */
    public final /* synthetic */ void mo28490c() {
    }

    /* renamed from: g */
    public final void mo28491g() {
        C116553d dVar = this.f323185a;
        C116551b bVar = (C116551b) dVar.f323193b.remove(this.f323186b);
        if (bVar != null) {
            bVar.f323187a.mo28434y(bVar.f323188b);
            if (dVar.f323193b.isEmpty()) {
                C116766ho hoVar = dVar.f323194c;
                C116552c cVar = dVar.f323195d;
                C58893dc.m90996a(cVar);
                hoVar.mo80761o(cVar);
                dVar.f323195d = null;
            }
        }
    }
}
