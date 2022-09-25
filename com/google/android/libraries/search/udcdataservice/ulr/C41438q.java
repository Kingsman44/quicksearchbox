package com.google.android.libraries.search.udcdataservice.ulr;

import com.google.android.gms.location.reporting.C144966d;
import com.google.android.libraries.search.logging.p3041d.C39141kp;
import com.google.android.libraries.search.udcdataservice.C41420s;
import com.google.android.libraries.storage.protostore.C42876ab;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.data.p3611a.C46128f;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60922j;

/* renamed from: com.google.android.libraries.search.udcdataservice.ulr.q */
/* compiled from: PG */
public final class C41438q {

    /* renamed from: a */
    public final C60887da f108221a;

    /* renamed from: b */
    public final C60887da f108222b;

    /* renamed from: c */
    public final C46128f f108223c;

    /* renamed from: d */
    public final C144966d f108224d;

    /* renamed from: e */
    public final C42876ab f108225e;

    /* renamed from: f */
    public final AccountId f108226f;

    /* renamed from: g */
    public final C39141kp f108227g;

    /* renamed from: h */
    private final C41420s f108228h;

    public C41438q(C46128f fVar, AccountId accountId, C60887da daVar, C60887da daVar2, C42876ab abVar, C144966d dVar, C39141kp kpVar, C41420s sVar) {
        this.f108221a = daVar;
        this.f108222b = daVar2;
        this.f108223c = fVar;
        this.f108224d = dVar;
        this.f108225e = abVar;
        this.f108226f = accountId;
        this.f108227g = kpVar;
        this.f108228h = sVar;
    }

    /* renamed from: a */
    public final C60870cx mo43955a() {
        C60870cx a = this.f108228h.mo43952a(this.f108226f);
        C41431j jVar = new C41431j(this);
        C60870cx h = C60922j.m93045h(a, C47810es.m84966f(jVar), this.f108221a);
        C41432k kVar = C41432k.f108215a;
        return C60922j.m93044g(h, C47810es.m84963c(kVar), this.f108221a);
    }

    /* renamed from: b */
    public final C60870cx mo43956b(C60870cx cxVar) {
        C41435n nVar = new C41435n(this);
        return C60922j.m93045h(cxVar, C47810es.m84966f(nVar), this.f108221a);
    }
}
