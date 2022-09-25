package com.google.apps.tiktok.account.api.controller;

import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.apps.tiktok.account.api.controller.af */
/* compiled from: PG */
public final /* synthetic */ class C45968af implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ List f120802a;

    /* renamed from: b */
    public final /* synthetic */ AccountId f120803b;

    public /* synthetic */ C45968af(List list, AccountId accountId) {
        this.f120802a = list;
        this.f120803b = accountId;
    }

    public final C60870cx apply(Object obj) {
        List<C45964ab> list = this.f120802a;
        AccountId accountId = this.f120803b;
        ValidationResult validationResult = (ValidationResult) obj;
        ArrayList arrayList = new ArrayList(list.size());
        for (C45964ab agVar : list) {
            arrayList.add(new C45969ag(agVar, accountId));
        }
        return C60922j.m93044g(C46017ca.m82210a(arrayList, C45970ah.f120806a, C60826bg.f164896a), C47810es.m84963c(C45971ai.f120807a), C60826bg.f164896a);
    }
}
