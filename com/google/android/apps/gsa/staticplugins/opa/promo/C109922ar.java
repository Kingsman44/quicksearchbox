package com.google.android.apps.gsa.staticplugins.opa.promo;

import android.animation.ValueAnimator;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.promo.ar */
/* compiled from: PG */
final class C109922ar implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    final /* synthetic */ UpgradePromoTooltipActivity f306278a;

    public C109922ar(UpgradePromoTooltipActivity upgradePromoTooltipActivity) {
        this.f306278a = upgradePromoTooltipActivity;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        Integer num = (Integer) valueAnimator.getAnimatedValue();
        UpgradePromoTooltipActivity upgradePromoTooltipActivity = this.f306278a;
        upgradePromoTooltipActivity.f306159e.setPadding(0, (upgradePromoTooltipActivity.f306160f - num.intValue()) / 2, 0, (this.f306278a.f306160f - num.intValue()) / 2);
        this.f306278a.f306158d.getLayoutParams().width = num.intValue();
        this.f306278a.f306158d.getLayoutParams().height = num.intValue();
        this.f306278a.f306158d.requestLayout();
    }
}
