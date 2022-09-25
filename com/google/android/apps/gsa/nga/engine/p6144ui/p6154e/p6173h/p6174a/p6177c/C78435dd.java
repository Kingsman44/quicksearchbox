package com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6173h.p6174a.p6177c;

import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6159c.C78224b;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a.C80734di;
import com.google.android.apps.gsa.shared.p6983ah.C89160q;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.e.h.a.c.dd */
/* compiled from: PG */
public final /* synthetic */ class C78435dd implements Function {

    /* renamed from: a */
    public final /* synthetic */ C78438dg f215956a;

    public /* synthetic */ C78435dd(C78438dg dgVar) {
        this.f215956a = dgVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C78438dg dgVar = this.f215956a;
        if (((C78224b) obj).mo73148k(C89160q.DEMAND_STATE)) {
            return C80734di.f221620a;
        }
        return dgVar.mo73372a().mo73346d();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
