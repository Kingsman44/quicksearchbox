package com.google.android.apps.gsa.staticplugins.immersiveactions;

import android.animation.ValueAnimator;

/* renamed from: com.google.android.apps.gsa.staticplugins.immersiveactions.b */
/* compiled from: PG */
final class C102412b implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    final /* synthetic */ ImmersiveActionsListenableScrollView f285832a;

    public C102412b(ImmersiveActionsListenableScrollView immersiveActionsListenableScrollView) {
        this.f285832a = immersiveActionsListenableScrollView;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f285832a.setScrollY(((Integer) valueAnimator.getAnimatedValue()).intValue());
    }
}
