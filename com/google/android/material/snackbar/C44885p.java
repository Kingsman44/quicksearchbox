package com.google.android.material.snackbar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: com.google.android.material.snackbar.p */
/* compiled from: PG */
final class C44885p extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ BaseTransientBottomBar f117132a;

    public C44885p(BaseTransientBottomBar baseTransientBottomBar) {
        this.f117132a = baseTransientBottomBar;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f117132a.mo48342g();
    }
}
