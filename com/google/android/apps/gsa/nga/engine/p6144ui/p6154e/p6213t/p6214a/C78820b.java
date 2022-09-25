package com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6213t.p6214a;

import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6159c.C78224b;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6210s.C78815q;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6210s.C78816r;
import com.google.android.apps.gsa.shared.p6983ah.C89160q;
import p3186j$.util.function.BiFunction;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.e.t.a.b */
/* compiled from: PG */
public final /* synthetic */ class C78820b implements BiFunction {

    /* renamed from: a */
    public static final /* synthetic */ C78820b f216935a = new C78820b();

    private /* synthetic */ C78820b() {
    }

    public final /* synthetic */ BiFunction andThen(Function function) {
        return BiFunction.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj, Object obj2) {
        boolean z;
        C78815q qVar = (C78815q) obj;
        int i = C78823e.f216940c;
        if (((C78224b) obj2).mo73148k(C89160q.DEMAND_STATE)) {
            z = false;
        } else {
            z = C78816r.m126601f(qVar);
        }
        return Boolean.valueOf(z);
    }
}
