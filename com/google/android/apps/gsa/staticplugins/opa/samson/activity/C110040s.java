package com.google.android.apps.gsa.staticplugins.opa.samson.activity;

import com.google.android.libraries.gsa.p1876k.C22869e;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.samson.activity.s */
/* compiled from: PG */
final class C110040s implements C22869e {

    /* renamed from: a */
    final WeakReference f306590a;

    public C110040s(OpaAmbActivity opaAmbActivity) {
        this.f306590a = new WeakReference(opaAmbActivity);
    }

    public final void run() {
        OpaAmbActivity opaAmbActivity = (OpaAmbActivity) this.f306590a.get();
        if (opaAmbActivity != null) {
            opaAmbActivity.mo98299C();
        }
    }
}
