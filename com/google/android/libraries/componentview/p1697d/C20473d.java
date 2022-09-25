package com.google.android.libraries.componentview.p1697d;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: com.google.android.libraries.componentview.d.d */
/* compiled from: PG */
final class C20473d implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    final /* synthetic */ View f57592a;

    public C20473d(View view) {
        this.f57592a = view;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        ViewGroup.LayoutParams layoutParams = this.f57592a.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            this.f57592a.setLayoutParams(layoutParams);
        }
    }
}
