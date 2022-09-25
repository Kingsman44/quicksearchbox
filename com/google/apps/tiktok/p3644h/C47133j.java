package com.google.apps.tiktok.p3644h;

import com.google.apps.tiktok.account.AccountId;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.apps.tiktok.h.j */
/* compiled from: PG */
public final /* synthetic */ class C47133j implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C47134k f122738a;

    /* renamed from: b */
    public final /* synthetic */ AccountId f122739b;

    public /* synthetic */ C47133j(C47134k kVar, AccountId accountId) {
        this.f122738a = kVar;
        this.f122739b = accountId;
    }

    public final C60870cx apply(Object obj) {
        String str = (String) obj;
        return str != null ? this.f122738a.mo51029c(str) : C60856cj.m92899h(new IllegalStateException("Cannot get auth token for account id: ".concat(String.valueOf(String.valueOf(this.f122739b)))));
    }
}
