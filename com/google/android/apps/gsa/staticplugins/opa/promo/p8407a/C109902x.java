package com.google.android.apps.gsa.staticplugins.opa.promo.p8407a;

import com.google.android.apps.gsa.p8852u.C118569b;
import com.google.android.apps.gsa.p8852u.C118575h;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.p8885y.C118827a;
import com.google.android.apps.gsa.p8885y.C118837d;
import com.google.android.apps.gsa.p8885y.p8886a.C118831d;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90037cp;
import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.shared.util.debug.p7166b.C91018d;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.staticplugins.opa.p8335be.C108013bm;
import com.google.android.apps.gsa.tasks.C118476ak;
import com.google.android.apps.gsa.tasks.C118549h;
import com.google.android.apps.gsa.tasks.C118561t;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import dagger.C68214a;
import p5488io.grpc.C70761fa;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.promo.a.x */
/* compiled from: PG */
public final class C109902x implements C118549h {

    /* renamed from: a */
    public static final C59071e f306224a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.promo.a.x");

    /* renamed from: b */
    public final C109894p f306225b;

    /* renamed from: c */
    public final C118561t f306226c;

    /* renamed from: d */
    public final C68214a f306227d;

    /* renamed from: e */
    public final C118827a f306228e;

    /* renamed from: f */
    public final C109889k f306229f;

    /* renamed from: g */
    private final C22871g f306230g;

    /* renamed from: h */
    private final C108013bm f306231h;

    /* renamed from: i */
    private final C86124t f306232i;

    public C109902x(C109894p pVar, C22871g gVar, C118561t tVar, C108013bm bmVar, C68214a aVar, C118827a aVar2, C109889k kVar, C86124t tVar2) {
        this.f306225b = pVar;
        this.f306230g = gVar;
        this.f306226c = tVar;
        this.f306231h = bmVar;
        this.f306227d = aVar;
        this.f306228e = aVar2;
        this.f306229f = kVar;
        this.f306232i = tVar2;
    }

    /* renamed from: a */
    public final C60870cx mo65234a(C118476ak akVar) {
        if (!this.f306232i.mo79746e(C90037cp.f248424aE)) {
            C59104x c = f306224a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "OpaAcqNotifRequestTask");
            ((C59052c) ((C59052c) c).mo56372aa(25480)).mo56386p("Feature flag disabled. Not making notification request.");
            return C118826c.f331423b;
        }
        C58976aa aaVar = C58975e.f156826a;
        C118831d g = this.f306228e.mo77944g(C118569b.OPA_ACQUISITION_NOTIFICATION_SERVER_RPC_RESPONSE_SUCCESS_LATENCY, C118575h.OPA_ACQUISITION_NOTIFICATION);
        C118831d g2 = this.f306228e.mo77944g(C118569b.OPA_ACQUISITION_NOTIFICATION_SERVER_RPC_FAILURE_LATENCY, C118575h.OPA_ACQUISITION_NOTIFICATION);
        long a = g.mo104019a();
        C60870cx u = this.f306231h.mo96364u();
        C60870cx z = this.f306231h.mo96369z();
        C60870cx h = C60922j.m93045h(C60856cj.m92893b(u, z).mo57334a(new C109895q(this, u, z), C60826bg.f164896a), new C109896r(this), C60826bg.f164896a);
        C90476a aVar = C91018d.f254254a;
        C90873ag agVar = new C90873ag(h, this.f306230g, "Response future has finished", new C109897s(this, g, a));
        agVar.mo85224b(IllegalStateException.class, new C109898t(this, g2, a));
        agVar.mo85224b(C70761fa.class, new C109899u(this, g2, a));
        agVar.mo85224b(RuntimeException.class, new C109900v(this, g2, a));
        agVar.mo85223a(new C109901w(this, g2, a));
        return C118826c.f331423b;
    }

    /* renamed from: b */
    public final void mo98226b(Exception exc, C118831d dVar, long j) {
        this.f306225b.mo98224a();
        C118837d.m197250d(dVar, j);
        C59104x c = f306224a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "OpaAcqNotifRequestTask");
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g(exc)).mo56372aa(25483)).mo56386p("Acquisition Notification gRPC failed");
    }
}
