package com.google.android.apps.gsa.staticplugins.opa.samson.activity;

import android.app.KeyguardManager;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.samson.activity.j */
/* compiled from: PG */
final class C110030j extends KeyguardManager.KeyguardDismissCallback {

    /* renamed from: a */
    final /* synthetic */ OpaAmbActivity f306574a;

    public C110030j(OpaAmbActivity opaAmbActivity) {
        this.f306574a = opaAmbActivity;
    }

    public final void onDismissSucceeded() {
        super.onDismissSucceeded();
        C58976aa aaVar = C58975e.f156826a;
        this.f306574a.mo98306w();
    }
}
