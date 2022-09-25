package com.google.android.apps.gsa.staticplugins.opa.appintegration.service;

import android.hardware.Sensor;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.appintegration.service.l */
/* compiled from: PG */
public final /* synthetic */ class C107361l implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C107364o f298800a;

    /* renamed from: b */
    public final /* synthetic */ C107354e f298801b;

    public /* synthetic */ C107361l(C107364o oVar, C107354e eVar) {
        this.f298800a = oVar;
        this.f298801b = eVar;
    }

    public final void run() {
        C107364o oVar = this.f298800a;
        C107354e eVar = this.f298801b;
        Sensor sensor = oVar.f298805a;
        if (sensor != null && !oVar.f298808d) {
            oVar.f298806b.registerListener(oVar.f298807c, sensor, 0);
            oVar.f298808d = true;
        }
        oVar.f298812h = eVar;
    }
}
