package com.google.android.libraries.lens.view.infopanel;

import android.animation.ValueAnimator;

/* renamed from: com.google.android.libraries.lens.view.infopanel.bj */
/* compiled from: PG */
public final /* synthetic */ class C27048bj implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ C27050bl f73713a;

    public /* synthetic */ C27048bj(C27050bl blVar) {
        this.f73713a = blVar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f73713a.f73718d.mo32490a(valueAnimator.getAnimatedFraction());
    }
}
