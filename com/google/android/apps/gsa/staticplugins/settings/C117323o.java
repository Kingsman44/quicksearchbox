package com.google.android.apps.gsa.staticplugins.settings;

import android.hardware.Sensor;
import com.google.common.base.C58839bc;

/* renamed from: com.google.android.apps.gsa.staticplugins.settings.o */
/* compiled from: PG */
public final /* synthetic */ class C117323o implements C58839bc {

    /* renamed from: a */
    public static final /* synthetic */ C117323o f325672a = new C117323o();

    private /* synthetic */ C117323o() {
    }

    /* renamed from: a */
    public final boolean mo5941a(Object obj) {
        Sensor sensor = (Sensor) obj;
        return (sensor == null || sensor.getStringType() == null) ? false : true;
    }
}
