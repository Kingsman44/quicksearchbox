package com.google.android.material.internal;

import android.animation.ValueAnimator;
import android.view.View;

/* renamed from: com.google.android.material.internal.l */
/* compiled from: PG */
public final class C44752l implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    private final View f116682a;

    /* renamed from: b */
    private final View f116683b;

    /* renamed from: c */
    private final float[] f116684c = new float[2];

    public C44752l(View view, View view2) {
        this.f116682a = view;
        this.f116683b = view2;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        C44753m.m79358a(((Float) valueAnimator.getAnimatedValue()).floatValue(), this.f116684c);
        View view = this.f116682a;
        if (view != null) {
            view.setAlpha(this.f116684c[0]);
        }
        View view2 = this.f116683b;
        if (view2 != null) {
            view2.setAlpha(this.f116684c[1]);
        }
    }
}
