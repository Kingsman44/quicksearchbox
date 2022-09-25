package com.google.android.apps.gsa.staticplugins.opa.smartspace.p8460k;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.SettableFuture;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.smartspace.k.f */
/* compiled from: PG */
public final /* synthetic */ class C110721f implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ SettableFuture f308506a;

    public /* synthetic */ C110721f(SettableFuture settableFuture) {
        this.f308506a = settableFuture;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        SettableFuture settableFuture = this.f308506a;
        C59104x c = C110722g.f308507a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "opaSmartspaceRmCtrl");
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g((Exception) obj)).mo56372aa(26733)).mo56386p("Failed to load reminder events from gmscore reminder component.");
        settableFuture.mo57356n(C118826c.f331422a);
    }
}
