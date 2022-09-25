package com.google.android.apps.gsa.staticplugins.opa.samson.activity;

import android.view.View;
import com.google.android.apps.gsa.staticplugins.opa.samson.charging.p8428d.C110091b;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.samson.activity.f */
/* compiled from: PG */
public final /* synthetic */ class C110026f implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ OpaAmbActivity f306570a;

    public /* synthetic */ C110026f(OpaAmbActivity opaAmbActivity) {
        this.f306570a = opaAmbActivity;
    }

    public final void onClick(View view) {
        OpaAmbActivity opaAmbActivity = this.f306570a;
        if (!opaAmbActivity.f306538S.mo98664b()) {
            opaAmbActivity.finish();
        } else if (!opaAmbActivity.f306538S.mo98664b()) {
            C59104x c = OpaAmbActivity.f306519j.mo56225c();
            c.mo56378ag(C58975e.f156826a, "OpaAmbAct");
            ((C59052c) ((C59052c) c).mo56372aa(25554)).mo56386p("fadeToUpdatesScreen() called even though updates screen should not be shown!");
        } else {
            C110091b.m183350a(opaAmbActivity.f306528I, opaAmbActivity.f306525F, 300);
            opaAmbActivity.state = C110035o.UPDATES;
            opaAmbActivity.f306546l.mo96387a(new C110031k(opaAmbActivity));
        }
    }
}
