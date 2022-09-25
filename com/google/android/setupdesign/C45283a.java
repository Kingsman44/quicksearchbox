package com.google.android.setupdesign;

import android.animation.Animator;
import android.util.Log;

/* renamed from: com.google.android.setupdesign.a */
/* compiled from: PG */
final class C45283a implements Animator.AnimatorListener {

    /* renamed from: a */
    final /* synthetic */ GlifLoadingLayout f118319a;

    public C45283a(GlifLoadingLayout glifLoadingLayout) {
        this.f118319a = glifLoadingLayout;
    }

    public final void onAnimationCancel(Animator animator) {
    }

    public final void onAnimationEnd(Animator animator) {
        boolean w = this.f118319a.mo49202w();
        Log.i("GlifLoadingLayout", "Animate enable:" + w + ". Animation end.");
    }

    public final void onAnimationRepeat(Animator animator) {
    }

    public final void onAnimationStart(Animator animator) {
    }
}
