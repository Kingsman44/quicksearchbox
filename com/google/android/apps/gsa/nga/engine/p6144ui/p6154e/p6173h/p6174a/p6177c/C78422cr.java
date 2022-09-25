package com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6173h.p6174a.p6177c;

import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6159c.C78224b;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6173h.C78537at;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6173h.C78540aw;
import com.google.android.apps.gsa.shared.p6983ah.C89160q;
import p3186j$.util.function.BiFunction;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.e.h.a.c.cr */
/* compiled from: PG */
public final /* synthetic */ class C78422cr implements BiFunction {

    /* renamed from: a */
    public final /* synthetic */ C78391bn f215920a;

    /* renamed from: b */
    public final /* synthetic */ C78393bp f215921b;

    public /* synthetic */ C78422cr(C78391bn bnVar, C78393bp bpVar) {
        this.f215920a = bnVar;
        this.f215921b = bpVar;
    }

    public final /* synthetic */ BiFunction andThen(Function function) {
        return BiFunction.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj, Object obj2) {
        C78391bn bnVar = this.f215920a;
        C78393bp bpVar = this.f215921b;
        C78537at atVar = (C78537at) obj;
        if (((C78224b) obj2).mo73148k(C89160q.DEMAND_STATE)) {
            return C78540aw.f216294a;
        }
        C78356af c = C78356af.m125854c(bnVar.mo73348f());
        c.mo73313d(bpVar);
        return c.mo73311a();
    }
}
