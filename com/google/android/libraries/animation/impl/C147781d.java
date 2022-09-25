package com.google.android.libraries.animation.impl;

import android.animation.ValueAnimator;
import com.google.android.libraries.animation.C147768a;

/* renamed from: com.google.android.libraries.animation.impl.d */
/* compiled from: PG */
public final /* synthetic */ class C147781d implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ C147768a f398735a;

    public /* synthetic */ C147781d(C147768a aVar) {
        this.f398735a = aVar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f398735a.mo42047a(Float.valueOf(((Float) valueAnimator.getAnimatedValue()).floatValue()));
    }
}
