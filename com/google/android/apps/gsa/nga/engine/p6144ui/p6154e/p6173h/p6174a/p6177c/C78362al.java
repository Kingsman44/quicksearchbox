package com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6173h.p6174a.p6177c;

import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6159c.C78224b;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a.C80696by;
import com.google.android.apps.gsa.shared.p6983ah.C89160q;
import com.google.common.p4526f.C59071e;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.e.h.a.c.al */
/* compiled from: PG */
public final /* synthetic */ class C78362al implements Function {

    /* renamed from: a */
    public final /* synthetic */ C78380bc f215734a;

    public /* synthetic */ C78362al(C78380bc bcVar) {
        this.f215734a = bcVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C78380bc bcVar = this.f215734a;
        C59071e eVar = C78381bd.f215751a;
        if (((C78224b) obj).mo73148k(C89160q.DEMAND_STATE)) {
            return C80696by.f221559a;
        }
        return bcVar.mo73320a().mo73345c();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
