package com.google.android.apps.search.assistant.libraries.p8984ui.logoview;

import android.animation.ValueAnimator;

/* renamed from: com.google.android.apps.search.assistant.libraries.ui.logoview.c */
/* compiled from: PG */
final class C119465c implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    final /* synthetic */ ValueAnimator f333059a;

    /* renamed from: b */
    final /* synthetic */ LogoView f333060b;

    public C119465c(LogoView logoView, ValueAnimator valueAnimator) {
        this.f333060b = logoView;
        this.f333059a = valueAnimator;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f333060b.f332960b = ((Integer) this.f333059a.getAnimatedValue()).intValue();
        this.f333060b.invalidate();
    }
}
