package com.google.android.apps.gsa.staticplugins.opa.valyrian.p8599d;

import android.animation.ValueAnimator;
import android.view.View;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.valyrian.d.l */
/* compiled from: PG */
public final /* synthetic */ class C114029l implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ View f315694a;

    public /* synthetic */ C114029l(View view) {
        this.f315694a = view;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        View view = this.f315694a;
        view.getLayoutParams().height = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        view.requestLayout();
    }
}
