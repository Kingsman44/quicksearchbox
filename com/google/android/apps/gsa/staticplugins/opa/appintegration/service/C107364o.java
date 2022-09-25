package com.google.android.apps.gsa.staticplugins.opa.appintegration.service;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Handler;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.appintegration.service.o */
/* compiled from: PG */
public final class C107364o {

    /* renamed from: a */
    final Sensor f298805a;

    /* renamed from: b */
    final SensorManager f298806b;

    /* renamed from: c */
    final C107363n f298807c;

    /* renamed from: d */
    boolean f298808d = false;

    /* renamed from: e */
    public final Handler f298809e;

    /* renamed from: f */
    Float f298810f = Float.valueOf(0.0f);

    /* renamed from: g */
    public int f298811g = 0;

    /* renamed from: h */
    C107354e f298812h;

    public C107364o(Context context, Handler handler) {
        this.f298809e = handler;
        SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
        this.f298806b = sensorManager;
        Sensor defaultSensor = sensorManager.getDefaultSensor(8);
        this.f298805a = defaultSensor;
        if (defaultSensor != null) {
            this.f298810f = Float.valueOf(defaultSensor.getMaximumRange());
        }
        this.f298807c = new C107363n(this);
    }
}
