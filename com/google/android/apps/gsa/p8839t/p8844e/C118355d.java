package com.google.android.apps.gsa.p8839t.p8844e;

import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123770cj;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.t.e.d */
/* compiled from: PG */
public final /* synthetic */ class C118355d implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C118356e f328504a;

    public /* synthetic */ C118355d(C118356e eVar) {
        this.f328504a = eVar;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C118356e eVar = this.f328504a;
        C59104x d = C118356e.f328505a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "PCP.TopContactManager");
        ((C59052c) ((C59052c) ((C59052c) d).mo56382g((Exception) obj)).mo56372aa(6944)).mo56386p("#maybeReadTopContactsFromCache(): opaStore.getTopContactSections() failed with error");
        if (!eVar.f328515k.isDone()) {
            eVar.f328515k.mo57356n(C123770cj.f341899b);
        }
    }
}
