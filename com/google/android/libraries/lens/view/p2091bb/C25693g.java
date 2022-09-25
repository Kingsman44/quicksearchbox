package com.google.android.libraries.lens.view.p2091bb;

import android.animation.ValueAnimator;
import android.graphics.PointF;
import com.google.android.libraries.lens.view.p2078at.C25518ax;
import com.google.common.base.C58833ax;

/* renamed from: com.google.android.libraries.lens.view.bb.g */
/* compiled from: PG */
public final /* synthetic */ class C25693g implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ C25696j f69837a;

    /* renamed from: b */
    public final /* synthetic */ float f69838b;

    /* renamed from: c */
    public final /* synthetic */ float f69839c;

    public /* synthetic */ C25693g(C25696j jVar, float f, float f2) {
        this.f69837a = jVar;
        this.f69838b = f;
        this.f69839c = f2;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        C25696j jVar = this.f69837a;
        float f = this.f69838b;
        float f2 = this.f69839c;
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        jVar.mo30825w();
        float f3 = jVar.mo30819q().f69479a.y;
        float f4 = jVar.mo30819q().f69480b;
        C25518ax q = jVar.mo30819q();
        float f5 = 1.0f - floatValue;
        PointF pointF = new PointF(0.0f, ((f * f5) + (floatValue * 0.0f)) - f3);
        PointF pointF2 = new PointF(0.5f, 0.5f);
        jVar.f69844a = C58833ax.m90834k(C25518ax.m46996c(q, ((f2 * f5) + floatValue) / f4, pointF2.x, pointF2.y, pointF.x, pointF.y));
        jVar.mo30822t();
        jVar.mo30823u();
    }
}
