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

/* renamed from: com.google.android.gms.search.queries.i */
/* compiled from: PG */
public final class C145941i extends C145863b {

    /* renamed from: a */
    private final GlobalQueryCall$Request f394537a;

    public C145941i(GlobalQueryCall$Request globalQueryCall$Request, C143851w wVar) {
        super(C145891g.f394440m, wVar);
        this.f394537a = globalQueryCall$Request;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ C143711ad mo117683c(Status status) {
        GlobalQueryCall$Response globalQueryCall$Response = new GlobalQueryCall$Response();
        globalQueryCall$Response.f394503a = status;
        return globalQueryCall$Response;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final /* bridge */ /* synthetic */ void mo117681h(C143717b bVar) {
        C145925i iVar = (C145925i) bVar;
        ((C145919c) iVar.mo122241m()).mo122334e(this.f394537a, new C145927k(this, GlobalQueryCall$Response.class, iVar));
    }
}
