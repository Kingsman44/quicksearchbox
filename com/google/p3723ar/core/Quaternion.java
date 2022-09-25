package com.google.p3723ar.core;

import java.util.Locale;

/* renamed from: com.google.ar.core.Quaternion */
/* compiled from: PG */
class Quaternion {

    /* renamed from: a */
    public static final Quaternion f124025a = new Quaternion();

    /* renamed from: w */
    public float f124026w = 1.0f;

    /* renamed from: x */
    public float f124027x = 0.0f;

    /* renamed from: y */
    public float f124028y = 0.0f;

    /* renamed from: z */
    public float f124029z = 0.0f;

    public Quaternion() {
        mo52030b(0.0f, 0.0f, 0.0f, 1.0f);
    }

    /* renamed from: a */
    public static void m85104a(Quaternion quaternion, float[] fArr, int i, float[] fArr2, int i2) {
        float f = fArr[i];
        float f2 = fArr[i + 1];
        float f3 = fArr[i + 2];
        float f4 = quaternion.f124027x;
        float f5 = quaternion.f124028y;
        float f6 = quaternion.f124029z;
        float f7 = quaternion.f124026w;
        float f8 = ((f7 * f) + (f5 * f3)) - (f6 * f2);
        float f9 = ((f7 * f2) + (f6 * f)) - (f4 * f3);
        float f10 = ((f7 * f3) + (f4 * f2)) - (f5 * f);
        float f11 = -f4;
        float f12 = ((f * f11) - (f2 * f5)) - (f3 * f6);
        float f13 = -f6;
        float f14 = -f5;
        fArr2[i2] = (((f8 * f7) + (f12 * f11)) + (f9 * f13)) - (f10 * f14);
        fArr2[i2 + 1] = (((f9 * f7) + (f12 * f14)) + (f10 * f11)) - (f8 * f13);
        fArr2[i2 + 2] = (((f10 * f7) + (f12 * f13)) + (f8 * f14)) - (f9 * f11);
    }

    /* renamed from: b */
    public final void mo52030b(float f, float f2, float f3, float f4) {
        this.f124027x = f;
        this.f124028y = f2;
        this.f124029z = f3;
        this.f124026w = f4;
    }

    public final String toString() {
        return String.format(Locale.ROOT, "[%.3f, %.3f, %.3f, %.3f]", new Object[]{Float.valueOf(this.f124027x), Float.valueOf(this.f124028y), Float.valueOf(this.f124029z), Float.valueOf(this.f124026w)});
    }

    public Quaternion(float f, float f2, float f3, float f4) {
        mo52030b(f, f2, f3, f4);
    }

    public Quaternion(Quaternion quaternion) {
        mo52030b(quaternion.f124027x, quaternion.f124028y, quaternion.f124029z, quaternion.f124026w);
    }
}
