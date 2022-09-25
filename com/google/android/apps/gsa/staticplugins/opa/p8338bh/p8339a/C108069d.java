package com.google.android.apps.gsa.staticplugins.opa.p8338bh.p8339a;

import android.content.ComponentCallbacks;
import android.content.res.Configuration;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.bh.a.d */
/* compiled from: PG */
final class C108069d implements ComponentCallbacks {

    /* renamed from: a */
    final /* synthetic */ C108070e f300635a;

    public C108069d(C108070e eVar) {
        this.f300635a = eVar;
    }

    public final void onConfigurationChanged(Configuration configuration) {
        if (this.f300635a.f300640e != configuration.orientation) {
            this.f300635a.f300640e = configuration.orientation;
            this.f300635a.mo96426g();
        }
    }

    public final void onLowMemory() {
    }
}
