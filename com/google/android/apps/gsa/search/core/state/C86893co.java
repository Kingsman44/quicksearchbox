package com.google.android.apps.gsa.search.core.state;

import com.google.android.apps.gsa.search.shared.actions.ActionData;
import com.google.android.apps.gsa.search.shared.actions.SearchError;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.search.core.state.co */
/* compiled from: PG */
public final class C86893co extends C86898ct {

    /* renamed from: a */
    public Query f234653a = Query.f252741b;

    /* renamed from: b */
    public SearchError f234654b;

    /* renamed from: c */
    public SearchError f234655c;

    /* renamed from: d */
    public SearchError f234656d;

    /* renamed from: e */
    private final C68214a f234657e;

    /* renamed from: f */
    private final C68214a f234658f;

    /* renamed from: g */
    private final C68214a f234659g;

    public C86893co(C68214a aVar, C68214a aVar2, C68214a aVar3, C68214a aVar4) {
        super(aVar, 77);
        this.f234657e = aVar2;
        this.f234658f = aVar3;
        this.f234659g = aVar4;
    }

    /* renamed from: a */
    public final SearchError mo80548a(Query query) {
        if (this.f234653a.mo84383cP(query)) {
            return this.f234656d;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo80549b(SearchError searchError) {
        this.f234654b = searchError;
        if (mo80550e()) {
            mo80591ar();
        }
    }

    /* renamed from: e */
    public final boolean mo80550e() {
        SearchError searchError;
        Query query = ((C87052fn) this.f234658f.mo27525b()).f235177m;
        if (query.mo84435dP()) {
            Query query2 = ((C87052fn) this.f234658f.mo27525b()).f235177m;
            SearchError searchError2 = this.f234654b;
            boolean z = false;
            boolean z2 = query2.mo84420dA() || query2.mo84369cB();
            if (this.f234655c != null || ((C87052fn) this.f234658f.mo27525b()).mo80691L(query2)) {
                z = true;
            }
            if (searchError2 != null && z2 && z) {
                return mo80551f(this.f234655c);
            }
            boolean z3 = !((C87059fu) this.f234659g.mo27525b()).mo80163g(query2);
            if (!z2 || !z3 || (searchError = this.f234655c) == null || !searchError.mo81138R(4)) {
                return mo80551f(this.f234654b);
            }
            return mo80551f(searchError);
        }
        ActionData a = ((C87028ev) this.f234657e.mo27525b()).mo80642a(query);
        if (a != null && !a.equals(ActionData.f235991b)) {
            return mo80551f((SearchError) null);
        }
        if (((C87028ev) this.f234657e.mo27525b()).mo80644g(query) && a == null && this.f234655c != null) {
            return mo80551f((SearchError) null);
        }
        SearchError searchError3 = this.f234655c;
        if (searchError3 != null) {
            return mo80551f(searchError3);
        }
        return mo80551f((SearchError) null);
    }

    /* renamed from: f */
    public final boolean mo80551f(SearchError searchError) {
        if (this.f234656d == searchError) {
            return false;
        }
        this.f234656d = searchError;
        return true;
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        fVar.mo85291r("ErrorState");
        fVar.mo85288o("Error", this.f234656d);
        SearchError searchError = this.f234656d;
        if (searchError != null) {
            fVar.mo85284k("Search Error", searchError.mo81137P());
        }
    }

    public final String toString() {
        SearchError searchError = this.f234656d;
        String obj = searchError == null ? "null" : searchError.toString();
        return "ErrorState{Error={" + obj + "}}";
    }
}
