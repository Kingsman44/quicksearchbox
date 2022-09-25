package com.google.apps.tiktok.account.p3616e.p3620d;

import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.api.controller.C45983au;
import com.google.apps.tiktok.account.api.controller.C45985aw;
import com.google.apps.tiktok.account.api.controller.C45986ax;
import com.google.apps.tiktok.account.api.controller.C45987ay;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60826bg;

/* renamed from: com.google.apps.tiktok.account.e.d.g */
/* compiled from: PG */
public final class C46347g implements C45987ay {

    /* renamed from: a */
    final /* synthetic */ C46348h f121343a;

    public C46347g(C46348h hVar) {
        this.f121343a = hVar;
    }

    /* renamed from: a */
    public final void mo19982a(C45985aw awVar) {
        AccountId accountId = awVar.f120815a.f120816a;
        C46348h hVar = this.f121343a;
        C46459k.m82829b(hVar.f121344a.mo46040b(C47810es.m84966f(new C46343c(hVar, accountId)), C60826bg.f164896a), "Failed to set default account.", new Object[0]);
    }

    /* renamed from: b */
    public final void mo19983b(Throwable th) {
    }

    /* renamed from: c */
    public final /* synthetic */ void mo19984c() {
    }

    /* renamed from: d */
    public final /* synthetic */ void mo19985d(C45986ax axVar) {
        C45983au.m82161a(this);
    }
}
