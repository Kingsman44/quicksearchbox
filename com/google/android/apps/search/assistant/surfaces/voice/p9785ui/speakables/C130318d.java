package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.speakables;

import android.animation.ValueAnimator;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.speakables.d */
/* compiled from: PG */
public final class C130318d implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    final /* synthetic */ C130322h f357201a;

    /* renamed from: b */
    final /* synthetic */ ValueAnimator f357202b;

    public C130318d(C130322h hVar, ValueAnimator valueAnimator) {
        this.f357201a = hVar;
        this.f357202b = valueAnimator;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        C69664n.m101061g(valueAnimator, "it");
        C130322h hVar = this.f357201a;
        Object animatedValue = this.f357202b.getAnimatedValue();
        C69664n.m101059e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        hVar.f357213f = ((Float) animatedValue).floatValue();
    }
}
