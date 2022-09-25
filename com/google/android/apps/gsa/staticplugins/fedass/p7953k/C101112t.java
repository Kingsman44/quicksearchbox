package com.google.android.apps.gsa.staticplugins.fedass.p7953k;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.preferences.C86337q;
import com.google.android.apps.gsa.staticplugins.fedass.p7939a.C100740f;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.fedass.k.t */
/* compiled from: PG */
public final /* synthetic */ class C101112t implements C100740f {

    /* renamed from: a */
    public final /* synthetic */ C101077aa f282309a;

    public /* synthetic */ C101112t(C101077aa aaVar) {
        this.f282309a = aaVar;
    }

    /* renamed from: a */
    public final void mo92031a(Object obj) {
        C101077aa aaVar = this.f282309a;
        C118826c cVar = (C118826c) obj;
        C59104x b = C101077aa.f282243a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "TrainMaintainTask");
        ((C59052c) ((C59052c) b).mo56372aa(19783)).mo56386p("Successfully completed the train periodic task.");
        C86337q b2 = aaVar.f282246c.mo80076b();
        b2.mo80072g("FedAss.TrainPeriodicTask.LastSuccess", aaVar.f282245b.mo26870b());
        b2.apply();
    }
}
