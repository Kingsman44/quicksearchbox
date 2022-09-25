package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.speakables;

import android.animation.ValueAnimator;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.speakables.c */
/* compiled from: PG */
final class C130317c implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    final /* synthetic */ Wiggle f357199a;

    /* renamed from: b */
    final /* synthetic */ ValueAnimator f357200b;

    public C130317c(Wiggle wiggle, ValueAnimator valueAnimator) {
        this.f357199a = wiggle;
        this.f357200b = valueAnimator;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        C69664n.m101061g(valueAnimator, "it");
        Wiggle wiggle = this.f357199a;
        Object animatedValue = this.f357200b.getAnimatedValue();
        C69664n.m101059e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        wiggle.mo109655b(((Float) animatedValue).floatValue());
    }
}
