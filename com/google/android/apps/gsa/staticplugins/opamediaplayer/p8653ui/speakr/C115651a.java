package com.google.android.apps.gsa.staticplugins.opamediaplayer.p8653ui.speakr;

import android.animation.ValueAnimator;

/* renamed from: com.google.android.apps.gsa.staticplugins.opamediaplayer.ui.speakr.a */
/* compiled from: PG */
public final /* synthetic */ class C115651a implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ C115732d f320831a;

    public /* synthetic */ C115651a(C115732d dVar) {
        this.f320831a = dVar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        C115732d dVar = this.f320831a;
        dVar.f320994a.setAlpha((int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * ((float) dVar.f320995b)));
        dVar.invalidateSelf();
    }
}
