package com.google.android.apps.gsa.staticplugins.opa.smartspace.p8461l;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.opa.smartspace.C83741am;
import com.google.android.apps.gsa.opa.smartspace.C83800p;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.smartspace.C92111g;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.assistant.p3886c.C50818do;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.smartspace.l.bg */
/* compiled from: PG */
public final /* synthetic */ class C110762bg implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C110764bi f308590a;

    public /* synthetic */ C110762bg(C110764bi biVar) {
        this.f308590a = biVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C110764bi biVar = this.f308590a;
        C83800p pVar = (C83800p) obj;
        if (biVar.f308612c.mo77175m()) {
            return biVar.mo98875m(pVar);
        }
        C83741am b = pVar.mo77056b();
        C92111g gVar = biVar.f308613d;
        C50818do doVar = b.f228252c;
        if (doVar == null) {
            doVar = C50818do.f132293H;
        }
        if (!gVar.mo86743d(doVar)) {
            C59104x d = C110764bi.f308595a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "ProactiveServiceManager");
            ((C59052c) ((C59052c) d).mo56372aa(26760)).mo56386p("weather update info not present");
            return C118826c.f331423b;
        }
        C58495hd i = pVar.mo77065i();
        return biVar.f308614e.mo28210j(biVar.mo98869g(pVar), BuildConfig.FLAVOR, new C110781q(biVar, i, b, pVar));
    }
}
