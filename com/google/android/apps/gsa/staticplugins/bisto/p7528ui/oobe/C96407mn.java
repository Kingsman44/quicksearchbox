package com.google.android.apps.gsa.staticplugins.bisto.p7528ui.oobe;

import com.google.android.apps.gsa.staticplugins.bisto.p7488f.C95299e;
import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9392b.p9393a.C124542a;
import com.google.common.base.C58817ah;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.concurrent.TimeoutException;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ui.oobe.mn */
/* compiled from: PG */
public final /* synthetic */ class C96407mn implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C96408mo f269715a;

    public /* synthetic */ C96407mn(C96408mo moVar) {
        this.f269715a = moVar;
    }

    public final Object apply(Object obj) {
        TimeoutException timeoutException = (TimeoutException) obj;
        C58976aa aaVar = C58975e.f156826a;
        ((C95299e) this.f269715a.f269718c.mo27525b()).f266647b.mo57066b("HardwareCapabilitiesTimeout");
        C59104x d = C96408mo.f269716a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "BistoHardwareCapSeq");
        ((C59052c) ((C59052c) d).mo56372aa(17100)).mo56386p("Timeout fetching device capabilities");
        return C124542a.m204020a();
    }
}
