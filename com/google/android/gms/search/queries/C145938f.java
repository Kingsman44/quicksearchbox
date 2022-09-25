package com.google.android.gms.search.queries;

import android.os.Parcel;
import com.google.android.gms.common.api.C143711ad;
import com.google.android.gms.common.api.C143717b;
import com.google.android.gms.common.api.C143851w;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.search.C145891g;
import com.google.android.gms.search.p10865b.p10866a.C145863b;
import com.google.android.gms.search.queries.p10873a.C145919c;
import com.google.android.gms.search.queries.p10873a.C145925i;
import com.google.android.gms.search.queries.p10873a.C145927k;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.gms.search.queries.f */
/* compiled from: PG */
public final class C145938f extends C145863b {

    /* renamed from: a */
    private final GetPhraseAffinityCall$Request f394536a;

    public C145938f(GetPhraseAffinityCall$Request getPhraseAffinityCall$Request, C143851w wVar) {
        super(C145891g.f394440m, wVar);
        this.f394536a = getPhraseAffinityCall$Request;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ C143711ad mo117683c(Status status) {
        GetPhraseAffinityCall$Response getPhraseAffinityCall$Response = new GetPhraseAffinityCall$Response();
        getPhraseAffinityCall$Response.f394495a = status;
        return getPhraseAffinityCall$Response;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final /* bridge */ /* synthetic */ void mo117681h(C143717b bVar) {
        C145925i iVar = (C145925i) bVar;
        C145919c cVar = (C145919c) iVar.mo122241m();
        GetPhraseAffinityCall$Request getPhraseAffinityCall$Request = this.f394536a;
        C145927k kVar = new C145927k(this, GetPhraseAffinityCall$Response.class, iVar);
        Parcel gA = cVar.mo17260gA();
        C8850c.m23497f(gA, getPhraseAffinityCall$Request);
        C8850c.m23499h(gA, kVar);
        cVar.mo17262he(5, gA);
    }
}
