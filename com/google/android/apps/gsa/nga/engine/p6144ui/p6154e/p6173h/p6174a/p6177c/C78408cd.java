package com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6173h.p6174a.p6177c;

import com.google.android.apps.gsa.nga.shared.p6417x.C83357g;
import com.google.android.apps.gsa.nga.shared.p6417x.C83358h;
import com.google.android.apps.gsa.nga.shared.p6417x.C83363m;
import p3186j$.util.Objects;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.e.h.a.c.cd */
/* compiled from: PG */
public final /* synthetic */ class C78408cd implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C78419co f215857a;

    public /* synthetic */ C78408cd(C78419co coVar) {
        this.f215857a = coVar;
    }

    public final void accept(Object obj) {
        C78419co coVar = this.f215857a;
        C78394bq bqVar = (C78394bq) obj;
        bqVar.mo73323b();
        C83363m mVar = coVar.f215878b;
        C83358h a = bqVar.mo73322a();
        C83357g gVar = coVar.f215879c;
        Objects.requireNonNull(gVar);
        mVar.mo76663c(a, new C78415ck(gVar));
        C83363m mVar2 = coVar.f215878b;
        C83358h g = bqVar.mo73328g();
        C83357g gVar2 = coVar.f215880d;
        Objects.requireNonNull(gVar2);
        mVar2.mo76663c(g, new C78416cl(gVar2));
        C83363m mVar3 = coVar.f215878b;
        C83358h f = bqVar.mo73327f();
        C83357g gVar3 = coVar.f215881e;
        Objects.requireNonNull(gVar3);
        mVar3.mo76663c(f, new C78396bs(gVar3));
        coVar.f215878b.mo76663c(bqVar.f215840r, new C78397bt(coVar));
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
