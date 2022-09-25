package com.google.android.apps.gsa.staticplugins.opa.p8296ar;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.opa.p6443g.C83679a;
import com.google.android.apps.gsa.opa.p6443g.p6445b.C83682a;
import com.google.android.apps.gsa.opa.p6443g.p6445b.C83683b;
import com.google.android.apps.gsa.opa.p6443g.p6446c.C83692a;
import com.google.android.apps.gsa.opa.p6443g.p6446c.C83693b;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.staticplugins.opa.p8296ar.p8299c.C107421a;
import com.google.android.apps.gsa.staticplugins.opa.p8296ar.p8299c.C107431k;
import com.google.android.apps.gsa.staticplugins.opa.p8296ar.p8299c.C107435o;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.assistant.p3803ag.p3804a.C48794ab;
import com.google.assistant.p3803ag.p3804a.C48796ad;
import com.google.assistant.p3803ag.p3804a.C48798af;
import com.google.assistant.p3803ag.p3804a.C48836bc;
import com.google.assistant.p3803ag.p3804a.C48838be;
import com.google.assistant.p3803ag.p3804a.C48840bg;
import com.google.assistant.p3803ag.p3804a.C48851br;
import com.google.assistant.p3803ag.p3804a.C48855bv;
import com.google.assistant.p3803ag.p3804a.C48862e;
import com.google.assistant.p3803ag.p3804a.C48865h;
import com.google.assistant.p3803ag.p3804a.C48871n;
import com.google.assistant.p3803ag.p3804a.C48876s;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ar.z */
/* compiled from: PG */
public final class C107458z implements C107441i {

    /* renamed from: a */
    public static final C59071e f299018a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.ar.z");

    /* renamed from: b */
    public final C107435o f299019b;

    /* renamed from: c */
    public final C83692a f299020c;

    /* renamed from: d */
    public final C22871g f299021d;

    /* renamed from: e */
    public final C22871g f299022e;

    /* renamed from: f */
    public final C83693b f299023f;

    /* renamed from: g */
    public final C83679a f299024g;

    /* renamed from: h */
    public final C107431k f299025h;

    /* renamed from: i */
    public final C107421a f299026i;

    public C107458z(C22871g gVar, C22871g gVar2, C107435o oVar, C83692a aVar, C83693b bVar, C83679a aVar2, C107431k kVar, C107421a aVar3) {
        this.f299019b = oVar;
        this.f299022e = gVar2;
        this.f299021d = gVar;
        this.f299020c = aVar;
        this.f299023f = bVar;
        this.f299024g = aVar2;
        this.f299025h = kVar;
        this.f299026i = aVar3;
    }

    /* renamed from: a */
    public final C60870cx mo96006a(C48865h hVar) {
        C48862e eVar;
        C60870cx cxVar;
        C48862e eVar2;
        Object obj;
        C48862e eVar3;
        Object obj2;
        C48862e eVar4;
        Object obj3;
        C48862e eVar5;
        Object obj4;
        C48862e eVar6;
        Object obj5;
        Object obj6;
        C48851br brVar;
        C48851br brVar2;
        C48798af afVar;
        C59071e eVar7 = f299018a;
        C59104x b = eVar7.mo56224b();
        b.mo56378ag(C58975e.f156826a, "actionPayloadHandler");
        ((C59052c) ((C59052c) b).mo56372aa(25355)).mo56386p("#handleClientActionPayload");
        int i = hVar.f126458b;
        if (i == 3) {
            C60870cx e = this.f299020c.mo77012e(((C48851br) hVar.f126459c).toByteString());
            C83682a aVar = (C83682a) C83683b.f228105f.createBuilder();
            if (hVar.f126458b == 3) {
                brVar = (C48851br) hVar.f126459c;
            } else {
                brVar = C48851br.f126412f;
            }
            aVar.copyOnWrite();
            C83683b bVar = (C83683b) aVar.instance;
            brVar.getClass();
            bVar.f228110d = brVar;
            bVar.f228107a = 4 | bVar.f228107a;
            if (hVar.f126458b == 3) {
                brVar2 = (C48851br) hVar.f126459c;
            } else {
                brVar2 = C48851br.f126412f;
            }
            if (brVar2.f126415b == 3) {
                afVar = (C48798af) brVar2.f126416c;
            } else {
                afVar = C48798af.f126265b;
            }
            int a = C48876s.m85289a(afVar.f126267a);
            if (a == 0) {
                a = 1;
            }
            aVar.copyOnWrite();
            C83683b bVar2 = (C83683b) aVar.instance;
            bVar2.f228111e = a - 1;
            bVar2.f228107a |= 8;
            aVar.copyOnWrite();
            C83683b bVar3 = (C83683b) aVar.instance;
            bVar3.f228108b = 0;
            bVar3.f228107a = 1 | bVar3.f228107a;
            return this.f299022e.mo28210j(e, "clientContentInfoInCacheFuture", new C107447o(this, hVar, (C83683b) aVar.build()));
        }
        if (i == 4) {
            eVar = (C48862e) hVar.f126459c;
        } else {
            eVar = C48862e.f126439a;
        }
        C62940bt r4 = C62942bv.checkIsLite(C48838be.f126380d);
        eVar.mo58887l(r4);
        if (eVar.f169962ag.mo58857o(r4.f169971d)) {
            C59104x b2 = eVar7.mo56224b();
            b2.mo56378ag(C58975e.f156826a, "actionPayloadHandler");
            ((C59052c) ((C59052c) b2).mo56372aa(25361)).mo56386p("#handleStartJourneyAction");
            if (hVar.f126458b == 4) {
                eVar6 = (C48862e) hVar.f126459c;
            } else {
                eVar6 = C48862e.f126439a;
            }
            C62940bt r0 = C62942bv.checkIsLite(C48838be.f126380d);
            eVar6.mo58887l(r0);
            Object l = eVar6.f169962ag.mo58854l(r0.f169971d);
            if (l == null) {
                obj5 = r0.f169969b;
            } else {
                obj5 = r0.mo58889c(l);
            }
            C48838be beVar = (C48838be) obj5;
            C48855bv bvVar = beVar.f126382a;
            if (bvVar == null) {
                bvVar = C48855bv.f126424b;
            }
            C60870cx j = this.f299021d.mo28210j(this.f299020c.mo77013f(bvVar), BuildConfig.FLAVOR, new C107452t(this, beVar));
            C62940bt r2 = C62942bv.checkIsLite(C48838be.f126380d);
            eVar6.mo58887l(r2);
            Object l2 = eVar6.f169962ag.mo58854l(r2.f169971d);
            if (l2 == null) {
                obj6 = r2.f169969b;
            } else {
                obj6 = r2.mo58889c(l2);
            }
            cxVar = this.f299021d.mo28210j(j, BuildConfig.FLAVOR, new C107453u(this, beVar, ((C48838be) obj6).f126383b));
        } else {
            C62940bt r42 = C62942bv.checkIsLite(C48796ad.f126260c);
            eVar.mo58887l(r42);
            if (eVar.f169962ag.mo58857o(r42.f169971d)) {
                C59104x b3 = eVar7.mo56224b();
                b3.mo56378ag(C58975e.f156826a, "actionPayloadHandler");
                ((C59052c) ((C59052c) b3).mo56372aa(25360)).mo56386p("#handleShowContentAction");
                if (hVar.f126458b == 4) {
                    eVar5 = (C48862e) hVar.f126459c;
                } else {
                    eVar5 = C48862e.f126439a;
                }
                if (hVar.f126458b == 4) {
                    C62940bt r7 = C62942bv.checkIsLite(C48796ad.f126260c);
                    eVar5.mo58887l(r7);
                    Object l3 = eVar5.f169962ag.mo58854l(r7.f169971d);
                    if (l3 == null) {
                        obj4 = r7.f169969b;
                    } else {
                        obj4 = r7.mo58889c(l3);
                    }
                    C48871n nVar = ((C48796ad) obj4).f126262a;
                    if (nVar == null) {
                        nVar = C48871n.f126470e;
                    }
                    cxVar = C118826c.m197213c(mo96007b(nVar));
                } else {
                    cxVar = C60856cj.m92899h(new IllegalStateException("Show content action has no payload"));
                }
            } else {
                C62940bt r43 = C62942bv.checkIsLite(C48794ab.f126255c);
                eVar.mo58887l(r43);
                if (eVar.f169962ag.mo58857o(r43.f169971d)) {
                    C59104x b4 = eVar7.mo56224b();
                    b4.mo56378ag(C58975e.f156826a, "actionPayloadHandler");
                    ((C59052c) ((C59052c) b4).mo56372aa(25359)).mo56386p("#handleRemoveContentClientAction");
                    if (hVar.f126458b == 4) {
                        eVar4 = (C48862e) hVar.f126459c;
                    } else {
                        eVar4 = C48862e.f126439a;
                    }
                    C62940bt r02 = C62942bv.checkIsLite(C48794ab.f126255c);
                    eVar4.mo58887l(r02);
                    Object l4 = eVar4.f169962ag.mo58854l(r02.f169971d);
                    if (l4 == null) {
                        obj3 = r02.f169969b;
                    } else {
                        obj3 = r02.mo58889c(l4);
                    }
                    C48851br brVar3 = ((C48794ab) obj3).f126257a;
                    if (brVar3 == null) {
                        brVar3 = C48851br.f126412f;
                    }
                    cxVar = this.f299021d.mo28210j(this.f299020c.mo77012e(brVar3.toByteString()), "handleRemoveContentClientAction", new C107454v(this, brVar3));
                } else {
                    C62940bt r44 = C62942bv.checkIsLite(C48840bg.f126387c);
                    eVar.mo58887l(r44);
                    if (eVar.f169962ag.mo58857o(r44.f169971d)) {
                        C59104x b5 = eVar7.mo56224b();
                        b5.mo56378ag(C58975e.f156826a, "actionPayloadHandler");
                        ((C59052c) ((C59052c) b5).mo56372aa(25362)).mo56386p("#handleTerminateJourneyAction");
                        if (hVar.f126458b == 4) {
                            eVar3 = (C48862e) hVar.f126459c;
                        } else {
                            eVar3 = C48862e.f126439a;
                        }
                        C62940bt r03 = C62942bv.checkIsLite(C48840bg.f126387c);
                        eVar3.mo58887l(r03);
                        Object l5 = eVar3.f169962ag.mo58854l(r03.f169971d);
                        if (l5 == null) {
                            obj2 = r03.f169969b;
                        } else {
                            obj2 = r03.mo58889c(l5);
                        }
                        C48855bv bvVar2 = ((C48840bg) obj2).f126389a;
                        if (bvVar2 == null) {
                            bvVar2 = C48855bv.f126424b;
                        }
                        cxVar = this.f299021d.mo28210j(this.f299023f.mo77018d(bvVar2), "handleTerminateJourneyAction", new C107445m(this, eVar3));
                    } else {
                        C62940bt r45 = C62942bv.checkIsLite(C48836bc.f126375c);
                        eVar.mo58887l(r45);
                        if (!eVar.f169962ag.mo58857o(r45.f169971d)) {
                            return C60856cj.m92899h(new IllegalStateException("unsupported extension"));
                        }
                        C59104x b6 = eVar7.mo56224b();
                        b6.mo56378ag(C58975e.f156826a, "actionPayloadHandler");
                        ((C59052c) ((C59052c) b6).mo56372aa(25358)).mo56386p("#handleRegenerateJourneyAction");
                        if (hVar.f126458b == 4) {
                            eVar2 = (C48862e) hVar.f126459c;
                        } else {
                            eVar2 = C48862e.f126439a;
                        }
                        C62940bt r04 = C62942bv.checkIsLite(C48836bc.f126375c);
                        eVar2.mo58887l(r04);
                        Object l6 = eVar2.f169962ag.mo58854l(r04.f169971d);
                        if (l6 == null) {
                            obj = r04.f169969b;
                        } else {
                            obj = r04.mo58889c(l6);
                        }
                        C48855bv bvVar3 = ((C48836bc) obj).f126377a;
                        if (bvVar3 == null) {
                            bvVar3 = C48855bv.f126424b;
                        }
                        cxVar = this.f299021d.mo28210j(this.f299020c.mo77013f(bvVar3), "handleRegenerateJourneyAction", new C107443k(this, bvVar3));
                    }
                }
            }
        }
        return this.f299022e.mo28210j(cxVar, "clientActionPayloadHandleResultFuture", C107448p.f299002a);
    }

    /* renamed from: b */
    public final C60870cx mo96007b(C48871n nVar) {
        C59071e eVar = f299018a;
        C59104x b = eVar.mo56224b();
        b.mo56378ag(C58975e.f156826a, "actionPayloadHandler");
        ((C59052c) ((C59052c) b).mo56372aa(25356)).mo56386p("#handleClientContent");
        if ((nVar.f126472a & 2) == 0) {
            C83692a aVar = this.f299020c;
            C48851br brVar = nVar.f126473b;
            if (brVar == null) {
                brVar = C48851br.f126412f;
            }
            return this.f299022e.mo28210j(aVar.mo77012e(brVar.toByteString()), "clientContentInfoInCacheFuture", new C107444l(this, nVar));
        }
        C59104x d = eVar.mo56226d();
        d.mo56378ag(C58975e.f156826a, "actionPayloadHandler");
        ((C59052c) ((C59052c) d).mo56372aa(25357)).mo56386p("handleClientContent ignoring content with creation/rendering error");
        return C60866ct.f164955a;
    }
}
