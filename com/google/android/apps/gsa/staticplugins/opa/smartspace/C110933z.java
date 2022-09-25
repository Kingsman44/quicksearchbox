package com.google.android.apps.gsa.staticplugins.opa.smartspace;

import com.google.common.base.C58836b;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.smartspace.z */
/* compiled from: PG */
public final /* synthetic */ class C110933z implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C60870cx f309036a;

    public /* synthetic */ C110933z(C60870cx cxVar) {
        this.f309036a = cxVar;
    }

    public final Object call() {
        C60870cx cxVar = this.f309036a;
        C59071e eVar = C110512ac.f308097a;
        if (!cxVar.isDone() || cxVar.isCancelled()) {
            C59104x d = C110512ac.f308097a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "OpaSSRequestSender");
            ((C59052c) ((C59052c) d).mo56372aa(26464)).mo56386p("getLatestProactiveContent failed.");
        } else {
            C58976aa aaVar = C58975e.f156826a;
        }
        return C58836b.f156633a;
    }
}
