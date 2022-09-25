package com.google.android.apps.gsa.staticplugins.opa.zerostate.sections;

import com.google.android.apps.gsa.opa.p6440e.C83608a;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.C114577b;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.C114606c;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.C114705cf;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.C114708ci;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.C114714d;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.C114730f;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8634h.C114757k;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protos.p4934ay.p4939d.p4940a.p4941a.p4942a.p4943a.C64328d;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.zerostate.sections.q */
/* compiled from: PG */
public final /* synthetic */ class C115072q implements C83608a {

    /* renamed from: a */
    public final /* synthetic */ C115077v f319412a;

    public /* synthetic */ C115072q(C115077v vVar) {
        this.f319412a = vVar;
    }

    /* renamed from: a */
    public final void mo76967a(C64328d dVar) {
        C114577b bVar;
        C115077v vVar = this.f319412a;
        if (dVar.f173912a == 2 && (bVar = vVar.f319425e) != null) {
            C114730f fVar = bVar.f317800a;
            C114757k kVar = bVar.f317801b;
            C114708ci ciVar = fVar.f319042g;
            C58976aa aaVar = C58975e.f156826a;
            ciVar.mo101528d();
            C114708ci ciVar2 = fVar.f319042g;
            new C90873ag(ciVar2.f318281b.mo28209i(ciVar2.f318286g.mo101842a(), "getHomeAutomationSectionDataFuture", C114705cf.f318277a), fVar.f319052q, "refreshHomeAutomationData", new C114606c(kVar)).mo85223a(C114714d.f318323a);
        }
    }
}
