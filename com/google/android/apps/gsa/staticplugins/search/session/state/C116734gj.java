package com.google.android.apps.gsa.staticplugins.search.session.state;

import com.google.android.apps.gsa.search.shared.actions.ActionData;
import com.google.android.apps.gsa.search.shared.actions.SearchError;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91007g;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;
import com.google.common.base.C58832aw;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.search.session.state.gj */
/* compiled from: PG */
public final class C116734gj implements C91007g {

    /* renamed from: a */
    protected int f323726a = 0;

    /* renamed from: b */
    public Query f323727b = Query.f252741b;

    /* renamed from: c */
    public SearchError f323728c;

    /* renamed from: d */
    public boolean f323729d;

    /* renamed from: e */
    private final C68214a f323730e;

    /* renamed from: f */
    private ActionData f323731f;

    public C116734gj(C68214a aVar) {
        this.f323730e = aVar;
    }

    /* renamed from: c */
    static String m193739c(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "PAUSED_BY_DEMAND" : "PAUSED_BY_TIMEOUT" : "ERROR" : "LOADED" : "LOADING" : "COMMITTED" : "IDLE";
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final ActionData mo102852a(Query query) {
        ActionData actionData = this.f323731f;
        if (actionData == null || this.f323727b.f252780s != query.f252780s) {
            return null;
        }
        return actionData;
    }

    /* renamed from: b */
    public final SearchError mo102853b(Query query) {
        if (mo102859j(query)) {
            return this.f323728c;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo102854e(Query query) {
        C59071e eVar = C116735gk.f323734a;
        C58976aa aaVar = C58975e.f156826a;
        this.f323727b = query;
        this.f323731f = null;
        mo102856g(1);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final void mo102855f() {
        C59071e eVar = C116735gk.f323734a;
        C58976aa aaVar = C58975e.f156826a;
        mo102856g(0);
        this.f323727b = Query.f252741b;
        this.f323731f = null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final void mo102856g(int i) {
        SearchError searchError;
        C59071e eVar = C116735gk.f323734a;
        C58976aa aaVar = C58975e.f156826a;
        if (i == 1) {
            this.f323729d = false;
            i = 1;
        }
        int i2 = 4;
        if (i == 4) {
            searchError = this.f323728c;
            searchError.getClass();
        } else {
            i2 = i;
            searchError = null;
        }
        this.f323728c = searchError;
        C116611bv bvVar = (C116611bv) this.f323730e.mo27525b();
        bvVar.f323413c = this.f323728c;
        if (bvVar.mo102798j()) {
            bvVar.mo80591ar();
        }
        this.f323726a = i2;
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        fVar.mo85291r(m193739c(this.f323726a));
        fVar.mo85288o("Current Query", this.f323727b);
        fVar.mo85288o("Loaded data", this.f323731f);
        fVar.mo85279c("Voice done").mo85276a(C90752i.m148228b(Boolean.valueOf(this.f323729d)));
    }

    /* renamed from: h */
    public final boolean mo102857h() {
        return this.f323726a == 4;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final boolean mo102858i(Query query) {
        if (!mo102859j(query)) {
            return false;
        }
        int i = this.f323726a;
        return i == 2 || i == 1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final boolean mo102859j(Query query) {
        return this.f323727b.f252780s == query.f252780s;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final boolean mo102860k(Query query) {
        if (!mo102859j(query)) {
            return false;
        }
        int i = this.f323726a;
        return i == 4 || i == 3 || i == 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public final boolean mo102861l(Query query) {
        if (!mo102859j(query)) {
            return false;
        }
        int i = this.f323726a;
        return i == 5 || i == 6;
    }

    /* renamed from: m */
    public final void mo102862m(ActionData actionData) {
        C59071e eVar = C116735gk.f323734a;
        C58976aa aaVar = C58975e.f156826a;
        C58832aw.m90831a(this.f323731f, actionData);
        this.f323731f = actionData;
        mo102856g(3);
    }

    public final String toString() {
        int i = this.f323726a;
        String valueOf = String.valueOf(this.f323727b);
        String valueOf2 = String.valueOf(this.f323731f);
        boolean z = this.f323729d;
        return m193739c(i) + ":" + valueOf + " D=" + valueOf2 + " VoiceDone=" + z;
    }
}
