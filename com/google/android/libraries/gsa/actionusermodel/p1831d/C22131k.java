package com.google.android.libraries.gsa.actionusermodel.p1831d;

import com.google.android.apps.gsa.nga.engine.p6096p.C77435ab;
import com.google.android.libraries.search.logging.p3041d.C39141kp;
import com.google.android.libraries.search.p2476a.C32160b;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58872ci;
import com.google.common.base.C58889cz;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60888db;
import com.google.common.util.concurrent.C60922j;

/* renamed from: com.google.android.libraries.gsa.actionusermodel.d.k */
/* compiled from: PG */
public final class C22131k {

    /* renamed from: a */
    public final C60888db f60975a;

    /* renamed from: b */
    public final C39141kp f60976b;

    /* renamed from: c */
    private final C32160b f60977c;

    /* renamed from: d */
    private final C77435ab f60978d;

    /* renamed from: e */
    private final C58889cz f60979e;

    public C22131k(C60888db dbVar, C32160b bVar, C77435ab abVar, C39141kp kpVar, C58889cz czVar) {
        this.f60975a = dbVar;
        this.f60977c = bVar;
        this.f60978d = abVar;
        this.f60976b = kpVar;
        this.f60979e = czVar;
    }

    /* renamed from: a */
    public final C60870cx mo27362a() {
        C58872ci d = C58872ci.m90947d(this.f60979e);
        C60870cx b = this.f60977c.mo37974b();
        C22126f fVar = new C22126f(this, this.f60978d.mo72570b(), d);
        C60870cx h = C60922j.m93045h(b, C47810es.m84966f(fVar), this.f60975a);
        C22130j jVar = new C22130j(this);
        C60856cj.m92911t(h, C47810es.m84974n(jVar), this.f60975a);
        return h;
    }
}
