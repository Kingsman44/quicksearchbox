package com.google.apps.tiktok.experiments.phenotype;

import com.google.apps.tiktok.account.AccountId;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.apps.tiktok.experiments.phenotype.fe */
/* compiled from: PG */
final class C47047fe implements C60931s {

    /* renamed from: a */
    final /* synthetic */ C47065s f122627a;

    /* renamed from: b */
    final /* synthetic */ AccountId f122628b;

    public C47047fe(C47065s sVar, AccountId accountId) {
        this.f122627a = sVar;
        this.f122628b = accountId;
    }

    public final /* bridge */ /* synthetic */ C60870cx apply(Object obj) {
        String str = (String) obj;
        C69664n.m101061g(str, "packageName");
        return this.f122627a.mo50995b(str, this.f122628b);
    }
}
