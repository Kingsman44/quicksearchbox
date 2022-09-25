package com.google.android.apps.search.pronunciationlearning.p10638ui.mic.logoview;

import android.animation.ValueAnimator;

/* renamed from: com.google.android.apps.search.pronunciationlearning.ui.mic.logoview.b */
/* compiled from: PG */
final class C141475b implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    final /* synthetic */ ValueAnimator f384008a;

    /* renamed from: b */
    final /* synthetic */ C141479c f384009b;

    public C141475b(C141479c cVar, ValueAnimator valueAnimator) {
        this.f384009b = cVar;
        this.f384008a = valueAnimator;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f384009b.f384041g = ((Integer) this.f384008a.getAnimatedValue()).intValue();
        this.f384009b.f384035a.invalidate();
    }
}
