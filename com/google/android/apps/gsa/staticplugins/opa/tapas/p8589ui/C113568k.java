package com.google.android.apps.gsa.staticplugins.opa.tapas.p8589ui;

import android.support.p033v7.widget.C0673gh;
import android.view.View;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113342cm;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113415ez;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.ui.k */
/* compiled from: PG */
public final /* synthetic */ class C113568k implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C113572o f314455a;

    /* renamed from: b */
    public final /* synthetic */ C113342cm f314456b;

    /* renamed from: c */
    public final /* synthetic */ C113415ez f314457c;

    /* renamed from: d */
    public final /* synthetic */ C0673gh f314458d;

    public /* synthetic */ C113568k(C113572o oVar, C113342cm cmVar, C113415ez ezVar, C0673gh ghVar) {
        this.f314455a = oVar;
        this.f314456b = cmVar;
        this.f314457c = ezVar;
        this.f314458d = ghVar;
    }

    public final void onClick(View view) {
        C113572o oVar = this.f314455a;
        C113342cm cmVar = this.f314456b;
        C113415ez ezVar = this.f314457c;
        C0673gh ghVar = this.f314458d;
        C59104x b = C113572o.f314464a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "SgtSecInnerAdapter");
        ((C59052c) ((C59052c) b).mo56372aa(27914)).mo56386p("Tapas suggestion view tapped");
        if (!cmVar.mo99718i()) {
            oVar.f314468e.mo99654e(view);
        }
        cmVar.mo99685f(oVar.f314465b.f313869c, ezVar, ghVar, oVar);
    }
}
