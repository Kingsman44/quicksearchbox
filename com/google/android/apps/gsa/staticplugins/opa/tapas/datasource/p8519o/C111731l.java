package com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.p8519o;

import android.content.SharedPreferences;
import com.google.android.apps.gsa.shared.p7066m.C90063do;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8552k.C112131q;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.o.l */
/* compiled from: PG */
public final /* synthetic */ class C111731l implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C68214a f310578a;

    public /* synthetic */ C111731l(C68214a aVar) {
        this.f310578a = aVar;
    }

    public final void run() {
        C68214a aVar = this.f310578a;
        C59071e eVar = C111739t.f310591a;
        C112131q qVar = (C112131q) aVar.mo27525b();
        if (qVar.f311377b.mo79746e(C90063do.f249315bH)) {
            if (qVar.f311377b.mo79746e(C90063do.f249372cL)) {
                long b = qVar.f311380e.mo26870b();
                ((SharedPreferences) qVar.f311379d.mo27525b()).edit().putLong("tapas_setting_first_run_tapas_server_latest_ts", b).commit();
                qVar.f311381f = b;
            }
            if (qVar.mo99413e("tapas_setting_first_run_tapas_server")) {
                C59104x b2 = C112131q.f311376a.mo56224b();
                b2.mo56378ag(C58975e.f156826a, "TapasSync");
                ((C59052c) ((C59052c) b2).mo56372aa(27583)).mo56386p("Tapas Server initial fetch success!");
            }
        }
    }
}
