package com.google.android.gms.location.reporting.p10843a;

import android.accounts.Account;
import com.google.android.gms.common.api.C143711ad;
import com.google.android.gms.common.api.C143717b;
import com.google.android.gms.common.api.C143851w;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.reporting.C144968f;
import com.google.android.gms.location.reporting.ReportingState;

/* renamed from: com.google.android.gms.location.reporting.a.c */
/* compiled from: PG */
public final class C144961c extends C144968f {

    /* renamed from: a */
    final /* synthetic */ Account f391931a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C144961c(C143851w wVar, Account account) {
        super(wVar);
        this.f391931a = account;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final /* synthetic */ C143711ad mo117683c(Status status) {
        return new C144963e(status, (ReportingState) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final /* bridge */ /* synthetic */ void mo117681h(C143717b bVar) {
        C144960b bVar2 = (C144960b) bVar;
        Account account = this.f391931a;
        bVar2.mo119455M();
        mo119112p(new C144963e(Status.f389615a, ((C144959a) bVar2.mo119451G()).mo120468e(account)));
    }
}
