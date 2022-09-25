package com.google.android.material.internal;

/* renamed from: com.google.android.material.internal.m */
/* compiled from: PG */
final class C44753m {
    /* renamed from: a */
    static void m79358a(float f, float[] fArr) {
        if (f <= 0.5f) {
            fArr[0] = 1.0f - (f + f);
            fArr[1] = 0.0f;
            return;
        }
        fArr[0] = 0.0f;
        fArr[1] = (f + f) - 4.0f;
    }
}
