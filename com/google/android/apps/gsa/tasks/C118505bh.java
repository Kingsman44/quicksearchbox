package com.google.android.apps.gsa.tasks;

import com.google.android.apps.gsa.search.core.preferences.C86337q;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.tasks.bh */
/* compiled from: PG */
public final /* synthetic */ class C118505bh implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C118506bi f328914a;

    /* renamed from: b */
    public final /* synthetic */ boolean f328915b;

    public /* synthetic */ C118505bh(C118506bi biVar, boolean z) {
        this.f328914a = biVar;
        this.f328915b = z;
    }

    public final void run() {
        C118506bi biVar = this.f328914a;
        boolean z = this.f328915b;
        C118511bn bnVar = (C118511bn) biVar.f328916a.mo27525b();
        C58976aa aaVar = C58975e.f156826a;
        C118478am amVar = bnVar.f328929d;
        synchronized (amVar.f328848e) {
            amVar.f328848e.clear();
            amVar.mo103714a();
        }
        if (z && !((C118526ca) bnVar.f328928c.f329178d.mo6453a()).mo103724h()) {
            C86337q b = bnVar.f328930e.mo80076b();
            b.mo80075j("com.google.android.apps.gsa.tasks.scheduled_tasks");
            b.apply();
        }
        bnVar.mo103731a();
    }
}
