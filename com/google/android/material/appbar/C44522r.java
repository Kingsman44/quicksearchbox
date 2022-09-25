package com.google.android.material.appbar;

import android.animation.ValueAnimator;

/* renamed from: com.google.android.material.appbar.r */
/* compiled from: PG */
final class C44522r implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    final /* synthetic */ CollapsingToolbarLayout f115754a;

    public C44522r(CollapsingToolbarLayout collapsingToolbarLayout) {
        this.f115754a = collapsingToolbarLayout;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f115754a.mo47438e(((Integer) valueAnimator.getAnimatedValue()).intValue());
    }
}
