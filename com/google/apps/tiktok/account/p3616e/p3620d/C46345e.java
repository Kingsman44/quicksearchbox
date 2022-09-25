package com.google.apps.tiktok.account.p3616e.p3620d;

import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.data.C46108a;
import com.google.apps.tiktok.account.p3616e.p3620d.p3621a.C46339a;
import com.google.apps.tiktok.account.p3616e.p3620d.p3621a.C46341c;
import com.google.common.base.C58817ah;
import com.google.common.base.C58838bb;

/* renamed from: com.google.apps.tiktok.account.e.d.e */
/* compiled from: PG */
public final /* synthetic */ class C46345e implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C46348h f121339a;

    /* renamed from: b */
    public final /* synthetic */ C46341c f121340b;

    /* renamed from: c */
    public final /* synthetic */ AccountId f121341c;

    public /* synthetic */ C46345e(C46348h hVar, C46341c cVar, AccountId accountId) {
        this.f121339a = hVar;
        this.f121340b = cVar;
        this.f121341c = accountId;
    }

    public final Object apply(Object obj) {
        C46348h hVar = this.f121339a;
        C46341c cVar = this.f121340b;
        AccountId accountId = this.f121341c;
        C46108a aVar = (C46108a) obj;
        C58838bb.m90883r(aVar.mo50211c() == 2);
        if (aVar.mo50210b().f121165j.equals("incognito")) {
            return cVar;
        }
        C46339a aVar2 = (C46339a) cVar.toBuilder();
        aVar2.mo50321a(hVar.f121345b, accountId.mo50068a());
        return (C46341c) aVar2.build();
    }
}
