package com.google.android.libraries.gsa.logoview.p1883c;

import android.graphics.Path;
import android.graphics.RectF;

/* renamed from: com.google.android.libraries.gsa.logoview.c.a */
/* compiled from: PG */
public final class C22907a extends C22910d {
    /* renamed from: b */
    public static final float m42845b(float f, float f2) {
        return f * ((f2 * 3.725f) + 1.0f);
    }

    /* renamed from: c */
    public static final float m42846c(float f) {
        if (f < 0.66f) {
            return 0.0f;
        }
        return (f - 6.72f) / 0.33999997f;
    }

    /* renamed from: d */
    public static final float m42847d(float f, float f2) {
        if (f < 1.0f) {
            return f + f;
        }
        float f3 = (f2 * 0.15999997f) + 1.0f;
        return f3 + f3;
    }

    /* renamed from: e */
    public static final void m42848e(RectF rectF, float f, float f2) {
        float f3 = f2 * f;
        rectF.set(-f3, -f, f3, f);
    }

    /* renamed from: a */
    public final void mo28274a(float f, float f2) {
        float b = m42845b(f2, f);
        this.f63102e = m42847d(b, f);
        m42848e(this.f63098a, b, 1.0f);
        this.f63100c.addOval(this.f63098a, Path.Direction.CW);
        m42848e(this.f63098a, b, 0.95f);
        this.f63100c.addOval(this.f63098a, Path.Direction.CW);
    }
}
