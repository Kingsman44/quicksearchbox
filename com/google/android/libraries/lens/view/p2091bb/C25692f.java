package com.google.android.libraries.lens.view.p2091bb;

import android.animation.ValueAnimator;
import android.graphics.PointF;
import com.google.common.base.C58833ax;

/* renamed from: com.google.android.libraries.lens.view.bb.f */
/* compiled from: PG */
public final /* synthetic */ class C25692f implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ C25696j f69836a;

    public /* synthetic */ C25692f(C25696j jVar) {
        this.f69836a = jVar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        C25696j jVar = this.f69836a;
        jVar.mo30825w();
        jVar.f69844a = C58833ax.m90834k(jVar.mo30819q().mo30548d(new PointF(0.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue() - jVar.mo30819q().f69479a.y)));
        jVar.mo30822t();
        jVar.mo30823u();
    }
}
