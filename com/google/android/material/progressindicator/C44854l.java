package com.google.android.material.progressindicator;

import android.util.Property;

/* renamed from: com.google.android.material.progressindicator.l */
/* compiled from: PG */
final class C44854l extends Property {
    public C44854l(Class cls) {
        super(cls, "completeEndFraction");
    }

    public final /* synthetic */ Object get(Object obj) {
        int[] iArr = C44855m.f117027a;
        return Float.valueOf(((C44855m) obj).f117036h);
    }

    public final /* synthetic */ void set(Object obj, Object obj2) {
        float floatValue = ((Float) obj2).floatValue();
        int[] iArr = C44855m.f117027a;
        ((C44855m) obj).f117036h = floatValue;
    }
}
