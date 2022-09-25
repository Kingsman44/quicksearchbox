package com.google.android.apps.gsa.staticplugins.opa.valyrian.p8599d;

import android.animation.ValueAnimator;
import android.view.View;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.valyrian.d.i */
/* compiled from: PG */
public final /* synthetic */ class C114026i implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ View f315679a;

    public /* synthetic */ C114026i(View view) {
        this.f315679a = view;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        View view = this.f315679a;
        view.getLayoutParams().height = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        view.requestLayout();
    }
}
