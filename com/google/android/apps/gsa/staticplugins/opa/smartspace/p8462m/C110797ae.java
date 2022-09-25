package com.google.android.apps.gsa.staticplugins.opa.smartspace.p8462m;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.opa.smartspace.C83800p;
import com.google.android.apps.gsa.staticplugins.opa.smartspace.p8461l.C110764bi;
import com.google.android.apps.gsa.staticplugins.opa.smartspace.p8461l.C110782r;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.common.p4526f.p4527a.C58970a;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.smartspace.m.ae */
/* compiled from: PG */
public final /* synthetic */ class C110797ae implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C110812at f308704a;

    public /* synthetic */ C110797ae(C110812at atVar) {
        this.f308704a = atVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C110812at atVar = this.f308704a;
        C83800p pVar = (C83800p) obj;
        Collection.EL.stream(pVar.mo77061f()).forEach(new C110808ap(atVar));
        C110764bi biVar = atVar.f308729c;
        ((C58970a) ((C58970a) biVar.f308623n.mo56224b()).mo56372aa(26763)).mo56386p("refreshSmartspaceChip");
        if (biVar.f308612c.mo77175m()) {
            return biVar.mo98875m(pVar);
        }
        return biVar.f308614e.mo28210j(biVar.mo98869g(pVar), BuildConfig.FLAVOR, new C110782r(biVar, pVar));
    }
}
