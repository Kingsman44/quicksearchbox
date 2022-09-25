package com.google.android.libraries.lens.view.infopanel;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: com.google.android.libraries.lens.view.infopanel.bg */
/* compiled from: PG */
final class C27045bg extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ Runnable f73709a;

    public C27045bg(Runnable runnable) {
        this.f73709a = runnable;
    }

    public final void onAnimationEnd(Animator animator) {
        ((C27042bd) this.f73709a).f73703a.mo32484a();
    }
}
