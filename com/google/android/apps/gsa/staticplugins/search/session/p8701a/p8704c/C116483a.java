package com.google.android.apps.gsa.staticplugins.search.session.p8701a.p8704c;

import com.google.android.apps.gsa.search.core.p6820r.p6821a.p6824c.C86362b;
import com.google.android.apps.gsa.shared.logger.p7053c.C89882e;
import com.google.android.apps.gsa.shared.p7127q.C90456c;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.staticplugins.search.session.state.C116719fv;
import com.google.android.apps.gsa.staticplugins.search.session.state.C116720fw;
import com.google.android.apps.gsa.staticplugins.search.session.state.C116735gk;
import com.google.common.base.C58833ax;
import com.google.common.base.C58838bb;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C60537to;

/* renamed from: com.google.android.apps.gsa.staticplugins.search.session.a.c.a */
/* compiled from: PG */
public final class C116483a extends C86362b {

    /* renamed from: a */
    private final C116720fw f322960a;

    /* renamed from: b */
    private final Query f322961b;

    public C116483a(Query query, C116720fw fwVar) {
        this.f322960a = fwVar;
        this.f322961b = query;
    }

    /* renamed from: a */
    public final void mo80123a(C60537to toVar, C90456c cVar) {
        this.f322960a.mo102848j(this.f322961b, 464, toVar, C58833ax.m90834k(cVar));
    }

    /* renamed from: b */
    public final void mo80124b() {
        C116720fw fwVar = this.f322960a;
        Query query = this.f322961b;
        C58976aa aaVar = C58975e.f156826a;
        long j = ((C116735gk) fwVar.f323698b.mo27525b()).f323784p.f252749G;
        long j2 = query.f252749G;
        if (j == j2) {
            if (fwVar.mo102851n()) {
                C116719fv fvVar = fwVar.f323701e;
                fvVar.getClass();
                if (fvVar.f323694b.f252749G != j2) {
                    fwVar.mo102847i(fvVar, 465, C60537to.NO_LONGER_HANDLED);
                    fwVar.mo80591ar();
                }
            }
            if (query.f252749G != fwVar.f323702f) {
                fwVar.f323701e = fwVar.mo102845e(query);
            }
            if (fwVar.mo102851n()) {
                C58838bb.m90883r(query.mo84430dK());
                C116719fv fvVar2 = fwVar.f323701e;
                fvVar2.getClass();
                fvVar2.f323696d = true;
            }
        }
    }

    /* renamed from: c */
    public final void mo80125c() {
        this.f322960a.mo102849k(this.f322961b);
    }

    /* renamed from: d */
    public final void mo80126d(C89882e eVar) {
        this.f322960a.mo102850m(eVar, this.f322961b.f252749G);
    }
}
