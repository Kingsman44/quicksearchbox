package com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6089c;

import android.content.Intent;
import com.google.android.apps.gsa.nga.engine.am.t;
import com.google.android.apps.gsa.nga.engine.p5913am.p5939u.C74965n;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80399l;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6282a.C80293ao;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6282a.C80295aq;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6282a.C80338cf;
import com.google.android.apps.gsa.nga.shared.p6358n.C81442m;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.c.af */
/* compiled from: PG */
public final /* synthetic */ class C76952af implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C80399l f212457a;

    /* renamed from: b */
    public final /* synthetic */ C74965n f212458b;

    public /* synthetic */ C76952af(C80399l lVar, C74965n nVar) {
        this.f212457a = lVar;
        this.f212458b = nVar;
    }

    public final void accept(Object obj) {
        C80399l lVar = this.f212457a;
        C74965n nVar = this.f212458b;
        lVar.mo74319k(23152);
        C81442m.m129557s(lVar, t.u((Intent) obj, 2, nVar.mo71336k(), false, false));
        C80293ao aoVar = (C80293ao) C80295aq.f220357c.createBuilder();
        C80338cf cfVar = C80338cf.f220449a;
        aoVar.copyOnWrite();
        C80295aq aqVar = (C80295aq) aoVar.instance;
        cfVar.getClass();
        aqVar.f220360b = cfVar;
        aqVar.f220359a = 7;
        C81442m.m129555q(lVar, aoVar);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
