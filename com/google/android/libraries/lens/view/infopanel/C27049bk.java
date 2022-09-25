package com.google.android.libraries.lens.view.infopanel;

import android.animation.ValueAnimator;
import androidx.p119j.p120a.p121a.C2300b;

/* renamed from: com.google.android.libraries.lens.view.infopanel.bk */
/* compiled from: PG */
public final /* synthetic */ class C27049bk implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ C27050bl f73714a;

    public /* synthetic */ C27049bk(C27050bl blVar) {
        this.f73714a = blVar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        C27050bl blVar = this.f73714a;
        blVar.f73717c.mo32490a(valueAnimator.getAnimatedFraction());
        if (valueAnimator.getAnimatedFraction() > 0.8f && !blVar.f73720f) {
            blVar.f73720f = true;
            blVar.f73718d.mo32490a(0.0f);
            blVar.f73716b.animate().setDuration(200).setInterpolator(new C2300b()).setListener(new C27045bg(blVar.f73719e)).setUpdateListener(new C27048bj(blVar)).start();
        }
    }
}
