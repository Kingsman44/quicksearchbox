package com.google.android.apps.search.podcasts.playerpanel;

import android.animation.Animator;
import android.view.View;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.playerpanel.ah */
/* compiled from: PG */
public final class C140877ah implements Animator.AnimatorListener {

    /* renamed from: a */
    final /* synthetic */ View f382545a;

    public C140877ah(View view) {
        this.f382545a = view;
    }

    public final void onAnimationCancel(Animator animator) {
        C69664n.m101061g(animator, "animation");
    }

    public final void onAnimationEnd(Animator animator) {
        C69664n.m101061g(animator, "animation");
        this.f382545a.sendAccessibilityEvent(8);
    }

    public final void onAnimationRepeat(Animator animator) {
        C69664n.m101061g(animator, "animation");
    }

    public final void onAnimationStart(Animator animator) {
        C69664n.m101061g(animator, "animation");
    }
}
