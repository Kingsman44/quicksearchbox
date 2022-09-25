package com.google.android.libraries.onegoogle.tooltip;

import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;

/* renamed from: com.google.android.libraries.onegoogle.tooltip.v */
/* compiled from: PG */
final class C31086v implements Animation.AnimationListener {

    /* renamed from: a */
    final /* synthetic */ ScaleAnimation f83731a;

    /* renamed from: b */
    final /* synthetic */ TooltipView f83732b;

    public C31086v(TooltipView tooltipView, ScaleAnimation scaleAnimation) {
        this.f83732b = tooltipView;
        this.f83731a = scaleAnimation;
    }

    public final void onAnimationEnd(Animation animation) {
        this.f83732b.setAnimation(this.f83731a);
    }

    public final void onAnimationRepeat(Animation animation) {
    }

    public final void onAnimationStart(Animation animation) {
    }
}
