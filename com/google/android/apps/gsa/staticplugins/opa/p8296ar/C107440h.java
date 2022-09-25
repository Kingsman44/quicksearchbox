package com.google.android.apps.gsa.staticplugins.opa.p8296ar;

import android.content.Context;
import com.google.android.apps.gsa.search.core.google.gaia.p6800c.p6801a.C86034c;
import com.google.android.apps.gsa.shared.util.p7159c.C90875ai;
import com.google.android.apps.gsa.staticplugins.opa.p8296ar.p8299c.C107421a;
import com.google.android.apps.gsa.staticplugins.opa.p8296ar.p8299c.C107432l;
import com.google.android.apps.search.assistant.platform.pcp.p9338h.C124032d;
import com.google.android.libraries.assistant.contexttrigger.C17737g;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p1635au.C19569f;
import com.google.android.libraries.search.logging.p3041d.C39141kp;
import com.google.android.libraries.search.p3047m.p3050b.C39226b;
import com.google.assistant.p3803ag.p3804a.C48819b;
import com.google.assistant.p3803ag.p3804a.C48864g;
import com.google.assistant.p3803ag.p3804a.C48865h;
import com.google.assistant.p3803ag.p3804a.C48869l;
import com.google.assistant.p3803ag.p3807b.p3808a.C48904f;
import com.google.assistant.p3803ag.p3807b.p3808a.C48914p;
import com.google.assistant.p3803ag.p3807b.p3808a.C48915q;
import com.google.assistant.p3803ag.p3807b.p3808a.C48918t;
import com.google.assistant.p3803ag.p3807b.p3808a.C48919u;
import com.google.assistant.p3803ag.p3807b.p3808a.C48922x;
import com.google.assistant.p3803ag.p3807b.p3808a.C48923y;
import com.google.assistant.p3803ag.p3809c.C48952az;
import com.google.assistant.p3803ag.p3809c.C48971br;
import com.google.assistant.p3803ag.p3809c.C49005cy;
import com.google.assistant.p3803ag.p3809c.C49017dj;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ar.h */
/* compiled from: PG */
public final class C107440h implements C17737g {

    /* renamed from: a */
    public static final C59071e f298981a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.ar.h");

    /* renamed from: b */
    public final Context f298982b;

    /* renamed from: c */
    public final C107421a f298983c;

    /* renamed from: d */
    private final C22871g f298984d;

    /* renamed from: e */
    private final C107441i f298985e;

    /* renamed from: f */
    private final C107432l f298986f;

    /* renamed from: g */
    private final C124032d f298987g;

    /* renamed from: h */
    private final C86034c f298988h;

    public C107440h(C107441i iVar, C22871g gVar, C124032d dVar, C107432l lVar, Context context, C86034c cVar, C107421a aVar) {
        this.f298985e = iVar;
        this.f298984d = gVar;
        this.f298987g = dVar;
        this.f298986f = lVar;
        this.f298982b = context;
        this.f298988h = cVar;
        this.f298983c = aVar;
    }

    /* renamed from: b */
    private final void m178366b(C107401b bVar, C48923y yVar) {
        if (bVar != null) {
            C48865h hVar = bVar.f298915b;
            if (hVar == null) {
                hVar = C48865h.f126455f;
            }
            C48919u uVar = yVar.f126603b;
            if (uVar == null) {
                uVar = C48919u.f126586g;
            }
            C48918t tVar = (C48918t) uVar.toBuilder();
            C39226b bVar2 = C39226b.TAG_CLASSIC_ASSISTANT_PROACTIVEAPI;
            tVar.copyOnWrite();
            C48919u uVar2 = (C48919u) tVar.instance;
            uVar2.f126592e = bVar2.getNumber();
            uVar2.f126588a |= 8;
            String b = C107421a.m178337b(hVar);
            tVar.copyOnWrite();
            C48919u uVar3 = (C48919u) tVar.instance;
            uVar3.f126588a |= 16;
            uVar3.f126593f = b;
            C48919u uVar4 = (C48919u) tVar.build();
            C48914p pVar = (C48914p) C48915q.f126574c.createBuilder();
            pVar.copyOnWrite();
            C48915q qVar = (C48915q) pVar.instance;
            uVar4.getClass();
            qVar.f126577b = uVar4;
            qVar.f126576a |= 1;
            C48915q qVar2 = (C48915q) pVar.build();
            C90875ai.m148465b(C107436d.f298975a, this.f298984d.mo28210j(this.f298988h.mo79697b(), "processTriggerResult#accountId", new C107420c(this, qVar2)), this.f298984d, "removeTriggerResult").mo85223a(new C107437e(qVar2));
            C90875ai.m148465b(new C107438f(this, hVar), this.f298985e.mo96006a(hVar), this.f298984d, "handleClientActionPayload").mo85223a(new C107439g(this, hVar));
            return;
        }
        C59104x d = f298981a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "ClientActionListener");
        ((C59052c) ((C59052c) d).mo56372aa(25354)).mo56386p("context trigger result does not contain payload");
    }

    /* renamed from: a */
    public final void mo23454a(C48923y yVar) {
        Object obj;
        C58833ax axVar;
        Object obj2;
        C48952az azVar;
        Object obj3;
        C48952az azVar2;
        C48971br brVar;
        C49017dj djVar;
        C58833ax axVar2;
        C48971br brVar2;
        C49017dj djVar2;
        C49005cy cyVar;
        C59071e eVar = f298981a;
        C59104x b = eVar.mo56224b();
        b.mo56378ag(C58975e.f156826a, "ClientActionListener");
        ((C59052c) ((C59052c) b).mo56372aa(25351)).mo56386p("#onContextTrigger");
        if ((yVar.f126602a & 2) != 0) {
            C48904f fVar = yVar.f126604c;
            if (fVar == null) {
                fVar = C48904f.f126552a;
            }
            C62940bt r4 = C62942bv.checkIsLite(C107401b.f298912d);
            fVar.mo58887l(r4);
            if (fVar.f169962ag.mo58857o(r4.f169971d)) {
                C48904f fVar2 = yVar.f126604c;
                if (fVar2 == null) {
                    fVar2 = C48904f.f126552a;
                }
                C62940bt r42 = C62942bv.checkIsLite(C107401b.f298912d);
                fVar2.mo58887l(r42);
                Object l = fVar2.f169962ag.mo58854l(r42.f169971d);
                if (l == null) {
                    obj = r42.f169969b;
                } else {
                    obj = r42.mo58889c(l);
                }
                C107401b bVar = (C107401b) obj;
                C107421a aVar = this.f298983c;
                C48865h hVar = bVar.f298915b;
                if (hVar == null) {
                    hVar = C48865h.f126455f;
                }
                if ((hVar.f126457a & 2) != 0) {
                    C48869l lVar = hVar.f126461e;
                    if (lVar == null) {
                        lVar = C48869l.f126467a;
                    }
                    C62940bt r8 = C62942bv.checkIsLite(C48819b.f126312d);
                    lVar.mo58887l(r8);
                    if (!lVar.f169962ag.mo58857o(r8.f169971d)) {
                        axVar = C58836b.f156633a;
                    } else {
                        C62940bt r82 = C62942bv.checkIsLite(C48819b.f126312d);
                        lVar.mo58887l(r82);
                        Object l2 = lVar.f169962ag.mo58854l(r82.f169971d);
                        if (l2 == null) {
                            obj3 = r82.f169969b;
                        } else {
                            obj3 = r82.mo58889c(l2);
                        }
                        C48819b bVar2 = (C48819b) obj3;
                        if (bVar2.f126314a == 1) {
                            azVar2 = (C48952az) bVar2.f126315b;
                        } else {
                            azVar2 = C48952az.f126657c;
                        }
                        if (azVar2.f126659a == 1) {
                            brVar = (C48971br) azVar2.f126660b;
                        } else {
                            brVar = C48971br.f126689d;
                        }
                        if (brVar.f126691a == 2) {
                            djVar = (C49017dj) brVar.f126692b;
                        } else {
                            djVar = C49017dj.f126788c;
                        }
                        if (djVar.f126790a == 1) {
                            if (azVar2.f126659a == 1) {
                                brVar2 = (C48971br) azVar2.f126660b;
                            } else {
                                brVar2 = C48971br.f126689d;
                            }
                            if (brVar2.f126691a == 2) {
                                djVar2 = (C49017dj) brVar2.f126692b;
                            } else {
                                djVar2 = C49017dj.f126788c;
                            }
                            if (djVar2.f126790a == 1) {
                                cyVar = (C49005cy) djVar2.f126791b;
                            } else {
                                cyVar = C49005cy.f126761d;
                            }
                            axVar2 = C58833ax.m90834k(Long.valueOf(cyVar.f126764b));
                        } else {
                            axVar2 = C58836b.f156633a;
                        }
                        axVar = !axVar2.mo56113h() ? C58836b.f156633a : C58833ax.m90834k(Long.valueOf(aVar.f298956b.mo26870b() - ((Long) axVar2.mo56107c()).longValue()));
                    }
                } else {
                    axVar = C58836b.f156633a;
                }
                if (axVar.mo56113h()) {
                    C39141kp kpVar = aVar.f298955a;
                    double longValue = (double) ((Long) axVar.mo56107c()).longValue();
                    C48864g a = C48864g.m85285a(hVar.f126460d);
                    if (a == null) {
                        a = C48864g.TYPE_UNSPECIFIED;
                    }
                    ((C19569f) kpVar.f102836aT.mo6453a()).mo24824b(longValue, a.name(), C107421a.m178337b(hVar));
                }
                C48922x a2 = C48922x.m85306a(yVar.f126605d);
                if (a2 == null) {
                    a2 = C48922x.UNKNOWN;
                }
                if (a2 != C48922x.ACTIVE) {
                    C48922x a3 = C48922x.m85306a(yVar.f126605d);
                    if (a3 == null) {
                        a3 = C48922x.UNKNOWN;
                    }
                    if (a3 == C48922x.UNKNOWN) {
                        C59104x b2 = eVar.mo56224b();
                        b2.mo56378ag(C58975e.f156826a, "ClientActionListener");
                        ((C59052c) ((C59052c) b2).mo56372aa(25352)).mo56386p("context trigger status - UNKNOWN");
                        C48865h hVar2 = bVar.f298915b;
                        if (hVar2 == null) {
                            hVar2 = C48865h.f126455f;
                        }
                        C48869l lVar2 = hVar2.f126461e;
                        if (lVar2 == null) {
                            lVar2 = C48869l.f126467a;
                        }
                        C62940bt r2 = C62942bv.checkIsLite(C48819b.f126312d);
                        lVar2.mo58887l(r2);
                        Object l3 = lVar2.f169962ag.mo58854l(r2.f169971d);
                        if (l3 == null) {
                            obj2 = r2.f169969b;
                        } else {
                            obj2 = r2.mo58889c(l3);
                        }
                        C48819b bVar3 = (C48819b) obj2;
                        C124032d dVar = this.f298987g;
                        if (bVar3.f126314a == 1) {
                            azVar = (C48952az) bVar3.f126315b;
                        } else {
                            azVar = C48952az.f126657c;
                        }
                        if (dVar.mo106244a(azVar, this.f298986f)) {
                            m178366b(bVar, yVar);
                            return;
                        }
                        return;
                    }
                    return;
                }
                C59104x b3 = eVar.mo56224b();
                b3.mo56378ag(C58975e.f156826a, "ClientActionListener");
                ((C59052c) ((C59052c) b3).mo56372aa(25353)).mo56386p("context trigger status - ACTIVE");
                m178366b(bVar, yVar);
            }
        }
    }
}
