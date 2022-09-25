package com.google.android.libraries.onegoogle.owners.mdi;

import android.accounts.Account;
import android.accounts.OnAccountsUpdateListener;

/* renamed from: com.google.android.libraries.onegoogle.owners.mdi.h */
/* compiled from: PG */
public final /* synthetic */ class C30993h implements OnAccountsUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ C30996k f83484a;

    public /* synthetic */ C30993h(C30996k kVar) {
        this.f83484a = kVar;
    }

    public final void onAccountsUpdated(Account[] accountArr) {
        C30996k kVar = this.f83484a;
        kVar.mo36679j();
        for (Account i : accountArr) {
            kVar.mo36678i(i);
        }
    }
}
