package com.google.android.apps.gsa.staticplugins.bisto.p7531w;

import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124625ar;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.w.bz */
/* compiled from: PG */
public final /* synthetic */ class C96567bz implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C96569ca f270163a;

    public /* synthetic */ C96567bz(C96569ca caVar) {
        this.f270163a = caVar;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C96569ca caVar = this.f270163a;
        Exception exc = (Exception) obj;
        if (exc instanceof C96584cp) {
            C59104x c = C96569ca.f270168a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "OtaStateUploading");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(exc)).mo56372aa(16668)).mo56386p("Failed to upload OTA. Fatal error. Abort OTA.");
            caVar.mo90226c();
        } else if (!caVar.mo90244t()) {
            C59104x c2 = C96569ca.f270168a.mo56225c();
            c2.mo56378ag(C58975e.f156826a, "OtaStateUploading");
            ((C59052c) ((C59052c) ((C59052c) c2).mo56382g(exc)).mo56372aa(16667)).mo56386p("Failed to upload OTA");
            caVar.mo90240o(C124625ar.READY_TO_UPLOAD_TO_HEADSET);
        }
    }
}
