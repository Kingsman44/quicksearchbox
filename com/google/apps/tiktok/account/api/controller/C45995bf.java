package com.google.apps.tiktok.account.api.controller;

import android.content.Intent;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.data.C46215j;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58838bb;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.apps.tiktok.account.api.controller.bf */
/* compiled from: PG */
public final /* synthetic */ class C45995bf implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C46003bn f120831a;

    /* renamed from: b */
    public final /* synthetic */ AccountId f120832b;

    public /* synthetic */ C45995bf(C46003bn bnVar, AccountId accountId) {
        this.f120831a = bnVar;
        this.f120832b = accountId;
    }

    public final C60870cx apply(Object obj) {
        C46003bn bnVar = this.f120831a;
        AccountId accountId = this.f120832b;
        ValidationResult validationResult = (ValidationResult) obj;
        if (validationResult.mo50108c()) {
            return C60922j.m93044g(bnVar.f120842a.mo50284d(accountId), C47810es.m84963c(new C45999bj(validationResult)), C60826bg.f164896a);
        }
        C58838bb.m90883r(!validationResult.mo50108c());
        return C60856cj.m92900i(new AccountActionResult(accountId, C46215j.f121154k, validationResult, (Intent) null));
    }
}
