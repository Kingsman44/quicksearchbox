package com.google.android.libraries.lens.view.sensors;

import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.view.WindowManager;
import com.google.common.p4526f.p4527a.C58970a;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.libraries.lens.view.sensors.b */
/* compiled from: PG */
public final /* synthetic */ class C27720b implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C27722d f75679a;

    public /* synthetic */ C27720b(C27722d dVar) {
        this.f75679a = dVar;
    }

    public final Object call() {
        C27722d dVar = this.f75679a;
        if (dVar.f75687g != null) {
            return null;
        }
        WindowManager windowManager = (WindowManager) dVar.f75683c.getSystemService("window");
        windowManager.getClass();
        dVar.f75685e = windowManager.getDefaultDisplay().getRotation();
        SensorManager sensorManager = (SensorManager) dVar.f75682b.mo17428b();
        Sensor defaultSensor = sensorManager.getDefaultSensor(9);
        if (defaultSensor == null) {
            ((C58970a) ((C58970a) C27722d.f75681a.mo56226d()).mo56372aa(49915)).mo56386p("Gravity sensor not found.");
            return null;
        }
        C27721c cVar = new C27721c(dVar);
        if (sensorManager.registerListener(cVar, defaultSensor, 3, dVar.f75684d)) {
            dVar.f75687g = cVar;
            return null;
        }
        ((C58970a) ((C58970a) C27722d.f75681a.mo56226d()).mo56372aa(49913)).mo56386p("Failed to register gravity sensor listener.");
        return null;
    }
}
