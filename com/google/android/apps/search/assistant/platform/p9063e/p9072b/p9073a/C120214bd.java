package com.google.android.apps.search.assistant.platform.p9063e.p9072b.p9073a;

import com.google.android.apps.search.assistant.platform.p9063e.p9072b.p9073a.p9075b.C120210a;
import com.google.android.libraries.assistant.p1363c.p1386e.p1387a.C17268f;
import com.google.android.libraries.search.assistant.p2570h.p2571a.p2576c.C33451e;
import com.google.android.libraries.search.assistant.p2570h.p2571a.p2576c.p2577a.C33447g;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3897e.p3910e.p3911a.C51193h;
import com.google.assistant.p3897e.p3910e.p3911a.C51194i;
import com.google.assistant.p3897e.p3910e.p3911a.C51195j;
import com.google.assistant.p3897e.p3921j.C52081en;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.protos.p5068j.p5069a.p5070a.p5071a.p5076b.p5077a.p5078a.p5082b.p5083a.p5084a.C65482b;
import com.google.speech.p5208h.C66611ci;
import com.google.speech.p5208h.C66624cv;
import com.google.speech.p5208h.C66629d;
import com.google.speech.p5224k.p5225a.C67238p;
import com.google.speech.recognizer.p5233a.C67438ag;
import com.google.speech.recognizer.p5233a.C67442ak;

/* renamed from: com.google.android.apps.search.assistant.platform.e.b.a.bd */
/* compiled from: PG */
public final class C120214bd implements C17268f {

    /* renamed from: a */
    private static final C59071e f334542a = C59071e.m91332i("com.google.android.apps.search.assistant.platform.e.b.a.bd");

    /* renamed from: b */
    private final C120252cj f334543b;

    /* renamed from: c */
    private boolean f334544c = false;

    /* renamed from: d */
    private final C33447g f334545d;

    public C120214bd(C120252cj cjVar, C33447g gVar) {
        this.f334543b = cjVar;
        this.f334545d = gVar;
    }

    /* renamed from: a */
    public final void mo23256a() {
        C58976aa aaVar = C58975e.f156826a;
        this.f334543b.mo104710c();
    }

    /* renamed from: b */
    public final void mo23257b(Throwable th) {
        C59104x d = f334542a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "ConvEngine.OnlineProcessing");
        ((C59052c) ((C59052c) ((C59052c) d).mo56382g(th)).mo56372aa(34687)).mo56386p("#onError");
        this.f334543b.mo104711d(th);
    }

    /* renamed from: c */
    public final void mo23258c(C66611ci ciVar) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        C62940bt r0 = C62942bv.checkIsLite(C66629d.f181275b);
        ciVar.mo58887l(r0);
        if (ciVar.f169962ag.mo58857o(r0.f169971d)) {
            C62940bt r02 = C62942bv.checkIsLite(C66629d.f181275b);
            ciVar.mo58887l(r02);
            Object l = ciVar.f169962ag.mo58854l(r02.f169971d);
            if (l == null) {
                obj5 = r02.f169969b;
            } else {
                obj5 = r02.mo58889c(l);
            }
            C51195j jVar = (C51195j) obj5;
            C59071e eVar = f334542a;
            C59104x b = eVar.mo56224b();
            b.mo56378ag(C58975e.f156826a, "ConvEngine.OnlineProcessing");
            ((C59052c) ((C59052c) b).mo56372aa(34684)).mo56389s("#handleAssistantResponse(%s)", jVar);
            if ((jVar.f133266a & 4) != 0) {
                C51194i iVar = jVar.f133270e;
                if (iVar == null) {
                    iVar = C51194i.f133258e;
                }
                int a = C51193h.m86083a(iVar.f133263d);
                if (a != 0 && a == 2) {
                    C59104x b2 = eVar.mo56224b();
                    b2.mo56378ag(C58975e.f156826a, "ConvEngine.OnlineProcessing");
                    ((C59052c) ((C59052c) b2).mo56372aa(34685)).mo56386p("#handleAssistantResponse: ignore contextual cards.");
                }
            }
            C120221bk e = this.f334543b.mo104712e();
            if ((jVar.f133266a & 128) != 0) {
                C52081en enVar = jVar.f133275j;
                if (enVar == null) {
                    enVar = C52081en.f136679i;
                }
                e.f334558c.execute(C47810es.m84977q(new C120217bg(e, enVar, jVar.f133274i)));
            }
            if (jVar.f133278m) {
                e.mo104691b(new C120236bz("Request was declared invalid on the server side", C65482b.INVALID_REQUEST, (Throwable) null));
            }
        }
        C62940bt r03 = C62942bv.checkIsLite(C67238p.f182737f);
        ciVar.mo58887l(r03);
        if (ciVar.f169962ag.mo58857o(r03.f169971d)) {
            C62940bt r04 = C62942bv.checkIsLite(C67238p.f182737f);
            ciVar.mo58887l(r04);
            Object l2 = ciVar.f169962ag.mo58854l(r04.f169971d);
            if (l2 == null) {
                obj4 = r04.f169969b;
            } else {
                obj4 = r04.mo58889c(l2);
            }
            C67238p pVar = (C67238p) obj4;
            if (pVar.f182740b == 1) {
                C67442ak akVar = ((C67438ag) pVar.f182741c).f183263f;
                if (akVar == null) {
                    akVar = C67442ak.f183276i;
                }
                if ((akVar.f183278a & 8) != 0) {
                    C58976aa aaVar = C58975e.f156826a;
                    this.f334544c = true;
                }
            }
        }
        if (!this.f334544c) {
            C62940bt r05 = C62942bv.checkIsLite(C66624cv.f181248e);
            ciVar.mo58887l(r05);
            if (ciVar.f169962ag.mo58857o(r05.f169971d)) {
                C62940bt r06 = C62942bv.checkIsLite(C66624cv.f181248e);
                ciVar.mo58887l(r06);
                Object l3 = ciVar.f169962ag.mo58854l(r06.f169971d);
                if (l3 == null) {
                    obj = r06.f169969b;
                } else {
                    obj = r06.mo58889c(l3);
                }
                if ((((C66624cv) obj).f181250a & 1) != 0) {
                    C59071e eVar2 = f334542a;
                    C59104x b3 = eVar2.mo56224b();
                    b3.mo56378ag(C58975e.f156826a, "ConvEngine.OnlineProcessing");
                    C59052c cVar = (C59052c) ((C59052c) b3).mo56372aa(34688);
                    C62940bt r3 = C62942bv.checkIsLite(C66624cv.f181248e);
                    ciVar.mo58887l(r3);
                    Object l4 = ciVar.f169962ag.mo58854l(r3.f169971d);
                    if (l4 == null) {
                        obj2 = r3.f169969b;
                    } else {
                        obj2 = r3.mo58889c(l4);
                    }
                    cVar.mo56389s("Have received a cloud MDA response. Decision was: %b", Boolean.valueOf(((C66624cv) obj2).f181251b));
                    C62940bt r2 = C62942bv.checkIsLite(C66624cv.f181248e);
                    ciVar.mo58887l(r2);
                    Object l5 = ciVar.f169962ag.mo58854l(r2.f169971d);
                    if (l5 == null) {
                        obj3 = r2.f169969b;
                    } else {
                        obj3 = r2.mo58889c(l5);
                    }
                    if (!((C66624cv) obj3).f181251b) {
                        C59104x c = eVar2.mo56225c();
                        c.mo56378ag(C58975e.f156826a, "ConvEngine.OnlineProcessing");
                        ((C59052c) ((C59052c) c).mo56372aa(34689)).mo56386p("Cancelling utterance since this device was not selected");
                        this.f334545d.mo38850c(new C33451e(new C120210a()));
                    }
                }
            }
        }
    }
}
