package com.google.apps.tiktok.account.api.controller;

import android.content.Intent;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.data.C46215j;
import com.google.common.base.C58817ah;

/* renamed from: com.google.apps.tiktok.account.api.controller.bi */
/* compiled from: PG */
public final /* synthetic */ class C45998bi implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ AccountId f120837a;

    public /* synthetic */ C45998bi(AccountId accountId) {
        this.f120837a = accountId;
    }

    public final Object apply(Object obj) {
        return new AccountActionResult(this.f120837a, C46215j.f121154k, (ValidationResult) null, (Intent) null);
    }
}
