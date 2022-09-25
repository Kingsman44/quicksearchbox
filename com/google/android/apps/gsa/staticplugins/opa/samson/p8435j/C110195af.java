package com.google.android.apps.gsa.staticplugins.opa.samson.p8435j;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.airbnb.lottie.LottieAnimationView;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.samson.j.af */
/* compiled from: PG */
final class C110195af extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ LottieAnimationView f307058a;

    /* renamed from: b */
    final /* synthetic */ LottieAnimationView f307059b;

    public C110195af(LottieAnimationView lottieAnimationView, LottieAnimationView lottieAnimationView2) {
        this.f307058a = lottieAnimationView;
        this.f307059b = lottieAnimationView2;
    }

    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        this.f307058a.setVisibility(0);
        this.f307059b.setVisibility(8);
        this.f307058a.mo9695f();
        this.f307059b.mo9696g(this);
    }
}
