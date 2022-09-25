package com.google.android.apps.gsa.staticplugins.bisto.p7528ui.oobe;

import android.view.View;
import com.google.android.apps.gsa.staticplugins.bisto.p7488f.C95299e;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C60103kw;
import com.google.common.p4552o.C60106kz;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ui.oobe.dt */
/* compiled from: PG */
public final /* synthetic */ class C96170dt implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C96183ef f269208a;

    public /* synthetic */ C96170dt(C96183ef efVar) {
        this.f269208a = efVar;
    }

    public final void onClick(View view) {
        C96183ef efVar = this.f269208a;
        efVar.f269243t.mo77360a().setBackground(efVar.f269246w);
        efVar.f269243t.mo77360a().setTextColor(efVar.f269248y);
        efVar.f269242s.f228719b.setTextColor(efVar.f269249z);
        C59104x b = C96183ef.f269221b.mo56224b();
        b.mo56378ag(C58975e.f156826a, "BistoGacsConnectFrag");
        ((C59052c) ((C59052c) b).mo56372aa(16980)).mo56386p("retry");
        C60103kw kwVar = ((C95299e) efVar.f269603D.mo27525b()).f266647b;
        int i = ((C60106kz) kwVar.instance).f162546n;
        kwVar.copyOnWrite();
        C60106kz kzVar = (C60106kz) kwVar.instance;
        kzVar.f162533a |= 65536;
        kzVar.f162546n = i + 1;
        efVar.mo89999i();
        efVar.mo89998h();
        efVar.mo90000j();
        efVar.mo90001k(0);
    }
}
