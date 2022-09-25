package com.google.android.apps.gsa.staticplugins.opa;

import android.animation.ValueAnimator;
import com.google.android.apps.gsa.staticplugins.opa.valyrian.p8598c.C113988g;
import com.google.android.apps.gsa.staticplugins.opa.valyrian.p8598c.C113989h;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.bm */
/* compiled from: PG */
public final /* synthetic */ class C108099bm implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ C109040fj f300686a;

    public /* synthetic */ C108099bm(C109040fj fjVar) {
        this.f300686a = fjVar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        C109040fj fjVar = this.f300686a;
        Integer num = (Integer) valueAnimator.getAnimatedValue();
        fjVar.f303450o.mo95420i().getLayoutParams().height = num.intValue();
        if (C109040fj.m181378bx(fjVar.f303450o)) {
            ((C113989h) ((C113988g) fjVar.f303450o).mo100833bf().mo56107c()).mo100886ca();
        }
        fjVar.f303228N.setTranslationY((float) (-num.intValue()));
        fjVar.f303450o.mo95420i().requestLayout();
    }
}
