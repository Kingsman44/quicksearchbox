package com.google.android.apps.gsa.staticplugins.opa.morris2.framework;

import com.google.android.libraries.assistant.auto.tng.morris.framework.C14985g;
import com.google.common.p4522b.C58800sl;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.morris2.framework.j */
/* compiled from: PG */
public final /* synthetic */ class C109633j implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C109638o f305310a;

    public /* synthetic */ C109633j(C109638o oVar) {
        this.f305310a = oVar;
    }

    public final void run() {
        C109638o oVar = this.f305310a;
        C59104x b = C109638o.f305343a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "Morris.LifecycleMng");
        ((C59052c) ((C59052c) b).mo56372aa(24846)).mo56386p("#onNavigationStopped");
        oVar.mo97932a();
        C58800sl lA = oVar.f305344b.iterator();
        while (lA.hasNext()) {
            ((C14985g) lA.next()).mo21505e();
        }
    }
}
