package com.google.android.libraries.home.coreui.devicetile;

import android.animation.ValueAnimator;
import android.graphics.drawable.GradientDrawable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.graphics.C1924a;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.home.coreui.devicetile.af */
/* compiled from: PG */
final class C23660af implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    final /* synthetic */ GradientDrawable f64713a;

    /* renamed from: b */
    final /* synthetic */ int f64714b;

    /* renamed from: c */
    final /* synthetic */ int f64715c;

    /* renamed from: d */
    final /* synthetic */ C23674at f64716d;

    /* renamed from: e */
    final /* synthetic */ int f64717e;

    /* renamed from: f */
    final /* synthetic */ int f64718f;

    /* renamed from: g */
    final /* synthetic */ float f64719g;

    public C23660af(GradientDrawable gradientDrawable, int i, int i2, C23674at atVar, int i3, int i4, float f) {
        this.f64713a = gradientDrawable;
        this.f64714b = i;
        this.f64715c = i2;
        this.f64716d = atVar;
        this.f64717e = i3;
        this.f64718f = i4;
        this.f64719g = f;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        C69664n.m101061g(valueAnimator, "it");
        GradientDrawable gradientDrawable = this.f64713a;
        Object animatedValue = valueAnimator.getAnimatedValue();
        C69664n.m101059e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        gradientDrawable.setAlpha(((Integer) animatedValue).intValue());
        this.f64713a.setColor(C1924a.m5186e(this.f64714b, this.f64715c, valueAnimator.getAnimatedFraction()));
        this.f64716d.f64740D.setColor(C1924a.m5186e(this.f64717e, this.f64718f, valueAnimator.getAnimatedFraction()));
        ConstraintLayout constraintLayout = this.f64716d.f64761l;
        float f = this.f64719g;
        constraintLayout.setAlpha(f + ((1.0f - f) * valueAnimator.getAnimatedFraction()));
    }
}
