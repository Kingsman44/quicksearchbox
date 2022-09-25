package com.google.android.apps.gsa.staticplugins.hotwordenrollment.p8009ui;

import android.animation.ValueAnimator;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.ui.c */
/* compiled from: PG */
public final /* synthetic */ class C102235c implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ C102238f f285275a;

    public /* synthetic */ C102235c(C102238f fVar) {
        this.f285275a = fVar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f285275a.f285280c.f285269e.setScrollY(((Integer) valueAnimator.getAnimatedValue()).intValue());
    }
}
