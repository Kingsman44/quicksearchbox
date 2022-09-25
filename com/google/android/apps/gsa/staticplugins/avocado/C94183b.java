package com.google.android.apps.gsa.staticplugins.avocado;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.apps.gsa.staticplugins.avocado.b */
/* compiled from: PG */
final class C94183b extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ int f263146a;

    /* renamed from: b */
    final /* synthetic */ C94221c f263147b;

    public C94183b(C94221c cVar, int i) {
        this.f263147b = cVar;
        this.f263146a = i;
    }

    public final void onAnimationEnd(Animator animator) {
        AvocadoLottieAnimationView avocadoLottieAnimationView = this.f263147b.f263256b;
        Animator.AnimatorListener animatorListener = avocadoLottieAnimationView.f263016i;
        if (animatorListener != null) {
            avocadoLottieAnimationView.mo9696g(animatorListener);
        }
        int i = this.f263146a;
        int i2 = ((i + i) - 1) * 60;
        int i3 = i2 - 60;
        ((C59052c) ((C59052c) C94221c.f263255a.mo56224b()).mo56372aa(14105)).mo56359L("Loop arrow. Index is %d, min is %d, max is %d", Integer.valueOf(this.f263146a), Integer.valueOf(i3), Integer.valueOf(i2));
        this.f263147b.f263256b.mo88348p(i3, i2);
        this.f263147b.f263256b.mo9693d(true);
    }
}
