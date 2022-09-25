package com.google.android.apps.search.podcasts.widgets.playbutton;

import android.animation.ValueAnimator;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.widgets.playbutton.a */
/* compiled from: PG */
final class C141267a implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    final /* synthetic */ PlayProgressButton f383534a;

    public C141267a(PlayProgressButton playProgressButton) {
        this.f383534a = playProgressButton;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        C69664n.m101061g(valueAnimator, "unused");
        this.f383534a.invalidate();
    }
}
