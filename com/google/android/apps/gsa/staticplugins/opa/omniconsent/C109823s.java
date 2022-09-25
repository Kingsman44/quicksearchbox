package com.google.android.apps.gsa.staticplugins.opa.omniconsent;

import android.accounts.Account;
import com.google.android.libraries.gsa.p1876k.C22862b;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.omniconsent.s */
/* compiled from: PG */
public final /* synthetic */ class C109823s implements C22862b {

    /* renamed from: a */
    public final /* synthetic */ C109782ab f306051a;

    public /* synthetic */ C109823s(C109782ab abVar) {
        this.f306051a = abVar;
    }

    /* renamed from: a */
    public final Object mo17947a() {
        C109782ab abVar = this.f306051a;
        Account account = (Account) abVar.f305902b.mo77278a().mo56107c();
        boolean z = false;
        if (account != null && abVar.f305908h.mo79143d(account.name) == 1) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
