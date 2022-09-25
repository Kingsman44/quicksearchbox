package com.google.android.apps.gsa.staticplugins.opa.samson.p8443o;

import com.google.android.apps.gsa.assistant.shared.z;
import com.google.android.apps.gsa.search.core.preferences.C86338r;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.samson.o.b */
/* compiled from: PG */
public final /* synthetic */ class C110291b implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C110298i f307401a;

    public /* synthetic */ C110291b(C110298i iVar) {
        this.f307401a = iVar;
    }

    public final void run() {
        C110298i iVar = this.f307401a;
        iVar.f307414f = null;
        iVar.f307412d.mo5708l(z.a);
        C59104x b = C110298i.f307409a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "CDIImpl");
        ((C59052c) ((C59052c) b).mo56372aa(25974)).mo56386p("remove observer");
        iVar.f307410b.f307435h.mo5679j(iVar.f307411c);
        ((C86338r) iVar.f307413e.mo27525b()).unregisterOnSharedPreferenceChangeListener(iVar);
    }
}
