package com.google.android.material.tabs;

import android.animation.ValueAnimator;

/* renamed from: com.google.android.material.tabs.e */
/* compiled from: PG */
final class C44902e implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    final /* synthetic */ TabLayout f117211a;

    public C44902e(TabLayout tabLayout) {
        this.f117211a = tabLayout;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f117211a.scrollTo(((Integer) valueAnimator.getAnimatedValue()).intValue(), 0);
    }
}
