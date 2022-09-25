package com.google.android.libraries.lens.view.p2087ay;

import android.hardware.Sensor;
import android.hardware.SensorManager;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.libraries.lens.view.ay.al */
/* compiled from: PG */
public final /* synthetic */ class C25629al implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C25663x f69726a;

    public /* synthetic */ C25629al(C25663x xVar) {
        this.f69726a = xVar;
    }

    public final void run() {
        C25663x xVar = this.f69726a;
        C58974d dVar = C25664y.f69785a;
        C25664y yVar = xVar.f69784a;
        yVar.f69787c = 0;
        C25646g gVar = yVar.f69796l;
        C25654o oVar = yVar.f69803s;
        if (gVar.f69764a.mo56113h()) {
            C25644e eVar = (C25644e) gVar.f69764a.mo56107c();
            SensorManager sensorManager = (SensorManager) eVar.f69761e.mo17428b();
            Sensor defaultSensor = sensorManager.getDefaultSensor(4);
            if (defaultSensor == null) {
                ((C58970a) ((C58970a) C25644e.f69757a.mo56224b()).mo56372aa(50208)).mo56386p("Sensor has not been found.");
            } else {
                eVar.f69763g = new C25643d(eVar);
                if (sensorManager.registerListener(eVar.f69763g, defaultSensor, 3, eVar.f69759c)) {
                    eVar.f69762f = new WeakReference(oVar);
                } else {
                    eVar.f69762f.clear();
                    ((C58970a) ((C58970a) C25644e.f69757a.mo56224b()).mo56372aa(50207)).mo56386p("Failed to register to SensorManager.");
                }
            }
        }
        if (gVar.f69765b.mo56113h()) {
            ((C25648i) gVar.f69765b.mo56107c()).f69766a = new WeakReference(oVar);
        }
    }
}
