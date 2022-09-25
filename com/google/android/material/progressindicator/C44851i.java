package com.google.android.material.progressindicator;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: com.google.android.material.progressindicator.i */
/* compiled from: PG */
final class C44851i extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ C44855m f117025a;

    public C44851i(C44855m mVar) {
        this.f117025a = mVar;
    }

    public final void onAnimationRepeat(Animator animator) {
        super.onAnimationRepeat(animator);
        C44855m mVar = this.f117025a;
        mVar.f117034f = (mVar.f117034f + 4) % mVar.f117033e.f117017c.length;
    }
}
