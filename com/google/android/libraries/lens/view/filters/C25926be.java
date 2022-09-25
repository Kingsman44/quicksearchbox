package com.google.android.libraries.lens.view.filters;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.FrameLayout;

/* renamed from: com.google.android.libraries.lens.view.filters.be */
/* compiled from: PG */
public final /* synthetic */ class C25926be implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ View f70426a;

    /* renamed from: b */
    public final /* synthetic */ float f70427b;

    /* renamed from: c */
    public final /* synthetic */ float f70428c;

    public /* synthetic */ C25926be(View view, float f, float f2) {
        this.f70426a = view;
        this.f70427b = f;
        this.f70428c = f2;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        View view = this.f70426a;
        float f = this.f70427b;
        float f2 = this.f70428c;
        float min = Math.min(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue() * 1.3333334f);
        view.setAlpha(1.0f - min);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        int i = (int) (f + (min * (f2 - f)));
        layoutParams.width = i;
        layoutParams.height = i;
        view.setLayoutParams(layoutParams);
    }
}
