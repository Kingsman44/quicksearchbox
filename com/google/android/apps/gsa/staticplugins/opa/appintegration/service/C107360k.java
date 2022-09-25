package com.google.android.apps.gsa.staticplugins.opa.appintegration.service;

import android.hardware.Sensor;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.appintegration.service.k */
/* compiled from: PG */
public final /* synthetic */ class C107360k implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C107364o f298799a;

    public /* synthetic */ C107360k(C107364o oVar) {
        this.f298799a = oVar;
    }

    public final void run() {
        C107364o oVar = this.f298799a;
        Sensor sensor = oVar.f298805a;
        if (sensor != null) {
            oVar.f298806b.unregisterListener(oVar.f298807c, sensor);
        }
        oVar.f298808d = false;
        oVar.f298811g = 0;
    }
}
