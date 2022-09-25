package com.google.android.apps.gsa.nga.engine.p6038j;

import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.nga.engine.j.r */
/* compiled from: PG */
public final /* synthetic */ class C76204r implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C76164aa f211212a;

    public /* synthetic */ C76204r(C76164aa aaVar) {
        this.f211212a = aaVar;
    }

    public final void run() {
        C76167ad adVar = this.f211212a.f211154k;
        if (adVar != null) {
            C58976aa aaVar = C58975e.f156826a;
            C76185av avVar = (C76185av) adVar;
            String str = ((C76180aq) avVar.f211180d.get()).f211171a;
            avVar.mo72118b("onTimeout", new C76169af(avVar));
        }
    }
}
