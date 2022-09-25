package com.google.android.libraries.search.assistant.p2803u.p2804a.p2807c;

import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.experiments.C46889a;
import com.google.apps.tiktok.experiments.phenotype.C46989db;
import com.google.apps.tiktok.experiments.phenotype.C47038ew;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58847bk;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60846c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import java.util.concurrent.TimeUnit;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.u.a.c.h */
/* compiled from: PG */
public final /* synthetic */ class C36644h implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C36656t f95497a;

    /* renamed from: b */
    public final /* synthetic */ AccountId f95498b;

    public /* synthetic */ C36644h(C36656t tVar, AccountId accountId) {
        this.f95497a = tVar;
        this.f95498b = accountId;
    }

    public final C60870cx apply(Object obj) {
        C36656t tVar = this.f95497a;
        AccountId accountId = this.f95498b;
        if (!((Boolean) obj).booleanValue()) {
            return C60856cj.m92900i(false);
        }
        C46989db dbVar = tVar.f95522h;
        C69664n.m101061g(accountId, "accountId");
        String a = dbVar.f122518c.mo50923a("com.google.android.apps.search.assistant.user");
        C46889a aVar = (C46889a) dbVar.f122517b.get(a);
        if (aVar == C46889a.UI_USER || aVar == C46889a.USER) {
            C60870cx q = C60856cj.m92908q(((C47038ew) ((C58847bk) dbVar.f122516a).f156646a).mo50985a(a, accountId), 10000, TimeUnit.MILLISECONDS, tVar.f95517c);
            C36653q qVar = C36653q.f95510a;
            C60870cx g = C60922j.m93044g(q, C47810es.m84963c(qVar), C60826bg.f164896a);
            C36654r rVar = C36654r.f95511a;
            return C60846c.m92878g(g, Throwable.class, C47810es.m84963c(rVar), C60826bg.f164896a);
        }
        throw new IllegalStateException("Package " + a + " was not a user package. Instead was " + aVar);
    }
}
