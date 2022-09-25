package com.google.apps.tiktok.experiments.phenotype;

import com.google.apps.tiktok.account.AccountId;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.apps.tiktok.experiments.phenotype.eg */
/* compiled from: PG */
final class C47021eg implements C60931s {

    /* renamed from: a */
    final /* synthetic */ C47065s f122568a;

    /* renamed from: b */
    final /* synthetic */ AccountId f122569b;

    public C47021eg(C47065s sVar, AccountId accountId) {
        this.f122568a = sVar;
        this.f122569b = accountId;
    }

    public final /* bridge */ /* synthetic */ C60870cx apply(Object obj) {
        String str = (String) obj;
        C69664n.m101061g(str, "packageName");
        return this.f122568a.mo50995b(str, this.f122569b);
    }
}
