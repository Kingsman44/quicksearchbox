package com.google.android.apps.search.assistant.platform.p9005b.p9041d.p9042a;

import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119807bb;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119808bc;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119810be;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119824bs;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119834cb;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119836cd;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119847co;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119848cp;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119850cr;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119851cs;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119860da;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119862dc;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119863dd;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119870dk;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119874do;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119893l;
import com.google.android.apps.search.assistant.platform.p9080f.p9109g.C120690e;
import com.google.android.apps.search.assistant.platform.p9080f.p9109g.C120691f;
import com.google.android.apps.search.assistant.platform.p9080f.p9109g.C120692g;
import com.google.android.apps.search.assistant.platform.p9080f.p9109g.C120693h;
import com.google.android.apps.search.assistant.platform.p9080f.p9109g.C120695j;
import com.google.android.apps.search.assistant.platform.p9080f.p9109g.C120702q;
import com.google.android.apps.search.assistant.platform.p9080f.p9109g.C120703r;
import com.google.android.apps.search.assistant.platform.p9080f.p9123l.C120809b;
import com.google.android.apps.search.assistant.platform.p9080f.p9123l.C120811d;
import com.google.android.apps.search.assistant.platform.p9080f.p9123l.C120812e;
import com.google.android.apps.search.assistant.platform.p9080f.p9123l.C120813f;
import com.google.android.libraries.assistant.hotword.p1516b.C18343b;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34053bp;
import com.google.android.libraries.search.assistant.p2511d.p2512a.C32512e;
import com.google.android.libraries.search.assistant.p2511d.p2512a.C32524q;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32849cq;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3897e.p3921j.C51805du;
import com.google.assistant.p3897e.p3921j.C52077ej;
import com.google.assistant.p3897e.p3921j.C52078ek;
import com.google.assistant.p3897e.p3921j.C52082eo;
import com.google.assistant.p3897e.p3921j.C52083ep;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import p5488io.grpc.Status;

/* renamed from: com.google.android.apps.search.assistant.platform.b.d.a.m */
/* compiled from: PG */
final class C119999m implements C32524q {

    /* renamed from: a */
    final /* synthetic */ C119987bn f334131a;

    /* renamed from: b */
    final /* synthetic */ C119996j f334132b;

    public C119999m(C119987bn bnVar, C119996j jVar) {
        this.f334131a = bnVar;
        this.f334132b = jVar;
    }

    /* renamed from: a */
    public final /* synthetic */ C60870cx mo38124a(Object obj) {
        C119851cs csVar;
        C119850cr crVar;
        C119847co coVar;
        C119863dd ddVar;
        C119834cb cbVar;
        C119860da daVar;
        C119808bc bcVar = (C119808bc) obj;
        C119987bn bnVar = this.f334131a;
        C58976aa aaVar = C58975e.f156826a;
        C119807bb bbVar = C119807bb.START_INTERACTION;
        int ordinal = C119807bb.m198714a(bcVar.f333716a).ordinal();
        if (ordinal == 0) {
            if (bcVar.f333716a == 1) {
                csVar = (C119851cs) bcVar.f333717b;
            } else {
                csVar = C119851cs.f333803i;
            }
            int b = C119848cp.m198740b(csVar.f333806b);
            int i = b - 1;
            if (b == 0) {
                throw null;
            } else if (i == 0 || i == 1) {
                C119973bb bbVar2 = (C119973bb) bnVar.f334103b.mo27525b();
                C120690e eVar = (C120690e) C120691f.f335673d.createBuilder();
                C34053bp bpVar = csVar.f333808d;
                if (bpVar == null) {
                    bpVar = C34053bp.f90753a;
                }
                eVar.copyOnWrite();
                C120691f fVar = (C120691f) eVar.instance;
                bpVar.getClass();
                fVar.f335676b = bpVar;
                fVar.f335675a |= 1;
                if ((csVar.f333805a & 4) != 0) {
                    C32849cq cqVar = csVar.f333811g;
                    if (cqVar == null) {
                        cqVar = C32849cq.f88059c;
                    }
                    eVar.copyOnWrite();
                    C120691f fVar2 = (C120691f) eVar.instance;
                    cqVar.getClass();
                    fVar2.f335677c = cqVar;
                    fVar2.f335675a |= 2;
                }
                C120693h hVar = (C120693h) C120695j.f335679k.createBuilder();
                C119824bs bsVar = csVar.f333810f;
                if (bsVar == null) {
                    bsVar = C119824bs.f333739b;
                }
                hVar.copyOnWrite();
                C120695j jVar = (C120695j) hVar.instance;
                bsVar.getClass();
                jVar.f335688h = bsVar;
                jVar.f335681a |= 4;
                hVar.copyOnWrite();
                C120691f fVar3 = (C120691f) eVar.build();
                fVar3.getClass();
                ((C120695j) hVar.instance).f335686f = fVar3;
                boolean z = csVar.f333812h;
                hVar.copyOnWrite();
                C120695j jVar2 = (C120695j) hVar.instance;
                jVar2.f335681a |= 8;
                jVar2.f335689i = z;
                C119836cd cdVar = C119836cd.CLIENT;
                hVar.copyOnWrite();
                ((C120695j) hVar.instance).f335690j = cdVar.getNumber();
                if ((csVar.f333805a & 2) != 0) {
                    String str = csVar.f333809e;
                    hVar.copyOnWrite();
                    C120695j jVar3 = (C120695j) hVar.instance;
                    str.getClass();
                    jVar3.f335681a |= 2;
                    jVar3.f335687g = str;
                }
                int i2 = csVar.f333806b;
                int b2 = C119848cp.m198740b(i2);
                int i3 = b2 - 1;
                if (b2 == 0) {
                    throw null;
                } else if (i3 == 0) {
                    if (i2 == 2) {
                        crVar = (C119850cr) csVar.f333807c;
                    } else {
                        crVar = C119850cr.f333797d;
                    }
                    C120702q qVar = (C120702q) C120703r.f335705e.createBuilder();
                    C18343b bVar = crVar.f333800b;
                    if (bVar == null) {
                        bVar = C18343b.f52029d;
                    }
                    qVar.copyOnWrite();
                    C120703r rVar = (C120703r) qVar.instance;
                    bVar.getClass();
                    rVar.f335709c = bVar;
                    rVar.f335708b = 1;
                    if ((crVar.f333799a & 2) != 0) {
                        C119893l lVar = crVar.f333801c;
                        if (lVar == null) {
                            lVar = C119893l.f333893e;
                        }
                        qVar.copyOnWrite();
                        C120703r rVar2 = (C120703r) qVar.instance;
                        lVar.getClass();
                        rVar2.f335710d = lVar;
                        rVar2.f335707a |= 1;
                    }
                    C120692g gVar = bbVar2.f334084b;
                    hVar.copyOnWrite();
                    C120695j jVar4 = (C120695j) hVar.instance;
                    C120703r rVar3 = (C120703r) qVar.build();
                    rVar3.getClass();
                    jVar4.f335683c = rVar3;
                    jVar4.f335682b = 2;
                    return C60922j.m93044g(gVar.mo104876a((C120695j) hVar.build()), C47810es.m84963c(C119968ay.f334078a), C60826bg.f164896a);
                } else if (i3 != 1) {
                    C59104x c = C119973bb.f334083a.mo56225c();
                    c.mo56378ag(C58975e.f156826a, "ConvEngine.ClientInteraction");
                    C59052c cVar = (C59052c) ((C59052c) c).mo56372aa(34622);
                    int b3 = C119848cp.m198740b(csVar.f333806b);
                    String a = C119848cp.m198739a(b3);
                    if (b3 != 0) {
                        cVar.mo56389s("Received unsupported TypeCase in startInteraction: %s", a);
                        return C60856cj.m92899h(Status.f186906d.withDescription("Unsupported type in InteractionStartRequest").asException());
                    }
                    throw null;
                } else {
                    if (i2 == 3) {
                        coVar = (C119847co) csVar.f333807c;
                    } else {
                        coVar = C119847co.f333794b;
                    }
                    C51805du duVar = coVar.f333796a;
                    if (duVar == null) {
                        duVar = C51805du.f135924e;
                    }
                    C120812e eVar2 = (C120812e) C120813f.f335969b.createBuilder();
                    C52082eo eoVar = (C52082eo) C52083ep.f136689f.createBuilder();
                    C52077ej ejVar = (C52077ej) C52078ek.f136671f.createBuilder();
                    ejVar.copyOnWrite();
                    C52078ek ekVar = (C52078ek) ejVar.instance;
                    duVar.getClass();
                    ekVar.f136675c = duVar;
                    ekVar.f136674b = 5;
                    eoVar.copyOnWrite();
                    C52083ep epVar = (C52083ep) eoVar.instance;
                    C52078ek ekVar2 = (C52078ek) ejVar.build();
                    ekVar2.getClass();
                    epVar.f136693c = ekVar2;
                    epVar.f136692b = 3;
                    eVar2.copyOnWrite();
                    C120813f fVar4 = (C120813f) eVar2.instance;
                    C52083ep epVar2 = (C52083ep) eoVar.build();
                    epVar2.getClass();
                    fVar4.mo104939a();
                    fVar4.f335971a.add(epVar2);
                    C120813f fVar5 = (C120813f) eVar2.build();
                    C120692g gVar2 = bbVar2.f334084b;
                    C120809b bVar2 = (C120809b) C120811d.f335965c.createBuilder();
                    bVar2.copyOnWrite();
                    C120811d dVar = (C120811d) bVar2.instance;
                    fVar5.getClass();
                    dVar.f335968b = fVar5;
                    dVar.f335967a = 2;
                    hVar.copyOnWrite();
                    C120695j jVar5 = (C120695j) hVar.instance;
                    C120811d dVar2 = (C120811d) bVar2.build();
                    dVar2.getClass();
                    jVar5.f335683c = dVar2;
                    jVar5.f335682b = 3;
                    return C60922j.m93044g(gVar2.mo104876a((C120695j) hVar.build()), C47810es.m84963c(C119968ay.f334078a), C60826bg.f164896a);
                }
            } else {
                C59104x c2 = C119987bn.f334102a.mo56225c();
                c2.mo56378ag(C58975e.f156826a, "ConvEngine.ClientInteraction");
                C59052c cVar2 = (C59052c) ((C59052c) c2).mo56372aa(34632);
                int b4 = C119848cp.m198740b(csVar.f333806b);
                String a2 = C119848cp.m198739a(b4);
                if (b4 != 0) {
                    cVar2.mo56389s("#handleStartInteraction: received unsupported TypeCase in handleStartInteraction: %s", a2);
                    return C60856cj.m92899h(Status.f186906d.withDescription("Unsupported type in InteractionStartRequest").asException());
                }
                throw null;
            }
        } else if (ordinal == 1) {
            if (bcVar.f333716a == 2) {
                ddVar = (C119863dd) bcVar.f333717b;
            } else {
                ddVar = C119863dd.f333821c;
            }
            int a3 = C119862dc.m198753a(ddVar.f333823a);
            int i4 = a3 - 1;
            if (a3 == 0) {
                throw null;
            } else if (i4 == 0) {
                ((C119973bb) bnVar.f334103b.mo27525b()).mo104593a(C119967ax.f334077a);
                return C60856cj.m92900i(C119810be.f333719c);
            } else if (i4 != 1) {
                C59104x c3 = C119987bn.f334102a.mo56225c();
                c3.mo56378ag(C58975e.f156826a, "ConvEngine.ClientInteraction");
                C59052c cVar3 = (C59052c) ((C59052c) c3).mo56372aa(34633);
                int a4 = C119862dc.m198753a(ddVar.f333823a);
                String str2 = a4 != 1 ? a4 != 2 ? a4 != 3 ? "null" : "TARGETINTERACTION_NOT_SET" : "INTERACTION_ID" : "CURRENTLY_RUNNING_INTERACTION";
                if (a4 != 0) {
                    cVar3.mo56389s("#handleStopInteraction: received unsupported TargetInteractionCase in handleStopInteraction: %s", str2);
                    return C60856cj.m92899h(new C119986bm());
                }
                throw null;
            } else {
                C119973bb bbVar3 = (C119973bb) bnVar.f334103b.mo27525b();
                if (ddVar.f333823a == 2) {
                    cbVar = (C119834cb) ddVar.f333824b;
                } else {
                    cbVar = C119834cb.f333765b;
                }
                bbVar3.mo104593a(new C119969az(cbVar));
                return C60856cj.m92900i(C119810be.f333719c);
            }
        } else if (ordinal != 2) {
            C59104x c4 = C119987bn.f334102a.mo56225c();
            c4.mo56378ag(C58975e.f156826a, "ConvEngine.ClientInteraction");
            ((C59052c) ((C59052c) c4).mo56372aa(34631)).mo56389s("#handleRequest: received unknown ProcedureCase in handleRequest: %s", C119807bb.m198714a(bcVar.f333716a));
            return C60856cj.m92899h(new C119986bm());
        } else {
            if (bcVar.f333716a == 3) {
                daVar = (C119860da) bcVar.f333717b;
            } else {
                daVar = C119860da.f333818b;
            }
            C119973bb bbVar4 = (C119973bb) bnVar.f334103b.mo27525b();
            C119834cb cbVar2 = daVar.f333820a;
            if (cbVar2 == null) {
                cbVar2 = C119834cb.f333765b;
            }
            bbVar4.mo104593a(new C119972ba(cbVar2));
            return C60856cj.m92900i(C119810be.f333719c);
        }
    }

    /* renamed from: b */
    public final void mo38125b(C32512e eVar) {
        C119996j jVar = this.f334132b;
        C119870dk dkVar = (C119870dk) C119874do.f333841c.createBuilder();
        dkVar.copyOnWrite();
        C119874do doVar = (C119874do) dkVar.instance;
        eVar.getClass();
        doVar.f333844b = eVar;
        doVar.f333843a = 3;
        jVar.mo104614b((C119874do) dkVar.build());
    }

    /* renamed from: c */
    public final void mo38126c(Throwable th) {
        C59104x d = C120000n.f334133a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "ConvEngine.ClientInteraction");
        ((C59052c) ((C59052c) ((C59052c) d).mo56382g(th)).mo56372aa(34614)).mo56386p("#onLowQualityClassificationFailure: sending response to client with low quality classification error code");
    }
}
