package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import com.google.android.gms.appdatasearch.p10735a.C142772b;
import com.google.android.gms.appdatasearch.p10735a.C142778h;
import com.google.android.gms.common.api.C143711ad;
import com.google.android.gms.common.api.C143717b;
import com.google.android.gms.common.api.C143851w;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C143824m;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.gms.appdatasearch.o */
/* compiled from: PG */
public final class C142818o extends C143824m {

    /* renamed from: a */
    private final GetRecentContextCall$Request f387607a;

    public C142818o(GetRecentContextCall$Request getRecentContextCall$Request, C143851w wVar) {
        super(C142805b.f387602b, wVar);
        this.f387607a = getRecentContextCall$Request;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ C143711ad mo117683c(Status status) {
        GetRecentContextCall$Response getRecentContextCall$Response = new GetRecentContextCall$Response();
        getRecentContextCall$Response.f387453a = status;
        return getRecentContextCall$Response;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final /* bridge */ /* synthetic */ void mo117681h(C143717b bVar) {
        C142772b bVar2 = (C142772b) ((C142778h) bVar).mo119451G();
        GetRecentContextCall$Request getRecentContextCall$Request = this.f387607a;
        C142817n nVar = new C142817n(this);
        Parcel gA = bVar2.mo17260gA();
        C8850c.m23497f(gA, getRecentContextCall$Request);
        C8850c.m23499h(gA, nVar);
        bVar2.mo17262he(5, gA);
    }

    /* renamed from: i */
    public final /* bridge */ /* synthetic */ void mo117682i(Object obj) {
        super.mo119112p((C143711ad) obj);
    }
}
