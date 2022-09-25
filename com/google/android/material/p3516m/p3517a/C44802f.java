package com.google.android.material.p3516m.p3517a;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* renamed from: com.google.android.material.m.a.f */
/* compiled from: PG */
final class C44802f extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ View f116839a;

    /* renamed from: b */
    final /* synthetic */ float f116840b;

    public C44802f(View view, float f) {
        this.f116839a = view;
        this.f116840b = f;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f116839a.setTranslationX(this.f116840b);
    }
}
