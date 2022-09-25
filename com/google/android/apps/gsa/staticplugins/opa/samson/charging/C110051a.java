package com.google.android.apps.gsa.staticplugins.opa.samson.charging;

import android.app.KeyguardManager;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.samson.charging.a */
/* compiled from: PG */
final class C110051a extends KeyguardManager.KeyguardDismissCallback {

    /* renamed from: a */
    final /* synthetic */ C110107e f306628a;

    public C110051a(C110107e eVar) {
        this.f306628a = eVar;
    }

    public final void onDismissCancelled() {
        C59104x d = AmbientBiometricsUnlockController.f306619a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "AmbUnlockCtrl");
        ((C59052c) ((C59052c) d).mo56372aa(25600)).mo56386p("onFingerprintTouched.onDismissCancelled, should not happen since device is not locked.");
        this.f306628a.mo97376z();
    }

    public final void onDismissError() {
        C59104x d = AmbientBiometricsUnlockController.f306619a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "AmbUnlockCtrl");
        ((C59052c) ((C59052c) d).mo56372aa(25601)).mo56386p("onFingerprintTouched.onDismissError, should not happen since device is not locked.");
        this.f306628a.mo97376z();
    }

    public final void onDismissSucceeded() {
        this.f306628a.mo97376z();
    }
}
