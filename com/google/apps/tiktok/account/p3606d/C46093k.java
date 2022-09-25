package com.google.apps.tiktok.account.p3606d;

import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.data.C46167as;
import com.google.common.base.C58817ah;

/* renamed from: com.google.apps.tiktok.account.d.k */
/* compiled from: PG */
public final /* synthetic */ class C46093k implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ AccountId f120971a;

    public /* synthetic */ C46093k(AccountId accountId) {
        this.f120971a = accountId;
    }

    public final Object apply(Object obj) {
        AccountId accountId = this.f120971a;
        if (((Boolean) obj).booleanValue()) {
            return accountId;
        }
        throw new C46167as("Stored account is disabled. Avoid this situation with an AccountDisabledInterceptor as described in go/tiktok-account/storage.md#storing-account-data-in-singleton-storage");
    }
}
