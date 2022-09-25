package com.google.android.gms.lockbox.internal;

import android.accounts.Account;
import android.os.Parcel;
import com.google.android.gms.common.api.C143711ad;
import com.google.android.gms.common.api.C143717b;
import com.google.android.gms.common.api.C143851w;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.lockbox.C144980b;
import com.google.android.gms.lockbox.LockboxOptInOptions;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.gms.lockbox.internal.c */
/* compiled from: PG */
public final class C144987c extends C144980b {

    /* renamed from: a */
    final /* synthetic */ Account f391960a;

    /* renamed from: d */
    final /* synthetic */ LockboxOptInOptions f391961d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C144987c(C143851w wVar, Account account, LockboxOptInOptions lockboxOptInOptions) {
        super(wVar);
        this.f391960a = account;
        this.f391961d = lockboxOptInOptions;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ C143711ad mo117683c(Status status) {
        return status;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final /* bridge */ /* synthetic */ void mo117681h(C143717b bVar) {
        C144990f fVar = (C144990f) bVar;
        String str = this.f391960a.name;
        LockboxOptInOptions lockboxOptInOptions = this.f391961d;
        fVar.mo119455M();
        C144985a aVar = (C144985a) fVar.mo119451G();
        Parcel gA = aVar.mo17260gA();
        gA.writeString(str);
        C8850c.m23497f(gA, lockboxOptInOptions);
        aVar.mo17262he(6, gA);
        mo119112p(Status.f389615a);
    }
}
