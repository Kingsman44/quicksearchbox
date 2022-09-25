package com.google.android.libraries.animation.impl;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.libraries.animation.C147776i;
import com.google.android.libraries.animation.C147784j;

/* renamed from: com.google.android.libraries.animation.impl.e */
/* compiled from: PG */
final class C147782e extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ C147784j f398736a;

    /* renamed from: b */
    final /* synthetic */ AnimationControllerFactoryImpl$ValueAnimatorTicker f398737b;

    public C147782e(AnimationControllerFactoryImpl$ValueAnimatorTicker animationControllerFactoryImpl$ValueAnimatorTicker, C147784j jVar) {
        this.f398737b = animationControllerFactoryImpl$ValueAnimatorTicker;
        this.f398736a = jVar;
    }

    public final void onAnimationCancel(Animator animator) {
        this.f398737b.mo124452c();
        ((C147776i) this.f398736a).f398729a.mo124463e(4);
    }

    public final void onAnimationEnd(Animator animator) {
        this.f398737b.mo124452c();
        ((C147776i) this.f398736a).f398729a.mo124463e(3);
    }

    public final void onAnimationStart(Animator animator) {
        ((C147776i) this.f398736a).f398729a.mo124463e(2);
    }
}
