package com.google.android.apps.search.pronunciationlearning.p10638ui.mic.logoview;

import android.animation.ValueAnimator;

/* renamed from: com.google.android.apps.search.pronunciationlearning.ui.mic.logoview.a */
/* compiled from: PG */
final class C141471a implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    final /* synthetic */ ValueAnimator f383994a;

    /* renamed from: b */
    final /* synthetic */ C141479c f383995b;

    public C141471a(C141479c cVar, ValueAnimator valueAnimator) {
        this.f383995b = cVar;
        this.f383994a = valueAnimator;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f383995b.f384040f = ((Integer) this.f383994a.getAnimatedValue()).intValue();
        this.f383995b.f384035a.invalidate();
    }
}
