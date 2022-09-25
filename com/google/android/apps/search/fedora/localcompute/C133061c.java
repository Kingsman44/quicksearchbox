package com.google.android.apps.search.fedora.localcompute;

import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60845bz;

/* renamed from: com.google.android.apps.search.fedora.localcompute.c */
/* compiled from: PG */
final class C133061c implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ String f362808a;

    public C133061c(String str) {
        this.f362808a = str;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C59104x c = FedoraLocalComputeResultHandlingService.f362794a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "FedoraLCResultSrvc");
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g(th)).mo56372aa(39844)).mo56389s("Failed handle results for session: %s", this.f362808a);
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        Void voidR = (Void) obj;
        C59104x b = FedoraLocalComputeResultHandlingService.f362794a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "FedoraLCResultSrvc");
        ((C59052c) ((C59052c) b).mo56372aa(39845)).mo56389s("Completed handling results for session: %s", this.f362808a);
    }
}
