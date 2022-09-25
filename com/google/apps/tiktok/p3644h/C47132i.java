package com.google.apps.tiktok.p3644h;

import com.google.apps.tiktok.account.AccountId;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.apps.tiktok.h.i */
/* compiled from: PG */
public final /* synthetic */ class C47132i implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C47134k f122736a;

    /* renamed from: b */
    public final /* synthetic */ AccountId f122737b;

    public /* synthetic */ C47132i(C47134k kVar, AccountId accountId) {
        this.f122736a = kVar;
        this.f122737b = accountId;
    }

    public final C60870cx apply(Object obj) {
        String str = (String) obj;
        return str != null ? this.f122736a.mo51030d(str) : C60856cj.m92899h(new IllegalStateException("Cannot get auth token for account id: ".concat(String.valueOf(String.valueOf(this.f122737b)))));
    }
}
