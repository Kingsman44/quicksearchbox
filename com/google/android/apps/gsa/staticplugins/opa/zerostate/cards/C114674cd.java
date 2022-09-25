package com.google.android.apps.gsa.staticplugins.opa.zerostate.cards;

import android.accounts.Account;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.apps.gsa.assistant.shared.n.l;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.assistant.p3861at.C50144me;
import com.google.assistant.p3861at.acu;
import com.google.assistant.p3861at.acv;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.zerostate.cards.cd */
/* compiled from: PG */
final class C114674cd extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ C114675ce f318121a;

    public C114674cd(C114675ce ceVar) {
        this.f318121a = ceVar;
    }

    public final void onAnimationEnd(Animator animator) {
        C114675ce ceVar = this.f318121a;
        C114676cf cfVar = ceVar.f318122a;
        l lVar = cfVar.f318136j;
        Account a = cfVar.f318133g.mo79668a();
        acu acu = (acu) acv.f128920X.createBuilder();
        acu.copyOnWrite();
        acv acv = (acv) acu.instance;
        acv.f128945a |= 8388608;
        acv.f128966v = true;
        new C90873ag(lVar.j(a, (acv) acu.build(), (C50144me) null, (long) C114676cf.f318127c, TimeUnit.MILLISECONDS, ceVar.getClass().getSimpleName()), ceVar.f318122a.f318138l, "getAssistantSettings", new C114665bv(ceVar)).mo85223a(new C114666bw(ceVar));
    }
}
