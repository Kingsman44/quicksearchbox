package com.google.android.libraries.lens.view.sensors;

import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.libraries.lens.view.sensors.a */
/* compiled from: PG */
public final /* synthetic */ class C27719a implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C27722d f75678a;

    public /* synthetic */ C27719a(C27722d dVar) {
        this.f75678a = dVar;
    }

    public final Object call() {
        C27722d dVar = this.f75678a;
        SensorEventListener sensorEventListener = dVar.f75687g;
        if (sensorEventListener != null) {
            ((SensorManager) dVar.f75682b.mo17428b()).unregisterListener(sensorEventListener);
            dVar.f75687g = null;
            dVar.f75686f = null;
        }
        return null;
    }
}
