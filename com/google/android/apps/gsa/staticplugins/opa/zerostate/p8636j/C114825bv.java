package com.google.android.apps.gsa.staticplugins.opa.zerostate.p8636j;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.zerostate.j.bv */
/* compiled from: PG */
final class C114825bv implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    final /* synthetic */ View f318597a;

    public C114825bv(View view) {
        this.f318597a = view;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        ((ViewGroup) this.f318597a).getChildAt(1).getLayoutParams().height = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        this.f318597a.requestLayout();
    }
}
