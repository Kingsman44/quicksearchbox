package com.google.android.material.behavior;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: com.google.android.material.behavior.a */
/* compiled from: PG */
final class C44540a extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ HideBottomViewOnScrollBehavior f115843a;

    public C44540a(HideBottomViewOnScrollBehavior hideBottomViewOnScrollBehavior) {
        this.f115843a = hideBottomViewOnScrollBehavior;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f115843a.f115827a = null;
    }
}
