package com.google.android.libraries.search.p3005i.p3009d;

import com.google.android.libraries.geller.portable.GellerException;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import com.google.net.p4726a.p4727a.C62722b;
import com.google.protos.p5129p.p5131b.C65813cq;

/* renamed from: com.google.android.libraries.search.i.d.c */
/* compiled from: PG */
public final /* synthetic */ class C38441c implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C38446h f101743a;

    /* renamed from: b */
    public final /* synthetic */ AccountId f101744b;

    /* renamed from: c */
    public final /* synthetic */ Iterable f101745c;

    /* renamed from: d */
    public final /* synthetic */ C65813cq f101746d;

    public /* synthetic */ C38441c(C38446h hVar, AccountId accountId, Iterable iterable, C65813cq cqVar) {
        this.f101743a = hVar;
        this.f101744b = accountId;
        this.f101745c = iterable;
        this.f101746d = cqVar;
    }

    public final C60870cx apply(Object obj) {
        C38446h hVar = this.f101743a;
        AccountId accountId = this.f101744b;
        Iterable iterable = this.f101745c;
        C65813cq cqVar = this.f101746d;
        if (((Boolean) obj).booleanValue()) {
            C38444f fVar = new C38444f(hVar, accountId, iterable);
            C60870cx n = C60856cj.m92905n(C47810es.m84965e(fVar), hVar.f101759b);
            C60870cx a = hVar.f101760c.mo41421a(accountId);
            C60870cx a2 = hVar.f101761d.mo41427a(accountId);
            return C47638k.m84753d(n, a, a2).mo51520a(new C38445g(a, cqVar, a2, n), hVar.f101759b);
        }
        throw new GellerException(C62722b.UNKNOWN, "Cannot generate sync context for disabled account.");
    }
}
