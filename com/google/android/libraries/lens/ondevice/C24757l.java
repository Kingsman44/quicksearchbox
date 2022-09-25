package com.google.android.libraries.lens.ondevice;

import com.google.android.libraries.lens.ondevice.p2031h.C24519o;
import com.google.common.p4526f.p4527a.C58970a;

/* renamed from: com.google.android.libraries.lens.ondevice.l */
/* compiled from: PG */
public final /* synthetic */ class C24757l implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C24823o f67648a;

    public /* synthetic */ C24757l(C24823o oVar) {
        this.f67648a = oVar;
    }

    public final void run() {
        C24823o oVar = this.f67648a;
        ((C58970a) ((C58970a) C24823o.f67844a.mo56224b()).mo56372aa(48758)).mo56386p("Shutting down");
        oVar.f67847d.mo30000d();
        C24519o oVar2 = oVar.f67850g;
        if (oVar2 != null) {
            oVar2.mo29931c();
        } else {
            ((C58970a) ((C58970a) C24823o.f67844a.mo56225c()).mo56372aa(48759)).mo56386p("Missing cascadeRunner");
        }
        oVar.f67850g = null;
    }
}
