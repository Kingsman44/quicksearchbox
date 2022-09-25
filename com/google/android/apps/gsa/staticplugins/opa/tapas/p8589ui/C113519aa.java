package com.google.android.apps.gsa.staticplugins.opa.tapas.p8589ui;

import android.animation.ValueAnimator;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.ui.aa */
/* compiled from: PG */
public final /* synthetic */ class C113519aa implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ C113521ac f314295a;

    public /* synthetic */ C113519aa(C113521ac acVar) {
        this.f314295a = acVar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        C113521ac acVar = this.f314295a;
        acVar.f314300c.f314302a.getLayoutParams().height = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        acVar.f314300c.f314302a.requestLayout();
    }
}
