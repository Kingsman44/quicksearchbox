package com.google.android.apps.search.googleapp.pixelsuggest;

import android.animation.Animator;
import android.view.View;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.pixelsuggest.c */
/* compiled from: PG */
public final class C136893c implements Animator.AnimatorListener {

    /* renamed from: a */
    final /* synthetic */ View f372583a;

    public C136893c(View view) {
        this.f372583a = view;
    }

    public final void onAnimationCancel(Animator animator) {
        C69664n.m101061g(animator, "animator");
    }

    public final void onAnimationEnd(Animator animator) {
        C69664n.m101061g(animator, "animator");
        this.f372583a.setVisibility(8);
    }

    public final void onAnimationRepeat(Animator animator) {
        C69664n.m101061g(animator, "animator");
    }

    public final void onAnimationStart(Animator animator) {
        C69664n.m101061g(animator, "animator");
    }
}
