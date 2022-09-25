package com.google.android.apps.gsa.staticplugins.opa;

import com.google.android.apps.gsa.nga.api.a.be;
import com.google.android.apps.gsa.opa.C83572ac;
import com.google.android.apps.gsa.search.shared.p6930h.C87565h;
import com.google.android.apps.gsa.search.shared.p6930h.C87568k;
import com.google.android.apps.gsa.search.shared.service.C87682aj;
import com.google.android.apps.gsa.search.shared.service.ServiceEventData;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88244um;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88246uo;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88374zh;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88375zi;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88376zj;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108228az;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108331et;
import com.google.android.apps.gsa.staticplugins.opa.p8189ak.p8196c.p8199c.C106281i;
import com.google.android.apps.gsa.staticplugins.opa.p8300as.p8303b.C107505a;
import com.google.android.apps.gsa.staticplugins.opa.p8300as.p8303b.C107554c;
import com.google.android.apps.gsa.staticplugins.opa.p8300as.p8303b.C107556e;
import com.google.android.apps.gsa.staticplugins.opa.p8300as.p8303b.p8304a.C107506a;
import com.google.android.apps.gsa.staticplugins.opa.p8300as.p8303b.p8304a.C107518al;
import com.google.android.apps.gsa.staticplugins.opa.p8300as.p8303b.p8304a.C107520an;
import com.google.android.apps.gsa.staticplugins.opa.p8300as.p8303b.p8304a.C107522ap;
import com.google.android.apps.gsa.staticplugins.opa.p8300as.p8303b.p8304a.C107523b;
import com.google.android.apps.gsa.staticplugins.opa.p8300as.p8303b.p8304a.C107524c;
import com.google.android.apps.gsa.staticplugins.opa.p8300as.p8303b.p8304a.C107527f;
import com.google.android.apps.gsa.staticplugins.opa.p8300as.p8303b.p8304a.C107531j;
import com.google.android.apps.gsa.staticplugins.opa.p8300as.p8303b.p8304a.C107537p;
import com.google.android.apps.gsa.staticplugins.opa.valyrian.p8598c.C113984c;
import com.google.android.libraries.assistant.assistantactions.rendering.p639c.C11300h;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.aq */
/* compiled from: PG */
public final /* synthetic */ class C107376aq implements C87682aj {

    /* renamed from: a */
    public final /* synthetic */ C109040fj f298853a;

    public /* synthetic */ C107376aq(C109040fj fjVar) {
        this.f298853a = fjVar;
    }

    /* renamed from: fM */
    public final void mo19965fM(ServiceEventData serviceEventData) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        C109040fj fjVar = this.f298853a;
        C88244um a = C88244um.m142794a(serviceEventData.f236959a.f238699b);
        if (a == null) {
            a = C88244um.ATTACH_WEBVIEW;
        }
        C109026ey eyVar = C109026ey.UNINITIALIZED;
        C83572ac acVar = C83572ac.UNINITIALIZED;
        C113984c cVar = C113984c.UNKNOWN;
        C108228az azVar = C108228az.UNINITIALIZED;
        int ordinal = a.ordinal();
        if (ordinal != 0) {
            if (ordinal == 69) {
                int a2 = C88374zh.m142798a(((C88375zi) serviceEventData.mo81918e(C88376zj.f238984a)).f238981b);
                if (a2 != 0 && a2 == 6) {
                    ((C108331et) fjVar.f303382cn.mo27525b()).onSessionDestroyed();
                }
            } else if (ordinal == 31) {
                fjVar.f303450o.mo95388aD();
                fjVar.f303238X.mo96165aq(false);
                C11300h hVar = fjVar.f303310bQ;
                if (hVar != null) {
                    hVar.mo19699C(false);
                }
                if (fjVar.f303450o.mo95402am()) {
                    fjVar.f303450o.mo95415az();
                    fjVar.mo97485au();
                }
                if (fjVar.f303262aV.mo95240v()) {
                    long a3 = fjVar.f303455t.mo79743a(C90014bt.f247408gb);
                    fjVar.f303255aO.mo98058b(a3, a3);
                }
            } else if (ordinal == 32) {
                fjVar.f303450o.mo95388aD();
                C11300h hVar2 = fjVar.f303310bQ;
                if (hVar2 != null) {
                    hVar2.mo19699C(true);
                }
                fjVar.f303238X.mo96165aq(true);
            } else if (ordinal == 112) {
                C62940bt btVar = C107505a.f299120a;
                C88246uo uoVar = serviceEventData.f236959a;
                C62940bt r2 = C62942bv.checkIsLite(btVar);
                uoVar.mo58887l(r2);
                if (!uoVar.f169962ag.mo58857o(r2.f169971d)) {
                    C59104x d = C109040fj.f303210a.mo56226d();
                    d.mo56378ag(C58975e.f156826a, "ChatUiController");
                    ((C59052c) ((C59052c) d).mo56372aa(22655)).mo56387q("onServiceEvent: %d missing OpaSessionServiceEvent extension", a.f238695cJ);
                    return;
                }
                C107556e eVar = (C107556e) serviceEventData.mo81918e(C107505a.f299120a);
                int a4 = C107554c.m178398a(eVar.f299213b);
                if (a4 == 0) {
                    a4 = 1;
                }
                switch (a4 - 1) {
                    case 14:
                        C62940bt r1 = C62942bv.checkIsLite(C107524c.f299156a);
                        eVar.mo58887l(r1);
                        Object l = eVar.f169962ag.mo58854l(r1.f169971d);
                        if (l == null) {
                            obj = r1.f169969b;
                        } else {
                            obj = r1.mo58889c(l);
                        }
                        fjVar.f303304bK = ((C107522ap) obj).f299154b;
                        return;
                    case 15:
                        fjVar.mo97483as();
                        return;
                    case 16:
                        fjVar.mo97462aX(0);
                        return;
                    case 18:
                        C62940bt r12 = C62942bv.checkIsLite(C107523b.f299155a);
                        eVar.mo58887l(r12);
                        Object l2 = eVar.f169962ag.mo58854l(r12.f169971d);
                        if (l2 == null) {
                            obj2 = r12.f169969b;
                        } else {
                            obj2 = r12.mo58889c(l2);
                        }
                        be a5 = be.a(((C107537p) obj2).f299183b);
                        if (a5 == null) {
                            a5 = be.a;
                        }
                        C58976aa aaVar = C58975e.f156826a;
                        fjVar.f303307bN = a5;
                        fjVar.mo97511bc();
                        return;
                    case 23:
                        if (fjVar.f303455t.mo79746e(C90014bt.f247271dx)) {
                            C62940bt r13 = C62942bv.checkIsLite(C107518al.f299146a);
                            eVar.mo58887l(r13);
                            Object l3 = eVar.f169962ag.mo58854l(r13.f169971d);
                            if (l3 == null) {
                                obj3 = r13.f169969b;
                            } else {
                                obj3 = r13.mo58889c(l3);
                            }
                            fjVar.mo97513be(Math.min(100, Math.round(((C107520an) obj3).f299150b * 32767.0f)));
                            return;
                        }
                        return;
                    case 24:
                        C62940bt r14 = C62942bv.checkIsLite(C107506a.f299121a);
                        eVar.mo58887l(r14);
                        Object l4 = eVar.f169962ag.mo58854l(r14.f169971d);
                        if (l4 == null) {
                            obj4 = r14.f169969b;
                        } else {
                            obj4 = r14.mo58889c(l4);
                        }
                        int i = ((C107527f) obj4).f299161b;
                        fjVar.f303448m.mo28212l("Restore visibility", new C107128ao(fjVar));
                        return;
                    case 25:
                        C62940bt r15 = C62942bv.checkIsLite(C107531j.f299167a);
                        eVar.mo58887l(r15);
                        Object l5 = eVar.f169962ag.mo58854l(r15.f169971d);
                        if (l5 == null) {
                            obj5 = r15.f169969b;
                        } else {
                            obj5 = r15.mo58889c(l5);
                        }
                        C106281i iVar = (C106281i) obj5;
                        if (!fjVar.f303371cc) {
                            C59104x d2 = C109040fj.f303210a.mo56226d();
                            d2.mo56378ag(C58975e.f156826a, "ChatUiController");
                            ((C59052c) ((C59052c) d2).mo56372aa(22648)).mo56389s("NGA event received without NGA integration being enabled: %b", Boolean.valueOf(iVar.f296518b));
                            return;
                        }
                        C58976aa aaVar2 = C58975e.f156826a;
                        if (iVar.f296518b) {
                            if (fjVar.f303238X.mo96177e() != 0) {
                                fjVar.mo97462aX(0);
                            } else {
                                fjVar.f303238X.mo96151ac(false);
                            }
                            fjVar.f303448m.mo28212l("Stop all TTS playback", new C106179aj(fjVar));
                        }
                        fjVar.f303238X.mo96124W(iVar.f296518b);
                        C11300h hVar3 = fjVar.f303310bQ;
                        if (hVar3 == null) {
                            return;
                        }
                        if (iVar.f296518b) {
                            hVar3.mo19698B(2);
                            return;
                        } else {
                            hVar3.mo19698B(9);
                            return;
                        }
                    case 26:
                        fjVar.f303441f.finish();
                        C87565h hVar4 = new C87565h();
                        hVar4.f236560f = 1;
                        hVar4.f236541al = true;
                        hVar4.f236535af = true;
                        hVar4.f236550au = true;
                        ((C87568k) fjVar.f303271ae.mo56107c()).mo81689c(fjVar.f303346c, hVar4.mo81685a(), 268468224);
                        return;
                    default:
                        return;
                }
            } else if (ordinal == 113) {
                if (fjVar.f303282ap) {
                    fjVar.f303238X.mo96115N(true);
                }
                C58976aa aaVar3 = C58975e.f156826a;
                fjVar.f303295bB = false;
                fjVar.f303329bj.mo96471d();
                fjVar.mo97553z();
                fjVar.f303448m.mo28212l("COMPLETED_ASSISTANT_CONVERSATION", new C107125an(fjVar));
            } else if (ordinal == 131) {
                fjVar.mo97414B();
            } else if (ordinal == 132) {
                fjVar.f303240Z.f298231j = true;
            }
        } else if (fjVar.mo97521bm() && !fjVar.f303455t.mo79746e(C90014bt.f247411ge)) {
            fjVar.mo97498bH(false, false, false, 2);
        }
    }
}
