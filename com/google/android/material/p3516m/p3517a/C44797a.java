package com.google.android.material.p3516m.p3517a;

import android.animation.ValueAnimator;
import android.view.View;

/* renamed from: com.google.android.material.m.a.a */
/* compiled from: PG */
final class C44797a implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    final /* synthetic */ View f116829a;

    /* renamed from: b */
    final /* synthetic */ float f116830b;

    /* renamed from: c */
    final /* synthetic */ float f116831c;

    /* renamed from: d */
    final /* synthetic */ float f116832d;

    /* renamed from: e */
    final /* synthetic */ float f116833e;

    public C44797a(View view, float f, float f2, float f3, float f4) {
        this.f116829a = view;
        this.f116830b = f;
        this.f116831c = f2;
        this.f116832d = f3;
        this.f116833e = f4;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        View view = this.f116829a;
        float f = this.f116830b;
        float f2 = this.f116831c;
        float f3 = this.f116832d;
        float f4 = this.f116833e;
        int i = C44804h.f116842a;
        if (floatValue >= f3) {
            f = floatValue > f4 ? f2 : f + (((floatValue - f3) / (f4 - f3)) * (f2 - f));
        }
        view.setAlpha(f);
    }
}
