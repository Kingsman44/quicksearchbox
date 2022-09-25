package com.google.android.apps.gsa.staticplugins.opa.samson.charging;

import android.app.KeyguardManager;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.samson.charging.c */
/* compiled from: PG */
final class C110062c extends KeyguardManager.KeyguardDismissCallback {

    /* renamed from: a */
    final /* synthetic */ C110107e f306639a;

    public C110062c(C110107e eVar) {
        this.f306639a = eVar;
    }

    public final void onDismissCancelled() {
        C59104x d = AmbientBiometricsUnlockController.f306619a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "AmbUnlockCtrl");
        ((C59052c) ((C59052c) d).mo56372aa(25604)).mo56386p("onDismissCancelled, should not happen since device is not locked.");
        this.f306639a.mo97376z();
    }

    public final void onDismissError() {
        C59104x d = AmbientBiometricsUnlockController.f306619a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "AmbUnlockCtrl");
        ((C59052c) ((C59052c) d).mo56372aa(25605)).mo56386p("onDismissError, should not happen since device is not locked.");
        this.f306639a.mo97376z();
    }

    public final void onDismissSucceeded() {
        this.f306639a.mo97376z();
    }
}
