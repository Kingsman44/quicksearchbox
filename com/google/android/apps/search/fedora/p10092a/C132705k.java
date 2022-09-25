package com.google.android.apps.search.fedora.p10092a;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.AccountManagerCallback;
import android.accounts.AccountManagerFuture;
import com.google.apps.tiktok.account.data.device.C46200d;
import com.google.apps.tiktok.concurrent.C46428ao;

/* renamed from: com.google.android.apps.search.fedora.a.k */
/* compiled from: PG */
public final /* synthetic */ class C132705k implements C46200d {

    /* renamed from: a */
    public final /* synthetic */ Account f362122a;

    /* renamed from: b */
    public final /* synthetic */ String f362123b;

    public /* synthetic */ C132705k(Account account, String str) {
        this.f362122a = account;
        this.f362123b = str;
    }

    /* renamed from: a */
    public final AccountManagerFuture mo50257a(AccountManager accountManager, AccountManagerCallback accountManagerCallback, C46428ao aoVar) {
        return accountManager.hasFeatures(this.f362122a, new String[]{this.f362123b}, accountManagerCallback, aoVar);
    }
}
