package com.google.apps.tiktok.account.p3616e.p3620d;

import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.p3616e.p3620d.p3621a.C46339a;
import com.google.apps.tiktok.account.p3616e.p3620d.p3621a.C46341c;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.apps.tiktok.account.e.d.c */
/* compiled from: PG */
public final /* synthetic */ class C46343c implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C46348h f121336a;

    /* renamed from: b */
    public final /* synthetic */ AccountId f121337b;

    public /* synthetic */ C46343c(C46348h hVar, AccountId accountId) {
        this.f121336a = hVar;
        this.f121337b = accountId;
    }

    public final C60870cx apply(Object obj) {
        C46348h hVar = this.f121336a;
        AccountId accountId = this.f121337b;
        C46341c cVar = (C46341c) obj;
        if (accountId != null) {
            return C60922j.m93044g(hVar.f121346c.mo50284d(accountId), C47810es.m84963c(new C46345e(hVar, cVar, accountId)), C60826bg.f164896a);
        }
        C46339a aVar = (C46339a) cVar.toBuilder();
        aVar.mo50322b(hVar.f121345b);
        return C60856cj.m92900i((C46341c) aVar.build());
    }
}
