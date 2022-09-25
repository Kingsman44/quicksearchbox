package com.google.android.libraries.elements.p1708c.p1711c;

import android.animation.Animator;

/* renamed from: com.google.android.libraries.elements.c.c.p */
/* compiled from: PG */
final class C20766p implements Animator.AnimatorListener {

    /* renamed from: a */
    private final Runnable f58108a;

    public C20766p(Runnable runnable) {
        this.f58108a = runnable;
    }

    public final void onAnimationCancel(Animator animator) {
    }

    public final void onAnimationEnd(Animator animator) {
        this.f58108a.run();
    }

    public final void onAnimationRepeat(Animator animator) {
        this.f58108a.run();
    }

    public final void onAnimationStart(Animator animator) {
    }
}
