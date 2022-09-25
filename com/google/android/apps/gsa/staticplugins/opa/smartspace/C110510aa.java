package com.google.android.apps.gsa.staticplugins.opa.smartspace;

import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60845bz;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.smartspace.aa */
/* compiled from: PG */
final class C110510aa implements C60845bz {
    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C59104x d = C110512ac.f308097a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "OpaSSRequestSender");
        ((C59052c) ((C59052c) ((C59052c) d).mo56382g(th)).mo56372aa(26460)).mo56386p("Failed to save flight data to PCP");
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        Void voidR = (Void) obj;
        C59104x b = C110512ac.f308097a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "OpaSSRequestSender");
        ((C59052c) ((C59052c) b).mo56372aa(26461)).mo56386p("Successfully saved flight data to PCP.");
    }
}
