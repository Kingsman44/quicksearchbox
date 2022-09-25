package com.google.android.libraries.lens.view.infopanel;

import android.animation.ValueAnimator;
import android.view.ViewGroup;

/* renamed from: com.google.android.libraries.lens.view.infopanel.u */
/* compiled from: PG */
public final /* synthetic */ class C27205u implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ C27207w f74375a;

    public /* synthetic */ C27205u(C27207w wVar) {
        this.f74375a = wVar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        C27207w wVar = this.f74375a;
        int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        ViewGroup.LayoutParams layoutParams = wVar.f74390d.f74385j.getLayoutParams();
        layoutParams.getClass();
        layoutParams.height = intValue;
        wVar.f74390d.f74385j.setLayoutParams(layoutParams);
        wVar.f74390d.f74385j.setAlpha(((float) intValue) / ((float) wVar.f74392f));
        if (wVar.f74389c) {
            if (intValue == 0) {
                wVar.f74390d.f74385j.setVisibility(0);
            } else if (intValue == wVar.f74392f) {
                wVar.mo32647b();
            }
        } else if (intValue == wVar.f74392f) {
            wVar.f74390d.f74379d.setClickable(false);
        } else if (intValue == 0) {
            wVar.f74390d.f74379d.setClickable(true);
            wVar.f74390d.f74385j.setVisibility(8);
            wVar.mo32647b();
        }
    }
}
