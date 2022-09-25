package com.google.android.apps.gsa.p8839t.p8841b;

import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.SettableFuture;

/* renamed from: com.google.android.apps.gsa.t.b.b */
/* compiled from: PG */
public final /* synthetic */ class C118343b implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ SettableFuture f328485a;

    public /* synthetic */ C118343b(SettableFuture settableFuture) {
        this.f328485a = settableFuture;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        SettableFuture settableFuture = this.f328485a;
        C59104x d = C118345d.f328487a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "PCP.HmAutomationMng");
        ((C59052c) ((C59052c) ((C59052c) d).mo56382g((Exception) obj)).mo56372aa(6936)).mo56386p("Failed to fetch network connectivity");
        settableFuture.mo57356n(C58836b.f156633a);
    }
}
