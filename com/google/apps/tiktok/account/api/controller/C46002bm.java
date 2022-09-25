package com.google.apps.tiktok.account.api.controller;

import android.content.Intent;
import android.util.Pair;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.data.C46215j;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.apps.tiktok.account.api.controller.bm */
/* compiled from: PG */
public final /* synthetic */ class C46002bm implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C46003bn f120841a;

    public /* synthetic */ C46002bm(C46003bn bnVar) {
        this.f120841a = bnVar;
    }

    public final C60870cx apply(Object obj) {
        C46003bn bnVar = this.f120841a;
        Pair pair = (Pair) obj;
        if (pair != null) {
            if (pair.first instanceof C45979aq) {
                Intent intent = (Intent) pair.second;
                return C60922j.m93044g(((C45979aq) pair.first).mo50126b(), C45997bh.f120836a, C60826bg.f164896a);
            } else if (pair.first instanceof C45977ao) {
                AccountId accountId = (AccountId) pair.second;
                return C60922j.m93045h(bnVar.f120842a.mo50284d(accountId), C47810es.m84966f(new C45996bg(bnVar, (C45977ao) pair.first, accountId)), C60826bg.f164896a);
            }
        }
        return C60856cj.m92900i(new AccountActionResult((AccountId) null, C46215j.f121154k, (ValidationResult) null, (Intent) null));
    }
}
