package com.google.android.apps.gsa.search.core.state;

import com.google.android.apps.gsa.search.shared.actions.ActionData;
import com.google.android.apps.gsa.search.shared.actions.SearchError;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91007g;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.search.core.state.fm */
/* compiled from: PG */
public final class C87051fm implements C91007g {

    /* renamed from: a */
    int f235135a = 0;

    /* renamed from: b */
    public Query f235136b = Query.f252741b;

    /* renamed from: c */
    public SearchError f235137c;

    /* renamed from: d */
    public ActionData f235138d;

    /* renamed from: e */
    public boolean f235139e;

    /* renamed from: f */
    private final C68214a f235140f;

    public C87051fm(C68214a aVar) {
        this.f235140f = aVar;
    }

    /* renamed from: b */
    static String m140597b(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "PAUSED_BY_DEMAND" : "PAUSED_BY_TIMEOUT" : "ERROR" : "LOADED" : "LOADING" : "COMMITTED" : "IDLE";
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final SearchError mo80673a(Query query) {
        if (mo80680j(query)) {
            return this.f235137c;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo80674c(Query query) {
        C59071e eVar = C87052fn.f235141a;
        C58976aa aaVar = C58975e.f156826a;
        this.f235136b = query;
        this.f235138d = null;
        mo80677g(1);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo80675e() {
        C59071e eVar = C87052fn.f235141a;
        C58976aa aaVar = C58975e.f156826a;
        mo80677g(0);
        this.f235136b = Query.f252741b;
        this.f235138d = null;
    }

    /* renamed from: f */
    public final void mo80676f(ActionData actionData) {
        C59071e eVar = C87052fn.f235141a;
        C58976aa aaVar = C58975e.f156826a;
        this.f235138d = actionData;
        mo80677g(3);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final void mo80677g(int i) {
        SearchError searchError;
        C59071e eVar = C87052fn.f235141a;
        C58976aa aaVar = C58975e.f156826a;
        if (i == 1) {
            this.f235139e = false;
            i = 1;
        }
        int i2 = 4;
        if (i == 4) {
            searchError = this.f235137c;
            searchError.getClass();
        } else {
            i2 = i;
            searchError = null;
        }
        this.f235137c = searchError;
        C86893co coVar = (C86893co) this.f235140f.mo27525b();
        coVar.f234655c = this.f235137c;
        if (coVar.mo80550e()) {
            coVar.mo80591ar();
        }
        this.f235135a = i2;
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        fVar.mo85291r(m140597b(this.f235135a));
        fVar.mo85288o("Current Query", this.f235136b);
        fVar.mo85288o("Loaded data", this.f235138d);
        fVar.mo85279c("Voice done").mo85276a(C90752i.m148228b(Boolean.valueOf(this.f235139e)));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final boolean mo80678h() {
        return this.f235135a == 4;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final boolean mo80679i(Query query) {
        if (!mo80680j(query)) {
            return false;
        }
        int i = this.f235135a;
        return i == 2 || i == 1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final boolean mo80680j(Query query) {
        return this.f235136b.f252780s == query.f252780s;
    }

    /* renamed from: k */
    public final boolean mo80681k(Query query) {
        if (!mo80680j(query)) {
            return false;
        }
        int i = this.f235135a;
        return i == 4 || i == 3 || i == 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public final boolean mo80682l(Query query) {
        if (!mo80680j(query)) {
            return false;
        }
        int i = this.f235135a;
        return i == 5 || i == 6;
    }

    public final String toString() {
        int i = this.f235135a;
        String valueOf = String.valueOf(this.f235136b);
        String valueOf2 = String.valueOf(this.f235138d);
        boolean z = this.f235139e;
        return m140597b(i) + ":" + valueOf + " D=" + valueOf2 + " VoiceDone=" + z;
    }
}
