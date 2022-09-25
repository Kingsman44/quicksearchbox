package com.google.android.gms.search.global;

import android.os.Parcel;
import com.google.android.gms.common.api.C143711ad;
import com.google.android.gms.common.api.C143717b;
import com.google.android.gms.common.api.C143851w;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.search.C145891g;
import com.google.android.gms.search.global.p10872a.C145893a;
import com.google.android.gms.search.global.p10872a.C145894b;
import com.google.android.gms.search.global.p10872a.C145897e;
import com.google.android.gms.search.p10865b.p10866a.C145863b;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.gms.search.global.d */
/* compiled from: PG */
public final class C145900d extends C145863b {

    /* renamed from: a */
    private final GetGlobalSearchSourcesCall$Request f394474a;

    public C145900d(GetGlobalSearchSourcesCall$Request getGlobalSearchSourcesCall$Request, C143851w wVar) {
        super(C145891g.f394441n, wVar);
        this.f394474a = getGlobalSearchSourcesCall$Request;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ C143711ad mo117683c(Status status) {
        GetGlobalSearchSourcesCall$Response getGlobalSearchSourcesCall$Response = new GetGlobalSearchSourcesCall$Response();
        getGlobalSearchSourcesCall$Response.f394460a = status;
        return getGlobalSearchSourcesCall$Response;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final /* bridge */ /* synthetic */ void mo117681h(C143717b bVar) {
        C145897e eVar = (C145897e) ((C145893a) bVar).mo122241m();
        GetGlobalSearchSourcesCall$Request getGlobalSearchSourcesCall$Request = this.f394474a;
        C145894b bVar2 = new C145894b(this, GetGlobalSearchSourcesCall$Response.class);
        Parcel gA = eVar.mo17260gA();
        C8850c.m23497f(gA, getGlobalSearchSourcesCall$Request);
        C8850c.m23499h(gA, bVar2);
        eVar.mo17262he(2, gA);
    }
}
