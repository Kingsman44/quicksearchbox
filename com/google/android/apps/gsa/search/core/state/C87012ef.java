package com.google.android.apps.gsa.search.core.state;

import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.apps.gsa.search.core.state.ef */
/* compiled from: PG */
public final /* synthetic */ class C87012ef implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C87023eq f235000a;

    /* renamed from: b */
    public final /* synthetic */ Query f235001b;

    /* renamed from: c */
    public final /* synthetic */ C22869e f235002c;

    public /* synthetic */ C87012ef(C87023eq eqVar, Query query, C22869e eVar) {
        this.f235000a = eqVar;
        this.f235001b = query;
        this.f235002c = eVar;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C87023eq eqVar = this.f235000a;
        Query query = this.f235001b;
        C22869e eVar = this.f235002c;
        ((C59052c) ((C59052c) ((C59052c) C87023eq.f235022a.mo56226d()).mo56382g((Exception) obj)).mo56372aa(8765)).mo56386p("boolean future in dispatchAssistantResult failed");
        if (((C87052fn) eqVar.f235038c.mo27525b()).f235177m.mo84383cP(query)) {
            eVar.run();
        }
    }
}
