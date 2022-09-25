package com.google.android.apps.gsa.staticplugins.search.session.state;

import com.google.android.apps.gsa.search.core.p6519al.p6668cr.C85199a;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.p6820r.C86388aj;
import com.google.android.apps.gsa.search.core.p6820r.C86389b;
import com.google.android.apps.gsa.search.core.p6820r.C86394c;
import com.google.android.apps.gsa.search.core.p6820r.C86575u;
import com.google.android.apps.gsa.search.core.p6820r.C86577w;
import com.google.android.apps.gsa.search.core.p6820r.p6837i.C86495m;
import com.google.android.apps.gsa.search.core.p6820r.p6838j.C86498a;
import com.google.android.apps.gsa.search.shared.actions.SearchError;
import com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88433bd;
import com.google.android.apps.gsa.shared.logger.p7053c.C89880c;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.p7012bb.C89356b;
import com.google.android.apps.gsa.shared.p7066m.C90110fh;
import com.google.android.apps.gsa.shared.p7127q.C90452a;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.staticplugins.search.session.p8711c.p8713b.C116534a;
import com.google.android.apps.gsa.staticplugins.search.session.p8711c.p8713b.C116535b;
import com.google.common.base.C58833ax;
import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C60537to;
import com.google.common.util.concurrent.C60870cx;
import dagger.C68214a;
import dagger.p5294a.C68219e;
import dagger.p5294a.C68226l;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.search.session.state.gr */
/* compiled from: PG */
public final class C116742gr extends C116780ib implements C86389b, C86388aj, C86498a {

    /* renamed from: a */
    public boolean f323824a = true;

    /* renamed from: b */
    private final C68214a f323825b;

    /* renamed from: c */
    private final C68214a f323826c;

    /* renamed from: d */
    private final C68214a f323827d;

    /* renamed from: e */
    private final C116535b f323828e;

    /* renamed from: f */
    private final C116784if f323829f;

    /* renamed from: g */
    private final C116793io f323830g;

    /* renamed from: h */
    private final C86124t f323831h;

    /* renamed from: i */
    private final C86394c f323832i = new C86394c();

    /* renamed from: j */
    private C86498a f323833j;

    /* renamed from: k */
    private Query f323834k = Query.f252741b;

    /* renamed from: l */
    private SearchError f323835l;

    public C116742gr(C68214a aVar, C68214a aVar2, C68214a aVar3, C68214a aVar4, C116535b bVar, C116784if ifVar, C116793io ioVar, C86124t tVar) {
        super(aVar, 163);
        this.f323825b = aVar2;
        this.f323826c = aVar3;
        this.f323827d = aVar4;
        this.f323828e = bVar;
        this.f323829f = ifVar;
        this.f323830g = ioVar;
        this.f323831h = tVar;
    }

    /* renamed from: o */
    private final C86498a m193848o() {
        C86498a aVar = this.f323833j;
        if (aVar != null) {
            return aVar;
        }
        C116535b bVar = this.f323828e;
        C86394c cVar = this.f323832i;
        C86495m mVar = (C86495m) bVar.f323152a.mo17428b();
        mVar.getClass();
        C68214a a = C68219e.m98518a(((C68226l) bVar.f323153b).f184585a);
        a.getClass();
        C85199a aVar2 = (C85199a) bVar.f323154c.mo17428b();
        aVar2.getClass();
        C116534a aVar3 = new C116534a(mVar, a, aVar2, cVar, this, this);
        this.f323833j = aVar3;
        return aVar3;
    }

    /* renamed from: p */
    private final List m193849p(Query query) {
        C58480gp gpVar = new C58480gp(4);
        C116784if ifVar = this.f323829f;
        query.getClass();
        C116786ih ihVar = (C116786ih) ifVar.f323991a.mo17428b();
        ihVar.getClass();
        gpVar.mo55395g(new C116783ie(query, ihVar));
        C116793io ioVar = this.f323830g;
        query.getClass();
        C116667dx dxVar = (C116667dx) ioVar.f324027a.mo17428b();
        dxVar.getClass();
        gpVar.mo55395g(new C116792in(query, dxVar));
        return gpVar.mo55394f();
    }

    /* renamed from: a */
    public final void mo80107a(Query query) {
        C58976aa aaVar = C58975e.f156826a;
        C116720fw fwVar = (C116720fw) this.f323826c.mo27525b();
        Query query2 = this.f323834k;
        C60537to a = C89880c.m146354a(query2);
        if (query2.mo84460dn() && fwVar.mo102851n()) {
            C116719fv fvVar = fwVar.f323701e;
            fvVar.getClass();
            if (fvVar.f323694b.mo84383cP(query)) {
                fwVar.f323701e.f323693a.f233510b = true;
            }
        }
        fwVar.mo102846g(query, a);
    }

    /* renamed from: b */
    public final void mo80108b(Query query) {
        ((C116720fw) this.f323826c.mo27525b()).mo102848j(query, 464, C60537to.TASKGRAPH_NO_ENDSTATE_LOGGED, C58833ax.m90834k(new C90452a(211, C89885b.INTERNAL_ERROR_UNKNOWN_ENDSTATE_VALUE)));
    }

    /* renamed from: c */
    public final void mo80109c() {
        this.f323824a = false;
        this.f323835l = null;
        ((C116611bv) this.f323827d.mo27525b()).mo102796g((SearchError) null);
    }

    /* renamed from: d */
    public final void mo80110d(Query query) {
        this.f323834k = query;
        C116735gk gkVar = (C116735gk) this.f323825b.mo27525b();
        C58838bb.m90883r(query.mo84435dP());
        if (gkVar.f323784p.mo84383cP(query)) {
            if (!gkVar.f323784p.mo84383cP(gkVar.f323791w.f323727b)) {
                gkVar.f323791w.mo102854e(query);
            }
        }
    }

    /* renamed from: e */
    public final void mo80111e(SearchError searchError) {
        if (this.f323831h.mo79746e(C90110fh.f250663bH)) {
            C116735gk gkVar = (C116735gk) this.f323825b.mo27525b();
            if (this.f323834k.mo84420dA() && (this.f323834k.mo84395cb(this.f323831h.mo79745c(C90110fh.f250705k), this.f323831h.mo79745c(C90110fh.f250636ah)) || this.f323834k.mo84461do())) {
                if ((!((C116735gk) this.f323825b.mo27525b()).f323784p.mo84383cP(this.f323834k) || !gkVar.f323736B) && !this.f323834k.mo84391cX() && searchError.mo81135N() == 524292) {
                    mo80591ar();
                    return;
                }
            }
        }
        C58976aa aaVar = C58975e.f156826a;
        this.f323835l = searchError;
        ((C116611bv) this.f323827d.mo27525b()).mo102796g(searchError);
        ((C116735gk) this.f323825b.mo27525b()).mo102908y(searchError);
        mo80591ar();
    }

    /* renamed from: f */
    public final void mo80112f(Query query) {
        if (!this.f323824a && mo80163g(query)) {
            this.f323824a = true;
            mo80591ar();
        }
    }

    /* renamed from: g */
    public final boolean mo80163g(Query query) {
        return this.f323834k.mo84383cP(query) && this.f323834k.f252749G == query.f252749G;
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        fVar.mo85291r("SearchGraphState");
        fVar.mo85288o("foreground query", this.f323834k);
        fVar.mo85288o("error", this.f323835l);
    }

    @Deprecated
    /* renamed from: h */
    public final boolean mo80164h(Query query) {
        return ((C116735gk) this.f323825b.mo27525b()).f323784p.mo84383cP(query);
    }

    /* access modifiers changed from: protected */
    /* renamed from: hq */
    public final void mo80407hq(C88433bd bdVar, int i) {
        this.f323834k = Query.f252741b;
    }

    /* renamed from: i */
    public final C86577w mo80185i(Query query, C60870cx cxVar, C60870cx cxVar2, C89356b bVar) {
        return m193848o().mo80186j(query, cxVar, cxVar2, m193849p(query), bVar);
    }

    /* renamed from: j */
    public final C86577w mo80186j(Query query, C60870cx cxVar, C60870cx cxVar2, List list, C89356b bVar) {
        throw null;
    }

    /* renamed from: k */
    public final C86577w mo80187k(Query query, C86575u uVar, C89356b bVar) {
        return m193848o().mo80188l(query, uVar, m193849p(query), bVar);
    }

    /* renamed from: l */
    public final C86577w mo80188l(Query query, C86575u uVar, List list, C89356b bVar) {
        throw null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public final SearchError mo102920m(Query query) {
        if (mo80163g(query)) {
            return this.f323835l;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public final void mo102921n(C60537to toVar) {
        ((C116720fw) this.f323826c.mo27525b()).mo102846g(this.f323834k, toVar);
        this.f323832i.mo80165a();
    }

    public final String toString() {
        return "SearchGraphState";
    }
}
