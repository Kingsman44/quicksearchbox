package com.google.android.apps.gsa.staticplugins.immersiveactions;

import android.animation.ValueAnimator;

/* renamed from: com.google.android.apps.gsa.staticplugins.immersiveactions.s */
/* compiled from: PG */
final class C102429s implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    final /* synthetic */ ImmersiveActionsHeader f285863a;

    public C102429s(ImmersiveActionsHeader immersiveActionsHeader) {
        this.f285863a = immersiveActionsHeader;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        ImmersiveActionsHeader immersiveActionsHeader = this.f285863a;
        immersiveActionsHeader.mo93189h(immersiveActionsHeader.f285735g - ((int) floatValue));
    }
}
