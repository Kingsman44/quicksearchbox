package com.google.android.apps.gsa.sidekick.main.p7218m;

import com.google.android.apps.gsa.proactive.C84172h;
import com.google.android.apps.gsa.shared.util.C90772bp;
import com.google.android.apps.gsa.shared.util.p7158b.C90755l;
import com.google.android.apps.gsa.sidekick.main.p7200c.C91282g;
import com.google.android.apps.gsa.sidekick.main.p7203f.C91375e;
import com.google.android.apps.gsa.sidekick.main.p7203f.C91376f;
import com.google.android.apps.gsa.sidekick.main.p7203f.C91377g;
import com.google.android.apps.gsa.sidekick.main.p7203f.C91378h;
import com.google.android.apps.gsa.sidekick.main.p7225q.C91599f;
import com.google.android.apps.gsa.sidekick.shared.C91642a;
import com.google.android.apps.gsa.sidekick.shared.C91712d;
import com.google.android.apps.gsa.sidekick.shared.C91716e;
import com.google.android.apps.gsa.sidekick.shared.p7244m.C91763c;
import com.google.android.apps.p489g.C9296n;
import com.google.android.libraries.gsa.p1876k.C22862b;
import com.google.android.sidekick.shared.remoteapi.CardRenderingContext;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.p4566l.C60220t;
import com.google.common.util.concurrent.C60866ct;
import com.google.p375ai.p378b.C7642eo;
import com.google.p375ai.p378b.C7719hk;
import com.google.p375ai.p378b.C7720hl;
import com.google.p375ai.p378b.C7722hn;
import com.google.p375ai.p378b.C7726hr;
import com.google.p375ai.p378b.C7735i;
import com.google.p375ai.p378b.C7744ii;
import com.google.p375ai.p378b.C7762j;
import com.google.p375ai.p378b.C7799kj;
import com.google.p375ai.p378b.C7950pz;
import com.google.p375ai.p378b.C7952qa;
import com.google.p375ai.p378b.C7963ql;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62963cj;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C62974ct;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.sidekick.main.m.a */
/* compiled from: PG */
public final /* synthetic */ class C91462a implements C22862b {

    /* renamed from: a */
    public final /* synthetic */ C91467f f255110a;

    /* renamed from: b */
    public final /* synthetic */ C7799kj f255111b;

    /* renamed from: c */
    public final /* synthetic */ boolean f255112c;

    /* renamed from: d */
    public final /* synthetic */ C7642eo f255113d;

    /* renamed from: e */
    public final /* synthetic */ boolean f255114e;

    public /* synthetic */ C91462a(C91467f fVar, C7799kj kjVar, boolean z, C7642eo eoVar, boolean z2) {
        this.f255110a = fVar;
        this.f255111b = kjVar;
        this.f255112c = z;
        this.f255113d = eoVar;
        this.f255114e = z2;
    }

    /* renamed from: a */
    public final Object mo17947a() {
        C91466e eVar;
        C7735i iVar;
        C91467f fVar = this.f255110a;
        C7799kj kjVar = this.f255111b;
        boolean z = this.f255112c;
        C7642eo eoVar = this.f255113d;
        boolean z2 = this.f255114e;
        synchronized (fVar.f255127b) {
            eVar = (C91466e) fVar.f255131f.get(kjVar);
        }
        if (!z && eVar != null) {
            C7722hn hnVar = eVar.f255124a.f32270d;
            if (hnVar == null) {
                hnVar = C7722hn.f26993i;
            }
            if (fVar.mo85817c(hnVar)) {
                C59104x b = C91467f.f255126a.mo56224b();
                b.mo56378ag(C58975e.f156826a, "CachingSecondScreenInte");
                ((C59052c) ((C59052c) b).mo56372aa(11749)).mo56386p("Cache hit.");
                long b2 = fVar.f255130e.mo26870b();
                C91712d f = C91716e.m150235f();
                f.mo86017b(Math.max(0, b2 - eVar.f255124a.f32268b));
                f.mo86018c(eVar.f255125b);
                C9296n nVar = eVar.f255124a;
                if ((nVar.f32267a & 16) != 0) {
                    C60220t tVar = nVar.f32272f;
                    if (tVar == null) {
                        tVar = C60220t.f162931e;
                    }
                    ((C91642a) f).f255595c = tVar;
                }
                C9296n nVar2 = eVar.f255124a;
                if ((nVar2.f32267a & 4) != 0) {
                    C7722hn hnVar2 = nVar2.f32270d;
                    if (hnVar2 == null) {
                        hnVar2 = C7722hn.f26993i;
                    }
                    ((C91642a) f).f255593a = hnVar2;
                }
                return f.mo86016a();
            }
        }
        C91474m mVar = fVar.f255128c;
        C7719hk hkVar = (C7719hk) C7720hl.f26986e.createBuilder();
        hkVar.mo16939a(kjVar);
        C7720hl hlVar = (C7720hl) hkVar.build();
        if (z) {
            C58976aa aaVar = C58975e.f156826a;
        }
        C7950pz pzVar = (C7950pz) C91763c.m150327a(eoVar).toBuilder();
        pzVar.copyOnWrite();
        C7952qa qaVar = (C7952qa) pzVar.instance;
        qaVar.f27920a |= 1;
        qaVar.f27921b = z2;
        pzVar.copyOnWrite();
        C7952qa qaVar2 = (C7952qa) pzVar.instance;
        qaVar2.f27920a |= 65536;
        qaVar2.f27933n = z;
        pzVar.copyOnWrite();
        C7952qa qaVar3 = (C7952qa) pzVar.instance;
        hlVar.getClass();
        qaVar3.f27922c = hlVar;
        qaVar3.f27920a |= 4;
        C91377g f2 = C91378h.m149422f();
        f2.mo85672d(true);
        f2.mo85671c(true);
        C91378h a = f2.mo85669a();
        C91376f fVar2 = mVar.f255153b;
        C84172h hVar = mVar.f255155d;
        C7952qa qaVar4 = (C7952qa) pzVar.build();
        if (a.mo85676d()) {
            List a2 = C91599f.m149844a(hVar.f229119a.mo85960b());
            if ((qaVar4.f27920a & 8) != 0) {
                C7762j jVar = qaVar4.f27923d;
                if (jVar == null) {
                    jVar = C7762j.f27177h;
                }
                iVar = (C7735i) jVar.toBuilder();
            } else {
                iVar = (C7735i) C7762j.f27177h.createBuilder();
            }
            if (!a2.isEmpty()) {
                iVar.mo16954a(a2);
            }
            C7950pz pzVar2 = (C7950pz) qaVar4.toBuilder();
            pzVar2.copyOnWrite();
            C7952qa qaVar5 = (C7952qa) pzVar2.instance;
            C7762j jVar2 = (C7762j) iVar.build();
            jVar2.getClass();
            qaVar5.f27923d = jVar2;
            qaVar5.f27920a |= 8;
            qaVar4 = (C7952qa) pzVar2.build();
        }
        C91375e a3 = fVar2.mo85696a(qaVar4, a);
        CardRenderingContext b3 = CardRenderingContext.m80811b(C60866ct.f164955a);
        C7963ql qlVar = a3.f254946a;
        C7722hn hnVar3 = null;
        if (!(qlVar == null || (qlVar.f27971a & 1) == 0)) {
            C7722hn hnVar4 = qlVar.f27972b;
            if (hnVar4 == null) {
                hnVar4 = C7722hn.f26993i;
            }
            if (hnVar4.f26996b.size() != 0) {
                C91282g gVar = mVar.f255154c;
                C62963cj cjVar = new C62963cj(((C7744ii) hnVar4.f26996b.get(0)).f27062g, C7744ii.f27053h);
                C7726hr hrVar = ((C7744ii) hnVar4.f26996b.get(0)).f27057b;
                if (hrVar == null) {
                    hrVar = C7726hr.f27008i;
                }
                C62971cq cqVar = hrVar.f27012c;
                gVar.mo85557b(b3, cjVar);
                gVar.mo85558c(b3, cqVar);
                hnVar3 = hnVar4;
            }
        }
        C91712d f3 = C91716e.m150235f();
        C91642a aVar = (C91642a) f3;
        aVar.f255594b = b3;
        byte[] bArr = a3.f254948c;
        if (bArr != null) {
            try {
                ((C91642a) f3).f255595c = (C60220t) C62942bv.parseFrom((C62942bv) C60220t.f162931e, bArr);
            } catch (C62974ct e) {
                C59104x c = C91474m.f255152a.mo56225c();
                c.mo56378ag(C58975e.f156826a, "SecondScreenRequestSend");
                ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(11754)).mo56386p("EventId is not parseable");
            }
        }
        if (hnVar3 != null) {
            aVar.f255593a = hnVar3;
        }
        C91716e a4 = f3.mo86016a();
        if (a4.mo86028e() != null) {
            C59104x b4 = C91467f.f255126a.mo56224b();
            b4.mo56378ag(C58975e.f156826a, "CachingSecondScreenInte");
            ((C59052c) ((C59052c) b4).mo56372aa(11748)).mo56386p("Successful network response.");
            C7722hn e2 = a4.mo86028e();
            if (e2 != null) {
                CardRenderingContext c2 = a4.mo86026c();
                try {
                    fVar.f255129d.d(new C91465d(fVar, kjVar, c2, a4.mo86027d(), e2, fVar.f255130e.mo26870b(), C90772bp.m148289P(c2)));
                } catch (RuntimeException e3) {
                    C59104x d = C91467f.f255126a.mo56226d();
                    d.mo56378ag(C58975e.f156826a, "CachingSecondScreenInte");
                    ((C59052c) ((C59052c) ((C59052c) d).mo56382g(e3)).mo56372aa(11750)).mo56386p("Error marshalling CardRenderingContext");
                    int i = C90755l.f253831a;
                }
            }
            return a4.mo86025b().mo86016a();
        } else if (eVar != null) {
            C59104x b5 = C91467f.f255126a.mo56224b();
            b5.mo56378ag(C58975e.f156826a, "CachingSecondScreenInte");
            ((C59052c) ((C59052c) b5).mo56372aa(11747)).mo56386p("Cache hit (expired).");
            long b6 = fVar.f255130e.mo26870b();
            C91712d b7 = a4.mo86025b();
            C7722hn hnVar5 = eVar.f255124a.f32270d;
            if (hnVar5 == null) {
                hnVar5 = C7722hn.f26993i;
            }
            b7.mo86019d(hnVar5);
            b7.mo86017b(Math.max(0, b6 - eVar.f255124a.f32268b));
            C9296n nVar3 = eVar.f255124a;
            if ((nVar3.f32267a & 16) != 0) {
                C60220t tVar2 = nVar3.f32272f;
                if (tVar2 == null) {
                    tVar2 = C60220t.f162931e;
                }
                b7.mo86020e(tVar2);
            }
            b7.mo86018c(eVar.f255125b);
            return b7.mo86016a();
        } else {
            C59104x c3 = C91467f.f255126a.mo56225c();
            c3.mo56378ag(C58975e.f156826a, "CachingSecondScreenInte");
            ((C59052c) ((C59052c) c3).mo56372aa(11746)).mo56386p("No content found for SecondScreen.");
            return a4.mo86025b().mo86016a();
        }
    }
}
