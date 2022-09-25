package com.google.android.libraries.lens.view.p2091bb;

import android.animation.ValueAnimator;
import android.graphics.PointF;
import com.google.common.base.C58833ax;

/* renamed from: com.google.android.libraries.lens.view.bb.i */
/* compiled from: PG */
public final /* synthetic */ class C25695i implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ C25696j f69841a;

    /* renamed from: b */
    public final /* synthetic */ PointF f69842b;

    public /* synthetic */ C25695i(C25696j jVar, PointF pointF) {
        this.f69841a = jVar;
        this.f69842b = pointF;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        C25696j jVar = this.f69841a;
        jVar.f69844a = C58833ax.m90834k(jVar.mo30819q().mo30547b(((Float) valueAnimator.getAnimatedValue()).floatValue() / jVar.mo30819q().f69480b, this.f69842b));
        jVar.mo30822t();
        jVar.mo30823u();
    }
}
