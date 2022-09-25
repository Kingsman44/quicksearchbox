package com.google.android.material.p3516m;

import android.animation.ValueAnimator;
import android.view.View;

/* renamed from: com.google.android.material.m.a */
/* compiled from: PG */
final class C44796a implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    final /* synthetic */ View f116825a;

    /* renamed from: b */
    final /* synthetic */ float f116826b;

    /* renamed from: c */
    final /* synthetic */ float f116827c;

    /* renamed from: d */
    final /* synthetic */ float f116828d;

    public C44796a(View view, float f, float f2, float f3) {
        this.f116825a = view;
        this.f116826b = f;
        this.f116827c = f2;
        this.f116828d = f3;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f116825a.setAlpha(C44812h.m79481a(this.f116826b, this.f116827c, this.f116828d, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
    }
}
