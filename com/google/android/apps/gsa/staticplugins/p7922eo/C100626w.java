package com.google.android.apps.gsa.staticplugins.p7922eo;

import com.google.android.apps.gsa.search.core.service.C86775r;
import com.google.android.apps.gsa.search.shared.service.C87684al;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88244um;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.eo.w */
/* compiled from: PG */
public final /* synthetic */ class C100626w {

    /* renamed from: a */
    public final /* synthetic */ C100585an f281389a;

    public /* synthetic */ C100626w(C100585an anVar) {
        this.f281389a = anVar;
    }

    /* renamed from: a */
    public final void mo91990a() {
        C86775r rVar = this.f281389a.f281257s.f233977l;
        boolean z = rVar != null;
        if (z) {
            rVar.f234383e.mo80379b(new C87684al(C88244um.NOTIFY_DEVICE_SELECTION_SUPPRESSION).mo81964a());
        }
        C59104x b = C100585an.f281229a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "VSWorkerHelper");
        ((C59052c) ((C59052c) b).mo56372aa(33706)).mo56389s("#onSuppress - activeClient: %b", Boolean.valueOf(z));
    }
}
