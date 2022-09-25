package com.google.apps.tiktok.experiments.phenotype;

import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.api.controller.C45983au;
import com.google.apps.tiktok.account.api.controller.C45985aw;
import com.google.apps.tiktok.account.api.controller.C45986ax;
import com.google.apps.tiktok.account.api.controller.C45987ay;
import com.google.apps.tiktok.concurrent.C46459k;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.apps.tiktok.experiments.phenotype.e */
/* compiled from: PG */
public final class C47014e implements C45987ay {

    /* renamed from: a */
    final /* synthetic */ C47023ei f122562a;

    public C47014e(C47023ei eiVar) {
        this.f122562a = eiVar;
    }

    /* renamed from: a */
    public final void mo19982a(C45985aw awVar) {
        AccountId accountId = awVar.f120815a.f120816a;
        C47023ei eiVar = this.f122562a;
        C69664n.m101060f(accountId, "accountId");
        C46459k.m82829b(eiVar.mo50980c(accountId), "Failed to commit to configuration for account %s", accountId);
    }

    /* renamed from: b */
    public final void mo19983b(Throwable th) {
        C69664n.m101061g(th, "reason");
    }

    /* renamed from: c */
    public final /* synthetic */ void mo19984c() {
    }

    /* renamed from: d */
    public final /* synthetic */ void mo19985d(C45986ax axVar) {
        C45983au.m82161a(this);
    }
}
