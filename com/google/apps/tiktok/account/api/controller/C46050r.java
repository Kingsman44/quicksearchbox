package com.google.apps.tiktok.account.api.controller;

import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.data.C46325t;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60846c;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;

/* renamed from: com.google.apps.tiktok.account.api.controller.r */
/* compiled from: PG */
public final class C46050r implements C45964ab {

    /* renamed from: a */
    private final C46325t f120915a;

    public C46050r(C46325t tVar) {
        this.f120915a = tVar;
    }

    /* renamed from: a */
    public final C60870cx mo37987a(AccountId accountId) {
        return C60922j.m93044g(C60846c.m92878g(this.f120915a.mo50289i(accountId), IllegalArgumentException.class, C47810es.m84963c(C46047o.f120912a), C60826bg.f164896a), C47810es.m84963c(C46048p.f120913a), C60826bg.f164896a);
    }
}
