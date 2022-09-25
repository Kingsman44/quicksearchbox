package com.google.android.apps.gsa.staticplugins.fedass.ipc.service;

import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.apps.gsa.staticplugins.fedass.ipc.service.f */
/* compiled from: PG */
public final /* synthetic */ class C100993f implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C101012y f282072a;

    public /* synthetic */ C100993f(C101012y yVar) {
        this.f282072a = yVar;
    }

    public final C60870cx apply(Object obj) {
        C101012y yVar = this.f282072a;
        Void voidR = (Void) obj;
        if (!yVar.f282109f.mo92030a()) {
            C59104x b = C101012y.f282104a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "TrainCommBinder");
            ((C59052c) ((C59052c) b).mo56372aa(19617)).mo56386p("unRegisterTraining() - no-op()");
            return C60866ct.f164955a;
        }
        C59104x b2 = C101012y.f282104a.mo56224b();
        b2.mo56378ag(C58975e.f156826a, "TrainCommBinder");
        ((C59052c) ((C59052c) b2).mo56372aa(19616)).mo56386p("unRegisterTraining() - cancelling all training.");
        return yVar.f282110g.mo92127a();
    }
}
