package com.google.android.libraries.search.p2476a.p2479c.p2481b;

import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.experiments.phenotype.C47039ex;
import com.google.common.base.C58817ah;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.a.c.b.p */
/* compiled from: PG */
public final /* synthetic */ class C32191p implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C32175ac f86397a;

    /* renamed from: b */
    public final /* synthetic */ AccountId f86398b;

    public /* synthetic */ C32191p(C32175ac acVar, AccountId accountId) {
        this.f86397a = acVar;
        this.f86398b = accountId;
    }

    public final Object apply(Object obj) {
        C32175ac acVar = this.f86397a;
        AccountId accountId = this.f86398b;
        C69664n.m101061g(accountId, "accountId");
        C46459k.m82829b(((C47039ex) acVar.f86373e.mo17428b()).f122619a.mo50980c(accountId), "Failed to commit experiments after account enable", new Object[0]);
        return accountId;
    }
}
