package com.google.android.material.floatingactionbutton;

import android.animation.ValueAnimator;
import android.graphics.Matrix;
import com.google.android.material.p3504a.C44497b;

/* renamed from: com.google.android.material.floatingactionbutton.u */
/* compiled from: PG */
final class C44682u implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    final /* synthetic */ float f116463a;

    /* renamed from: b */
    final /* synthetic */ float f116464b;

    /* renamed from: c */
    final /* synthetic */ float f116465c;

    /* renamed from: d */
    final /* synthetic */ float f116466d;

    /* renamed from: e */
    final /* synthetic */ float f116467e;

    /* renamed from: f */
    final /* synthetic */ float f116468f;

    /* renamed from: g */
    final /* synthetic */ float f116469g;

    /* renamed from: h */
    final /* synthetic */ Matrix f116470h;

    /* renamed from: i */
    final /* synthetic */ C44658aa f116471i;

    public C44682u(C44658aa aaVar, float f, float f2, float f3, float f4, float f5, float f6, float f7, Matrix matrix) {
        this.f116471i = aaVar;
        this.f116463a = f;
        this.f116464b = f2;
        this.f116465c = f3;
        this.f116466d = f4;
        this.f116467e = f5;
        this.f116468f = f6;
        this.f116469g = f7;
        this.f116470h = matrix;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.f116471i.f116396C.setAlpha(C44497b.m78598b(this.f116463a, this.f116464b, 0.0f, 0.2f, floatValue));
        this.f116471i.f116396C.setScaleX(C44497b.m78597a(this.f116465c, this.f116466d, floatValue));
        this.f116471i.f116396C.setScaleY(C44497b.m78597a(this.f116467e, this.f116466d, floatValue));
        C44658aa aaVar = this.f116471i;
        float f = this.f116468f;
        float f2 = this.f116469g;
        aaVar.f116418z = C44497b.m78597a(f, f2, floatValue);
        aaVar.mo47927d(C44497b.m78597a(f, f2, floatValue), this.f116470h);
        this.f116471i.f116396C.setImageMatrix(this.f116470h);
    }
}
