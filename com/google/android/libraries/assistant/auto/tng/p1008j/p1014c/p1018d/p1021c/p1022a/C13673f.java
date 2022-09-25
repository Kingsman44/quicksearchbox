package com.google.android.libraries.assistant.auto.tng.p1008j.p1014c.p1018d.p1021c.p1022a;

import com.google.android.gms.car.C143118bb;
import com.google.android.libraries.assistant.auto.tng.p1008j.p1009a.p1011b.C13641b;
import com.google.android.libraries.assistant.auto.tng.p1008j.p1014c.C13690f;
import com.google.android.libraries.assistant.auto.tng.p1008j.p1014c.C13697j;
import com.google.android.libraries.assistant.auto.tng.p1008j.p1014c.C13703p;
import com.google.android.libraries.assistant.auto.tng.p1008j.p1014c.C13705r;
import com.google.android.libraries.assistant.auto.tng.p1008j.p1014c.C13706s;
import com.google.android.libraries.assistant.auto.tng.p1008j.p1014c.C13707t;
import com.google.android.libraries.assistant.auto.tng.p1008j.p1014c.p1016b.C13651a;
import com.google.android.libraries.assistant.auto.tng.p1008j.p1014c.p1018d.p1019a.C13660a;
import com.google.android.libraries.assistant.auto.tng.p1008j.p1014c.p1023e.C13684c;
import com.google.android.libraries.assistant.auto.tng.p1008j.p1014c.p1023e.C13686e;
import com.google.android.libraries.assistant.auto.tng.p1008j.p1014c.p1023e.C13687f;
import com.google.android.libraries.assistant.auto.tng.p1008j.p1014c.p1023e.C13688g;
import com.google.android.libraries.assistant.auto.tng.p1008j.p1025d.C13709a;
import com.google.android.libraries.assistant.pcp.p1557g.C18767f;
import com.google.android.libraries.assistant.pcp.p1557g.C18768g;
import com.google.android.libraries.assistant.pcp.p1557g.C18770i;
import com.google.android.libraries.assistant.pcp.p1557g.p1560b.C18715g;
import com.google.android.libraries.assistant.pcp.p1557g.p1560b.C18717i;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3994s.p3995a.C53306j;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;
import java.util.Map;
import java.util.concurrent.Executor;
import p3186j$.util.Map;
import p3186j$.util.Objects;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.auto.tng.j.c.d.c.a.f */
/* compiled from: PG */
public final class C13673f implements C13668a {

    /* renamed from: a */
    public static final C59071e f41726a = C59071e.m91332i("com.google.android.libraries.assistant.auto.tng.j.c.d.c.a.f");

    /* renamed from: b */
    public final C13660a f41727b;

    /* renamed from: c */
    public final C13675h f41728c;

    /* renamed from: d */
    public final Executor f41729d;

    /* renamed from: e */
    private final C13709a f41730e;

    /* renamed from: f */
    private final Map f41731f;

    /* renamed from: g */
    private final C18768g f41732g;

    /* renamed from: h */
    private final C13688g f41733h;

    public C13673f(C13709a aVar, C13660a aVar2, C13675h hVar, C13688g gVar, Map map, C18768g gVar2, Executor executor) {
        this.f41730e = aVar;
        this.f41727b = aVar2;
        this.f41728c = hVar;
        this.f41731f = map;
        this.f41732g = gVar2;
        this.f41729d = executor;
        this.f41733h = gVar;
    }

    /* renamed from: a */
    public final void mo21207a(byte[] bArr) {
        C13703p pVar;
        C13697j jVar;
        C13697j jVar2;
        C13690f fVar;
        C13707t tVar;
        C13684c a;
        C58976aa aaVar = C58975e.f156826a;
        if (bArr.length == 0) {
            C59104x c = f41726a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "ProjectedVecTransport");
            ((C59052c) ((C59052c) c).mo56372aa(44920)).mo56386p("Bytes received are null or have length zero.");
            return;
        }
        try {
            C13705r rVar = (C13705r) C62942bv.parseFrom((C62942bv) C13705r.f41801c, bArr, C62921ba.m95368a());
            int i = rVar.f41803a;
            int i2 = 0;
            int i3 = i != 0 ? i != 1 ? i != 2 ? 0 : 2 : 1 : 3;
            int i4 = i3 - 1;
            if (i3 == 0) {
                throw null;
            } else if (i4 == 0) {
                if (i == 1) {
                    pVar = (C13703p) rVar.f41804b;
                } else {
                    pVar = C13703p.f41793f;
                }
                if ((pVar.f41795a & 2) != 0) {
                    C13675h hVar = this.f41728c;
                    C13706s sVar = (C13706s) C13707t.f41806h.createBuilder();
                    String str = pVar.f41799e;
                    sVar.copyOnWrite();
                    C13707t tVar2 = (C13707t) sVar.instance;
                    str.getClass();
                    tVar2.f41808a |= 2;
                    tVar2.f41812e = str;
                    hVar.mo21213c((C13707t) sVar.build());
                }
                int i5 = pVar.f41796b;
                if (i5 == 0) {
                    i2 = 6;
                } else if (i5 == 7) {
                    i2 = 5;
                } else if (i5 == 2) {
                    i2 = 1;
                } else if (i5 == 3) {
                    i2 = 2;
                } else if (i5 == 4) {
                    i2 = 3;
                } else if (i5 == 5) {
                    i2 = 4;
                }
                int i6 = i2 - 1;
                if (i2 == 0) {
                    throw null;
                } else if (i6 == 0) {
                    if (i5 == 2) {
                        jVar = (C13697j) pVar.f41797c;
                    } else {
                        jVar = C13697j.f41785c;
                    }
                    if ((jVar.f41787a & 1) != 0) {
                        C13709a aVar = this.f41730e;
                        if (pVar.f41796b == 2) {
                            jVar2 = (C13697j) pVar.f41797c;
                        } else {
                            jVar2 = C13697j.f41785c;
                        }
                        C13641b bVar = jVar2.f41788b;
                        if (bVar == null) {
                            bVar = C13641b.f41678d;
                        }
                        aVar.mo21228b(bVar);
                        return;
                    }
                    C59104x d = f41726a.mo56226d();
                    d.mo56378ag(C58975e.f156826a, "ProjectedVecTransport");
                    ((C59052c) ((C59052c) d).mo56372aa(44929)).mo56386p("No AutoHotwordArbitratorProto is provided with UnifiedAutoAssistantRequest.");
                } else if (i6 == 1) {
                } else {
                    if (i6 != 3) {
                        C59104x d2 = f41726a.mo56226d();
                        d2.mo56378ag(C58975e.f156826a, "ProjectedVecTransport");
                        ((C59052c) ((C59052c) d2).mo56372aa(44928)).mo56386p("Unexpected UnifiedAutoAssistantRequest case.");
                        return;
                    }
                    Map map = this.f41731f;
                    if (i5 == 5) {
                        fVar = (C13690f) pVar.f41797c;
                    } else {
                        fVar = C13690f.f41773c;
                    }
                    C13651a aVar2 = (C13651a) map.get(fVar.getClass());
                    if (aVar2 == null) {
                        C59104x d3 = f41726a.mo56226d();
                        d3.mo56378ag(C58975e.f156826a, "ProjectedVecTransport");
                        ((C59052c) ((C59052c) d3).mo56372aa(44925)).mo56386p("Failed to find request handler for ClientOpDelegationRequest");
                        return;
                    }
                    C60856cj.m92911t(aVar2.mo21203a(pVar), C47810es.m84974n(new C13672e(this, pVar)), this.f41729d);
                }
            } else if (i4 != 1) {
                try {
                    C62921ba a2 = C62921ba.m95368a();
                    C13641b bVar2 = C13641b.f41678d;
                    this.f41730e.mo21228b((C13641b) C62942bv.parseFrom((C62942bv) C13641b.f41678d, bArr, a2));
                } catch (C62974ct e) {
                    C59104x d4 = f41726a.mo56226d();
                    d4.mo56378ag(C58975e.f156826a, "ProjectedVecTransport");
                    ((C59052c) ((C59052c) ((C59052c) d4).mo56382g(e)).mo56372aa(44923)).mo56386p("Unexpected request-response type.");
                }
            } else {
                if (i == 2) {
                    tVar = (C13707t) rVar.f41804b;
                } else {
                    tVar = C13707t.f41806h;
                }
                C13688g gVar = this.f41733h;
                if ((tVar.f41808a & 2) != 0 && (a = gVar.mo21221a(tVar.f41812e)) != null) {
                    if (!tVar.f41813f) {
                        C59104x b = C13684c.f41754a.mo56224b();
                        b.mo56378ag(C58975e.f156826a, "UAARequestCompleter");
                        ((C59052c) ((C59052c) b).mo56372aa(44946)).mo56386p("#ack");
                        a.mo21218a();
                        return;
                    }
                    a.mo21219b(tVar);
                }
            }
        } catch (C62974ct e2) {
            C59104x c2 = f41726a.mo56225c();
            c2.mo56378ag(C58975e.f156826a, "ProjectedVecTransport");
            ((C59052c) ((C59052c) ((C59052c) c2).mo56382g(e2)).mo56372aa(44924)).mo56386p("Failed to parse unified assistant request.");
        }
    }

    /* renamed from: b */
    public final void mo21208b(C143118bb bbVar) {
        C58976aa aaVar = C58975e.f156826a;
        this.f41730e.mo21227a(true);
        this.f41727b.f41710a.set(Optional.ofNullable(bbVar));
        C13688g gVar = this.f41733h;
        C13675h hVar = this.f41728c;
        Objects.requireNonNull(hVar);
        C13669b bVar = new C13669b(hVar);
        C59104x b = C13688g.f41768a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "UAAReqResManager");
        ((C59052c) ((C59052c) b).mo56372aa(44961)).mo56386p("#registerDataSender");
        gVar.f41772e = bVar;
        Map.EL.forEach(gVar.f41769b, new C13687f(gVar));
        C60870cx a = new C18767f(this.f41732g, C58485gu.m89846n(new C18770i(C18717i.f52795a, C53306j.AUTO_PROJECTED))).mo24114a(C18715g.f52793a);
        C13670c cVar = new C13670c(this);
        C46459k.m82829b(C60922j.m93045h(a, C47810es.m84966f(cVar), this.f41729d), "Error on getting CapabilitySharingRequest.", new Object[0]);
    }

    /* renamed from: c */
    public final void mo21209c() {
        C58976aa aaVar = C58975e.f156826a;
        this.f41730e.mo21227a(false);
        C13688g gVar = this.f41733h;
        C59104x b = C13688g.f41768a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "UAAReqResManager");
        ((C59052c) ((C59052c) b).mo56372aa(44963)).mo56386p("#unregister");
        Map.EL.forEach(gVar.f41769b, C13686e.f41766a);
        gVar.f41769b.clear();
        gVar.f41772e = null;
        C13660a aVar = this.f41727b;
        aVar.f41711b.set(false);
        aVar.f41710a.set(Optional.empty());
    }
}
