package com.google.android.apps.search.podcasts.widgets.download;

import android.animation.Animator;
import p5462h.p5473f.p5474a.C69615a;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.widgets.download.a */
/* compiled from: PG */
public final class C141220a implements Animator.AnimatorListener {

    /* renamed from: a */
    private final C69615a f383409a;

    public C141220a(C69615a aVar) {
        this.f383409a = aVar;
    }

    public final void onAnimationCancel(Animator animator) {
        C69664n.m101061g(animator, "animation");
        this.f383409a.mo5672a();
    }

    public final void onAnimationEnd(Animator animator) {
        C69664n.m101061g(animator, "animation");
        this.f383409a.mo5672a();
    }

    public final void onAnimationRepeat(Animator animator) {
        C69664n.m101061g(animator, "animation");
    }

    public final void onAnimationStart(Animator animator) {
        C69664n.m101061g(animator, "animation");
    }
}
