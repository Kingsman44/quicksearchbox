package com.google.android.apps.search.assistant.verticals.calendar.localcalendar;

import android.accounts.AccountManager;
import android.accounts.AccountManagerCallback;
import android.accounts.AccountManagerFuture;
import com.google.apps.tiktok.account.data.device.C46200d;
import com.google.apps.tiktok.concurrent.C46428ao;

/* renamed from: com.google.android.apps.search.assistant.verticals.calendar.localcalendar.ac */
/* compiled from: PG */
public final /* synthetic */ class C131950ac implements C46200d {

    /* renamed from: a */
    public final /* synthetic */ String f360273a;

    public /* synthetic */ C131950ac(String str) {
        this.f360273a = str;
    }

    /* renamed from: a */
    public final AccountManagerFuture mo50257a(AccountManager accountManager, AccountManagerCallback accountManagerCallback, C46428ao aoVar) {
        return accountManager.getAccountsByTypeAndFeatures("com.google", new String[]{this.f360273a}, accountManagerCallback, aoVar);
    }
}
