package com.google.android.libraries.gsa.monet.tools.p1896a;

import android.animation.Animator;

/* renamed from: com.google.android.libraries.gsa.monet.tools.a.f */
/* compiled from: PG */
public final class C23136f implements Animator.AnimatorListener {

    /* renamed from: a */
    private Runnable f63484a;

    public C23136f(Runnable runnable) {
        this.f63484a = runnable;
    }

    public final void onAnimationCancel(Animator animator) {
    }

    public final void onAnimationEnd(Animator animator) {
        Runnable runnable = this.f63484a;
        if (runnable != null) {
            runnable.run();
            this.f63484a = null;
        }
    }

    public final void onAnimationRepeat(Animator animator) {
    }

    public final void onAnimationStart(Animator animator) {
    }
}
