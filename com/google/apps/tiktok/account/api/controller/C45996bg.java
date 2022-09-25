package com.google.apps.tiktok.account.api.controller;

import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.data.C46108a;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58759qy;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.apps.tiktok.account.api.controller.bg */
/* compiled from: PG */
public final /* synthetic */ class C45996bg implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C46003bn f120833a;

    /* renamed from: b */
    public final /* synthetic */ C45977ao f120834b;

    /* renamed from: c */
    public final /* synthetic */ AccountId f120835c;

    public /* synthetic */ C45996bg(C46003bn bnVar, C45977ao aoVar, AccountId accountId) {
        this.f120833a = bnVar;
        this.f120834b = aoVar;
        this.f120835c = accountId;
    }

    public final C60870cx apply(Object obj) {
        C46003bn bnVar = this.f120833a;
        C45977ao aoVar = this.f120834b;
        AccountId accountId = this.f120835c;
        C46108a aVar = (C46108a) obj;
        if (!((C58759qy) bnVar.f120843b).f156534a.equals(aVar.mo50210b().f121165j)) {
            C58838bb.m90884s(aVar.mo50211c() != 3, "Can't auto-select disabled accounts.");
        }
        return C60922j.m93044g(aoVar.mo37984b(accountId), C47810es.m84963c(new C45998bi(accountId)), C60826bg.f164896a);
    }
}
