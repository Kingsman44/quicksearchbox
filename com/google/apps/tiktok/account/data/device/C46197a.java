package com.google.apps.tiktok.account.data.device;

import android.accounts.AccountManagerCallback;
import android.accounts.AccountManagerFuture;
import com.google.common.util.concurrent.SettableFuture;

/* renamed from: com.google.apps.tiktok.account.data.device.a */
/* compiled from: PG */
public final /* synthetic */ class C46197a implements AccountManagerCallback {

    /* renamed from: a */
    public final /* synthetic */ SettableFuture f121131a;

    public /* synthetic */ C46197a(SettableFuture settableFuture) {
        this.f121131a = settableFuture;
    }

    public final void run(AccountManagerFuture accountManagerFuture) {
        C46201e.m82437b(this.f121131a, accountManagerFuture);
    }
}
