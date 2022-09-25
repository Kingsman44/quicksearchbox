package com.google.android.apps.gsa.search.shared.overlay;

import android.animation.ValueAnimator;
import com.google.android.apps.gsa.searchplate.C88890a;

/* renamed from: com.google.android.apps.gsa.search.shared.overlay.f */
/* compiled from: PG */
public final /* synthetic */ class C87657f implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ C88890a f236917a;

    public /* synthetic */ C87657f(C88890a aVar) {
        this.f236917a = aVar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        C88890a aVar = this.f236917a;
        Integer num = (Integer) valueAnimator.getAnimatedValue();
        aVar.mo82738c(num.intValue());
        num.intValue();
    }
}
