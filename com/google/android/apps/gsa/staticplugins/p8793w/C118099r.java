package com.google.android.apps.gsa.staticplugins.p8793w;

import com.google.android.apps.gsa.search.shared.service.p6935b.C87726bh;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.w.r */
/* compiled from: PG */
public final /* synthetic */ class C118099r implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C117724al f327734a;

    public /* synthetic */ C118099r(C117724al alVar) {
        this.f327734a = alVar;
    }

    public final void run() {
        C117724al alVar = this.f327734a;
        if (alVar.f326757j) {
            C59104x d = C117724al.f326726a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "CarAssistantSessionMgr");
            ((C59052c) ((C59052c) d).mo56372aa(18543)).mo56386p("Timed out waiting for response.");
            if (alVar.f326755h.f326724a == C87726bh.STOPPED) {
                alVar.mo103438j();
                return;
            }
            alVar.f326751d.mo79331m(alVar.mo79300b());
            alVar.f326750c.mo86849e(true);
            alVar.mo103440l();
        }
    }
}
