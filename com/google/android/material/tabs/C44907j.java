package com.google.android.material.tabs;

import android.animation.ValueAnimator;
import android.view.View;

/* renamed from: com.google.android.material.tabs.j */
/* compiled from: PG */
final class C44907j implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    final /* synthetic */ View f117215a;

    /* renamed from: b */
    final /* synthetic */ View f117216b;

    /* renamed from: c */
    final /* synthetic */ C44908k f117217c;

    public C44907j(C44908k kVar, View view, View view2) {
        this.f117217c = kVar;
        this.f117215a = view;
        this.f117216b = view2;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f117217c.mo48436c(this.f117215a, this.f117216b, valueAnimator.getAnimatedFraction());
    }
}
