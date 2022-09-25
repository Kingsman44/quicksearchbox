package com.google.android.apps.gsa.staticplugins.opa.p8360e.p8361a;

import com.google.android.apps.gsa.assistant.shared.bm;
import com.google.android.apps.gsa.p8852u.C118569b;
import com.google.android.apps.gsa.p8852u.C118575h;
import com.google.android.apps.gsa.p8885y.C118827a;
import com.google.android.apps.gsa.p8885y.p8886a.C118831d;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90035cn;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.shared.util.p7159c.p7160a.C90851k;
import com.google.android.apps.gsa.staticplugins.opa.tapas.framework.C112002j;
import com.google.android.apps.gsa.staticplugins.opa.tapas.framework.p8533a.C111804l;
import com.google.android.apps.gsa.staticplugins.opa.tapas.framework.p8533a.C111805m;
import com.google.android.apps.gsa.staticplugins.opa.tapas.framework.p8533a.C111806n;
import com.google.android.apps.gsa.staticplugins.opa.tapas.framework.p8534b.p8535a.C111837a;
import com.google.android.apps.gsa.staticplugins.opa.tapas.framework.p8534b.p8535a.C111840d;
import com.google.android.apps.gsa.staticplugins.opa.tapas.framework.p8534b.p8535a.C111841e;
import com.google.android.apps.gsa.staticplugins.opa.tapas.framework.p8534b.p8535a.C111844h;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8491c.p8492a.C111255r;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8572q.C113190cu;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113404eo;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113405ep;
import com.google.android.libraries.assistant.p1594s.p1597b.C19159at;
import com.google.android.libraries.assistant.p1594s.p1597b.C19160au;
import com.google.android.libraries.assistant.p1594s.p1597b.C19162aw;
import com.google.android.libraries.assistant.p1594s.p1597b.C19167ba;
import com.google.android.libraries.assistant.p1594s.p1597b.C19169bc;
import com.google.android.libraries.assistant.p1594s.p1597b.C19171be;
import com.google.android.libraries.assistant.p1594s.p1597b.C19179g;
import com.google.android.libraries.assistant.p1594s.p1597b.C19184l;
import com.google.android.libraries.assistant.p1594s.p1597b.C19185m;
import com.google.android.libraries.assistant.p1594s.p1597b.C19186n;
import com.google.android.libraries.assistant.p1594s.p1597b.C19187o;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.assistant.p3781ad.p3789d.p3791b.C48674ai;
import com.google.assistant.p3897e.p3917i.p3918a.C51331dt;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import dagger.C68214a;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import p3186j$.util.Optional;
import p5488io.grpc.Status;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.e.a.b */
/* compiled from: PG */
public final class C108795b extends C19179g {

    /* renamed from: a */
    public static final C59071e f302525a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.e.a.b");

    /* renamed from: b */
    public final C21370a f302526b;

    /* renamed from: c */
    public final C118831d f302527c;

    /* renamed from: d */
    private final C68214a f302528d;

    /* renamed from: e */
    private final C113190cu f302529e;

    /* renamed from: f */
    private final boolean f302530f;

    /* renamed from: g */
    private final Executor f302531g;

    /* renamed from: h */
    private final C68214a f302532h;

    /* renamed from: i */
    private final Optional f302533i;

    /* renamed from: j */
    private final Optional f302534j;

    /* renamed from: k */
    private final AtomicBoolean f302535k = new AtomicBoolean(false);

    public C108795b(C68214a aVar, C21370a aVar2, C68214a aVar3, C86124t tVar, C113190cu cuVar, C90851k kVar, C68214a aVar4) {
        this.f302528d = aVar;
        this.f302526b = aVar2;
        this.f302532h = aVar4;
        this.f302527c = ((C118827a) aVar3.mo27525b()).mo77944g(C118569b.TAPAS_BLUE_CHIP_SERVICE_FETCH_LATENCY_MILLIS, C118575h.GRAPH_TAPAS_SUGGESTION_FETCH);
        this.f302529e = cuVar;
        boolean e = tVar.mo79746e(C90035cn.f248380e);
        this.f302530f = e;
        this.f302533i = m180950e(aVar3, C118569b.TAPAS_GEMINI_GRPC_SETUP_LATENCY_MILLIS, e);
        this.f302534j = m180950e(aVar3, C118569b.TAPAS_GEMINI_GRPC_TRANSIT_LATENCY_MILLIS, e);
        this.f302531g = kVar.mo85210c("lightweightExecutor");
    }

    /* renamed from: e */
    private static Optional m180950e(C68214a aVar, C118569b bVar, boolean z) {
        if (z) {
            return Optional.m71637of(((C118827a) aVar.mo27525b()).mo77944g(bVar, C118575h.GRAPH_TAPAS_SUGGESTION_FETCH));
        }
        return Optional.empty();
    }

    /* renamed from: f */
    private final void m180951f(long j) {
        long c = this.f302526b.mo26871c() - j;
        if (j == 0) {
            C59104x d = f302525a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "AsstTapasServiceImpl");
            ((C59052c) ((C59052c) d).mo56372aa(23831)).mo56386p("Client needs to set timestamp.");
        } else if (this.f302535k.get()) {
            if (this.f302530f && this.f302534j.isPresent()) {
                ((C118831d) this.f302534j.get()).mo104025g(c);
            }
            C58976aa aaVar = C58975e.f156826a;
        } else {
            this.f302535k.set(true);
            if (this.f302530f && this.f302533i.isPresent()) {
                ((C118831d) this.f302533i.get()).mo104025g(c);
            }
            C58976aa aaVar2 = C58975e.f156826a;
        }
    }

    /* renamed from: b */
    public final void mo24310b(C19185m mVar, C70862aj ajVar) {
        if ((mVar.f53725a & 1) != 0) {
            int a = C19184l.m36586a(mVar.f53726b);
            if (a == 0) {
                a = 1;
            }
            C58976aa aaVar = C58975e.f156826a;
            if (a == 2) {
                m180951f(mVar.f53728d);
                if ((mVar.f53725a & 2) != 0) {
                    C111844h hVar = (C111844h) this.f302528d.mo27525b();
                    C19167ba baVar = mVar.f53727c;
                    if (baVar == null) {
                        baVar = C19167ba.f53673s;
                    }
                    hVar.f310815b.mo28212l("active tapas engine", new C111840d(hVar, baVar));
                }
                C19186n nVar = (C19186n) C19187o.f53730c.createBuilder();
                nVar.copyOnWrite();
                C19187o oVar = (C19187o) nVar.instance;
                oVar.f53732a |= 1;
                oVar.f53733b = true;
                ajVar.mo20123c((C19187o) nVar.build());
            } else if (a == 3) {
                this.f302535k.set(false);
                if ((mVar.f53725a & 2) != 0) {
                    C111844h hVar2 = (C111844h) this.f302528d.mo27525b();
                    C19167ba baVar2 = mVar.f53727c;
                    if (baVar2 == null) {
                        baVar2 = C19167ba.f53673s;
                    }
                    hVar2.f310815b.mo28212l("drive LifecycleOwner and TapasLifecycleController state", new C111841e(hVar2));
                    if (!hVar2.f310818e.isPresent()) {
                        C59104x d = C111844h.f310814a.mo56226d();
                        d.mo56378ag(C58975e.f156826a, "TapasEngineController");
                        ((C59052c) ((C59052c) d).mo56372aa(27446)).mo56386p("TapasEngine unavailable in cleanup, please turn on Tapas feature flag.");
                    } else {
                        ((C112002j) hVar2.f310818e.get()).mo99259c(baVar2);
                    }
                }
                C19186n nVar2 = (C19186n) C19187o.f53730c.createBuilder();
                nVar2.copyOnWrite();
                C19187o oVar2 = (C19187o) nVar2.instance;
                oVar2.f53732a |= 1;
                oVar2.f53733b = true;
                ajVar.mo20123c((C19187o) nVar2.build());
            } else {
                this.f302535k.set(false);
                ajVar.mo20122b(Status.f186914l.asException());
            }
        }
        ajVar.mo20121a();
    }

    /* renamed from: c */
    public final void mo24311c(C19169bc bcVar, C70862aj ajVar) {
        C48674ai aiVar;
        C60870cx cxVar;
        m180951f(bcVar.f53698f);
        if ((bcVar.f53693a & 1) != 0) {
            C113190cu cuVar = this.f302529e;
            String str = bcVar.f53694b;
            C19167ba baVar = bcVar.f53697e;
            if (baVar == null) {
                baVar = C19167ba.f53673s;
            }
            C51331dt dtVar = C51331dt.FULLY_TRUSTED;
            if ((bcVar.f53693a & 8) != 0) {
                aiVar = C48674ai.m85261a(bcVar.f53696d);
                if (aiVar == null) {
                    aiVar = C48674ai.UNKNOWN;
                }
            } else {
                aiVar = C48674ai.UNKNOWN;
            }
            C113404eo e = cuVar.mo99904b(str, baVar, dtVar, aiVar).mo100001a().mo100020e();
            if ((bcVar.f53693a & 2) != 0) {
                e.mo100006f((long) bcVar.f53695c);
            }
            C113405ep a = e.mo100001a();
            C111844h hVar = (C111844h) this.f302528d.mo27525b();
            if (!hVar.f310818e.isPresent() || !hVar.f310819f.isPresent()) {
                C59104x d = C111844h.f310814a.mo56226d();
                d.mo56378ag(C58975e.f156826a, "TapasEngineController");
                ((C59052c) ((C59052c) d).mo56372aa(27442)).mo56386p("TapasEngine unavailable, please turn on Tapas feature flag.");
                cxVar = C60856cj.m92900i(C58485gu.m89845m());
            } else {
                cxVar = hVar.f310816c.mo28210j(((C112002j) hVar.f310818e.get()).mo99257a(a), "convert suggestions", new C111837a(hVar, a));
                if (hVar.f310821h) {
                    C111806n nVar = (C111806n) hVar.f310820g.mo27525b();
                    C111255r rVar = C111255r.BLUECHIP;
                    String format = String.format("Receives response for prefix '%s'", new Object[]{a.mo100033p()});
                    long c = nVar.f310736b.mo26871c();
                    C22871g gVar = nVar.f310738d;
                    String str2 = rVar.f309593v;
                    new C90873ag(cxVar, gVar, "Log debug panel latency for ".concat(String.valueOf(str2)), new C111804l(nVar, rVar, format, c)).mo85223a(new C111805m(nVar, rVar));
                }
            }
            C60856cj.m92911t(cxVar, new C108794a(this, ajVar, a), this.f302531g);
            return;
        }
        C59104x d2 = f302525a.mo56226d();
        d2.mo56378ag(C58975e.f156826a, "AsstTapasServiceImpl");
        ((C59052c) ((C59052c) d2).mo56372aa(23828)).mo56386p("no query string is set");
        ajVar.mo20123c(C19171be.f53699b);
        ajVar.mo20121a();
    }

    /* renamed from: d */
    public final void mo24312d(C19159at atVar, C70862aj ajVar) {
        m180951f(atVar.f53657a);
        if (!((bm) this.f302532h.mo27525b()).u() || !((bm) this.f302532h.mo27525b()).w()) {
            C19160au auVar = (C19160au) C19162aw.f53660d.createBuilder();
            auVar.copyOnWrite();
            C19162aw awVar = (C19162aw) auVar.instance;
            awVar.f53662a |= 1;
            awVar.f53663b = false;
            auVar.copyOnWrite();
            C19162aw awVar2 = (C19162aw) auVar.instance;
            awVar2.f53664c = 1;
            awVar2.f53662a |= 2;
            ajVar.mo20123c((C19162aw) auVar.build());
        } else {
            C19160au auVar2 = (C19160au) C19162aw.f53660d.createBuilder();
            auVar2.copyOnWrite();
            C19162aw awVar3 = (C19162aw) auVar2.instance;
            awVar3.f53662a |= 1;
            awVar3.f53663b = true;
            ajVar.mo20123c((C19162aw) auVar2.build());
        }
        ajVar.mo20121a();
    }
}
