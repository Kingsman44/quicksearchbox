package com.google.android.gms.usagereporting.p10876a;

import com.google.android.gms.common.api.C143711ad;
import com.google.android.gms.common.api.C143717b;
import com.google.android.gms.common.api.C143851w;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C143784ce;
import com.google.android.gms.usagereporting.C146101m;

/* renamed from: com.google.android.gms.usagereporting.a.h */
/* compiled from: PG */
public final class C146082h extends C146101m {

    /* renamed from: a */
    final /* synthetic */ C143784ce f394805a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C146082h(C143851w wVar, C143784ce ceVar) {
        super(wVar);
        this.f394805a = ceVar;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ C143711ad mo117683c(Status status) {
        return status;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final /* synthetic */ void mo117681h(C143717b bVar) {
        C146089o oVar = (C146089o) bVar;
        C146088n nVar = new C146088n(this.f394805a);
        C146086l lVar = new C146086l((C146079e) oVar.mo119451G(), this, oVar.f394812a, nVar);
        C146088n nVar2 = (C146088n) oVar.f394812a.get();
        if (nVar2 != null) {
            ((C146079e) oVar.mo119451G()).mo122603g(nVar2, lVar);
            return;
        }
        oVar.f394812a.set(nVar);
        ((C146079e) oVar.mo119451G()).mo122602f(nVar, lVar);
    }
}
