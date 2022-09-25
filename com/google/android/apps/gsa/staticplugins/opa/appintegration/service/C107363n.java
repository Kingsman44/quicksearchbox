package com.google.android.apps.gsa.staticplugins.opa.appintegration.service;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.appintegration.service.n */
/* compiled from: PG */
final class C107363n implements SensorEventListener {

    /* renamed from: a */
    final /* synthetic */ C107364o f298804a;

    public C107363n(C107364o oVar) {
        this.f298804a = oVar;
    }

    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    public final void onSensorChanged(SensorEvent sensorEvent) {
        this.f298804a.f298809e.post(new C107362m(this, sensorEvent));
    }
}
