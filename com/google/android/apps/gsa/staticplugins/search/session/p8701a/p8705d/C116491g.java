package com.google.android.apps.gsa.staticplugins.search.session.p8701a.p8705d;

import com.google.android.apps.gsa.search.core.p6820r.p6821a.C86354a;
import com.google.android.apps.gsa.search.core.p6820r.p6821a.p6825d.C86370h;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.staticplugins.search.session.state.C116630cn;
import com.google.android.apps.gsa.staticplugins.search.session.state.C116735gk;
import com.google.android.apps.gsa.staticplugins.search.session.state.C116755hd;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.search.session.a.d.g */
/* compiled from: PG */
public final class C116491g extends C86354a implements C86370h {

    /* renamed from: a */
    private final Query f322981a;

    /* renamed from: b */
    private final C116630cn f322982b;

    /* renamed from: c */
    private final C116755hd f322983c;

    public C116491g(Query query, C116630cn cnVar, C116755hd hdVar) {
        this.f322981a = query;
        this.f322982b = cnVar;
        this.f322983c = hdVar;
    }

    /* renamed from: a */
    public final void mo80140a() {
        C116755hd hdVar = this.f322983c;
        if (((C116735gk) hdVar.f323872e.mo27525b()).f323784p.mo84438dS() && !((C116735gk) hdVar.f323872e.mo27525b()).mo102879U() && hdVar.f323883p != 4) {
            hdVar.f323856A = true;
            hdVar.f323883p = 4;
            hdVar.f323877j.mo78798i(4, hdVar.f323884q);
            hdVar.mo80591ar();
        }
    }

    /* renamed from: b */
    public final void mo80141b(boolean z) {
        C116630cn cnVar = this.f322982b;
        Query query = this.f322981a;
        if (((C116735gk) cnVar.f323462a.mo27525b()).f323784p.mo84383cP(query)) {
            boolean h = cnVar.f323463b.mo85055h(1, z);
            if (z) {
                C58976aa aaVar = C58975e.f156826a;
                cnVar.f323470i = query.f252780s;
            }
            if (h) {
                cnVar.mo80591ar();
            }
        }
    }

    /* renamed from: c */
    public final void mo80142c(Long l, Boolean bool) {
        C116630cn cnVar = this.f322982b;
        cnVar.f323467f = l.longValue();
        cnVar.f323468g = bool.booleanValue();
        cnVar.mo102813i(true);
    }
}
