package com.google.android.gms.lockbox.internal;

import android.accounts.Account;
import android.os.Parcel;
import com.google.android.gms.common.api.C143711ad;
import com.google.android.gms.common.api.C143717b;
import com.google.android.gms.common.api.C143851w;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.lockbox.C144980b;

/* renamed from: com.google.android.gms.lockbox.internal.d */
/* compiled from: PG */
public final class C144988d extends C144980b {

    /* renamed from: a */
    final /* synthetic */ Account f391962a;

    /* renamed from: d */
    final /* synthetic */ String f391963d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C144988d(C143851w wVar, Account account, String str) {
        super(wVar);
        this.f391962a = account;
        this.f391963d = str;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ C143711ad mo117683c(Status status) {
        return status;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final /* bridge */ /* synthetic */ void mo117681h(C143717b bVar) {
        C144990f fVar = (C144990f) bVar;
        Account account = this.f391962a;
        String str = account != null ? account.name : null;
        String str2 = this.f391963d;
        fVar.mo119455M();
        C144985a aVar = (C144985a) fVar.mo119451G();
        Parcel gA = aVar.mo17260gA();
        gA.writeString(str);
        gA.writeString(str2);
        aVar.mo17262he(7, gA);
        mo119112p(Status.f389615a);
    }
}
