package com.google.apps.tiktok.account.data;

import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.storage.protostore.C42876ab;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60836bq;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Executor;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.apps.tiktok.account.data.ag */
/* compiled from: PG */
public final class C46155ag {

    /* renamed from: a */
    public final C69464a f121067a;

    /* renamed from: b */
    public final C46325t f121068b;

    /* renamed from: c */
    public final C42876ab f121069c;

    /* renamed from: d */
    public final C21370a f121070d;

    /* renamed from: e */
    public final C60836bq f121071e = new C60836bq();

    /* renamed from: f */
    public final C69464a f121072f;

    /* renamed from: g */
    public final int f121073g;

    /* renamed from: h */
    public final Executor f121074h;

    public C46155ag(C69464a aVar, C46325t tVar, C42876ab abVar, C21370a aVar2, C69464a aVar3, int i, Executor executor) {
        this.f121067a = aVar;
        this.f121068b = tVar;
        this.f121069c = abVar;
        this.f121070d = aVar2;
        this.f121072f = aVar3;
        this.f121073g = i;
        this.f121074h = executor;
    }

    /* renamed from: a */
    public final C60870cx mo50224a() {
        return this.f121071e.mo57305b(C47810es.m84965e(new C46331z(this)), this.f121074h);
    }

    /* renamed from: b */
    public final C60870cx mo50225b() {
        return this.f121069c.mo46039a(new C46149aa(this), C60826bg.f164896a);
    }

    /* renamed from: c */
    public final void mo50226c(C60870cx cxVar) {
        C60856cj.m92911t(cxVar, C47810es.m84974n(new C46154af(this)), this.f121074h);
    }
}
