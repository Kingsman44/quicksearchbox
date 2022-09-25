package com.google.android.gms.search.queries;

import com.google.android.gms.common.api.C143711ad;
import com.google.android.gms.common.api.C143717b;
import com.google.android.gms.common.api.C143851w;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.search.C145891g;
import com.google.android.gms.search.p10865b.p10866a.C145863b;
import com.google.android.gms.search.queries.p10873a.C145919c;
import com.google.android.gms.search.queries.p10873a.C145925i;
import com.google.android.gms.search.queries.p10873a.C145927k;

/* renamed from: com.google.android.gms.search.queries.o */
/* compiled from: PG */
public final class C145947o extends C145863b {

    /* renamed from: a */
    private final QueryCall$Request f394538a;

    public C145947o(QueryCall$Request queryCall$Request, C143851w wVar) {
        super(C145891g.f394440m, wVar);
        this.f394538a = queryCall$Request;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ C143711ad mo117683c(Status status) {
        QueryCall$Response queryCall$Response = new QueryCall$Response();
        queryCall$Response.f394513a = status;
        return queryCall$Response;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final /* bridge */ /* synthetic */ void mo117681h(C143717b bVar) {
        C145925i iVar = (C145925i) bVar;
        ((C145919c) iVar.mo122241m()).mo122336g(this.f394538a, new C145927k(this, QueryCall$Response.class, iVar));
    }
}
