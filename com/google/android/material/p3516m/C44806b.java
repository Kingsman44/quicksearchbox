package com.google.android.material.p3516m;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* renamed from: com.google.android.material.m.b */
/* compiled from: PG */
final class C44806b extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ View f116843a;

    /* renamed from: b */
    final /* synthetic */ float f116844b;

    public C44806b(View view, float f) {
        this.f116843a = view;
        this.f116844b = f;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f116843a.setAlpha(this.f116844b);
    }
}
