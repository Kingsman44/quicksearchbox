package com.android.datetimepicker.time;

import android.util.Property;

/* renamed from: com.android.datetimepicker.time.c */
/* compiled from: PG */
final class C5107c extends Property {
    public C5107c(Class cls) {
        super(cls, "animationRadiusMultiplier");
    }

    public final /* synthetic */ Object get(Object obj) {
        int i = C5108d.f16298b;
        return Float.valueOf(((C5108d) obj).f16299a);
    }

    public final /* synthetic */ void set(Object obj, Object obj2) {
        float floatValue = ((Float) obj2).floatValue();
        int i = C5108d.f16298b;
        ((C5108d) obj).f16299a = floatValue;
    }
}
