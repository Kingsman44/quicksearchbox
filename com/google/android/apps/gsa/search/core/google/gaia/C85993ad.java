package com.google.android.apps.gsa.search.core.google.gaia;

import android.accounts.Account;
import com.google.android.libraries.gsa.p1876k.C22869e;

/* renamed from: com.google.android.apps.gsa.search.core.google.gaia.ad */
/* compiled from: PG */
public final /* synthetic */ class C85993ad implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C86013ax f232512a;

    /* renamed from: b */
    public final /* synthetic */ Account[] f232513b;

    public /* synthetic */ C85993ad(C86013ax axVar, Account[] accountArr) {
        this.f232512a = axVar;
        this.f232513b = accountArr;
    }

    public final void run() {
        C86013ax axVar = this.f232512a;
        Account[] accountArr = this.f232513b;
        for (C86051l iR : axVar.mo79656C()) {
            iR.mo79704iR(accountArr);
        }
    }
}
