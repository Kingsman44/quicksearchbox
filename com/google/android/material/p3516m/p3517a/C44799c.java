package com.google.android.material.p3516m.p3517a;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: com.google.android.material.m.a.c */
/* compiled from: PG */
public final class C44799c implements C44805i {
    /* renamed from: c */
    private static Animator m79447c(View view, float f, float f2, float f3, float f4, float f5) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        ofFloat.addUpdateListener(new C44797a(view, f, f2, f3, f4));
        ofFloat.addListener(new C44798b(view, f5));
        return ofFloat;
    }

    /* renamed from: a */
    public final Animator mo48165a(ViewGroup viewGroup, View view) {
        float alpha = view.getAlpha() == 0.0f ? 1.0f : view.getAlpha();
        return m79447c(view, 0.0f, alpha, 0.35f, 1.0f, alpha);
    }

    /* renamed from: b */
    public final Animator mo48166b(ViewGroup viewGroup, View view) {
        float alpha = view.getAlpha() == 0.0f ? 1.0f : view.getAlpha();
        return m79447c(view, alpha, 0.0f, 0.0f, 0.35f, alpha);
    }
}
