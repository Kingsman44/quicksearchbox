package com.google.android.apps.gsa.staticplugins.nowcards.p8123ui;

import android.animation.Animator;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowcards.ui.n */
/* compiled from: PG */
final class C105077n implements Animator.AnimatorListener {

    /* renamed from: a */
    final /* synthetic */ Runnable f292814a;

    public C105077n(Runnable runnable) {
        this.f292814a = runnable;
    }

    public final void onAnimationCancel(Animator animator) {
        this.f292814a.run();
    }

    public final void onAnimationEnd(Animator animator) {
        this.f292814a.run();
    }

    public final void onAnimationRepeat(Animator animator) {
    }

    public final void onAnimationStart(Animator animator) {
    }
}
