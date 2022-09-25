package com.google.android.material.p3516m.p3517a;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* renamed from: com.google.android.material.m.a.b */
/* compiled from: PG */
final class C44798b extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ View f116834a;

    /* renamed from: b */
    final /* synthetic */ float f116835b;

    public C44798b(View view, float f) {
        this.f116834a = view;
        this.f116835b = f;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f116834a.setAlpha(this.f116835b);
    }
}
