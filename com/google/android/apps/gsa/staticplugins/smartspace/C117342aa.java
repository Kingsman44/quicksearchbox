package com.google.android.apps.gsa.staticplugins.smartspace;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.common.base.C58817ah;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.smartspace.aa */
/* compiled from: PG */
public final /* synthetic */ class C117342aa implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C117350ai f325713a;

    public /* synthetic */ C117342aa(C117350ai aiVar) {
        this.f325713a = aiVar;
    }

    public final Object apply(Object obj) {
        C117350ai aiVar = this.f325713a;
        if (((Boolean) obj).booleanValue()) {
            aiVar.f325770t.mo98928b();
        } else {
            aiVar.f325764n.mo109933f();
            C59104x d = C117350ai.f325731a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "SmartspaceWorker");
            ((C59052c) ((C59052c) d).mo56372aa(33017)).mo56386p("Can't get location to refresh Weather.");
        }
        return C118826c.f331422a;
    }
}
