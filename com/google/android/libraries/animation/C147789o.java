package com.google.android.libraries.animation;

import android.animation.TypeEvaluator;

/* renamed from: com.google.android.libraries.animation.o */
/* compiled from: PG */
public final /* synthetic */ class C147789o implements TypeEvaluator {

    /* renamed from: a */
    public static final /* synthetic */ C147789o f398752a = new C147789o();

    private /* synthetic */ C147789o() {
    }

    public final Object evaluate(float f, Object obj, Object obj2) {
        Float f2 = (Float) obj;
        return Float.valueOf(f2.floatValue() + (f * (((Float) obj2).floatValue() - f2.floatValue())));
    }
}
