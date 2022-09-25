package com.google.android.apps.gsa.staticplugins.opa.zerostate.p8636j;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.zerostate.j.ce */
/* compiled from: PG */
final class C114835ce implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    final /* synthetic */ View f318609a;

    public C114835ce(View view) {
        this.f318609a = view;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        View childAt = ((ViewGroup) this.f318609a).getChildAt(1);
        if (!(childAt == null || childAt.getLayoutParams() == null)) {
            childAt.getLayoutParams().height = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        }
        this.f318609a.requestLayout();
    }
}
