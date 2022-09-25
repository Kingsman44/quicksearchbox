package com.google.android.apps.gsa.staticplugins.bisto.p7528ui.oobe;

import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.apps.gsa.opaonboarding.p6463ui.C84018m;
import com.google.android.apps.gsa.opaonboarding.p6463ui.HeaderLayout;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.android.apps.gsa.staticplugins.bisto.p7488f.C95299e;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C60103kw;
import com.google.common.p4552o.C60106kz;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ui.oobe.dy */
/* compiled from: PG */
public final /* synthetic */ class C96175dy implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C96183ef f269213a;

    public /* synthetic */ C96175dy(C96183ef efVar) {
        this.f269213a = efVar;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C96183ef efVar = this.f269213a;
        List list = (List) obj;
        C59104x b = C96183ef.f269221b.mo56224b();
        b.mo56378ag(C58975e.f156826a, "BistoGacsConnectFrag");
        ((C59052c) ((C59052c) b).mo56372aa(16977)).mo56386p("onConnectCompleted");
        efVar.f269240q.mo89391a(efVar.f269226c);
        if (efVar.f269241r) {
            long b2 = efVar.f269237n.mo26870b();
            long j = efVar.f269247x;
            C60103kw kwVar = ((C95299e) efVar.f269603D.mo27525b()).f266647b;
            kwVar.copyOnWrite();
            C60106kz kzVar = (C60106kz) kwVar.instance;
            C60106kz kzVar2 = C60106kz.f162531p;
            kzVar.f162533a |= 16384;
            kzVar.f162544l = (int) (b2 - j);
            HeaderLayout headerLayout = efVar.f269242s;
            C84018m.m133908c(headerLayout.f228718a, C84018m.m133906a(R.string.bisto_gacs_connected, headerLayout), TextView.BufferType.NORMAL, headerLayout);
            efVar.f269242s.f228718a.setVisibility(0);
            efVar.f269242s.f228719b.setVisibility(8);
            efVar.f269244u.setVisibility(8);
            efVar.f269245v.setVisibility(0);
            efVar.f269245v.setProgress(0);
            ProgressBar progressBar = efVar.f269245v;
            progressBar.setProgress(progressBar.getMax(), true);
            efVar.f269233j.mo28213m("resolve-connect", 1000, new C96172dv(efVar));
        }
    }
}
