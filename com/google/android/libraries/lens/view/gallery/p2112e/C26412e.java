package com.google.android.libraries.lens.view.gallery.p2112e;

import android.animation.ValueAnimator;

/* renamed from: com.google.android.libraries.lens.view.gallery.e.e */
/* compiled from: PG */
public final /* synthetic */ class C26412e implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ C26416i f71865a;

    public /* synthetic */ C26412e(C26416i iVar) {
        this.f71865a = iVar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        C26416i iVar = this.f71865a;
        float animatedFraction = valueAnimator.getAnimatedFraction();
        float f = iVar.f71878i;
        float f2 = iVar.f71881l;
        float f3 = iVar.f71879j;
        float f4 = iVar.f71882m;
        float f5 = iVar.f71877h;
        iVar.mo31622f(f + ((f2 - f) * animatedFraction), f3 + ((f4 - f3) * animatedFraction), f5 + ((iVar.f71880k - f5) * animatedFraction));
        iVar.f71883n = animatedFraction;
        iVar.mo31621e(animatedFraction);
    }
}
