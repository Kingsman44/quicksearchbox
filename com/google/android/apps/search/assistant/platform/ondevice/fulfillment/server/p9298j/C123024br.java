package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9298j;

import com.google.apps.tiktok.tracing.C47770dh;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.p4580v.C60950i;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60872cz;
import com.google.common.util.concurrent.C60888db;
import java.util.concurrent.TimeUnit;
import p3186j$.time.Duration;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.j.br */
/* compiled from: PG */
final class C123024br implements C123025bs {

    /* renamed from: a */
    public final C122990ak f340573a;

    /* renamed from: b */
    public final Optional f340574b;

    /* renamed from: c */
    public final C47770dh f340575c;

    /* renamed from: d */
    private final C123051cr f340576d;

    /* renamed from: e */
    private final C60888db f340577e;

    /* renamed from: f */
    private C60872cz f340578f;

    /* renamed from: g */
    private C123051cr f340579g;

    public C123024br(C60870cx cxVar, C122990ak akVar, Optional optional, C60950i iVar, C47770dh dhVar, C60888db dbVar) {
        this.f340576d = new C123051cr(cxVar);
        this.f340573a = akVar;
        this.f340574b = optional.map(new C123013bg(iVar));
        this.f340575c = dhVar;
        this.f340577e = dbVar;
        C123022bp bpVar = new C123022bp(this);
        C60856cj.m92911t(cxVar, C47810es.m84974n(bpVar), C60826bg.f164896a);
    }

    /* renamed from: g */
    private final synchronized void m202348g() {
        if (this.f340579g == null) {
            this.f340579g = new C123051cr(C47633f.m84733g(C60856cj.m92901j(this.f340576d.f340614a)).mo51515h(C123014bh.f340561a, C60826bg.f164896a).mo51513e(Throwable.class, C123015bi.f340562a, C60826bg.f164896a).mo51516i(new C123016bj(this), C60826bg.f164896a));
        }
    }

    /* renamed from: a */
    public final synchronized C60870cx mo105823a() {
        C60872cz czVar = this.f340578f;
        if (czVar != null) {
            czVar.cancel(false);
        }
        m202348g();
        return C60856cj.m92901j(this.f340579g.f340614a);
    }

    /* renamed from: b */
    public final synchronized C60870cx mo105824b() {
        C123051cr crVar = this.f340579g;
        if (crVar == null) {
            return null;
        }
        return C60856cj.m92901j(crVar.f340614a);
    }

    /* renamed from: c */
    public final C60870cx mo105825c() {
        return C60856cj.m92901j(this.f340576d.f340614a);
    }

    /* renamed from: d */
    public final void mo105826d() {
        this.f340574b.ifPresent(C123019bm.f340566a);
    }

    /* renamed from: e */
    public final synchronized void mo105831e() {
        this.f340579g = new C123051cr(C60866ct.f164955a);
    }

    /* renamed from: f */
    public final synchronized void mo105832f(Duration duration) {
        if (this.f340579g == null) {
            this.f340578f = this.f340577e.mo29164d(new C123017bk(this), duration.toMillis(), TimeUnit.MILLISECONDS);
        }
    }
}
