package com.google.android.apps.gsa.staticplugins.opa.p8319bb.p8323d;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.p6816p.C86251f;
import com.google.android.apps.gsa.search.core.service.p6842a.C86593a;
import com.google.android.apps.gsa.search.shared.service.C87684al;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88244um;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88283vy;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88284vz;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88286wa;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.android.libraries.gsa.p1876k.C22872h;
import com.google.assistant.p3897e.p3910e.p3911a.C51195j;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.SettableFuture;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.bb.d.v */
/* compiled from: PG */
public final /* synthetic */ class C107796v implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C107799y f299944a;

    /* renamed from: b */
    public final /* synthetic */ Query f299945b;

    /* renamed from: c */
    public final /* synthetic */ C86251f f299946c;

    public /* synthetic */ C107796v(C107799y yVar, Query query, C86251f fVar) {
        this.f299944a = yVar;
        this.f299945b = query;
        this.f299946c = fVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C107799y yVar = this.f299944a;
        Query query = this.f299945b;
        C86251f fVar = this.f299946c;
        C58833ax axVar = (C58833ax) obj;
        if (axVar.mo56113h()) {
            C51195j jVar = (C51195j) axVar.mo56107c();
            yVar.mo96287e(jVar, query);
            C107787m mVar = yVar.f299957g;
            SettableFuture settableFuture = fVar.f233147f;
            C22872h.m42743c(C86593a.class);
            C58976aa aaVar = C58975e.f156826a;
            mVar.f299931h = mVar.mo96283a(jVar);
            mVar.f299929f.mo78616L(jVar);
            C88284vz vzVar = (C88284vz) C88286wa.f238774c.createBuilder();
            vzVar.copyOnWrite();
            C88286wa waVar = (C88286wa) vzVar.instance;
            jVar.getClass();
            waVar.f238777b = jVar;
            waVar.f238776a |= 1;
            C87684al alVar = new C87684al(C88244um.SHOW_ASSISTANT_RESPONSE);
            alVar.mo81965b(C88283vy.f238773a, (C88286wa) vzVar.build());
            alVar.mo81966c(query);
            mVar.f299927d.mo96337a(alVar.mo81964a());
            new C90873ag(settableFuture, mVar.f299928e, "Tts", new C107783i(mVar, query, new C107786l(mVar, query, jVar))).mo85223a(C107784j.f299919a);
        }
        yVar.f299952b.mo96258f(query);
        return C118826c.f331422a;
    }
}
