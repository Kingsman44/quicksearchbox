package com.google.android.libraries.social.peoplekit.p3273a.p3274a;

import android.animation.ValueAnimator;
import android.view.View;

/* renamed from: com.google.android.libraries.social.peoplekit.a.a.u */
/* compiled from: PG */
final class C42002u implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    final /* synthetic */ View f109684a;

    /* renamed from: b */
    final /* synthetic */ boolean f109685b;

    /* renamed from: c */
    final /* synthetic */ C41967af f109686c;

    public C42002u(C41967af afVar, View view, boolean z) {
        this.f109686c = afVar;
        this.f109684a = view;
        this.f109685b = z;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f109684a.getLayoutParams().height = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        this.f109684a.requestLayout();
        if (valueAnimator.getAnimatedFraction() == 1.0f && !this.f109685b) {
            this.f109686c.f109535g.setVisibility(8);
        }
    }
}
