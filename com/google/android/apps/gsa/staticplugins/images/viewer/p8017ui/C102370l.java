package com.google.android.apps.gsa.staticplugins.images.viewer.p8017ui;

import android.animation.ValueAnimator;

/* renamed from: com.google.android.apps.gsa.staticplugins.images.viewer.ui.l */
/* compiled from: PG */
public final /* synthetic */ class C102370l implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ C102372n f285669a;

    public /* synthetic */ C102370l(C102372n nVar) {
        this.f285669a = nVar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        C102372n nVar = this.f285669a;
        nVar.f285673c.computeScrollOffset();
        if (nVar.f285674d > 0 || nVar.f285675e > 0) {
            nVar.mo93122c((float) (nVar.f285673c.getCurrX() - nVar.f285674d), (float) (nVar.f285673c.getCurrY() - nVar.f285675e));
        }
        nVar.f285674d = nVar.f285673c.getCurrX();
        nVar.f285675e = nVar.f285673c.getCurrY();
    }
}
