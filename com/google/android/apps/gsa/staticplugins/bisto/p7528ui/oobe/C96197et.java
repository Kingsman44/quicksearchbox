package com.google.android.apps.gsa.staticplugins.bisto.p7528ui.oobe;

import com.google.common.base.C58817ah;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ui.oobe.et */
/* compiled from: PG */
public final /* synthetic */ class C96197et implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C96206fb f269268a;

    public /* synthetic */ C96197et(C96206fb fbVar) {
        this.f269268a = fbVar;
    }

    public final Object apply(Object obj) {
        C96206fb fbVar = this.f269268a;
        Boolean bool = (Boolean) obj;
        if (!bool.booleanValue()) {
            C59104x d = C96206fb.f269286a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "BistoDataLayerSeq");
            ((C59052c) ((C59052c) d).mo56372aa(16987)).mo56386p("Node is not reachable");
            fbVar.f269293h.f266647b.mo57066b("DataLayerCapabilityMissing");
        }
        return bool;
    }
}
