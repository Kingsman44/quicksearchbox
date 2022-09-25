package com.google.android.apps.search.assistant.libraries.p8984ui.logoview.p8987c;

import android.graphics.Path;
import android.graphics.RectF;

/* renamed from: com.google.android.apps.search.assistant.libraries.ui.logoview.c.a */
/* compiled from: PG */
public final class C119466a extends C119469d {
    /* renamed from: a */
    public static float m198272a(float f, float f2) {
        return f * ((f2 * 3.725f) + 1.0f);
    }

    /* renamed from: b */
    public static float m198273b(float f) {
        if (f < 0.66f) {
            return 0.0f;
        }
        return (f - 6.72f) / 0.33999997f;
    }

    /* renamed from: c */
    public static void m198274c(RectF rectF, float f, float f2) {
        float f3 = f2 * f;
        rectF.set(-f3, -f, f3, f);
    }

    /* renamed from: e */
    public static final float m198275e(float f, float f2) {
        if (f < 1.0f) {
            return f + f;
        }
        float f3 = (f2 * 0.15999997f) + 1.0f;
        return f3 + f3;
    }

    /* renamed from: d */
    public final void mo104393d(float f, float f2) {
        float a = m198272a(f2, f);
        this.f333072e = m198275e(a, f);
        m198274c(this.f333068a, a, 1.0f);
        this.f333070c.addOval(this.f333068a, Path.Direction.CW);
        m198274c(this.f333068a, a, 0.95f);
        this.f333070c.addOval(this.f333068a, Path.Direction.CW);
    }
}
