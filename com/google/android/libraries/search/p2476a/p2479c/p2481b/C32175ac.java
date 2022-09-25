package com.google.android.libraries.search.p2476a.p2479c.p2481b;

import com.google.android.libraries.search.p2476a.C32160b;
import com.google.android.libraries.search.p2476a.p2479c.C32165a;
import com.google.android.libraries.search.p2476a.p2479c.C32205f;
import com.google.android.libraries.search.p2476a.p2479c.C32210k;
import com.google.apps.tiktok.account.api.controller.C45966ad;
import com.google.apps.tiktok.account.data.C46155ag;
import com.google.apps.tiktok.account.data.C46325t;
import com.google.apps.tiktok.account.data.p3611a.C46128f;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.contrib.work.C46578l;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47635h;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47636i;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60836bq;
import com.google.common.util.concurrent.C60846c;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60922j;
import p3186j$.util.Objects;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.search.a.c.b.ac */
/* compiled from: PG */
final class C32175ac implements C32210k {

    /* renamed from: a */
    public final C32160b f86369a;

    /* renamed from: b */
    public final C46325t f86370b;

    /* renamed from: c */
    public final C60887da f86371c;

    /* renamed from: d */
    public final C46155ag f86372d;

    /* renamed from: e */
    public final C69464a f86373e;

    /* renamed from: f */
    public final C46578l f86374f;

    /* renamed from: g */
    private final C60836bq f86375g = new C60836bq();

    /* renamed from: h */
    private final C45966ad f86376h;

    /* renamed from: i */
    private final C46128f f86377i;

    public C32175ac(C32160b bVar, C46325t tVar, C60887da daVar, C45966ad adVar, C46128f fVar, C46155ag agVar, C69464a aVar, C46578l lVar) {
        this.f86369a = bVar;
        this.f86370b = tVar;
        this.f86371c = daVar;
        this.f86376h = adVar;
        this.f86377i = fVar;
        this.f86372d = agVar;
        this.f86373e = aVar;
        this.f86374f = lVar;
    }

    /* renamed from: a */
    public final C32165a mo37985a() {
        C60870cx b = this.f86375g.mo57305b(C47810es.m84965e(new C32198w(this)), this.f86371c);
        C32199x xVar = new C32199x(this);
        C46459k.m82829b(C60922j.m93045h(b, C47810es.m84966f(xVar), this.f86371c), "Failed to schedule PeriodicTaskWorker to invalidate accounts", new Object[0]);
        C32200y yVar = C32200y.f86409a;
        C60870cx g = C60922j.m93044g(b, C47810es.m84963c(yVar), C60826bg.f164896a);
        C32201z zVar = C32201z.f86410a;
        C60870cx g2 = C60922j.m93044g(b, C47810es.m84963c(zVar), C60826bg.f164896a);
        C47635h c = C47636i.m84744c(g2);
        C45966ad adVar = this.f86376h;
        Objects.requireNonNull(adVar);
        return new C32205f(g, g2, c.mo51519b(new C32173aa(adVar), this.f86371c).mo51516i(new C32189n(g2), this.f86371c));
    }

    /* renamed from: b */
    public final C60870cx mo37986b(String str) {
        C60870cx cxVar;
        if (str == null) {
            cxVar = this.f86370b.mo50283c("pseudonymous", "pseudonymous");
        } else {
            cxVar = this.f86377i.mo50216c(str);
        }
        C32193r rVar = C32193r.f86401a;
        return C60846c.m92878g(cxVar, Throwable.class, C47810es.m84963c(rVar), this.f86371c);
    }
}
