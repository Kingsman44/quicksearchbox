package com.google.android.apps.search.assistant.platform.appintegration.grpc;

import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60845bz;

/* renamed from: com.google.android.apps.search.assistant.platform.appintegration.grpc.ad */
/* compiled from: PG */
final class C119584ad implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ String f333286a = "Binding to PublicSearchService";

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C59104x d = C119586af.f333288a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "GrpcPSSDataSender");
        ((C59052c) ((C59052c) ((C59052c) d).mo56382g(th)).mo56372aa(34448)).mo56389s("Future [%s] FAILED", this.f333286a);
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        Void voidR = (Void) obj;
        C59104x b = C119586af.f333288a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "GrpcPSSDataSender");
        ((C59052c) ((C59052c) b).mo56372aa(34449)).mo56389s("Future [%s] SUCCESS", this.f333286a);
    }
}
