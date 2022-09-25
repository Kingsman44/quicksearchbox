package com.google.android.libraries.lens.view.p2087ay;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;

/* renamed from: com.google.android.libraries.lens.view.ay.d */
/* compiled from: PG */
final class C25643d implements SensorEventListener {

    /* renamed from: a */
    final /* synthetic */ C25644e f69756a;

    public C25643d(C25644e eVar) {
        this.f69756a = eVar;
    }

    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    public final void onSensorChanged(SensorEvent sensorEvent) {
        this.f69756a.f69758b.execute(new C25642c(this, sensorEvent));
    }
}
