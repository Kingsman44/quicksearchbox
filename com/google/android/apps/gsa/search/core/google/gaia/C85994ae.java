package com.google.android.apps.gsa.search.core.google.gaia;

import android.accounts.Account;
import com.google.android.libraries.gsa.p1876k.C22869e;

/* renamed from: com.google.android.apps.gsa.search.core.google.gaia.ae */
/* compiled from: PG */
public final /* synthetic */ class C85994ae implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C86013ax f232514a;

    /* renamed from: b */
    public final /* synthetic */ Account f232515b;

    public /* synthetic */ C85994ae(C86013ax axVar, Account account) {
        this.f232514a = axVar;
        this.f232515b = account;
    }

    public final void run() {
        C86013ax axVar = this.f232514a;
        Account account = this.f232515b;
        for (C86051l iQ : axVar.mo79656C()) {
            iQ.mo17551iQ(account);
        }
    }
}
