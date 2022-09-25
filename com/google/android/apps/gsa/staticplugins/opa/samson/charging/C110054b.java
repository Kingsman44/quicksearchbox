package com.google.android.apps.gsa.staticplugins.opa.samson.charging;

import android.app.Activity;
import android.app.KeyguardManager;
import android.hardware.fingerprint.FingerprintManager;
import androidx.lifecycle.C2383n;
import androidx.lifecycle.C2384o;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.samson.charging.b */
/* compiled from: PG */
final class C110054b extends FingerprintManager.AuthenticationCallback {

    /* renamed from: a */
    private final WeakReference f306631a;

    /* renamed from: b */
    private final WeakReference f306632b;

    /* renamed from: c */
    private final WeakReference f306633c;

    /* renamed from: d */
    private final KeyguardManager f306634d;

    public C110054b(Activity activity, C110107e eVar, AmbientBiometricsUnlockController ambientBiometricsUnlockController, KeyguardManager keyguardManager) {
        this.f306632b = new WeakReference(activity);
        this.f306633c = new WeakReference(eVar);
        this.f306631a = new WeakReference(ambientBiometricsUnlockController);
        this.f306634d = keyguardManager;
    }

    public final void onAuthenticationError(int i, CharSequence charSequence) {
        C2384o oVar;
        C58976aa aaVar = C58975e.f156826a;
        AmbientBiometricsUnlockController ambientBiometricsUnlockController = (AmbientBiometricsUnlockController) this.f306631a.get();
        if (ambientBiometricsUnlockController != null && (oVar = ambientBiometricsUnlockController.f306626h) != null && oVar.mo5789a() == C2383n.RESUMED) {
            ambientBiometricsUnlockController.mo98335c();
        }
    }

    public final void onAuthenticationSucceeded(FingerprintManager.AuthenticationResult authenticationResult) {
        C58976aa aaVar = C58975e.f156826a;
        Activity activity = (Activity) this.f306632b.get();
        C110107e eVar = (C110107e) this.f306633c.get();
        if (activity != null && !activity.isFinishing() && eVar != null) {
            this.f306634d.requestDismissKeyguard(activity, new C110051a(eVar));
        }
    }
}
