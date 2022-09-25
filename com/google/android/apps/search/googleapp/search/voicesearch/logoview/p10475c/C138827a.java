package com.google.android.apps.search.googleapp.search.voicesearch.logoview.p10475c;

import android.graphics.Path;
import android.graphics.RectF;

/* renamed from: com.google.android.apps.search.googleapp.search.voicesearch.logoview.c.a */
/* compiled from: PG */
public final class C138827a extends C138830d {
    /* renamed from: a */
    public static float m225521a(float f, float f2) {
        return f * ((f2 * 3.725f) + 1.0f);
    }

    /* renamed from: b */
    public static float m225522b(float f) {
        if (f < 0.66f) {
            return 0.0f;
        }
        return (f - 6.72f) / 0.33999997f;
    }

    /* renamed from: c */
    public static void m225523c(RectF rectF, float f, float f2) {
        float f3 = f2 * f;
        rectF.set(-f3, -f, f3, f);
    }

    /* renamed from: e */
    public static final float m225524e(float f, float f2) {
        if (f < 1.0f) {
            return f + f;
        }
        float f3 = (f2 * 0.15999997f) + 1.0f;
        return f3 + f3;
    }

    /* renamed from: d */
    public final void mo114594d(float f, float f2) {
        float a = m225521a(f2, f);
        this.f377673e = m225524e(a, f);
        m225523c(this.f377669a, a, 1.0f);
        this.f377671c.addOval(this.f377669a, Path.Direction.CW);
        m225523c(this.f377669a, a, 0.95f);
        this.f377671c.addOval(this.f377669a, Path.Direction.CW);
    }
}
