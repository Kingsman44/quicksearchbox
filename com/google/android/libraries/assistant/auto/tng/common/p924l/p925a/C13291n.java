package com.google.android.libraries.assistant.auto.tng.common.p924l.p925a;

import com.google.android.gms.location.C144889at;
import com.google.android.gms.location.C144890au;
import com.google.android.libraries.assistant.auto.tng.gmm.grpc.p999b.C13610a;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.search.assistant.p2782r.C36379e;
import com.google.android.libraries.search.location.C38570a;
import com.google.android.libraries.search.location.C38683aa;
import com.google.android.libraries.search.location.C38700f;
import com.google.android.libraries.search.location.C38725y;
import com.google.android.libraries.search.location.C38726z;
import com.google.android.libraries.search.logging.p3041d.C39141kp;
import com.google.android.libraries.search.p3047m.p3050b.C39226b;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47632e;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.android.p4521a.C58274c;
import com.google.common.base.C58833ax;
import com.google.common.base.C58872ci;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60846c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60888db;
import com.google.common.util.concurrent.C60922j;
import java.util.concurrent.TimeUnit;
import p3186j$.time.Duration;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.assistant.auto.tng.common.l.a.n */
/* compiled from: PG */
public final class C13291n implements C36379e {

    /* renamed from: a */
    public static final C59071e f40984a = C59071e.m91332i("com.google.android.libraries.assistant.auto.tng.common.l.a.n");

    /* renamed from: b */
    public final C38700f f40985b;

    /* renamed from: c */
    public final C21370a f40986c;

    /* renamed from: d */
    public final C39141kp f40987d;

    /* renamed from: e */
    public final C144889at f40988e = new C13288k();

    /* renamed from: f */
    private final C38683aa f40989f;

    /* renamed from: g */
    private final C60888db f40990g;

    /* renamed from: h */
    private final long f40991h;

    /* renamed from: i */
    private final long f40992i;

    /* renamed from: j */
    private final C69464a f40993j;

    /* renamed from: k */
    private final C69464a f40994k;

    /* renamed from: l */
    private final C69464a f40995l;

    /* renamed from: m */
    private final C47632e f40996m;

    /* renamed from: n */
    private final C58833ax f40997n;

    public C13291n(C38683aa aaVar, C38700f fVar, C21370a aVar, C60888db dbVar, C69464a aVar2, C69464a aVar3, C69464a aVar4, C69464a aVar5, C69464a aVar6, C69464a aVar7, C39141kp kpVar, C58833ax axVar) {
        C47632e eVar = new C47632e();
        this.f40996m = eVar;
        this.f40989f = aaVar;
        this.f40986c = aVar;
        this.f40990g = dbVar;
        this.f40991h = ((Long) aVar2.mo17428b()).longValue();
        this.f40992i = ((Long) aVar3.mo17428b()).longValue();
        this.f40987d = kpVar;
        this.f40985b = fVar;
        this.f40993j = aVar4;
        this.f40994k = aVar5;
        this.f40995l = aVar7;
        this.f40997n = axVar;
        long millis = Duration.ofSeconds(((Long) aVar6.mo17428b()).longValue()).toMillis();
        if (!m29542e()) {
            ((C59052c) ((C59052c) f40984a.mo56224b()).mo56372aa(44733)).mo56386p("Background location updates not enabled.");
        } else {
            C46459k.m82829b(eVar.mo51512b(new C13278a(this, new C144890au(100, millis).mo120383a()), dbVar), "Failed to subscribe for location updates", new Object[0]);
        }
    }

    /* renamed from: e */
    private final boolean m29542e() {
        return ((Boolean) this.f40993j.mo17428b()).booleanValue() || ((Boolean) this.f40994k.mo17428b()).booleanValue();
    }

    /* renamed from: a */
    public final C60870cx mo21007a() {
        C60870cx cxVar;
        if (!((Boolean) this.f40995l.mo17428b()).booleanValue() || !this.f40997n.mo56113h()) {
            cxVar = mo21008b();
        } else {
            C60870cx a = ((C13610a) this.f40997n.mo56107c()).mo21188a();
            C13287j jVar = new C13287j(this);
            cxVar = C60922j.m93045h(a, C47810es.m84966f(jVar), this.f40990g);
        }
        C13290m mVar = new C13290m(this, C58872ci.m90947d(C58274c.f155808a));
        C60856cj.m92911t(cxVar, C47810es.m84974n(mVar), this.f40990g);
        return cxVar;
    }

    /* renamed from: b */
    public final C60870cx mo21008b() {
        C47633f h = C47633f.m84733g(C60856cj.m92908q(this.f40989f.mo41550d(C39226b.TAG_ASSISTANT_TNG_CAR_LO, 2), this.f40992i, TimeUnit.MILLISECONDS, this.f40990g)).mo51515h(C13284g.f40978a, this.f40990g);
        C38683aa aaVar = this.f40989f;
        C38725y d = C38726z.m68011d(C39226b.TAG_ASSISTANT_TNG_CAR_LO);
        ((C38570a) d).f101954b = 3;
        C47633f h2 = C47633f.m84733g(C60856cj.m92908q(aaVar.mo41548b(d.mo41492a()), this.f40991h, TimeUnit.MILLISECONDS, this.f40990g)).mo51515h(C13284g.f40978a, this.f40990g);
        if (m29542e()) {
            C13279b bVar = new C13279b(h2);
            C60870cx h3 = C60922j.m93045h(h, C47810es.m84966f(bVar), this.f40990g);
            C13280c cVar = new C13280c(h2);
            return C60846c.m92879h(h3, Exception.class, C47810es.m84966f(cVar), this.f40990g);
        }
        C13281d dVar = new C13281d(h);
        C60870cx h4 = C60922j.m93045h(h2, C47810es.m84966f(dVar), this.f40990g);
        C13282e eVar = new C13282e(h);
        return C60846c.m92879h(h4, Exception.class, C47810es.m84966f(eVar), this.f40990g);
    }

    /* renamed from: c */
    public final C60870cx mo21009c() {
        C60870cx a = mo21007a();
        C13285h hVar = C13285h.f40979a;
        return C60922j.m93044g(a, C47810es.m84963c(hVar), C60826bg.f164896a);
    }

    /* renamed from: d */
    public final void mo21010d() {
        if (!m29542e()) {
            ((C59052c) ((C59052c) f40984a.mo56224b()).mo56372aa(44734)).mo56386p("Background location updates not enabled, ignoring request to stop.");
            return;
        }
        C60870cx b = this.f40996m.mo51512b(new C13286i(this), this.f40990g);
        C13289l lVar = new C13289l();
        C60856cj.m92911t(b, C47810es.m84974n(lVar), C60826bg.f164896a);
    }
}
