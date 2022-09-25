package com.google.android.apps.gsa.staticplugins.opa.zerostate.cards;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.assistant.p3861at.C50477yn;
import com.google.assistant.p3861at.C50478yo;
import com.google.assistant.p3861at.acw;
import com.google.assistant.p3861at.acx;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.zerostate.cards.ca */
/* compiled from: PG */
final class C114671ca extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ boolean f318116a;

    /* renamed from: b */
    final /* synthetic */ C114675ce f318117b;

    public C114671ca(C114675ce ceVar, boolean z) {
        this.f318117b = ceVar;
        this.f318116a = z;
    }

    public final void onAnimationEnd(Animator animator) {
        acw acw = (acw) acx.f128971H.createBuilder();
        C50477yn ynVar = (C50477yn) C50478yo.f131370c.createBuilder();
        boolean z = this.f318116a;
        ynVar.copyOnWrite();
        C50478yo yoVar = (C50478yo) ynVar.instance;
        yoVar.f131372a |= 1;
        yoVar.f131373b = z;
        C50478yo yoVar2 = (C50478yo) ynVar.build();
        acw.copyOnWrite();
        acx acx = (acx) acw.instance;
        yoVar2.getClass();
        acx.f129007x = yoVar2;
        acx.f128984a |= 536870912;
        this.f318117b.mo101515d((acx) acw.build(), new C114669bz(this));
    }
}
