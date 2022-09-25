package com.google.android.apps.gsa.staticplugins.search.session.state;

import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.state.C87032ez;
import com.google.android.apps.gsa.search.shared.actions.ActionData;
import com.google.android.apps.gsa.shared.p7066m.C90120fr;
import com.google.android.apps.gsa.shared.p7066m.p7068b.C89994f;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.search.session.state.fq */
/* compiled from: PG */
public final class C116714fq extends C116780ib {

    /* renamed from: a */
    public final C68214a f323677a;

    /* renamed from: b */
    public Query f323678b = Query.f252741b;

    /* renamed from: c */
    public ActionData f323679c = null;

    /* renamed from: d */
    private final C68214a f323680d;

    /* renamed from: e */
    private final C89994f f323681e;

    /* renamed from: f */
    private final C86124t f323682f;

    public C116714fq(C68214a aVar, C68214a aVar2, C68214a aVar3, C89994f fVar, C86124t tVar) {
        super(aVar, 159);
        C58976aa aaVar = C58975e.f156826a;
        this.f323680d = aVar2;
        this.f323677a = aVar3;
        this.f323681e = fVar;
        this.f323682f = tVar;
    }

    /* renamed from: e */
    public final ActionData mo102840e(Query query) {
        if (mo102842i(query)) {
            return this.f323679c;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final boolean mo102841g(Query query) {
        boolean z = false;
        if (query.mo84415cv()) {
            C58976aa aaVar = C58975e.f156826a;
            return false;
        } else if (!query.mo84331bP() || ((int) this.f323682f.mo79743a(C90120fr.f250824ap)) == 0) {
            C58976aa aaVar2 = C58975e.f156826a;
            return false;
        } else {
            String ae = this.f323681e.mo83885ae();
            if (!((C116836z) this.f323680d.mo27525b()).mo102986P(query) && C87032ez.m140541a(query, ae) && !query.mo84394ca()) {
                z = true;
            }
            C58976aa aaVar3 = C58975e.f156826a;
            return z;
        }
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        fVar.mo85291r("PumpkinState");
        fVar.mo85285l(this.f323678b);
        fVar.mo85285l(this.f323679c);
    }

    /* renamed from: i */
    public final boolean mo102842i(Query query) {
        return this.f323679c != null && this.f323678b.mo84383cP(query);
    }

    public final String toString() {
        return "PumpkinState";
    }
}
