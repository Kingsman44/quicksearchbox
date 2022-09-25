package com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6093g;

import android.content.Intent;
import com.google.android.apps.gsa.nga.engine.am.t;
import com.google.android.apps.gsa.nga.engine.p5913am.p5939u.C74965n;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80399l;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80401n;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80403p;
import com.google.android.apps.gsa.nga.shared.p6358n.C81442m;
import p3186j$.util.Collection;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.g.p */
/* compiled from: PG */
public final /* synthetic */ class C77339p implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C77349z f213290a;

    /* renamed from: b */
    public final /* synthetic */ C80399l f213291b;

    /* renamed from: c */
    public final /* synthetic */ C74965n f213292c;

    /* renamed from: d */
    public final /* synthetic */ boolean f213293d;

    public /* synthetic */ C77339p(C77349z zVar, C80399l lVar, C74965n nVar, boolean z) {
        this.f213290a = zVar;
        this.f213291b = lVar;
        this.f213292c = nVar;
        this.f213293d = z;
    }

    public final void accept(Object obj) {
        C77349z zVar = this.f213290a;
        C80399l lVar = this.f213291b;
        C74965n nVar = this.f213292c;
        boolean z = this.f213293d;
        Intent intent = (Intent) obj;
        lVar.copyOnWrite();
        C80401n nVar2 = C80401n.f220656k;
        ((C80401n) lVar.instance).f220664g = C80403p.m128150a(5);
        intent.setIdentifier(nVar.mo71336k().f227136c);
        Collection.EL.stream(zVar.f213315d).forEach(new C77347x(intent));
        C81442m.m129557s(lVar, t.u(intent, 1, nVar.mo71336k(), false, false));
        lVar.mo74319k(true != z ? 28714 : 83831);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
