package com.google.android.material.internal;

import android.animation.ValueAnimator;
import android.view.View;

/* renamed from: com.google.android.material.internal.s */
/* compiled from: PG */
public final /* synthetic */ class C44759s implements C44762v {

    /* renamed from: a */
    public static final /* synthetic */ C44759s f116696a = new C44759s();

    private /* synthetic */ C44759s() {
    }

    /* renamed from: a */
    public final void mo48103a(ValueAnimator valueAnimator, View view) {
        int i = C44763w.f116699a;
        Float f = (Float) valueAnimator.getAnimatedValue();
        view.setScaleX(f.floatValue());
        view.setScaleY(f.floatValue());
    }
}
