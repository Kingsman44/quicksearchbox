package com.google.android.apps.search.assistant.libraries.p8984ui.logoview;

import android.animation.ValueAnimator;

/* renamed from: com.google.android.apps.search.assistant.libraries.ui.logoview.d */
/* compiled from: PG */
final class C119470d implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    final /* synthetic */ ValueAnimator f333075a;

    /* renamed from: b */
    final /* synthetic */ LogoView f333076b;

    public C119470d(LogoView logoView, ValueAnimator valueAnimator) {
        this.f333076b = logoView;
        this.f333075a = valueAnimator;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f333076b.f332961c = ((Integer) this.f333075a.getAnimatedValue()).intValue();
        this.f333076b.invalidate();
    }
}
