package com.google.android.gms.auth.p10737a.p10738a;

import android.accounts.Account;
import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.api.internal.C143798cs;
import com.google.android.gms.tasks.C146010af;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.gms.auth.a.a.v */
/* compiled from: PG */
public final /* synthetic */ class C142867v implements C143798cs {

    /* renamed from: a */
    public final /* synthetic */ Account f387668a;

    /* renamed from: b */
    public final /* synthetic */ String f387669b;

    /* renamed from: c */
    public final /* synthetic */ Bundle f387670c;

    public /* synthetic */ C142867v(Account account, String str, Bundle bundle) {
        this.f387668a = account;
        this.f387669b = str;
        this.f387670c = bundle;
    }

    /* renamed from: a */
    public final void mo117678a(Object obj, Object obj2) {
        Account account = this.f387668a;
        String str = this.f387669b;
        Bundle bundle = this.f387670c;
        C142858m mVar = (C142858m) ((C142848c) obj).mo119451G();
        C142871z zVar = new C142871z((C146010af) obj2);
        Parcel gA = mVar.mo17260gA();
        C8850c.m23499h(gA, zVar);
        C8850c.m23497f(gA, account);
        gA.writeString(str);
        C8850c.m23497f(gA, bundle);
        mVar.mo17262he(1, gA);
    }
}
