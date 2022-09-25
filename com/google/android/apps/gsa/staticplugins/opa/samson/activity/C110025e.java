package com.google.android.apps.gsa.staticplugins.opa.samson.activity;

import android.app.KeyguardManager;
import android.view.View;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.samson.activity.e */
/* compiled from: PG */
public final /* synthetic */ class C110025e implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ OpaAmbActivity f306569a;

    public /* synthetic */ C110025e(OpaAmbActivity opaAmbActivity) {
        this.f306569a = opaAmbActivity;
    }

    public final void onClick(View view) {
        OpaAmbActivity opaAmbActivity = this.f306569a;
        if (((KeyguardManager) opaAmbActivity.getSystemService("keyguard")).isKeyguardLocked()) {
            opaAmbActivity.f306522C.mo95770e(new C110030j(opaAmbActivity));
            return;
        }
        C59104x d = OpaAmbActivity.f306519j.mo56226d();
        d.mo56378ag(C58975e.f156826a, "OpaAmbAct");
        ((C59052c) ((C59052c) d).mo56372aa(25566)).mo56386p("Launching settings without attempting to dismiss keyguard");
        opaAmbActivity.mo98306w();
    }
}
