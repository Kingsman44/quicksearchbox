package com.google.android.apps.gsa.staticplugins.opa.zerostate;

import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.zerostate.ce */
/* compiled from: PG */
public final /* synthetic */ class C114704ce implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C114708ci f318276a;

    public /* synthetic */ C114704ce(C114708ci ciVar) {
        this.f318276a = ciVar;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C114708ci ciVar = this.f318276a;
        C59104x d = C114708ci.f318280a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "ZSSectionDataManager");
        ((C59052c) ((C59052c) ((C59052c) d).mo56382g((Exception) obj)).mo56372aa(29233)).mo56386p("Failed to load one or more ZeroState section data source. But still merge and update sectionDataList");
        ciVar.mo101527c();
        ciVar.f318290k = false;
    }
}
