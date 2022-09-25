package com.google.android.apps.gsa.p8839t.p8847h;

import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.staticplugins.p7684cn.C98043e;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.performance.primes.C31164au;
import com.google.android.libraries.performance.primes.metrics.p2415i.C31520m;
import com.google.assistant.p3994s.p3995a.C53306j;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71207aq;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71208ar;

/* renamed from: com.google.android.apps.gsa.t.h.k */
/* compiled from: PG */
public final class C118435k {

    /* renamed from: a */
    private static final C59071e f328735a = C59071e.m91332i("com.google.android.apps.gsa.t.h.k");

    /* renamed from: b */
    private final C58833ax f328736b;

    /* renamed from: c */
    private final C22871g f328737c;

    public C118435k(C58833ax axVar, C22871g gVar) {
        this.f328736b = axVar;
        this.f328737c = gVar;
    }

    /* renamed from: a */
    public final C58833ax mo103698a() {
        C58976aa aaVar = C58975e.f156826a;
        if (this.f328736b.mo56113h()) {
            return C58833ax.m90833j(((C98043e) this.f328736b.mo56107c()).f273769a.mo36912c());
        }
        C59104x d = f328735a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "PCP.LoggingUtils");
        ((C59052c) ((C59052c) d).mo56372aa(6955)).mo56386p("#startTimer(): primesWrapper not presented!");
        return C58836b.f156633a;
    }

    /* renamed from: b */
    public final void mo103699b(C60870cx cxVar, C58833ax axVar, C71207aq aqVar, C53306j jVar, C31164au auVar) {
        C58833ax axVar2 = axVar;
        C71207aq aqVar2 = aqVar;
        C53306j jVar2 = jVar;
        C31164au auVar2 = auVar;
        new C90873ag(cxVar, this.f328737c, "Log Primes Timer end event", new C118428d(this, axVar2, aqVar2, jVar2, auVar2)).mo85223a(new C118429e(this, axVar2, aqVar2, jVar2, auVar2));
    }

    /* renamed from: c */
    public final void mo103700c(C60870cx cxVar, C58833ax axVar, C71208ar arVar, C53306j jVar, C31164au auVar) {
        C71208ar arVar2 = arVar;
        C58833ax axVar2 = axVar;
        C53306j jVar2 = jVar;
        C31164au auVar2 = auVar;
        new C90873ag(cxVar, this.f328737c, "Log Primes Timer end event with on-device media status code", new C118430f(this, arVar2, axVar2, jVar2, auVar2)).mo85223a(new C118431g(this, arVar2, axVar2, jVar2, auVar2));
    }

    /* renamed from: d */
    public final void mo103701d(C60870cx cxVar, C58833ax axVar, C71208ar arVar, C53306j jVar, C31164au auVar) {
        C71208ar arVar2 = arVar;
        C58833ax axVar2 = axVar;
        C53306j jVar2 = jVar;
        C31164au auVar2 = auVar;
        new C90873ag(cxVar, this.f328737c, "Log Primes Timer end event for Potter with on-device media status code and quantity", new C118432h(this, arVar2, axVar2, jVar2, auVar2)).mo85223a(new C118433i(this, arVar2, axVar2, jVar2, auVar2));
    }

    /* renamed from: e */
    public final void mo103702e(C58833ax axVar, C71207aq aqVar, int i, C53306j jVar, C31164au auVar) {
        if (!this.f328736b.mo56113h()) {
            C59104x d = f328735a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "PCP.LoggingUtils");
            ((C59052c) ((C59052c) d).mo56372aa(6960)).mo56386p("#stopTimer(): primesWrapper not presented!");
        } else if (!axVar.mo56113h()) {
            C59104x d2 = f328735a.mo56226d();
            d2.mo56378ag(C58975e.f156826a, "PCP.LoggingUtils");
            ((C59052c) ((C59052c) d2).mo56372aa(6959)).mo56386p("timerEventOptional is not present!");
        } else {
            C31164au a = C31164au.m58091a(auVar, C31164au.m58093c((String) null, jVar));
            ((C98043e) this.f328736b.mo56107c()).f273769a.mo36919k((C31520m) axVar.mo56107c(), a, aqVar, i);
        }
    }
}
