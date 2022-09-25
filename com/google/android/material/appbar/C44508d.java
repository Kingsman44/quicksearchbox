package com.google.android.material.appbar;

import android.animation.ValueAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;

/* renamed from: com.google.android.material.appbar.d */
/* compiled from: PG */
final class C44508d implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    final /* synthetic */ CoordinatorLayout f115737a;

    /* renamed from: b */
    final /* synthetic */ AppBarLayout f115738b;

    /* renamed from: c */
    final /* synthetic */ AppBarLayout.BaseBehavior f115739c;

    public C44508d(AppBarLayout.BaseBehavior baseBehavior, CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
        this.f115739c = baseBehavior;
        this.f115737a = coordinatorLayout;
        this.f115738b = appBarLayout;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f115739c.mo47462B(this.f115737a, this.f115738b, ((Integer) valueAnimator.getAnimatedValue()).intValue());
    }
}
