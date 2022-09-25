package com.google.android.apps.search.assistant.surfaces.bisto.p9404e.p9407c.p9411b;

import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47632e;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.speech.p5208h.C66607ce;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.apps.search.assistant.surfaces.bisto.e.c.b.u */
/* compiled from: PG */
final class C124773u implements C70862aj {

    /* renamed from: a */
    public final C70862aj f344190a;

    /* renamed from: b */
    public final C70862aj f344191b;

    /* renamed from: c */
    final /* synthetic */ C124774v f344192c;

    /* renamed from: d */
    private volatile boolean f344193d;

    /* renamed from: e */
    private final C47632e f344194e = new C47632e();

    public C124773u(C124774v vVar, C70862aj ajVar, C70862aj ajVar2) {
        this.f344192c = vVar;
        this.f344190a = ajVar;
        this.f344191b = ajVar2;
        this.f344193d = true;
    }

    /* renamed from: a */
    public final void mo20121a() {
        this.f344194e.mo51511a(new C124768p(this), this.f344192c.f344196b);
    }

    /* renamed from: b */
    public final void mo20122b(Throwable th) {
        this.f344194e.mo51511a(new C124769q(this, th), this.f344192c.f344196b);
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo20123c(Object obj) {
        C60870cx b = this.f344194e.mo51512b(new C124770r(this, (C66607ce) obj), this.f344192c.f344196b);
        C124772t tVar = new C124772t(this);
        C60856cj.m92911t(b, C47810es.m84974n(tVar), this.f344192c.f344196b);
    }

    /* renamed from: d */
    public final synchronized C60870cx mo106607d(C66607ce ceVar) {
        if (this.f344193d) {
            C59104x b = C124774v.f344195a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "BistoSearchService");
            ((C59052c) ((C59052c) b).mo56372aa(36292)).mo56386p("Adding auth token to initial S3 request.");
            this.f344193d = false;
            return this.f344192c.f344199e.mo106604a(ceVar);
        }
        return C60856cj.m92900i(ceVar);
    }
}
