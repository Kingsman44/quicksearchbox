package com.google.android.apps.gsa.staticplugins.opa.samson.lightness;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import androidx.lifecycle.C2332ag;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.samson.lightness.e */
/* compiled from: PG */
public final class C110253e extends C2332ag implements SensorEventListener {

    /* renamed from: h */
    private int f307266h;

    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    public final void onSensorChanged(SensorEvent sensorEvent) {
        if (sensorEvent.values == null) {
            mo5708l(Integer.valueOf(this.f307266h));
            return;
        }
        int i = (int) sensorEvent.values[0];
        if (this.f307266h != i) {
            this.f307266h = i;
            C58976aa aaVar = C58975e.f156826a;
        }
        mo5708l(Integer.valueOf(this.f307266h));
    }
}
