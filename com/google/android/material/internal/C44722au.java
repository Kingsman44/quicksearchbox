package com.google.android.material.internal;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: com.google.android.material.internal.au */
/* compiled from: PG */
final class C44722au extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ C44724aw f116579a;

    public C44722au(C44724aw awVar) {
        this.f116579a = awVar;
    }

    public final void onAnimationEnd(Animator animator) {
        C44724aw awVar = this.f116579a;
        if (animator == null) {
            awVar.f116581b = null;
        }
    }
}
