package com.google.android.apps.gsa.staticplugins.opa.samson.lightness;

import android.hardware.Sensor;
import android.hardware.SensorManager;
import androidx.lifecycle.C2376g;
import androidx.lifecycle.C2391v;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.Iterator;
import p5460g.p5461a.C69464a;

/* compiled from: PG */
public class BoundBrightnessSensorListener implements C2376g {

    /* renamed from: c */
    private static final C59071e f307226c = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.samson.lightness.BoundBrightnessSensorListener");

    /* renamed from: a */
    C110250b f307227a;

    /* renamed from: b */
    final Sensor f307228b;

    /* renamed from: d */
    private final C110253e f307229d;

    /* renamed from: e */
    private final SensorManager f307230e;

    /* renamed from: f */
    private final C69464a f307231f;

    public BoundBrightnessSensorListener(SensorManager sensorManager, C110253e eVar, C69464a aVar) {
        Sensor sensor;
        this.f307229d = eVar;
        this.f307230e = sensorManager;
        this.f307231f = aVar;
        Iterator<Sensor> it = sensorManager.getSensorList(-1).iterator();
        while (true) {
            if (!it.hasNext()) {
                C59104x c = f307226c.mo56225c();
                c.mo56378ag(C58975e.f156826a, "BBrightSensor");
                ((C59052c) ((C59052c) c).mo56372aa(25748)).mo56386p("binned_brightness not found");
                sensor = null;
                break;
            }
            sensor = it.next();
            if ("com.google.sensor.binned_brightness".equals(sensor.getStringType())) {
                break;
            }
        }
        this.f307228b = sensor;
    }

    /* renamed from: gV */
    public final /* synthetic */ void mo3520gV(C2391v vVar) {
    }

    /* renamed from: gW */
    public final /* synthetic */ void mo3521gW(C2391v vVar) {
    }

    /* renamed from: gX */
    public final void mo3522gX(C2391v vVar) {
        if (this.f307228b != null) {
            C59104x b = f307226c.mo56224b();
            b.mo56378ag(C58975e.f156826a, "BBrightSensor");
            ((C59052c) ((C59052c) b).mo56372aa(25749)).mo56386p("unregister brightness listener");
            this.f307230e.unregisterListener(this.f307229d);
            return;
        }
        C110250b bVar = this.f307227a;
        if (bVar != null) {
            bVar.f307247a.unregisterListener(bVar);
        }
    }

    /* renamed from: gY */
    public final void mo3523gY(C2391v vVar) {
        if (this.f307228b != null) {
            C59104x b = f307226c.mo56224b();
            b.mo56378ag(C58975e.f156826a, "BBrightSensor");
            ((C59052c) ((C59052c) b).mo56372aa(25750)).mo56386p("register brightness listener");
            this.f307230e.registerListener(this.f307229d, this.f307228b, 0);
            return;
        }
        if (this.f307227a == null) {
            this.f307227a = (C110250b) this.f307231f.mo17428b();
        }
        C110250b bVar = this.f307227a;
        bVar.f307255i = this.f307229d;
        bVar.mo98497b(bVar.f307248b);
        bVar.mo98497b(bVar.f307249c);
    }

    /* renamed from: gZ */
    public final /* synthetic */ void mo3524gZ(C2391v vVar) {
    }

    /* renamed from: ha */
    public final /* synthetic */ void mo3525ha(C2391v vVar) {
    }
}
