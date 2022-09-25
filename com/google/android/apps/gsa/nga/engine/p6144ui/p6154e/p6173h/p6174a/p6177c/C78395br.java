package com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6173h.p6174a.p6177c;

import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a.C80744ds;
import p3186j$.util.Collection;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.e.h.a.c.br */
/* compiled from: PG */
public final /* synthetic */ class C78395br implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C78419co f215843a;

    /* renamed from: b */
    public final /* synthetic */ C80744ds f215844b;

    public /* synthetic */ C78395br(C78419co coVar, C80744ds dsVar) {
        this.f215843a = coVar;
        this.f215844b = dsVar;
    }

    public final void accept(Object obj) {
        C78394bq bqVar = (C78394bq) obj;
        Collection.EL.stream(this.f215843a.f215893q).forEach(new C78405ca(this.f215844b));
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
