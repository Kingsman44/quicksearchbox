package com.google.android.apps.gsa.search.core.google.gaia;

import android.accounts.AccountManagerCallback;
import android.accounts.AccountManagerFuture;
import com.google.common.util.concurrent.C60873d;

/* renamed from: com.google.android.apps.gsa.search.core.google.gaia.ar */
/* compiled from: PG */
final class C86007ar extends C60873d implements AccountManagerCallback {

    /* renamed from: a */
    public volatile AccountManagerFuture f232538a;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo46268a() {
        if (this.value instanceof C60873d.C60875b) {
            AccountManagerFuture accountManagerFuture = this.f232538a;
            accountManagerFuture.getClass();
            accountManagerFuture.cancel(mo57359q());
        }
        this.f232538a = null;
    }

    public final void run(AccountManagerFuture accountManagerFuture) {
        try {
            mo57356n((Boolean) accountManagerFuture.getResult());
        } catch (Throwable th) {
            mo57357o(th);
        }
    }
}
