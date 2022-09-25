package com.google.android.apps.gsa.staticplugins.search.session.state;

import com.google.android.apps.gsa.search.shared.actions.SearchError;
import com.google.android.apps.gsa.shared.logger.C89886e;
import com.google.android.apps.gsa.shared.logger.C89911f;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.p7127q.C90452a;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.libraries.gsa.p1876k.C22869e;

/* renamed from: com.google.android.apps.gsa.staticplugins.search.session.state.hq */
/* compiled from: PG */
final class C116768hq implements C22869e {

    /* renamed from: a */
    final /* synthetic */ C116769hr f323934a;

    /* renamed from: b */
    private final Query f323935b;

    public C116768hq(C116769hr hrVar, Query query) {
        this.f323934a = hrVar;
        this.f323935b = query;
    }

    public final void run() {
        if (((C116735gk) this.f323934a.f323937b.mo27525b()).f323784p.mo84383cP(this.f323935b) && ((C116611bv) this.f323934a.f323936a.mo27525b()).f323415e == null && !((C116740gp) this.f323934a.f323938c.mo27525b()).mo102913j() && !((C116740gp) this.f323934a.f323938c.mo27525b()).mo102912i()) {
            C90452a aVar = new C90452a(211, C89885b.INTERNAL_ERROR_SEARCH_RESULT_CANNOT_COMPLETE_VALUE);
            ((C116735gk) this.f323934a.f323937b.mo27525b()).mo102907x(this.f323935b, new SearchError(this.f323935b, (String) null, aVar));
            C89886e b = ((C89911f) this.f323934a.f323940e.mo27525b()).mo83756b(aVar);
            b.mo83725d(this.f323935b.f252749G);
            b.mo83721a();
        }
    }
}
