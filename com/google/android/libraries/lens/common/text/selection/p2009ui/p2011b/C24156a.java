package com.google.android.libraries.lens.common.text.selection.p2009ui.p2011b;

import android.animation.ValueAnimator;
import android.graphics.PointF;

/* renamed from: com.google.android.libraries.lens.common.text.selection.ui.b.a */
/* compiled from: PG */
public final /* synthetic */ class C24156a implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ C24157b f65979a;

    public /* synthetic */ C24156a(C24157b bVar) {
        this.f65979a = bVar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        C24157b bVar = this.f65979a;
        bVar.mo29585a(valueAnimator.getAnimatedFraction());
        bVar.f65980a.mo29596b(new PointF(bVar.f65986g, bVar.f65987h), bVar.f65988i, bVar.f65994o);
    }
}
