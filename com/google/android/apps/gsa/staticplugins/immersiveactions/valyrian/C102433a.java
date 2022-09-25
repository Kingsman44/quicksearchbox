package com.google.android.apps.gsa.staticplugins.immersiveactions.valyrian;

import android.animation.ValueAnimator;

/* renamed from: com.google.android.apps.gsa.staticplugins.immersiveactions.valyrian.a */
/* compiled from: PG */
final class C102433a implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    final /* synthetic */ ValyrianImmersiveActionsHeader f285895a;

    public C102433a(ValyrianImmersiveActionsHeader valyrianImmersiveActionsHeader) {
        this.f285895a = valyrianImmersiveActionsHeader;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        ValyrianImmersiveActionsHeader valyrianImmersiveActionsHeader = this.f285895a;
        valyrianImmersiveActionsHeader.mo93236h(valyrianImmersiveActionsHeader.f285873e - ((int) floatValue));
    }
}
