package com.google.android.material.p3516m;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;

/* renamed from: com.google.android.material.m.c */
/* compiled from: PG */
public final class C44807c implements C44813i {

    /* renamed from: a */
    public float f116845a = 1.0f;

    /* renamed from: c */
    private static Animator m79465c(View view, float f, float f2, float f3, float f4) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        ofFloat.addUpdateListener(new C44796a(view, f, f2, f3));
        ofFloat.addListener(new C44806b(view, f4));
        return ofFloat;
    }

    /* renamed from: a */
    public final Animator mo48173a(View view) {
        float alpha = view.getAlpha() == 0.0f ? 1.0f : view.getAlpha();
        return m79465c(view, 0.0f, alpha, this.f116845a, alpha);
    }

    /* renamed from: b */
    public final Animator mo48174b(View view) {
        float alpha = view.getAlpha() == 0.0f ? 1.0f : view.getAlpha();
        return m79465c(view, alpha, 0.0f, 1.0f, alpha);
    }
}
