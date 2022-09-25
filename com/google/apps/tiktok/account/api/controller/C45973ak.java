package com.google.apps.tiktok.account.api.controller;

import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.data.C46167as;
import com.google.common.base.C58817ah;

/* renamed from: com.google.apps.tiktok.account.api.controller.ak */
/* compiled from: PG */
public final /* synthetic */ class C45973ak implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ AccountId f120809a;

    public /* synthetic */ C45973ak(AccountId accountId) {
        this.f120809a = accountId;
    }

    public final Object apply(Object obj) {
        AccountId accountId = this.f120809a;
        if (((ValidationResult) obj).mo50108c()) {
            return accountId;
        }
        throw new C46167as("Requirements not met for account.");
    }
}
