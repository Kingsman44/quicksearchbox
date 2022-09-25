package com.google.android.libraries.lens.view.gallery.p2112e;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: com.google.android.libraries.lens.view.gallery.e.g */
/* compiled from: PG */
public final class C26414g extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ Runnable f71867a;

    public C26414g(Runnable runnable) {
        this.f71867a = runnable;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f71867a.run();
    }
}
