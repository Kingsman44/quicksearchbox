package com.google.android.apps.gsa.staticplugins.opa.p8595v;

import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.search.C90499g;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.common.base.C58817ah;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4552o.C59582aj;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.v.m */
/* compiled from: PG */
public final /* synthetic */ class C113909m implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C113916t f315366a;

    /* renamed from: b */
    public final /* synthetic */ Query f315367b;

    public /* synthetic */ C113909m(C113916t tVar, Query query) {
        this.f315366a = tVar;
        this.f315367b = query;
    }

    public final Object apply(Object obj) {
        C58833ax axVar;
        C113916t tVar = this.f315366a;
        Query query = this.f315367b;
        Long l = (Long) obj;
        if (!tVar.f315393c.mo79746e(C90014bt.f247756nE) || !query.mo84364bx("android.opa.extra.ORIGINAL_REQUEST_ID")) {
            axVar = C58836b.f156633a;
        } else {
            axVar = C58833ax.m90834k(Long.valueOf(query.mo84476f("android.opa.extra.ORIGINAL_REQUEST_ID")));
        }
        if (axVar.mo56113h()) {
            query = query.mo84271aH(((Long) axVar.mo56107c()).longValue());
        }
        return (C59582aj) C90499g.m147581a(query, l.longValue()).toBuilder();
    }
}
