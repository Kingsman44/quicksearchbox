package com.google.android.apps.gsa.search.core.state;

import com.google.android.apps.gsa.search.core.p6820r.C86388aj;
import com.google.android.apps.gsa.search.core.p6820r.C86389b;
import com.google.android.apps.gsa.search.core.p6820r.C86394c;
import com.google.android.apps.gsa.search.core.p6820r.C86575u;
import com.google.android.apps.gsa.search.core.p6820r.C86577w;
import com.google.android.apps.gsa.search.core.p6820r.p6838j.C86498a;
import com.google.android.apps.gsa.search.core.p6820r.p6838j.C86499b;
import com.google.android.apps.gsa.search.core.p6820r.p6838j.C86500c;
import com.google.android.apps.gsa.search.shared.actions.SearchError;
import com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88433bd;
import com.google.android.apps.gsa.shared.logger.p7053c.C89880c;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.p7012bb.C89356b;
import com.google.android.apps.gsa.shared.p7127q.C90452a;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.common.base.C58833ax;
import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4552o.C60537to;
import com.google.common.util.concurrent.C60870cx;
import dagger.C68214a;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.search.core.state.fu */
/* compiled from: PG */
public final class C87059fu extends C86898ct implements C86389b, C86388aj, C86498a {

    /* renamed from: a */
    public final C68214a f235200a;

    /* renamed from: b */
    public final C86394c f235201b = new C86394c();

    /* renamed from: c */
    public Query f235202c = Query.f252741b;

    /* renamed from: d */
    public SearchError f235203d;

    /* renamed from: e */
    public boolean f235204e = true;

    /* renamed from: f */
    private final C68214a f235205f;

    /* renamed from: g */
    private final C68214a f235206g;

    /* renamed from: h */
    private final C86500c f235207h;

    /* renamed from: i */
    private C86498a f235208i;

    public C87059fu(C68214a aVar, C68214a aVar2, C68214a aVar3, C68214a aVar4, C86500c cVar) {
        super(aVar, 59);
        this.f235205f = aVar2;
        this.f235200a = aVar3;
        this.f235206g = aVar4;
        this.f235207h = cVar;
    }

    /* renamed from: m */
    private final C86498a m140684m() {
        C86498a aVar = this.f235208i;
        if (aVar != null) {
            return aVar;
        }
        C86499b a = this.f235207h.mo80189a(this.f235201b, this, this);
        this.f235208i = a;
        return a;
    }

    /* renamed from: a */
    public final void mo80107a(Query query) {
        C87042fd fdVar = (C87042fd) this.f235200a.mo27525b();
        Query query2 = this.f235202c;
        C60537to a = C89880c.m146354a(query2);
        if (query2.mo84460dn() && fdVar.mo80671o()) {
            C87041fc fcVar = fdVar.f235115d;
            fcVar.getClass();
            if (fcVar.f235109b.mo84383cP(query)) {
                fdVar.f235115d.f235108a.f233510b = true;
            }
        }
        fdVar.mo80664e(query, a);
    }

    /* renamed from: b */
    public final void mo80108b(Query query) {
        ((C87042fd) this.f235200a.mo27525b()).mo80666i(query, 464, C60537to.TASKGRAPH_NO_ENDSTATE_LOGGED, C58833ax.m90834k(new C90452a(211, C89885b.INTERNAL_ERROR_UNKNOWN_ENDSTATE_VALUE)));
    }

    /* renamed from: c */
    public final void mo80109c() {
        this.f235204e = false;
        this.f235203d = null;
        ((C86893co) this.f235206g.mo27525b()).mo80549b((SearchError) null);
    }

    /* renamed from: d */
    public final void mo80110d(Query query) {
        this.f235202c = query;
        C87052fn fnVar = (C87052fn) this.f235205f.mo27525b();
        C58838bb.m90883r(query.mo84435dP());
        if (fnVar.f235177m.mo84383cP(query)) {
            if (!fnVar.f235177m.mo84383cP(fnVar.f235184t.f235136b)) {
                fnVar.f235184t.mo80674c(query);
            }
        }
    }

    /* renamed from: e */
    public final void mo80111e(SearchError searchError) {
        this.f235203d = searchError;
        ((C86893co) this.f235206g.mo27525b()).mo80549b(searchError);
        ((C87052fn) this.f235205f.mo27525b()).mo80715t(searchError);
        mo80591ar();
    }

    /* renamed from: f */
    public final void mo80112f(Query query) {
        if (!this.f235204e && mo80163g(query)) {
            this.f235204e = true;
            mo80591ar();
        }
    }

    /* renamed from: g */
    public final boolean mo80163g(Query query) {
        return this.f235202c.mo84383cP(query) && this.f235202c.f252749G == query.f252749G;
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        fVar.mo85291r("SearchGraphState");
        fVar.mo85288o("foreground query", this.f235202c);
        fVar.mo85288o("error", this.f235203d);
    }

    @Deprecated
    /* renamed from: h */
    public final boolean mo80164h(Query query) {
        return ((C87052fn) this.f235205f.mo27525b()).f235177m.mo84383cP(query);
    }

    /* access modifiers changed from: protected */
    /* renamed from: hq */
    public final void mo80407hq(C88433bd bdVar, int i) {
        this.f235202c = Query.f252741b;
    }

    /* renamed from: i */
    public final C86577w mo80185i(Query query, C60870cx cxVar, C60870cx cxVar2, C89356b bVar) {
        return m140684m().mo80186j(query, cxVar, cxVar2, C58485gu.m89845m(), bVar);
    }

    /* renamed from: j */
    public final C86577w mo80186j(Query query, C60870cx cxVar, C60870cx cxVar2, List list, C89356b bVar) {
        throw null;
    }

    /* renamed from: k */
    public final C86577w mo80187k(Query query, C86575u uVar, C89356b bVar) {
        return m140684m().mo80188l(query, uVar, C58485gu.m89845m(), bVar);
    }

    /* renamed from: l */
    public final C86577w mo80188l(Query query, C86575u uVar, List list, C89356b bVar) {
        throw null;
    }

    public final String toString() {
        return "SearchGraphState";
    }
}
