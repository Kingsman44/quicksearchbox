package com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6089c;

import android.content.Intent;
import com.google.android.apps.gsa.nga.engine.am.t;
import com.google.android.apps.gsa.nga.engine.p5913am.p5939u.C74965n;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80399l;
import com.google.android.apps.gsa.nga.shared.p6358n.C81442m;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.c.ac */
/* compiled from: PG */
public final /* synthetic */ class C76949ac implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C80399l f212453a;

    /* renamed from: b */
    public final /* synthetic */ C74965n f212454b;

    public /* synthetic */ C76949ac(C80399l lVar, C74965n nVar) {
        this.f212453a = lVar;
        this.f212454b = nVar;
    }

    public final void accept(Object obj) {
        C80399l lVar = this.f212453a;
        C81442m.m129557s(lVar, t.u((Intent) obj, 1, this.f212454b.mo71336k(), false, false));
        lVar.mo74319k(23152);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
