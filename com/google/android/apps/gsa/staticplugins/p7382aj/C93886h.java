package com.google.android.apps.gsa.staticplugins.p7382aj;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.base.C58838bb;
import com.google.common.p4526f.C59071e;
import java.lang.ref.WeakReference;
import java.util.LinkedList;

/* renamed from: com.google.android.apps.gsa.staticplugins.aj.h */
/* compiled from: PG */
public final class C93886h implements SensorEventListener {

    /* renamed from: a */
    public static final C59071e f262223a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.aj.h");

    /* renamed from: b */
    public final SensorManager f262224b;

    /* renamed from: c */
    private final C93881c f262225c = C93881c.m154895a();

    /* renamed from: d */
    private final LinkedList f262226d = new LinkedList();

    /* renamed from: e */
    private final float[] f262227e = new float[3];

    /* renamed from: f */
    private final C21370a f262228f;

    /* renamed from: g */
    private final WeakReference f262229g;

    public C93886h(SensorManager sensorManager, C93885g gVar, C21370a aVar) {
        sensorManager.getClass();
        this.f262224b = sensorManager;
        this.f262229g = new WeakReference(gVar);
        this.f262228f = aVar;
    }

    /* renamed from: a */
    public final Sensor mo88205a() {
        return this.f262224b.getDefaultSensor(1);
    }

    /* renamed from: b */
    public final void mo88206b() {
        if (mo88205a() != null) {
            this.f262224b.unregisterListener(this, mo88205a());
        }
        this.f262226d.clear();
    }

    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    public final void onSensorChanged(SensorEvent sensorEvent) {
        float[] fArr = sensorEvent.values;
        C93885g gVar = (C93885g) this.f262229g.get();
        if (gVar == null) {
            mo88206b();
            return;
        }
        float[] fArr2 = this.f262227e;
        boolean z = false;
        float f = (fArr2[0] * 0.8f) + (fArr[0] * 0.19999999f);
        fArr2[0] = f;
        float f2 = (fArr2[1] * 0.8f) + (fArr[1] * 0.19999999f);
        fArr2[1] = f2;
        float f3 = (fArr2[2] * 0.8f) + (fArr[2] * 0.19999999f);
        fArr2[2] = f3;
        fArr[0] = fArr[0] - f;
        fArr[1] = fArr[1] - f2;
        fArr[2] = fArr[2] - f3;
        this.f262225c.mo88201b(fArr);
        if (this.f262225c.f262206b > 10.0d) {
            long f4 = this.f262228f.mo26874f();
            C93882d dVar = new C93882d(C93881c.m154895a(), C93881c.m154895a());
            float[] fArr3 = this.f262227e;
            dVar.f262207a.mo88201b(fArr);
            dVar.f262208b.mo88201b(fArr3);
            dVar.f262209c = f4;
            this.f262226d.add(dVar);
            long j = f4 - 3000;
            while (!this.f262226d.isEmpty() && ((C93882d) this.f262226d.getFirst()).f262209c < j) {
                this.f262226d.removeFirst();
            }
            if (((long) this.f262226d.size()) >= 30) {
                C93881c cVar = ((C93882d) this.f262226d.getFirst()).f262208b;
                C93881c cVar2 = ((C93882d) this.f262226d.getLast()).f262208b;
                C58838bb.m90861B(2, 3, "index");
                float[] fArr4 = cVar.f262205a;
                float[] fArr5 = cVar2.f262205a;
                double d = (double) ((fArr4[0] * fArr5[0]) + (fArr4[1] * fArr5[1]) + (fArr4[2] * fArr5[2]));
                Double.isNaN(d);
                if (d / (cVar.f262206b * cVar2.f262206b) < 0.6000000238418579d) {
                    z = true;
                }
                this.f262226d.clear();
                if (!z) {
                    gVar.mo88204a();
                }
            }
        }
    }
}
