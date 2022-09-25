package com.google.android.gms.lockbox.internal;

import android.accounts.Account;
import android.os.Parcel;
import com.google.android.gms.common.api.C143711ad;
import com.google.android.gms.common.api.C143717b;
import com.google.android.gms.common.api.C143851w;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.lockbox.C144980b;
import com.google.android.gms.lockbox.C144982d;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.gms.lockbox.internal.b */
/* compiled from: PG */
public final class C144986b extends C144980b {

    /* renamed from: a */
    final /* synthetic */ Account f391959a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C144986b(C143851w wVar, Account account) {
        super(wVar);
        this.f391959a = account;
    }

    /* renamed from: c */
    public final /* synthetic */ C143711ad mo117683c(Status status) {
        return new C144989e(status, (C144982d) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final /* bridge */ /* synthetic */ void mo117681h(C143717b bVar) {
        C144990f fVar = (C144990f) bVar;
        String str = this.f391959a.name;
        fVar.mo119455M();
        C144985a aVar = (C144985a) fVar.mo119451G();
        Parcel gA = aVar.mo17260gA();
        gA.writeString(str);
        Parcel gT = aVar.mo17261gT(2, gA);
        gT.recycle();
        mo119112p(new C144989e(Status.f389615a, (LockboxOptInFlags) C8850c.m23492a(gT, LockboxOptInFlags.CREATOR)));
    }
}
