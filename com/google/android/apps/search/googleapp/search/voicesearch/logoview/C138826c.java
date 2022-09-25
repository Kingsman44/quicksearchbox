package com.google.android.apps.search.googleapp.search.voicesearch.logoview;

import android.animation.ValueAnimator;

/* renamed from: com.google.android.apps.search.googleapp.search.voicesearch.logoview.c */
/* compiled from: PG */
final class C138826c implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    final /* synthetic */ ValueAnimator f377660a;

    /* renamed from: b */
    final /* synthetic */ LogoView f377661b;

    public C138826c(LogoView logoView, ValueAnimator valueAnimator) {
        this.f377661b = logoView;
        this.f377660a = valueAnimator;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f377661b.f377575c = ((Integer) this.f377660a.getAnimatedValue()).intValue();
        this.f377661b.invalidate();
    }
}
