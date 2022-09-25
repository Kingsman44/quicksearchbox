package com.google.android.apps.gsa.staticplugins.opa.tapas.p8589ui;

import com.google.android.apps.gsa.shared.p7066m.C90063do;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8552k.C112131q;
import com.google.android.libraries.gsa.p1876k.C22862b;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.ui.at */
/* compiled from: PG */
public final /* synthetic */ class C113538at implements C22862b {

    /* renamed from: a */
    public final /* synthetic */ C113558bm f314336a;

    public /* synthetic */ C113538at(C113558bm bmVar) {
        this.f314336a = bmVar;
    }

    /* renamed from: a */
    public final Object mo17947a() {
        C112131q qVar = (C112131q) this.f314336a.f314433w.mo27525b();
        C58976aa aaVar = C58975e.f156826a;
        boolean z = false;
        if (qVar.f311377b.mo79746e(C90063do.f249315bH) && qVar.mo99413e("tapas_setting_first_show_ui")) {
            C59104x b = C112131q.f311376a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "TapasSync");
            ((C59052c) ((C59052c) b).mo56372aa(27589)).mo56386p("#runInitialShowTapasUi: initial Show Tapas Ui success!");
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
