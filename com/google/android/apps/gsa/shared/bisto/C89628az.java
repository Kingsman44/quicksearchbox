package com.google.android.apps.gsa.shared.bisto;

import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;

/* renamed from: com.google.android.apps.gsa.shared.bisto.az */
/* compiled from: PG */
public final /* synthetic */ class C89628az implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C89653h f242707a;

    public /* synthetic */ C89628az(C89653h hVar) {
        this.f242707a = hVar;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C89653h hVar = this.f242707a;
        if (!hVar.f242763d.f343621b.isConnected()) {
            C59104x d = C89644ba.f242727b.mo56226d();
            d.mo56378ag(C58975e.f156826a, "ProtoExchangeSocketImpl");
            ((C59052c) ((C59052c) d).mo56372aa(10291)).mo56386p("Connect timeout, closing socket");
            C89644ba.m145922f(hVar);
        }
        return C60866ct.f164955a;
    }
}
