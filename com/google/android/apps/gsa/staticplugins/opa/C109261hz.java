package com.google.android.apps.gsa.staticplugins.opa;

import com.google.android.apps.gsa.search.shared.service.p6935b.C87695ad;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.hz */
/* compiled from: PG */
public final /* synthetic */ class C109261hz implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C109266ia f304361a;

    /* renamed from: b */
    public final /* synthetic */ C87695ad f304362b;

    public /* synthetic */ C109261hz(C109266ia iaVar, C87695ad adVar) {
        this.f304361a = iaVar;
        this.f304362b = adVar;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C109266ia iaVar = this.f304361a;
        C87695ad adVar = this.f304362b;
        C59104x d = C109266ia.f304372a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "OpaClientSyncStartCtrl");
        ((C59052c) ((C59052c) ((C59052c) d).mo56382g((Exception) obj)).mo56372aa(22815)).mo56386p("Error get chat history");
        iaVar.mo97730a(adVar);
    }
}
