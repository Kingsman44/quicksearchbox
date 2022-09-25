package com.google.android.libraries.lens.view.p2087ay;

import android.hardware.SensorEvent;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.libraries.lens.view.ay.c */
/* compiled from: PG */
public final /* synthetic */ class C25642c implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C25643d f69754a;

    /* renamed from: b */
    public final /* synthetic */ SensorEvent f69755b;

    public /* synthetic */ C25642c(C25643d dVar, SensorEvent sensorEvent) {
        this.f69754a = dVar;
        this.f69755b = sensorEvent;
    }

    public final void run() {
        C25643d dVar = this.f69754a;
        SensorEvent sensorEvent = this.f69755b;
        C25644e eVar = dVar.f69756a;
        float[] fArr = sensorEvent.values;
        int millis = (int) TimeUnit.NANOSECONDS.toMillis(sensorEvent.timestamp);
        C25654o oVar = (C25654o) eVar.f69762f.get();
        if (oVar == null) {
            eVar.mo30764a();
            return;
        }
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        if ((f * f) + (f2 * f2) + (f3 * f3) > 5.0f) {
            C25619ab abVar = eVar.f69760d;
            abVar.f69694a.addLast(Integer.valueOf(millis));
        }
        eVar.f69760d.mo30731a(Integer.valueOf(millis - 500));
        if (eVar.f69760d.f69694a.size() >= 15) {
            oVar.mo30766a();
        }
    }
}
