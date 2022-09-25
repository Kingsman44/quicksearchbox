package com.google.android.apps.gsa.search.core;

import com.google.android.apps.gsa.shared.util.C91043j;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.search.core.z */
/* compiled from: PG */
public final /* synthetic */ class C87391z implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C91043j f235978a;

    public /* synthetic */ C87391z(C91043j jVar) {
        this.f235978a = jVar;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C91043j jVar = this.f235978a;
        Exception exc = (Exception) obj;
        C59104x c = C84413ad.f229680a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "PlayServicesHelper");
        ((C59052c) ((C59052c) c).mo56372aa(7403)).mo56386p("Failed to get Play services availability.");
        jVar.mo17709a(8);
    }
}
