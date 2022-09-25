package com.google.android.apps.gsa.staticplugins.opa.chatui;

import android.animation.ValueAnimator;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.chatui.af */
/* compiled from: PG */
final class C108208af implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    final /* synthetic */ C108212aj f300969a;

    public C108208af(C108212aj ajVar) {
        this.f300969a = ajVar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        if (this.f300969a.f300976b.getLayoutParams() != null) {
            this.f300969a.f300976b.getLayoutParams().height = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            this.f300969a.f300976b.requestLayout();
        }
    }
}
