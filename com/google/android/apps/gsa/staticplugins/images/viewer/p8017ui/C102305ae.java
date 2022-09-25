package com.google.android.apps.gsa.staticplugins.images.viewer.p8017ui;

import android.animation.ValueAnimator;
import android.view.View;

/* renamed from: com.google.android.apps.gsa.staticplugins.images.viewer.ui.ae */
/* compiled from: PG */
public final /* synthetic */ class C102305ae implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ C102307ag f285539a;

    /* renamed from: b */
    public final /* synthetic */ View f285540b;

    public /* synthetic */ C102305ae(C102307ag agVar, View view) {
        this.f285539a = agVar;
        this.f285540b = view;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f285539a.mo28167a(this.f285540b, ((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
