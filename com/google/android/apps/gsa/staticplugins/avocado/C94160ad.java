package com.google.android.apps.gsa.staticplugins.avocado;

import android.animation.Animator;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.apps.gsa.staticplugins.avocado.ad */
/* compiled from: PG */
public final /* synthetic */ class C94160ad implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C94167ak f263034a;

    /* renamed from: b */
    public final /* synthetic */ int f263035b;

    public /* synthetic */ C94160ad(C94167ak akVar, int i) {
        this.f263034a = akVar;
        this.f263035b = i;
    }

    public final void run() {
        C94167ak akVar = this.f263034a;
        int i = this.f263035b;
        C94221c cVar = akVar.f263044a.f263073Y;
        if (cVar.f263258d) {
            cVar.f263256b.mo9692c();
        }
        if (i > 1) {
            AvocadoLottieAnimationView avocadoLottieAnimationView = cVar.f263256b;
            Animator.AnimatorListener animatorListener = avocadoLottieAnimationView.f263016i;
            if (animatorListener != null) {
                avocadoLottieAnimationView.mo9696g(animatorListener);
            }
            cVar.f263256b.mo9689a(new C94183b(cVar, i));
            int i2 = i - 1;
            int i3 = (i2 + i2) * 60;
            int i4 = i3 - 60;
            ((C59052c) ((C59052c) C94221c.f263255a.mo56224b()).mo56372aa(14107)).mo56359L("Play edge. Index is %d, min is %d, max is %d", Integer.valueOf(i), Integer.valueOf(i4), Integer.valueOf(i3));
            cVar.f263256b.mo88348p(i4, i3);
            cVar.f263256b.mo9693d(false);
            return;
        }
        ((C59052c) ((C59052c) C94221c.f263255a.mo56224b()).mo56372aa(14106)).mo56393w("Loop arrow. Index is %d, min is 0, max is %d", i, 60);
        cVar.f263256b.mo88348p(0, 60);
        cVar.f263256b.mo9693d(true);
    }
}
