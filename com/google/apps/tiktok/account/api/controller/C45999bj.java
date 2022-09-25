package com.google.apps.tiktok.account.api.controller;

import android.content.Intent;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.data.C46108a;
import com.google.apps.tiktok.account.data.C46215j;
import com.google.common.base.C58817ah;
import com.google.common.base.C58838bb;

/* renamed from: com.google.apps.tiktok.account.api.controller.bj */
/* compiled from: PG */
public final /* synthetic */ class C45999bj implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ ValidationResult f120838a;

    public /* synthetic */ C45999bj(ValidationResult validationResult) {
        this.f120838a = validationResult;
    }

    public final Object apply(Object obj) {
        ValidationResult validationResult = this.f120838a;
        C46108a aVar = (C46108a) obj;
        AccountId a = aVar.mo50209a();
        C46215j b = aVar.mo50210b();
        C58838bb.m90884s(validationResult.mo50108c(), "Trying to propagate AccountInfo for invalid account.");
        return new AccountActionResult(a, b, validationResult, (Intent) null);
    }
}
