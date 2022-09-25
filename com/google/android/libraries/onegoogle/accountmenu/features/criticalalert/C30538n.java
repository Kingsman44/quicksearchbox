package com.google.android.libraries.onegoogle.accountmenu.features.criticalalert;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: com.google.android.libraries.onegoogle.accountmenu.features.criticalalert.n */
/* compiled from: PG */
final class C30538n extends AnimatorListenerAdapter {

    /* renamed from: a */
    boolean f82483a;

    /* renamed from: b */
    final /* synthetic */ C30539o f82484b;

    public C30538n(C30539o oVar) {
        this.f82484b = oVar;
    }

    public final void onAnimationCancel(Animator animator) {
        this.f82483a = true;
    }

    public final void onAnimationEnd(Animator animator) {
        if (this.f82484b.f82486b && !this.f82483a) {
            animator.setStartDelay(416);
            animator.start();
        }
    }
}
