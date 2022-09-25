package com.google.android.apps.gsa.nga.engine.p6038j;

import com.google.android.apps.gsa.nga.engine.b.g.ac;
import com.google.android.apps.gsa.nga.engine.p5964av.C75077bo;
import com.google.android.apps.gsa.nga.engine.p5978b.p5987f.C75242e;
import com.google.android.apps.gsa.nga.engine.p6038j.p6039a.C76163a;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.apps.gsa.nga.engine.j.s */
/* compiled from: PG */
public final /* synthetic */ class C76205s implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C76164aa f211213a;

    /* renamed from: b */
    public final /* synthetic */ C75077bo f211214b;

    public /* synthetic */ C76205s(C76164aa aaVar, C75077bo boVar) {
        this.f211213a = aaVar;
        this.f211214b = boVar;
    }

    public final void run() {
        C76164aa aaVar = this.f211213a;
        C75077bo boVar = this.f211214b;
        aaVar.f211152i.set(true);
        if (boVar.mo71464h().isPresent()) {
            C76163a aVar = aaVar.f211155l;
            ac acVar = (ac) boVar.mo71464h().get();
            C76186aw awVar = aVar.f211143a;
            acVar.getClass();
            C75242e eVar = (C75242e) awVar.f211182a.mo17428b();
            eVar.getClass();
            Executor executor = (Executor) awVar.f211183b.mo17428b();
            executor.getClass();
            aaVar.f211154k = new C76185av(acVar, eVar, executor);
            C76167ad adVar = aaVar.f211154k;
            C58976aa aaVar2 = C58975e.f156826a;
            C76185av avVar = (C76185av) adVar;
            String str = ((C76180aq) avVar.f211180d.get()).f211171a;
            avVar.mo72118b("initialize", new C76177an(avVar, boVar));
        }
    }
}
