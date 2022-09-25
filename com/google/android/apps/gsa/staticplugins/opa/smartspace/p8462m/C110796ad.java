package com.google.android.apps.gsa.staticplugins.opa.smartspace.p8462m;

import com.google.android.apps.gsa.opa.smartspace.C83800p;
import com.google.android.apps.gsa.staticplugins.opa.smartspace.p8461l.C110757bb;
import com.google.android.apps.gsa.staticplugins.opa.smartspace.p8461l.C110764bi;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4526f.p4527a.C58970a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.smartspace.m.ad */
/* compiled from: PG */
public final /* synthetic */ class C110796ad implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C110812at f308702a;

    /* renamed from: b */
    public final /* synthetic */ boolean f308703b;

    public /* synthetic */ C110796ad(C110812at atVar, boolean z) {
        this.f308702a = atVar;
        this.f308703b = z;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C110812at atVar = this.f308702a;
        boolean z = this.f308703b;
        C83800p pVar = (C83800p) obj;
        C110764bi biVar = atVar.f308729c;
        ((C58970a) ((C58970a) biVar.f308623n.mo56224b()).mo56372aa(26758)).mo56386p("handleWeatherPreferenceChanged");
        if (biVar.f308612c.mo77175m()) {
            return biVar.mo98875m(pVar);
        }
        C58495hd i = pVar.mo77065i();
        return biVar.f308614e.mo28210j(biVar.mo98869g(pVar), "rankedSmartspaceContent", new C110757bb(biVar, i, z, pVar));
    }
}
