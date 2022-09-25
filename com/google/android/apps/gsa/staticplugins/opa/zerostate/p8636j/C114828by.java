package com.google.android.apps.gsa.staticplugins.opa.zerostate.p8636j;

import android.animation.ValueAnimator;
import android.view.View;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.zerostate.j.by */
/* compiled from: PG */
final class C114828by implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    final /* synthetic */ View f318601a;

    public C114828by(View view) {
        this.f318601a = view;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        if (this.f318601a.getLayoutParams() != null) {
            this.f318601a.getLayoutParams().height = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            this.f318601a.requestLayout();
        }
    }
}
