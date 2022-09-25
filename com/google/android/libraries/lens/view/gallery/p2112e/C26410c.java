package com.google.android.libraries.lens.view.gallery.p2112e;

import android.animation.ValueAnimator;

/* renamed from: com.google.android.libraries.lens.view.gallery.e.c */
/* compiled from: PG */
public final /* synthetic */ class C26410c implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ C26416i f71863a;

    public /* synthetic */ C26410c(C26416i iVar) {
        this.f71863a = iVar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        C26416i iVar = this.f71863a;
        iVar.mo31621e((1.0f - valueAnimator.getAnimatedFraction()) * iVar.f71883n);
    }
}
