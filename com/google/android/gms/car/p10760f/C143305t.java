package com.google.android.gms.car.p10760f;

import android.content.ComponentCallbacks;
import android.content.res.Configuration;
import com.google.android.gms.car.C143181dh;

/* renamed from: com.google.android.gms.car.f.t */
/* compiled from: PG */
final class C143305t implements ComponentCallbacks {

    /* renamed from: a */
    final /* synthetic */ Runnable f388534a;

    /* renamed from: b */
    final /* synthetic */ C143268bb f388535b;

    public C143305t(C143268bb bbVar, Runnable runnable) {
        this.f388535b = bbVar;
        this.f388534a = runnable;
    }

    public final void onConfigurationChanged(Configuration configuration) {
        C143181dh.m232309b(new C143304s(this, configuration, this.f388534a));
    }

    public final void onLowMemory() {
    }
}
