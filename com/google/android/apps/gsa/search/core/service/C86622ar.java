package com.google.android.apps.gsa.search.core.service;

import com.google.android.apps.gsa.search.core.service.p6848e.C86684f;
import com.google.android.apps.gsa.search.core.service.p6848e.C86694p;
import com.google.android.apps.gsa.search.core.service.p6852g.C86727g;
import com.google.android.apps.gsa.search.core.state.p6872d.C86938be;
import com.google.android.apps.gsa.search.core.state.p6872d.C86948bo;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C58979ad;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4526f.p4534f.C59081b;

/* renamed from: com.google.android.apps.gsa.search.core.service.ar */
/* compiled from: PG */
public final /* synthetic */ class C86622ar implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C86626av f234006a;

    public /* synthetic */ C86622ar(C86626av avVar) {
        this.f234006a = avVar;
    }

    public final void run() {
        C86626av avVar = this.f234006a;
        avVar.f234040r = true;
        C86948bo boVar = (C86948bo) avVar.f234030h.mo27525b();
        boVar.f234850h = true;
        C86938be beVar = (C86938be) boVar.f234844b.mo27525b();
        try {
            beVar.f234796j.unregisterReceiver(beVar.f234800n);
            beVar.f234796j.unregisterReceiver(beVar.f234801o);
        } catch (IllegalArgumentException unused) {
        }
        int size = avVar.f234024b.size();
        for (int i = 0; i < size; i++) {
            avVar.mo80241g((C86775r) avVar.f234024b.valueAt(i), true, false);
        }
        avVar.f234024b.clear();
        C86669cg cgVar = (C86669cg) avVar.f234033k.mo27525b();
        C58976aa aaVar = C58975e.f156826a;
        C58485gu j = C58485gu.m89842j(cgVar.f234141e.mo55028h());
        cgVar.f234141e.clear();
        cgVar.f234142f.clear();
        int size2 = j.size();
        for (int i2 = 0; i2 < size2; i2++) {
            cgVar.mo80273h((C86684f) j.get(i2));
        }
        C86694p pVar = cgVar.f234138b;
        pVar.f234188b = null;
        pVar.f234187a.notifyObservers(C86694p.m139653a((C86684f) null));
        ((C86610af) avVar.f234028f.mo27525b()).mo80226g((C86775r) null);
        C86610af afVar = (C86610af) avVar.f234028f.mo27525b();
        C59081b.m91349a(C58979ad.FULL, "stack size");
        if (!afVar.f233976k) {
            afVar.f233974i.mo80357c();
            afVar.f233968c.mo80761o(afVar.f233969d);
            afVar.f233969d.mo80761o(afVar);
            afVar.f233976k = true;
            afVar.f233972g.f232790a.mo79725d(afVar);
        }
        ((C86727g) avVar.f234029g.mo27525b()).mo80257a();
    }
}
