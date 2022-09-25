package com.google.android.apps.gsa.staticplugins.save.p8699ui;

import android.animation.ValueAnimator;
import android.view.View;

/* renamed from: com.google.android.apps.gsa.staticplugins.save.ui.af */
/* compiled from: PG */
public final /* synthetic */ class C116442af implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ C116444ah f322877a;

    /* renamed from: b */
    public final /* synthetic */ View f322878b;

    public /* synthetic */ C116442af(C116444ah ahVar, View view) {
        this.f322877a = ahVar;
        this.f322878b = view;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f322877a.mo28167a(this.f322878b, ((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
