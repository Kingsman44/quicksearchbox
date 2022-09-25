package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p870d.p871a;

import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p726a.C12093d;
import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p800b.p804b.C12430d;
import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p870d.C12902a;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C12986d;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c.C13015ac;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c.C13078x;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c.C13079y;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c.C13080z;
import com.google.android.libraries.assistant.auto.tng.p1101o.p1102a.C15481g;
import com.google.android.libraries.assistant.auto.tng.p1101o.p1102a.C15494t;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.search.logging.p3043f.C39191a;
import com.google.android.libraries.search.p2871b.p2872a.p2875c.C37179a;
import com.google.android.libraries.search.p2871b.p2895i.C37253b;
import com.google.android.libraries.search.p2871b.p2895i.C37259h;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.common.base.C58851bo;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60904dr;
import com.google.common.util.concurrent.C60922j;
import com.google.net.p4726a.p4727a.C62722b;
import com.google.p4449cd.p4456g.p4458b.C57987f;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import p3186j$.util.Optional;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.d.a.ak */
/* compiled from: PG */
final class C12914ak {

    /* renamed from: a */
    public static final C59071e f40189a = C59071e.m91332i("com.google.android.libraries.assistant.auto.tng.assistant.c.d.a.ak");

    /* renamed from: b */
    public final C57987f f40190b = new C57987f();

    /* renamed from: c */
    public final C12093d f40191c;

    /* renamed from: d */
    public final C12945o f40192d;

    /* renamed from: e */
    public final C12430d f40193e;

    /* renamed from: f */
    public final C12902a f40194f;

    /* renamed from: g */
    public final Executor f40195g;

    /* renamed from: h */
    public final Executor f40196h;

    /* renamed from: i */
    public final C15481g f40197i;

    /* renamed from: j */
    public final C15494t f40198j;

    /* renamed from: k */
    public final C12935e f40199k;

    /* renamed from: l */
    public final C21370a f40200l;

    /* renamed from: m */
    public final C12940j f40201m;

    /* renamed from: n */
    public final C12929az f40202n;

    /* renamed from: o */
    public final C69464a f40203o;

    /* renamed from: p */
    public final Long f40204p;

    /* renamed from: q */
    public final C60870cx f40205q;

    /* renamed from: r */
    public C12953w f40206r;

    public C12914ak(C12093d dVar, C12945o oVar, C12430d dVar2, C12902a aVar, C15481g gVar, C15494t tVar, C12935e eVar, C12929az azVar, Executor executor, C21370a aVar2, C12940j jVar, C60870cx cxVar, C69464a aVar3) {
        this.f40191c = dVar;
        this.f40192d = oVar;
        this.f40193e = dVar2;
        this.f40194f = aVar;
        this.f40197i = gVar;
        this.f40198j = tVar;
        this.f40199k = eVar;
        this.f40195g = executor;
        this.f40196h = new C60904dr(executor);
        this.f40200l = aVar2;
        this.f40201m = jVar;
        this.f40202n = azVar;
        this.f40203o = aVar3;
        this.f40204p = Long.valueOf(C58851bo.f156649a.nextLong());
        this.f40205q = cxVar;
    }

    /* renamed from: a */
    public final C60870cx mo20846a(C12986d dVar) {
        C12956z zVar = new C12956z(this, dVar);
        C60870cx m = C60856cj.m92904m(C47810es.m84978r(zVar), this.f40196h);
        C12904aa aaVar = C12904aa.f40169a;
        C60870cx h = C60922j.m93045h(m, C47810es.m84966f(aaVar), this.f40195g);
        C12905ab abVar = C12905ab.f40170a;
        C60870cx h2 = C60922j.m93045h(m, C47810es.m84966f(abVar), this.f40195g);
        return C47638k.m84753d(h, h2).mo51521b(new C12906ac(this, h, h2, dVar), this.f40195g);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo20847b(Throwable th) {
        C57987f fVar = this.f40190b;
        C13078x xVar = (C13078x) C13079y.f40577f.createBuilder();
        C13080z zVar = (C13080z) C13015ac.f40430c.createBuilder();
        zVar.copyOnWrite();
        C13015ac acVar = (C13015ac) zVar.instance;
        acVar.f40433b = 1;
        acVar.f40432a |= 1;
        xVar.copyOnWrite();
        C13079y yVar = (C13079y) xVar.instance;
        C13015ac acVar2 = (C13015ac) zVar.build();
        acVar2.getClass();
        yVar.f40580b = acVar2;
        yVar.f40579a |= 1;
        fVar.f155056f.mo54591h((C13079y) xVar.build());
        if (th == null) {
            ((C59052c) ((C59052c) f40189a.mo56224b()).mo56372aa(44554)).mo56386p("SessionState is DONE");
            this.f40190b.f155056f.mo54589f(false);
        } else if (th instanceof CancellationException) {
            ((C59052c) ((C59052c) f40189a.mo56224b()).mo56372aa(44553)).mo56386p("SessionState is DONE due to cancellation");
            this.f40190b.f155056f.mo54589f(true);
        } else {
            ((C59052c) ((C59052c) f40189a.mo56224b()).mo56372aa(44552)).mo56386p("SessionState is DONE due to failure");
            this.f40190b.f155056f.mo54590g(th);
        }
    }

    /* renamed from: c */
    public final void mo20848c(C62722b bVar) {
        C37259h d = C37179a.f97469ao.mo40806d();
        C15481g gVar = this.f40197i;
        ((C37253b) d.f99012a).mo40795s("assistant_session_tag", C39191a.m68623b(this.f40204p.longValue()));
        gVar.mo22356f(d, bVar, Optional.empty(), Optional.empty());
    }
}
