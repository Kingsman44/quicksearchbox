package com.google.android.apps.gsa.staticplugins.search.session.p8718h;

import com.google.android.apps.gsa.search.core.p6884y.p6889e.p6900j.p6901a.C87349a;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.staticplugins.p7855dr.p7857b.C99998af;
import com.google.android.apps.gsa.staticplugins.search.session.state.C116733gi;
import com.google.android.apps.gsa.staticplugins.search.session.state.C116735gk;
import com.google.android.apps.gsa.staticplugins.search.session.state.C116766ho;
import com.google.android.libraries.gsa.monet.service.C23052c;
import com.google.common.base.C58838bb;
import com.google.common.util.concurrent.C60870cx;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.staticplugins.search.session.h.d */
/* compiled from: PG */
public final class C116553d implements C87349a {

    /* renamed from: a */
    public final C116735gk f323192a;

    /* renamed from: b */
    public final Map f323193b = new HashMap();

    /* renamed from: c */
    public final C116766ho f323194c;

    /* renamed from: d */
    public C116552c f323195d;

    public C116553d(C116735gk gkVar, C116766ho hoVar) {
        this.f323192a = gkVar;
        this.f323194c = hoVar;
    }

    /* renamed from: a */
    public final Query mo81002a() {
        return this.f323192a.f323783o;
    }

    /* renamed from: b */
    public final Query mo81003b() {
        return this.f323192a.f323784p;
    }

    /* renamed from: c */
    public final void mo81004c(Query query) {
        this.f323192a.mo80462q(query);
    }

    /* renamed from: d */
    public final void mo81005d(Query query) {
        this.f323192a.mo102868F(query);
    }

    /* renamed from: e */
    public final void mo81006e(Query query) {
        this.f323192a.mo102871L(query);
    }

    /* renamed from: f */
    public final void mo81007f(C23052c cVar, C99998af afVar) {
        if (this.f323193b.isEmpty()) {
            C58838bb.m90883r(this.f323195d == null);
            C116552c cVar2 = new C116552c(this);
            this.f323195d = cVar2;
            this.f323194c.mo80760l(cVar2);
        }
        if (!this.f323193b.containsKey(afVar)) {
            C116550a aVar = new C116550a(this, afVar);
            cVar.mo28427o(aVar);
            this.f323193b.put(afVar, new C116551b(cVar, aVar));
        }
    }

    /* renamed from: g */
    public final C60870cx mo81008g() {
        return this.f323192a.mo80461o();
    }

    /* renamed from: h */
    public final void mo81009h() {
        this.f323192a.mo102865B();
    }

    /* renamed from: i */
    public final boolean mo81010i() {
        C116735gk gkVar = this.f323192a;
        if (!gkVar.f323784p.mo84418cy()) {
            return false;
        }
        gkVar.mo102890ah(new C116733gi());
        Query k = gkVar.mo102900k();
        if (k == null || k.mo84385cR()) {
            return false;
        }
        gkVar.mo102876Q(true);
        return true;
    }
}
