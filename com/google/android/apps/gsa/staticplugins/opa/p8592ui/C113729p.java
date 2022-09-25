package com.google.android.apps.gsa.staticplugins.opa.p8592ui;

import android.animation.ValueAnimator;
import android.view.View;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ui.p */
/* compiled from: PG */
final class C113729p implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    final /* synthetic */ View f314961a;

    public C113729p(View view) {
        this.f314961a = view;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        Integer num = (Integer) valueAnimator.getAnimatedValue();
        this.f314961a.getLayoutParams().width = num.intValue();
        this.f314961a.getLayoutParams().height = num.intValue();
        this.f314961a.requestLayout();
    }
}
