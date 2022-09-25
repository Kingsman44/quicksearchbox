package com.google.android.apps.gsa.staticplugins.opa.samson.charging;

import android.app.Activity;
import android.app.KeyguardManager;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C58979ad;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4526f.p4534f.C59081b;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.samson.charging.d */
/* compiled from: PG */
final class C110089d implements C22869e {

    /* renamed from: a */
    public boolean f306722a = true;

    /* renamed from: b */
    private final WeakReference f306723b;

    /* renamed from: c */
    private final WeakReference f306724c;

    /* renamed from: d */
    private final C22871g f306725d;

    /* renamed from: e */
    private final KeyguardManager f306726e;

    /* renamed from: f */
    private final long f306727f;

    /* renamed from: g */
    private boolean f306728g;

    public C110089d(Activity activity, C110107e eVar, KeyguardManager keyguardManager, C22871g gVar, long j) {
        this.f306723b = new WeakReference(activity);
        this.f306724c = new WeakReference(eVar);
        this.f306726e = keyguardManager;
        this.f306725d = gVar;
        this.f306727f = j;
        this.f306728g = keyguardManager.isDeviceLocked();
    }

    public final void run() {
        Activity activity = (Activity) this.f306723b.get();
        C110107e eVar = (C110107e) this.f306724c.get();
        if (activity != null && eVar != null && !activity.isDestroyed() && this.f306722a) {
            boolean isDeviceLocked = this.f306726e.isDeviceLocked();
            if (!this.f306726e.isDeviceSecure() || isDeviceLocked || !this.f306728g) {
                this.f306728g = isDeviceLocked;
                this.f306725d.mo28213m("opa:amb-unl-detector", this.f306727f, this);
                return;
            }
            C58976aa aaVar = C58975e.f156826a;
            C59081b.m91349a(C58979ad.FULL, "stack size");
            this.f306726e.requestDismissKeyguard(activity, new C110062c(eVar));
        }
    }
}
