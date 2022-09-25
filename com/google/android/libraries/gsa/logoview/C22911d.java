package com.google.android.libraries.gsa.logoview;

import android.animation.ValueAnimator;

/* renamed from: com.google.android.libraries.gsa.logoview.d */
/* compiled from: PG */
final class C22911d implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    final /* synthetic */ ValueAnimator f63105a;

    /* renamed from: b */
    final /* synthetic */ LogoView f63106b;

    public C22911d(LogoView logoView, ValueAnimator valueAnimator) {
        this.f63106b = logoView;
        this.f63105a = valueAnimator;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f63106b.f62998e = ((Integer) this.f63105a.getAnimatedValue()).intValue();
        this.f63106b.invalidate();
    }
}
