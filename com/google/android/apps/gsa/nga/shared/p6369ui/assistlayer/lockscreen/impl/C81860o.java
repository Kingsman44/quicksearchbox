package com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.lockscreen.impl;

import com.google.android.apps.gsa.nga.shared.p6417x.C83349aj;
import com.google.android.apps.gsa.nga.shared.p6417x.C83369s;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.nga.shared.ui.assistlayer.lockscreen.impl.o */
/* compiled from: PG */
public final /* synthetic */ class C81860o implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C81865t f223850a;

    public /* synthetic */ C81860o(C81865t tVar) {
        this.f223850a = tVar;
    }

    public final void run() {
        C81865t tVar = this.f223850a;
        C59104x b = C81865t.f223856a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "TransparentAssistCont");
        ((C59052c) ((C59052c) b).mo56372aa(6291)).mo56386p("onCreate");
        tVar.f223861f.mo76662b(tVar.f223860e.mo75156i(), new C81853h(tVar));
        tVar.f223861f.mo76662b(C83349aj.m132655j(tVar.f223860e.mo75156i(), tVar.f223860e.mo75159l(), tVar.f223869n.f223135c, C81854i.f223844a), new C83369s(tVar.f223858c, "onIsActiveChanged", new C81855j(tVar)));
        tVar.f223861f.mo76663c(tVar.f223863h, new C83369s(tVar.f223858c, "onShouldAndCanShowActivityChanged", new C81856k(tVar)));
        tVar.f223858c.mo28212l("[NGA] subscribeAndNotify.createdAndShown", new C81857l(tVar));
    }
}
