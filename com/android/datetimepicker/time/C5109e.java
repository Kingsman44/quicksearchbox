package com.android.datetimepicker.time;

import android.util.Property;

/* renamed from: com.android.datetimepicker.time.e */
/* compiled from: PG */
final class C5109e extends Property {
    public C5109e(Class cls) {
        super(cls, "animationRadiusMultiplier");
    }

    public final /* synthetic */ Object get(Object obj) {
        int i = C5110f.f16300c;
        return Float.valueOf(((C5110f) obj).f16302b);
    }

    public final /* bridge */ /* synthetic */ void set(Object obj, Object obj2) {
        C5110f fVar = (C5110f) obj;
        float floatValue = ((Float) obj2).floatValue();
        int i = C5110f.f16300c;
        fVar.f16302b = floatValue;
        fVar.f16301a = true;
    }
}
