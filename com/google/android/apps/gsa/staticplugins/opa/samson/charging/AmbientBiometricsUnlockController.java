package com.google.android.apps.gsa.staticplugins.opa.samson.charging;

import android.app.Activity;
import android.app.KeyguardManager;
import android.hardware.fingerprint.FingerprintManager;
import android.os.CancellationSignal;
import android.os.Handler;
import androidx.lifecycle.C2376g;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2391v;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* compiled from: PG */
public final class AmbientBiometricsUnlockController {

    /* renamed from: a */
    public static final C59071e f306619a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.samson.charging.AmbientBiometricsUnlockController");

    /* renamed from: b */
    public final C86124t f306620b;

    /* renamed from: c */
    public final C22871g f306621c;

    /* renamed from: d */
    public final Activity f306622d;

    /* renamed from: e */
    public final C110107e f306623e;

    /* renamed from: f */
    public C110089d f306624f;

    /* renamed from: g */
    CancellationSignal f306625g;

    /* renamed from: h */
    public C2384o f306626h;

    public AmbientBiometricsUnlockController(C86124t tVar, C22871g gVar, Activity activity, C110107e eVar) {
        this.f306620b = tVar;
        this.f306621c = gVar;
        this.f306622d = activity;
        this.f306623e = eVar;
    }

    /* renamed from: a */
    public final KeyguardManager mo98333a() {
        return (KeyguardManager) this.f306622d.getSystemService("keyguard");
    }

    /* renamed from: b */
    public final void mo98334b(C2391v vVar) {
        this.f306626h = vVar.getLifecycle();
        vVar.getLifecycle().mo5790b(new C2376g() {
            /* renamed from: gV */
            public final /* synthetic */ void mo3520gV(C2391v vVar) {
            }

            /* renamed from: gW */
            public final /* synthetic */ void mo3521gW(C2391v vVar) {
            }

            /* renamed from: gX */
            public final void mo3522gX(C2391v vVar) {
                CancellationSignal cancellationSignal = AmbientBiometricsUnlockController.this.f306625g;
                if (cancellationSignal != null) {
                    cancellationSignal.cancel();
                }
                C110089d dVar = AmbientBiometricsUnlockController.this.f306624f;
                if (dVar != null) {
                    dVar.f306722a = false;
                }
            }

            /* renamed from: gY */
            public final void mo3523gY(C2391v vVar) {
                AmbientBiometricsUnlockController ambientBiometricsUnlockController = AmbientBiometricsUnlockController.this;
                long a = ambientBiometricsUnlockController.f306620b.mo79743a(C90014bt.f247072aJ);
                ambientBiometricsUnlockController.f306624f = new C110089d(ambientBiometricsUnlockController.f306622d, ambientBiometricsUnlockController.f306623e, ambientBiometricsUnlockController.mo98333a(), ambientBiometricsUnlockController.f306621c, a);
                ambientBiometricsUnlockController.f306621c.mo28213m("opa:amb-unl-detector-init", a, ambientBiometricsUnlockController.f306624f);
                AmbientBiometricsUnlockController.this.mo98335c();
            }

            /* renamed from: gZ */
            public final /* synthetic */ void mo3524gZ(C2391v vVar) {
            }

            /* renamed from: ha */
            public final /* synthetic */ void mo3525ha(C2391v vVar) {
            }
        });
    }

    /* renamed from: c */
    public final void mo98335c() {
        if (!this.f306620b.mo79746e(C90014bt.f247645l)) {
            C58976aa aaVar = C58975e.f156826a;
            return;
        }
        KeyguardManager a = mo98333a();
        if (a.isDeviceLocked()) {
            C58976aa aaVar2 = C58975e.f156826a;
            return;
        }
        FingerprintManager fingerprintManager = (FingerprintManager) this.f306622d.getSystemService("fingerprint");
        if (this.f306622d.checkSelfPermission("android.permission.USE_FINGERPRINT") != 0 && this.f306622d.checkSelfPermission("android.permission.USE_BIOMETRIC") != 0) {
            C59104x d = f306619a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "AmbUnlockCtrl");
            ((C59052c) ((C59052c) d).mo56372aa(25609)).mo56386p("none of the fingerprint and biometric permission granted. Bailing");
        } else if (fingerprintManager == null || !fingerprintManager.isHardwareDetected()) {
            C58976aa aaVar3 = C58975e.f156826a;
        } else {
            C58976aa aaVar4 = C58975e.f156826a;
            CancellationSignal cancellationSignal = this.f306625g;
            if (cancellationSignal != null) {
                cancellationSignal.cancel();
            }
            CancellationSignal cancellationSignal2 = new CancellationSignal();
            this.f306625g = cancellationSignal2;
            fingerprintManager.authenticate((FingerprintManager.CryptoObject) null, cancellationSignal2, 0, new C110054b(this.f306622d, this.f306623e, this, a), (Handler) null);
        }
    }
}
