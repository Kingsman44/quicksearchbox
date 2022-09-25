package com.google.android.apps.gsa.staticplugins.opa.samson.activity;

import androidx.lifecycle.C2384o;
import com.google.android.apps.gsa.staticplugins.opa.samson.charging.shared.C110121g;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.samson.activity.q */
/* compiled from: PG */
final class C110038q implements C110121g {

    /* renamed from: a */
    final WeakReference f306588a;

    public C110038q(OpaAmbActivity opaAmbActivity) {
        this.f306588a = new WeakReference(opaAmbActivity);
    }

    /* renamed from: a */
    public final C2384o mo98325a() {
        OpaAmbActivity opaAmbActivity = (OpaAmbActivity) this.f306588a.get();
        if (opaAmbActivity != null) {
            return opaAmbActivity.getLifecycle();
        }
        return null;
    }

    /* renamed from: b */
    public final void mo98326b() {
        OpaAmbActivity opaAmbActivity = (OpaAmbActivity) this.f306588a.get();
        if (opaAmbActivity != null) {
            opaAmbActivity.mo98299C();
        }
    }

    /* renamed from: c */
    public final void mo98327c() {
        OpaAmbActivity opaAmbActivity = (OpaAmbActivity) this.f306588a.get();
        if (opaAmbActivity != null) {
            opaAmbActivity.finish();
        }
    }
}
