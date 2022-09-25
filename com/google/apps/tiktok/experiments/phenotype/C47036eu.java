package com.google.apps.tiktok.experiments.phenotype;

import com.google.android.libraries.phenotype.client.p2420a.C31634b;
import com.google.apps.tiktok.account.AccountId;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.apps.tiktok.experiments.phenotype.eu */
/* compiled from: PG */
final class C47036eu implements C60931s {

    /* renamed from: a */
    final /* synthetic */ String f122608a;

    /* renamed from: b */
    final /* synthetic */ C47038ew f122609b;

    /* renamed from: c */
    final /* synthetic */ AccountId f122610c;

    public C47036eu(String str, C47038ew ewVar, AccountId accountId) {
        this.f122608a = str;
        this.f122609b = ewVar;
        this.f122610c = accountId;
    }

    public final /* bridge */ /* synthetic */ C60870cx apply(Object obj) {
        C31634b bVar = (C31634b) obj;
        C69664n.m101061g(bVar, "configurations");
        if ((bVar.f85109a & 2) != 0) {
            return this.f122609b.f122616d.mo50995b(this.f122608a, this.f122610c);
        }
        String str = this.f122608a;
        throw new C46968ch("No configuration was provided in response to registerSync for " + str + ". Note that the API required for this to work was added in GmsCore v7 - if you are using a client library older than that, this call will never succeed.");
    }
}
