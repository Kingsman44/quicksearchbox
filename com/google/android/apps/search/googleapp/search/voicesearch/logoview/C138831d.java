package com.google.android.apps.search.googleapp.search.voicesearch.logoview;

import android.animation.ValueAnimator;

/* renamed from: com.google.android.apps.search.googleapp.search.voicesearch.logoview.d */
/* compiled from: PG */
final class C138831d implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    final /* synthetic */ ValueAnimator f377676a;

    /* renamed from: b */
    final /* synthetic */ LogoView f377677b;

    public C138831d(LogoView logoView, ValueAnimator valueAnimator) {
        this.f377677b = logoView;
        this.f377676a = valueAnimator;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f377677b.f377576d = ((Integer) this.f377676a.getAnimatedValue()).intValue();
        this.f377677b.invalidate();
    }
}
