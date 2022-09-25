package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;

/* renamed from: com.google.android.gms.measurement.internal.iq */
/* compiled from: PG */
final class C145453iq implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C145455is f393266a;

    public C145453iq(C145455is isVar) {
        this.f393266a = isVar;
    }

    public final void run() {
        C145456it itVar = this.f393266a.f393270c;
        C145361ff ffVar = itVar.f393011w;
        Context context = ffVar.f392931a;
        C145508x xVar = ffVar.f392936f;
        itVar.mo121157m(new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementService"));
    }
}
