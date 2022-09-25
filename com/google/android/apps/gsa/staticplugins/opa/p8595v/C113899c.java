package com.google.android.apps.gsa.staticplugins.opa.p8595v;

import com.google.android.apps.gsa.shared.search.Query;
import com.google.common.base.C58817ah;
import com.google.common.base.C58833ax;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.v.c */
/* compiled from: PG */
public final /* synthetic */ class C113899c implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C113916t f315356a;

    public /* synthetic */ C113899c(C113916t tVar) {
        this.f315356a = tVar;
    }

    public final Object apply(Object obj) {
        boolean booleanValue;
        C113920x xVar = this.f315356a.f315397g;
        long j = ((Query) obj).f252749G;
        synchronized (xVar.f315454a) {
            booleanValue = ((Boolean) C58833ax.m90833j((C113918v) xVar.f315456c.get(Long.valueOf(j))).mo56106b(C113917u.f315417a).mo56109e(false)).booleanValue();
        }
        return Boolean.valueOf(booleanValue);
    }
}
