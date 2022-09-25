package com.google.android.material.internal;

import android.animation.ValueAnimator;
import android.widget.TextView;

/* renamed from: com.google.android.material.internal.bb */
/* compiled from: PG */
final class C44730bb implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    final /* synthetic */ TextView f116595a;

    public C44730bb(TextView textView) {
        this.f116595a = textView;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.f116595a.setScaleX(floatValue);
        this.f116595a.setScaleY(floatValue);
    }
}
