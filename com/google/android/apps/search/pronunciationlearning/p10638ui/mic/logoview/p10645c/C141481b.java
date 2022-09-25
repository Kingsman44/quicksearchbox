package com.google.android.apps.search.pronunciationlearning.p10638ui.mic.logoview.p10645c;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;

/* renamed from: com.google.android.apps.search.pronunciationlearning.ui.mic.logoview.c.b */
/* compiled from: PG */
public final class C141481b {

    /* renamed from: a */
    public final Matrix f384054a = new Matrix();

    /* renamed from: b */
    public final Path f384055b = new Path();

    /* renamed from: c */
    public final Path f384056c = new Path();

    /* renamed from: d */
    public float f384057d;

    /* renamed from: e */
    public float f384058e;

    /* renamed from: f */
    public Paint.Cap f384059f = Paint.Cap.ROUND;

    /* renamed from: g */
    private final RectF f384060g = new RectF();

    /* renamed from: b */
    public static float m229621b(float f, float f2) {
        return ((f - 1.0f) * f2) + 4.0f;
    }

    /* renamed from: a */
    public final void mo116498a(Path path, C141480a aVar, float f, float f2, float f3) {
        path.reset();
        float min = Math.min(f3, 1.0f) * f;
        if (f2 > 0.0f) {
            float f4 = -0.5f + f3;
            min += Math.max(f2 - (((f4 * f4) * f2) * 5.0f), 0.0f);
        }
        float f5 = aVar.f384051e;
        float f6 = (((f5 + 18.849556f) + aVar.f384052f) - f) * f3;
        if (f6 < f5) {
            float min2 = Math.min(f6 + min, f5);
            path.moveTo(0.0f, f6);
            path.lineTo(0.0f, min2);
            min -= min2 - f6;
        }
        float f7 = aVar.f384051e;
        if (f6 < f7 + 18.849556f && min > 0.0f) {
            float max = Math.max(0.0f, f6 - f7);
            float min3 = Math.min(18.849556f, max + min);
            float f8 = (max * 180.0f) / 18.849556f;
            float f9 = (min3 * 180.0f) / 18.849556f;
            if (!aVar.f384053g) {
                f8 = 180.0f - f8;
                f9 = 180.0f - f9;
            }
            float f10 = f9 - f8;
            float f11 = -6.0f;
            this.f384060g.set(-6.0f, -6.0f, 6.0f, 6.0f);
            if (true != aVar.f384053g) {
                f11 = 6.0f;
            }
            this.f384060g.offset(f11, aVar.f384051e);
            path.addArc(this.f384060g, f8, f10);
            min -= min3 - max;
        }
        if (min > 0.0f) {
            float f12 = true != aVar.f384053g ? 12.0f : -12.0f;
            float f13 = aVar.f384051e;
            path.moveTo(f12, f13);
            path.lineTo(f12, f13 - min);
        }
    }
}
