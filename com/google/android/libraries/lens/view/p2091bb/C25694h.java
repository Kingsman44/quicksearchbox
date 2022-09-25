package com.google.android.libraries.lens.view.p2091bb;

import android.animation.ValueAnimator;

/* renamed from: com.google.android.libraries.lens.view.bb.h */
/* compiled from: PG */
public final /* synthetic */ class C25694h implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ C25696j f69840a;

    public /* synthetic */ C25694h(C25696j jVar) {
        this.f69840a = jVar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        C25696j jVar = this.f69840a;
        if (jVar.f69846c.computeScrollOffset()) {
            int currX = jVar.f69846c.getCurrX();
            int currY = jVar.f69846c.getCurrY();
            int i = jVar.f69849f;
            if (currX != i || currY != jVar.f69850g) {
                jVar.mo30820r(((float) (currX - i)) / ((float) jVar.f69847d), ((float) (currY - jVar.f69850g)) / ((float) jVar.f69848e));
                jVar.f69849f = currX;
                jVar.f69850g = currY;
                return;
            }
            return;
        }
        jVar.f69845b.cancel();
    }
}
