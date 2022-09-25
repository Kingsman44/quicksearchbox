package com.google.android.apps.gsa.staticplugins.search.session.state;

import com.google.android.apps.gsa.search.shared.actions.ActionData;
import com.google.android.apps.gsa.search.shared.actions.SearchError;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.search.session.state.bv */
/* compiled from: PG */
public final class C116611bv extends C116780ib {

    /* renamed from: a */
    public Query f323411a = Query.f252741b;

    /* renamed from: b */
    public SearchError f323412b;

    /* renamed from: c */
    public SearchError f323413c;

    /* renamed from: d */
    public SearchError f323414d;

    /* renamed from: e */
    public SearchError f323415e;

    /* renamed from: f */
    private final C68214a f323416f;

    /* renamed from: g */
    private final C68214a f323417g;

    /* renamed from: h */
    private final C68214a f323418h;

    public C116611bv(C68214a aVar, C68214a aVar2, C68214a aVar3, C68214a aVar4) {
        super(aVar, 184);
        this.f323416f = aVar2;
        this.f323417g = aVar3;
        this.f323418h = aVar4;
    }

    /* renamed from: e */
    public final SearchError mo102795e(Query query) {
        if (this.f323411a.mo84383cP(query)) {
            return this.f323415e;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final void mo102796g(SearchError searchError) {
        C58976aa aaVar = C58975e.f156826a;
        this.f323412b = searchError;
        if (mo102798j()) {
            mo80591ar();
        }
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        fVar.mo85291r("ErrorState");
        fVar.mo85288o("Error", this.f323415e);
        SearchError searchError = this.f323415e;
        if (searchError != null) {
            fVar.mo85284k("Search Error", searchError.mo81137P());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final void mo102797i(SearchError searchError) {
        C58976aa aaVar = C58975e.f156826a;
        this.f323414d = searchError;
        if (mo102798j()) {
            mo80591ar();
        }
    }

    /* renamed from: j */
    public final boolean mo102798j() {
        SearchError searchError;
        Query query = ((C116735gk) this.f323417g.mo27525b()).f323784p;
        if (query.mo84435dP()) {
            Query query2 = ((C116735gk) this.f323417g.mo27525b()).f323784p;
            SearchError searchError2 = this.f323412b;
            boolean z = false;
            boolean z2 = query2.mo84420dA() || query2.mo84369cB();
            if (this.f323413c != null || ((C116735gk) this.f323417g.mo27525b()).mo102880V(query2)) {
                z = true;
            }
            if (searchError2 == null || !z2 || !z) {
                boolean z3 = !((C116742gr) this.f323418h.mo27525b()).mo80163g(query2);
                if (!z2 || !z3 || (searchError = this.f323413c) == null || !searchError.mo81138R(4)) {
                    C58976aa aaVar = C58975e.f156826a;
                    return mo102800m(this.f323412b);
                }
                C58976aa aaVar2 = C58975e.f156826a;
                return mo102800m(this.f323413c);
            }
            C58976aa aaVar3 = C58975e.f156826a;
            return mo102800m(this.f323413c);
        }
        ActionData e = ((C116714fq) this.f323416f.mo27525b()).mo102840e(query);
        if (e != null && !e.equals(ActionData.f235991b)) {
            C58976aa aaVar4 = C58975e.f156826a;
            return mo102800m((SearchError) null);
        } else if (((C116714fq) this.f323416f.mo27525b()).mo102841g(query) && e == null && this.f323413c != null) {
            C58976aa aaVar5 = C58975e.f156826a;
            return mo102800m((SearchError) null);
        } else if (this.f323413c != null) {
            C58976aa aaVar6 = C58975e.f156826a;
            return mo102800m(this.f323413c);
        } else if (this.f323414d != null) {
            C58976aa aaVar7 = C58975e.f156826a;
            return mo102800m(this.f323414d);
        } else {
            C58976aa aaVar8 = C58975e.f156826a;
            return mo102800m((SearchError) null);
        }
    }

    /* renamed from: k */
    public final boolean mo102799k() {
        return this.f323415e != null;
    }

    /* renamed from: m */
    public final boolean mo102800m(SearchError searchError) {
        if (this.f323415e == searchError) {
            return false;
        }
        C58976aa aaVar = C58975e.f156826a;
        this.f323415e = searchError;
        return true;
    }

    public final String toString() {
        SearchError searchError = this.f323415e;
        String obj = searchError == null ? "null" : searchError.toString();
        return "ErrorState{Error={" + obj + "}}";
    }
}
