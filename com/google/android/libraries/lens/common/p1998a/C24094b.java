package com.google.android.libraries.lens.common.p1998a;

import android.graphics.PointF;
import android.graphics.RectF;

/* renamed from: com.google.android.libraries.lens.common.a.b */
/* compiled from: PG */
public final class C24094b {
    /* renamed from: a */
    public static float m44752a(PointF pointF, PointF pointF2) {
        return (float) Math.hypot((double) (pointF2.x - pointF.x), (double) (pointF2.y - pointF.y));
    }

    /* renamed from: b */
    public static float m44753b(PointF pointF, RectF rectF) {
        float f;
        float f2 = pointF.x;
        float f3 = pointF.y;
        float f4 = 0.0f;
        if (f2 < rectF.left) {
            f = rectF.left - f2;
        } else {
            f = f2 > rectF.right ? f2 - rectF.right : 0.0f;
        }
        if (f3 < rectF.top) {
            f4 = rectF.top - f3;
        } else if (f3 > rectF.bottom) {
            f4 = f3 - rectF.bottom;
        }
        return (float) Math.hypot((double) f, (double) f4);
    }

    /* renamed from: c */
    public static PointF m44754c(PointF pointF, PointF pointF2, float f) {
        float a = m44752a(pointF, pointF2);
        return a != 0.0f ? m44755d(pointF, pointF2, f / a) : pointF;
    }

    /* renamed from: d */
    public static PointF m44755d(PointF pointF, PointF pointF2, float f) {
        float f2 = 1.0f - f;
        return new PointF((pointF.x * f2) + (pointF2.x * f), (pointF.y * f2) + (pointF2.y * f));
    }
}
