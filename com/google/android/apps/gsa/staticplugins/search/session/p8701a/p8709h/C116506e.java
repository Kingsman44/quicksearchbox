package com.google.android.apps.gsa.staticplugins.search.session.p8701a.p8709h;

import android.os.Bundle;
import com.google.android.apps.gsa.search.core.p6519al.p6725ds.C85452b;
import com.google.android.apps.gsa.search.core.p6519al.p6725ds.C85454d;
import com.google.android.apps.gsa.search.core.p6816p.C86230bm;
import com.google.android.apps.gsa.search.core.p6816p.C86231bn;
import com.google.android.apps.gsa.search.core.p6816p.C86232bo;
import com.google.android.apps.gsa.search.core.p6820r.p6821a.C86354a;
import com.google.android.apps.gsa.search.core.p6820r.p6821a.p6829h.C86377b;
import com.google.android.apps.gsa.search.shared.actions.SearchError;
import com.google.android.apps.gsa.search.shared.api.C87504b;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.p7127q.C90457d;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.staticplugins.search.session.state.C116735gk;
import com.google.android.apps.gsa.staticplugins.search.session.state.C116813jh;
import com.google.android.apps.gsa.staticplugins.search.session.state.C116814ji;
import com.google.android.apps.gsa.staticplugins.search.session.state.C116815jj;
import com.google.android.apps.gsa.staticplugins.search.session.state.C116816jk;
import com.google.android.apps.gsa.staticplugins.search.session.state.C116817jl;
import com.google.android.apps.gsa.staticplugins.search.session.state.C116818jm;
import com.google.android.apps.gsa.staticplugins.search.session.state.C116819jn;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;

/* renamed from: com.google.android.apps.gsa.staticplugins.search.session.a.h.e */
/* compiled from: PG */
public final class C116506e extends C86354a implements C86377b {

    /* renamed from: a */
    private final Query f323039a;

    /* renamed from: b */
    private final C116735gk f323040b;

    /* renamed from: c */
    private final C116819jn f323041c;

    public C116506e(Query query, C116735gk gkVar, C116819jn jnVar) {
        this.f323039a = query;
        this.f323040b = gkVar;
        this.f323041c = jnVar;
    }

    /* renamed from: a */
    public final C60870cx mo80149a(long j, Query query, C87504b bVar, C86231bn bnVar, C86230bm bmVar, C58833ax axVar) {
        Bundle bundle;
        long j2 = j;
        Query query2 = query;
        C116819jn jnVar = this.f323041c;
        if (!((C116735gk) jnVar.f324168d.mo27525b()).f323784p.mo84383cP(query)) {
            return C60856cj.m92899h(new C90457d("showSearchResult on a preempted query", (int) C89885b.WEBVIEW_LOAD_URL_PREEMPTED_VALUE));
        }
        jnVar.f324153P = j2;
        C85454d dVar = jnVar.f324175k;
        C85452b i = jnVar.mo102956i(j);
        if (jnVar.f324189y.mo84383cP(query)) {
            bundle = jnVar.f324180p;
        } else {
            bundle = jnVar.mo102955g(query);
        }
        C60870cx e = dVar.mo78963e(i, query, bVar, bnVar, bmVar, axVar, bundle);
        if (query.equals(Query.f252741b) || query.mo84435dP()) {
            return e;
        }
        new C90873ag(C60922j.m93045h(e, C116813jh.f324131a, C60826bg.f164896a), jnVar.f324173i, "WebViewReadyToShowCallback", new C116814ji(jnVar, query)).mo85223a(C116815jj.f324134a);
        new C90873ag(C60922j.m93045h(e, C116816jk.f324135a, C60826bg.f164896a), jnVar.f324173i, "WebViewDoneCallback", new C116817jl(jnVar, query)).mo85223a(new C116818jm(jnVar, query));
        return e;
    }

    /* renamed from: b */
    public final void mo80150b() {
        this.f323040b.mo102866D();
        C116819jn jnVar = this.f323041c;
        Query query = this.f323039a;
        C58976aa aaVar = C58975e.f156826a;
        jnVar.f324189y = query;
        jnVar.f324144D = false;
        jnVar.f324180p = jnVar.mo102955g(jnVar.f324189y);
        jnVar.mo102968x(2);
    }

    /* renamed from: c */
    public final void mo80151c(C86232bo boVar) {
        C116819jn jnVar = this.f323041c;
        Query query = this.f323039a;
        long l = boVar.mo79888l();
        C58976aa aaVar = C58975e.f156826a;
        jnVar.f324181q = l;
        jnVar.f324182r = query;
        jnVar.mo102961p();
        C116819jn.m194018m(470, jnVar.f324182r.f252749G);
        jnVar.mo80591ar();
    }

    /* renamed from: d */
    public final void mo80152d() {
        this.f323041c.mo102962q(this.f323039a);
    }

    /* renamed from: e */
    public final void mo80153e(SearchError searchError) {
        this.f323041c.mo102963r(this.f323039a, searchError);
    }

    /* renamed from: f */
    public final void mo80154f() {
        this.f323041c.mo102969y();
    }

    /* renamed from: g */
    public final void mo80155g() {
        this.f323041c.mo102964s(this.f323039a);
    }
}
