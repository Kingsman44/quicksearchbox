package com.google.android.apps.gsa.staticplugins.bisto.p7531w;

import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124625ar;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.w.bs */
/* compiled from: PG */
public final /* synthetic */ class C96560bs implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C96561bt f270145a;

    public /* synthetic */ C96560bs(C96561bt btVar) {
        this.f270145a = btVar;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C96561bt btVar = this.f270145a;
        Exception exc = (Exception) obj;
        C59104x c = C96561bt.f270146a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "OtaStateChecking");
        ((C59052c) ((C59052c) c).mo56372aa(16647)).mo56386p("Failed to get devices state");
        btVar.mo90240o(C124625ar.UNKNOWN_INTERNAL_OTA_STATE);
    }
}
