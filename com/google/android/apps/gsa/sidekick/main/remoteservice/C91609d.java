package com.google.android.apps.gsa.sidekick.main.remoteservice;

import com.google.android.apps.gsa.proactive.p6475b.C84160c;
import com.google.android.apps.gsa.shared.util.p7159c.C90888av;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.sidekick.main.remoteservice.d */
/* compiled from: PG */
final class C91609d extends C90888av {

    /* renamed from: a */
    final /* synthetic */ C91610e f255510a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C91609d(C91610e eVar) {
        super("GoogleNowRemoteService.updateApplicationForegroundState", 1, 8);
        this.f255510a = eVar;
    }

    public final void run() {
        int i = this.f255510a.f255526p.get();
        C58976aa aaVar = C58975e.f156826a;
        ((C84160c) this.f255510a.f255515e.mo27525b()).mo77603d(i > 0);
    }
}
