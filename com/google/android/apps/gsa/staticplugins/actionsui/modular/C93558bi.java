package com.google.android.apps.gsa.staticplugins.actionsui.modular;

import android.animation.ValueAnimator;
import android.widget.TextView;

/* renamed from: com.google.android.apps.gsa.staticplugins.actionsui.modular.bi */
/* compiled from: PG */
final class C93558bi implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    final /* synthetic */ TextView f261233a;

    /* renamed from: b */
    final /* synthetic */ ValueAnimator f261234b;

    public C93558bi(TextView textView, ValueAnimator valueAnimator) {
        this.f261233a = textView;
        this.f261234b = valueAnimator;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f261233a.setTextColor(((Integer) this.f261234b.getAnimatedValue()).intValue());
    }
}
