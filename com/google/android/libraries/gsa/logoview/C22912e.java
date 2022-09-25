package com.google.android.libraries.gsa.logoview;

import android.animation.ValueAnimator;

/* renamed from: com.google.android.libraries.gsa.logoview.e */
/* compiled from: PG */
final class C22912e implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    final /* synthetic */ ValueAnimator f63107a;

    /* renamed from: b */
    final /* synthetic */ LogoView f63108b;

    public C22912e(LogoView logoView, ValueAnimator valueAnimator) {
        this.f63108b = logoView;
        this.f63107a = valueAnimator;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f63108b.f62999f = ((Integer) this.f63107a.getAnimatedValue()).intValue();
        this.f63108b.invalidate();
    }
}
