package com.google.apps.tiktok.account.data.device;

import android.accounts.AccountManagerFuture;
import com.google.common.util.concurrent.C60873d;
import com.google.common.util.concurrent.SettableFuture;

/* renamed from: com.google.apps.tiktok.account.data.device.b */
/* compiled from: PG */
public final /* synthetic */ class C46198b implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ SettableFuture f121132a;

    /* renamed from: b */
    public final /* synthetic */ AccountManagerFuture f121133b;

    public /* synthetic */ C46198b(SettableFuture settableFuture, AccountManagerFuture accountManagerFuture) {
        this.f121132a = settableFuture;
        this.f121133b = accountManagerFuture;
    }

    public final void run() {
        SettableFuture settableFuture = this.f121132a;
        AccountManagerFuture accountManagerFuture = this.f121133b;
        if (settableFuture.value instanceof C60873d.C60875b) {
            accountManagerFuture.cancel(true);
        }
    }
}
