package com.google.apps.tiktok.contrib.work.p3631b;

import androidx.work.WorkerParameters;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.data.C46167as;
import com.google.apps.tiktok.tracing.C47558bi;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60846c;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60930r;

/* renamed from: com.google.apps.tiktok.contrib.work.b.h */
/* compiled from: PG */
public final /* synthetic */ class C46549h implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C46552k f121714a;

    /* renamed from: b */
    public final /* synthetic */ C47558bi f121715b;

    /* renamed from: c */
    public final /* synthetic */ WorkerParameters f121716c;

    /* renamed from: d */
    public final /* synthetic */ AccountId f121717d;

    public /* synthetic */ C46549h(C46552k kVar, C47558bi biVar, WorkerParameters workerParameters, AccountId accountId) {
        this.f121714a = kVar;
        this.f121715b = biVar;
        this.f121716c = workerParameters;
        this.f121717d = accountId;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C60870cx cxVar;
        C46552k kVar = this.f121714a;
        C47558bi biVar = this.f121715b;
        WorkerParameters workerParameters = this.f121716c;
        AccountId accountId = this.f121717d;
        if (kVar.f121721b.containsKey(kVar.f121724e)) {
            cxVar = kVar.f121720a.mo50122f(accountId, (C58485gu) kVar.f121721b.get(kVar.f121724e));
        } else {
            cxVar = kVar.f121720a.mo50118b(accountId);
        }
        C46550i iVar = C46550i.f121718a;
        Class<C46167as> cls = C46167as.class;
        C60870cx h = C60846c.m92879h(cxVar, cls, C47810es.m84966f(iVar), kVar.f121722c);
        C58817ah ahVar = kVar.f121723d;
        C60870cx g = C60922j.m93044g(h, C47810es.m84963c(ahVar), kVar.f121722c);
        C46551j jVar = new C46551j(workerParameters);
        C60870cx h2 = C60922j.m93045h(g, C47810es.m84966f(jVar), kVar.f121722c);
        biVar.mo51417a(h2);
        return h2;
    }
}
