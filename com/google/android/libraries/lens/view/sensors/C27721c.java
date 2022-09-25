package com.google.android.libraries.lens.view.sensors;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import com.google.lens.p4707j.C62451ca;
import com.google.lens.p4707j.C62452cb;

/* renamed from: com.google.android.libraries.lens.view.sensors.c */
/* compiled from: PG */
final class C27721c implements SensorEventListener {

    /* renamed from: a */
    final /* synthetic */ C27722d f75680a;

    public C27721c(C27722d dVar) {
        this.f75680a = dVar;
    }

    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    public final void onSensorChanged(SensorEvent sensorEvent) {
        C27722d dVar = this.f75680a;
        if (sensorEvent.sensor.getType() != 9) {
            sensorEvent.sensor.getStringType();
            long j = sensorEvent.timestamp;
        } else if (sensorEvent.values.length != 3) {
            int length = sensorEvent.values.length;
        } else {
            float[] fArr = new float[3];
            int i = dVar.f75685e;
            float[] fArr2 = sensorEvent.values;
            float f = fArr2[0];
            float f2 = fArr2[1];
            if (i == 1) {
                fArr[0] = f2;
                fArr[1] = -f;
            } else if (i == 2) {
                fArr[0] = -f;
                fArr[1] = -f2;
            } else if (i != 3) {
                fArr[0] = f;
                fArr[1] = f2;
            } else {
                fArr[0] = -f2;
                fArr[1] = f;
            }
            fArr[2] = fArr2[2];
            fArr[0] = -fArr[0];
            float f3 = sensorEvent.values[0];
            float f4 = sensorEvent.values[1];
            float f5 = sensorEvent.values[2];
            C62451ca caVar = (C62451ca) C62452cb.f168638e.createBuilder();
            float f6 = fArr[0];
            caVar.copyOnWrite();
            C62452cb cbVar = (C62452cb) caVar.instance;
            cbVar.f168640a |= 1;
            cbVar.f168641b = f6;
            float f7 = fArr[1];
            caVar.copyOnWrite();
            C62452cb cbVar2 = (C62452cb) caVar.instance;
            cbVar2.f168640a |= 2;
            cbVar2.f168642c = f7;
            float f8 = fArr[2];
            caVar.copyOnWrite();
            C62452cb cbVar3 = (C62452cb) caVar.instance;
            cbVar3.f168640a |= 4;
            cbVar3.f168643d = f8;
            dVar.f75686f = (C62452cb) caVar.build();
        }
    }
}
