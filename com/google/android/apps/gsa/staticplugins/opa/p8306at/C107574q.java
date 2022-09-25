package com.google.android.apps.gsa.staticplugins.opa.p8306at;

import android.animation.ValueAnimator;
import android.view.View;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.at.q */
/* compiled from: PG */
final class C107574q implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    final /* synthetic */ View f299292a;

    public C107574q(View view) {
        this.f299292a = view;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f299292a.getLayoutParams().height = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        this.f299292a.requestLayout();
    }
}
