package com.google.android.libraries.search.p3005i.p3009d;

import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import com.google.protos.p5129p.p5131b.C65813cq;

/* renamed from: com.google.android.libraries.search.i.d.e */
/* compiled from: PG */
public final /* synthetic */ class C38443e implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C38446h f101748a;

    /* renamed from: b */
    public final /* synthetic */ Iterable f101749b;

    /* renamed from: c */
    public final /* synthetic */ C65813cq f101750c;

    public /* synthetic */ C38443e(C38446h hVar, Iterable iterable, C65813cq cqVar) {
        this.f101748a = hVar;
        this.f101749b = iterable;
        this.f101750c = cqVar;
    }

    public final C60870cx apply(Object obj) {
        C38446h hVar = this.f101748a;
        Iterable iterable = this.f101749b;
        C65813cq cqVar = this.f101750c;
        AccountId accountId = (AccountId) obj;
        C60870cx g = hVar.f101762e.mo50250g(accountId);
        C38441c cVar = new C38441c(hVar, accountId, iterable, cqVar);
        return C60922j.m93045h(g, C47810es.m84966f(cVar), hVar.f101759b);
    }
}
