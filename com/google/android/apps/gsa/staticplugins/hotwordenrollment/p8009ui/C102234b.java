package com.google.android.apps.gsa.staticplugins.hotwordenrollment.p8009ui;

import android.animation.ValueAnimator;
import android.widget.TextView;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.ui.b */
/* compiled from: PG */
public final /* synthetic */ class C102234b implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ TextView f285274a;

    public /* synthetic */ C102234b(TextView textView) {
        this.f285274a = textView;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f285274a.setHeight(((Integer) valueAnimator.getAnimatedValue()).intValue());
    }
}
