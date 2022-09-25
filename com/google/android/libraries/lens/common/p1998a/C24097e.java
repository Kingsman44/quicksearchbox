package com.google.android.libraries.lens.common.p1998a;

import android.graphics.PointF;

/* renamed from: com.google.android.libraries.lens.common.a.e */
/* compiled from: PG */
public final class C24097e {
    /* renamed from: a */
    public static PointF m44767a(float f, float f2, float f3, int i, PointF pointF) {
        float f4 = f;
        float f5 = f2;
        float f6 = f3;
        PointF pointF2 = pointF;
        double radians = i == 1 ? Math.toRadians((double) f6) : (double) f6;
        double cos = Math.cos(radians);
        double sin = Math.sin(radians);
        double d = (double) (pointF2.x - f4);
        double d2 = (double) (pointF2.y - f5);
        double d3 = (double) f4;
        Double.isNaN(d);
        Double.isNaN(d2);
        Double.isNaN(d3);
        float f7 = (float) (d3 + ((d * cos) - (d2 * sin)));
        double d4 = (double) f5;
        Double.isNaN(d2);
        Double.isNaN(d);
        Double.isNaN(d4);
        return new PointF(f7, (float) (d4 + (d2 * cos) + (d * sin)));
    }

    /* renamed from: b */
    public static PointF[] m44768b(float f, float f2, float f3, int i, PointF... pointFArr) {
        PointF[] pointFArr2 = new PointF[4];
        for (int i2 = 0; i2 < 4; i2++) {
            pointFArr2[i2] = m44767a(f, f2, f3, i, pointFArr[i2]);
        }
        return pointFArr2;
    }
}
