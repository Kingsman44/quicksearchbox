package com.google.android.apps.gsa.staticplugins.avocado;

import android.animation.Animator;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.apps.gsa.staticplugins.avocado.ah */
/* compiled from: PG */
public final /* synthetic */ class C94164ah implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C94167ak f263039a;

    public /* synthetic */ C94164ah(C94167ak akVar) {
        this.f263039a = akVar;
    }

    public final void run() {
        C94167ak akVar = this.f263039a;
        ((C59052c) ((C59052c) C94170an.f263048b.mo56224b()).mo56372aa(14139)).mo56386p("CallBack#onDone");
        C94221c cVar = akVar.f263044a.f263073Y;
        C94163ag agVar = new C94163ag(akVar);
        if (cVar.f263258d) {
            cVar.f263256b.mo9692c();
        }
        AvocadoLottieAnimationView avocadoLottieAnimationView = cVar.f263256b;
        Animator.AnimatorListener animatorListener = avocadoLottieAnimationView.f263016i;
        if (animatorListener != null) {
            avocadoLottieAnimationView.mo9696g(animatorListener);
        }
        cVar.f263256b.mo9689a(new C94143a(agVar));
        int i = cVar.f263257c - 1;
        int i2 = (i + i) * 60;
        int i3 = i2 - 60;
        ((C59052c) ((C59052c) C94221c.f263255a.mo56224b()).mo56372aa(14108)).mo56359L("Play Final edge. Index is %d, min is %d, max is %d", Integer.valueOf(cVar.f263257c - 1), Integer.valueOf(i3), Integer.valueOf(i2));
        cVar.f263256b.mo88348p(i3, i2);
        cVar.f263256b.mo9693d(false);
    }
}
