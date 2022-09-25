package com.google.android.material.p3504a;

import android.animation.TypeEvaluator;
import android.graphics.Matrix;

/* renamed from: com.google.android.material.a.f */
/* compiled from: PG */
public class C44501f implements TypeEvaluator {

    /* renamed from: a */
    private final float[] f115656a = new float[9];

    /* renamed from: b */
    private final float[] f115657b = new float[9];

    /* renamed from: c */
    private final Matrix f115658c = new Matrix();

    /* renamed from: a */
    public Matrix evaluate(float f, Matrix matrix, Matrix matrix2) {
        matrix.getValues(this.f115656a);
        matrix2.getValues(this.f115657b);
        for (int i = 0; i < 9; i++) {
            float[] fArr = this.f115657b;
            float f2 = fArr[i];
            float f3 = this.f115656a[i];
            fArr[i] = f3 + ((f2 - f3) * f);
        }
        this.f115658c.setValues(this.f115657b);
        return this.f115658c;
    }
}
