package com.google.android.apps.gsa.p8839t.p8844e;

import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123770cj;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.SettableFuture;

/* renamed from: com.google.android.apps.gsa.t.e.c */
/* compiled from: PG */
public final /* synthetic */ class C118354c implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C118356e f328503a;

    public /* synthetic */ C118354c(C118356e eVar) {
        this.f328503a = eVar;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C118356e eVar = this.f328503a;
        C58833ax axVar = (C58833ax) obj;
        if (!axVar.mo56113h()) {
            eVar.f328515k.mo57356n(C123770cj.f341899b);
            return;
        }
        C58976aa aaVar = C58975e.f156826a;
        C123770cj cjVar = (C123770cj) axVar.mo56107c();
        if (eVar.f328515k.isDone()) {
            eVar.f328515k = new SettableFuture();
        }
        eVar.f328515k.mo57356n(cjVar);
    }
}
