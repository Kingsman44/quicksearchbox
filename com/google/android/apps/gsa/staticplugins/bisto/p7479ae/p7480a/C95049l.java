package com.google.android.apps.gsa.staticplugins.bisto.p7479ae.p7480a;

import com.google.android.libraries.gsa.p1876k.C22862b;
import com.google.android.libraries.search.p2904c.C37672hs;
import com.google.android.libraries.search.p2904c.p2907ab.C37336c;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ae.a.l */
/* compiled from: PG */
public final /* synthetic */ class C95049l implements C22862b {

    /* renamed from: a */
    public final /* synthetic */ C95051n f265906a;

    /* renamed from: b */
    public final /* synthetic */ C37672hs f265907b;

    public /* synthetic */ C95049l(C95051n nVar, C37672hs hsVar) {
        this.f265906a = nVar;
        this.f265907b = hsVar;
    }

    /* renamed from: a */
    public final Object mo17947a() {
        C95051n nVar = this.f265906a;
        C37672hs hsVar = this.f265907b;
        if (nVar.f265914d.mo89026d()) {
            C59104x b = C95051n.f265910a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "DialogHandler");
            ((C59052c) ((C59052c) b).mo56372aa(18101)).mo56386p("Playing start sound");
            nVar.f265914d.mo89023b();
        }
        C37336c c = nVar.f265912b.mo88881c(true);
        if (C95051n.m157001w(c)) {
            C59104x c2 = C95051n.f265910a.mo56225c();
            c2.mo56378ag(C58975e.f156826a, "DialogHandler");
            ((C59052c) ((C59052c) c2).mo56372aa(18100)).mo56386p("WABD: AudioSourceOpeningStatus is failed.");
        }
        nVar.f265920j = true;
        nVar.f265923m.put(hsVar, 4);
        nVar.f265922l.add(hsVar);
        return c;
    }
}
