package com.google.android.apps.gsa.staticplugins.opa.smartspace.p8462m;

import com.google.android.apps.gsa.opa.smartspace.C83741am;
import com.google.android.apps.gsa.opa.smartspace.C83800p;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.common.p4526f.p4527a.C58970a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.smartspace.m.m */
/* compiled from: PG */
public final /* synthetic */ class C110825m implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C110835w f308772a;

    public /* synthetic */ C110825m(C110835w wVar) {
        this.f308772a = wVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C110835w wVar = this.f308772a;
        C83800p pVar = (C83800p) obj;
        if (!pVar.mo77058d().mo56113h()) {
            ((C58970a) ((C58970a) wVar.f308785a.mo56226d()).mo56372aa(26790)).mo56386p("no weather card in cache!");
            return C118826c.f331423b;
        }
        return wVar.f308791g.mo28210j(wVar.f308789e.mo77143f((C83741am) pVar.mo77058d().mo56107c(), wVar.f308794j), "fetchImage", new C110829q(wVar, pVar, (C83741am) pVar.mo77058d().mo56107c()));
    }
}
