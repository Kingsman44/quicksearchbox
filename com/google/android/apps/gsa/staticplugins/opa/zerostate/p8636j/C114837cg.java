package com.google.android.apps.gsa.staticplugins.opa.zerostate.p8636j;

import android.animation.ValueAnimator;
import android.view.View;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.zerostate.j.cg */
/* compiled from: PG */
final class C114837cg implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    final /* synthetic */ View f318612a;

    public C114837cg(View view) {
        this.f318612a = view;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        if (this.f318612a.getLayoutParams() != null) {
            this.f318612a.getLayoutParams().height = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            this.f318612a.requestLayout();
        }
    }
}
