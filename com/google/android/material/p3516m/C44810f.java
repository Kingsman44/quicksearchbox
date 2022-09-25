package com.google.android.material.p3516m;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* renamed from: com.google.android.material.m.f */
/* compiled from: PG */
final class C44810f extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ View f116849a;

    /* renamed from: b */
    final /* synthetic */ float f116850b;

    /* renamed from: c */
    final /* synthetic */ float f116851c;

    public C44810f(View view, float f, float f2) {
        this.f116849a = view;
        this.f116850b = f;
        this.f116851c = f2;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f116849a.setScaleX(this.f116850b);
        this.f116849a.setScaleY(this.f116851c);
    }
}
