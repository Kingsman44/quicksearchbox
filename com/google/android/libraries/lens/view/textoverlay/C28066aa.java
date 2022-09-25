package com.google.android.libraries.lens.view.textoverlay;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RectF;

/* renamed from: com.google.android.libraries.lens.view.textoverlay.aa */
/* compiled from: PG */
public final class C28066aa {

    /* renamed from: a */
    public final Matrix f76384a = new Matrix();

    /* renamed from: b */
    private final RectF f76385b;

    public C28066aa(RectF rectF) {
        this.f76385b = rectF;
    }

    /* renamed from: a */
    public static float m52318a(PointF pointF, PointF pointF2) {
        return (float) Math.hypot((double) (pointF.x - pointF2.x), (double) (pointF.y - pointF2.y));
    }

    /* renamed from: b */
    public final void mo33521b(PointF pointF, PointF pointF2, double d) {
        float min = Math.min(this.f76385b.bottom - pointF.y, this.f76385b.bottom - pointF2.y);
        if (min < 0.0f) {
            double d2 = (double) min;
            Double.isNaN(d2);
            float f = (float) (d2 * d);
            pointF.offset(f, min);
            pointF2.offset(f, min);
        }
    }

    /* renamed from: c */
    public final void mo33522c(PointF pointF, PointF pointF2, double d) {
        float f = this.f76385b.left - pointF.x;
        if (f > 0.0f) {
            double d2 = (double) f;
            Double.isNaN(d2);
            float f2 = (float) (d2 * d);
            pointF.offset(f, f2);
            pointF2.offset(f, f2);
        }
    }

    /* renamed from: d */
    public final void mo33523d(PointF pointF, PointF pointF2, double d) {
        float f = this.f76385b.right - pointF.x;
        if (f < 0.0f) {
            double d2 = (double) f;
            Double.isNaN(d2);
            float f2 = (float) (d2 * d);
            pointF.offset(f, f2);
            pointF2.offset(f, f2);
        }
    }

    /* renamed from: e */
    public final void mo33524e(PointF pointF, PointF pointF2, double d) {
        float max = Math.max(this.f76385b.top - pointF.y, this.f76385b.top - pointF2.y);
        if (max > 0.0f) {
            double d2 = (double) max;
            Double.isNaN(d2);
            float f = (float) (d2 * d);
            pointF.offset(f, max);
            pointF2.offset(f, max);
        }
    }
}
