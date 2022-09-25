package com.google.android.libraries.lens.view.infopanel;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: com.google.android.libraries.lens.view.infopanel.bw */
/* compiled from: PG */
final class C27069bw extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ C27070bx f73794a;

    public C27069bw(C27070bx bxVar) {
        this.f73794a = bxVar;
    }

    public final void onAnimationStart(Animator animator) {
        super.onAnimationStart(animator);
        this.f73794a.f73796a.setVisibility(0);
    }
}
