package com.google.apps.tiktok.experiments.phenotype;

import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.data.C46108a;
import com.google.apps.tiktok.account.data.C46215j;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.apps.tiktok.experiments.phenotype.b */
/* compiled from: PG */
final class C46933b implements C60931s {

    /* renamed from: a */
    final /* synthetic */ C46905a f122416a;

    /* renamed from: b */
    final /* synthetic */ String f122417b;

    /* renamed from: c */
    final /* synthetic */ AccountId f122418c;

    public C46933b(C46905a aVar, String str, AccountId accountId) {
        this.f122416a = aVar;
        this.f122417b = str;
        this.f122418c = accountId;
    }

    public final /* bridge */ /* synthetic */ C60870cx apply(Object obj) {
        C46108a aVar = (C46108a) obj;
        C69664n.m101061g(aVar, "account");
        C46905a aVar2 = this.f122416a;
        String str = this.f122417b;
        AccountId accountId = this.f122418c;
        C46215j b = aVar.mo50210b();
        C69664n.m101060f(b, "account.info()");
        return aVar2.mo50909b(str, accountId, b);
    }
}
