package com.google.android.apps.gsa.staticplugins.opa.samson.lightness;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import androidx.lifecycle.LiveData;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.common.base.C58832aw;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.samson.lightness.f */
/* compiled from: PG */
public final class C110254f extends LiveData implements SensorEventListener {

    /* renamed from: h */
    private final C86124t f307267h;

    /* renamed from: i */
    private final SensorManager f307268i;

    /* renamed from: j */
    private final Sensor f307269j;

    public C110254f(Context context, C86124t tVar) {
        this.f307267h = tVar;
        SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
        this.f307268i = sensorManager;
        this.f307269j = sensorManager.getDefaultSensor(5);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo5708l(Boolean bool) {
        if (!C58832aw.m90831a(bool, mo3842a())) {
            super.mo5708l(bool);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final void mo5677g() {
        Sensor sensor = this.f307269j;
        if (sensor != null) {
            this.f307268i.registerListener(this, sensor, 0);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final void mo5678h() {
        if (this.f307269j != null) {
            this.f307268i.unregisterListener(this);
        }
    }

    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    public final void onSensorChanged(SensorEvent sensorEvent) {
        C58976aa aaVar = C58975e.f156826a;
        if (sensorEvent.values == null || sensorEvent.values.length == 0) {
            mo5708l(false);
            return;
        }
        boolean z = sensorEvent.values[0] <= ((float) this.f307267h.mo79743a(C90014bt.f247123bH));
        float f = sensorEvent.values[0];
        mo5708l(Boolean.valueOf(z));
    }
}
