package com.google.android.libraries.social.peoplekit.common.p3279a;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;

/* renamed from: com.google.android.libraries.social.peoplekit.common.a.a */
/* compiled from: PG */
public final class C42070a extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ AnimatorSet f109968a;

    /* renamed from: b */
    private boolean f109969b = false;

    public C42070a(AnimatorSet animatorSet) {
        this.f109968a = animatorSet;
    }

    public final void onAnimationCancel(Animator animator) {
        super.onAnimationCancel(animator);
        this.f109969b = true;
    }

    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        if (!this.f109969b) {
            this.f109968a.start();
        }
    }
}
