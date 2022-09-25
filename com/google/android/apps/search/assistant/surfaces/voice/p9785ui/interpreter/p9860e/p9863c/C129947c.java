package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter.p9860e.p9863c;

import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter.p9860e.C129893ab;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter.p9860e.C129901aj;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter.p9860e.C129906ao;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter.p9860e.C129909ar;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter.p9860e.C129910as;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter.p9860e.C129944c;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter.p9860e.C129960k;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter.p9860e.C129961l;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter.p9860e.C129964o;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter.p9860e.C129965p;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter.p9860e.C129966q;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter.p9860e.C129967r;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter.p9860e.C129969t;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter.p9860e.C129974y;
import com.google.assistant.p3897e.p3921j.p3925d.C51776b;
import com.google.assistant.p3897e.p3921j.p3925d.C51778d;
import com.google.assistant.p3897e.p3921j.p3925d.C51780f;
import com.google.assistant.p3897e.p3921j.p3925d.C51782h;
import com.google.assistant.p3897e.p3921j.p3926e.C51910dq;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59094n;
import com.google.protobuf.C62934bn;
import p5462h.C69677g;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.interpreter.e.c.c */
/* compiled from: PG */
public final class C129947c {

    /* renamed from: a */
    private static final C59071e f356414a = C59071e.m91331h();

    /* renamed from: a */
    public static final C129966q m212136a(C129901aj ajVar, C129910as asVar) {
        C129906ao aoVar;
        C129965p pVar;
        C69664n.m101061g(ajVar, "state");
        C69664n.m101061g(asVar, "stateUpdateEvent");
        C129966q qVar = ajVar.f356348a;
        if (qVar == null) {
            qVar = C129966q.f356466k;
        }
        C69664n.m101060f(qVar, "state.interpreterState");
        if (C129967r.m212141b(qVar)) {
            int i = asVar.f356358a;
            if (C129909ar.m212106a(i) == 4) {
                C59052c cVar = (C59052c) f356414a.mo56226d();
                cVar.mo56379ah(new C59094n(38632));
                cVar.mo56386p("Invalid type");
                return qVar;
            }
            int a = C129909ar.m212106a(i);
            int i2 = a - 1;
            if (a == 0) {
                throw null;
            } else if (i2 == 0) {
                if (i == 1) {
                    aoVar = (C129906ao) asVar.f356359b;
                } else {
                    aoVar = C129906ao.f356351b;
                }
                C69664n.m101060f(aoVar, "stateUpdateEvent.keyboardTap");
                C129966q qVar2 = ajVar.f356348a;
                if (qVar2 == null) {
                    qVar2 = C129966q.f356466k;
                }
                C69664n.m101060f(qVar2, "this.interpreterState");
                C51910dq dqVar = ajVar.f356349b;
                if (dqVar == null) {
                    dqVar = C51910dq.f136159t;
                }
                C69664n.m101060f(dqVar, "this.clientOp");
                C62934bn builder = qVar2.toBuilder();
                C69664n.m101060f(builder, "this.toBuilder()");
                C129969t a2 = C69664n.m101061g((C129944c) builder, "builder");
                if (aoVar.f356353a) {
                    C129964o oVar = (C129964o) C129965p.f356456i.createBuilder();
                    C69664n.m101060f(oVar, "newBuilder()");
                    C129893ab a3 = C69664n.m101061g(oVar, "builder");
                    C51776b bVar = dqVar.f136165e;
                    if (bVar == null) {
                        bVar = C51776b.f135842e;
                    }
                    C51780f fVar = bVar.f135845b;
                    if (fVar == null) {
                        fVar = C51780f.f135862d;
                    }
                    C51782h hVar = fVar.f135865b;
                    if (hVar == null) {
                        hVar = C51782h.f135867c;
                    }
                    String str = hVar.f135870b;
                    C69664n.m101060f(str, "clientOp.guiParams.sourc…l.languageNameHeader.text");
                    a3.mo109330c(str);
                    C51776b bVar2 = dqVar.f136165e;
                    if (bVar2 == null) {
                        bVar2 = C51776b.f135842e;
                    }
                    C51780f fVar2 = bVar2.f135845b;
                    if (fVar2 == null) {
                        fVar2 = C51780f.f135862d;
                    }
                    C51778d dVar = fVar2.f135866c;
                    if (dVar == null) {
                        dVar = C51778d.f135848m;
                    }
                    C51782h hVar2 = dVar.f135852c;
                    if (hVar2 == null) {
                        hVar2 = C51782h.f135867c;
                    }
                    String str2 = hVar2.f135870b;
                    C69664n.m101060f(str2, "clientOp.guiParams.sourc…ages.keyboardWaiting.text");
                    a3.mo109332e(str2);
                    C51776b bVar3 = dqVar.f136165e;
                    if (bVar3 == null) {
                        bVar3 = C51776b.f135842e;
                    }
                    C51780f fVar3 = bVar3.f135845b;
                    if (fVar3 == null) {
                        fVar3 = C51780f.f135862d;
                    }
                    C51778d dVar2 = fVar3.f135866c;
                    if (dVar2 == null) {
                        dVar2 = C51778d.f135848m;
                    }
                    C51782h hVar3 = dVar2.f135860k;
                    if (hVar3 == null) {
                        hVar3 = C51782h.f135867c;
                    }
                    String str3 = hVar3.f135870b;
                    C69664n.m101060f(str3, "clientOp.guiParams.sourc…l.messages.translate.text");
                    a3.mo109333f(str3);
                    C51776b bVar4 = dqVar.f136165e;
                    if (bVar4 == null) {
                        bVar4 = C51776b.f135842e;
                    }
                    C51780f fVar4 = bVar4.f135845b;
                    if (fVar4 == null) {
                        fVar4 = C51780f.f135862d;
                    }
                    C51778d dVar3 = fVar4.f135866c;
                    if (dVar3 == null) {
                        dVar3 = C51778d.f135848m;
                    }
                    C51782h hVar4 = dVar3.f135861l;
                    if (hVar4 == null) {
                        hVar4 = C51782h.f135867c;
                    }
                    String str4 = hVar4.f135870b;
                    C69664n.m101060f(str4, "clientOp.guiParams.sourc…anel.messages.cancel.text");
                    a3.mo109329b(str4);
                    boolean z = aoVar.f356353a;
                    C129964o oVar2 = a3.f356324a;
                    oVar2.copyOnWrite();
                    C129965p pVar2 = (C129965p) oVar2.instance;
                    pVar2.f356458a |= 1;
                    pVar2.f356461d = z;
                    String str5 = dqVar.f136163c;
                    C69664n.m101060f(str5, "clientOp.sourceLanguage");
                    a3.mo109331d(str5);
                    pVar = a3.mo109328a();
                } else {
                    C129964o oVar3 = (C129964o) C129965p.f356456i.createBuilder();
                    C69664n.m101060f(oVar3, "newBuilder()");
                    C129893ab a4 = C69664n.m101061g(oVar3, "builder");
                    C51776b bVar5 = dqVar.f136165e;
                    if (bVar5 == null) {
                        bVar5 = C51776b.f135842e;
                    }
                    C51780f fVar5 = bVar5.f135846c;
                    if (fVar5 == null) {
                        fVar5 = C51780f.f135862d;
                    }
                    C51782h hVar5 = fVar5.f135865b;
                    if (hVar5 == null) {
                        hVar5 = C51782h.f135867c;
                    }
                    String str6 = hVar5.f135870b;
                    C69664n.m101060f(str6, "clientOp.guiParams.targe…l.languageNameHeader.text");
                    a4.mo109330c(str6);
                    C51776b bVar6 = dqVar.f136165e;
                    if (bVar6 == null) {
                        bVar6 = C51776b.f135842e;
                    }
                    C51780f fVar6 = bVar6.f135846c;
                    if (fVar6 == null) {
                        fVar6 = C51780f.f135862d;
                    }
                    C51778d dVar4 = fVar6.f135866c;
                    if (dVar4 == null) {
                        dVar4 = C51778d.f135848m;
                    }
                    C51782h hVar6 = dVar4.f135852c;
                    if (hVar6 == null) {
                        hVar6 = C51782h.f135867c;
                    }
                    String str7 = hVar6.f135870b;
                    C69664n.m101060f(str7, "clientOp.guiParams.targe…ages.keyboardWaiting.text");
                    a4.mo109332e(str7);
                    C51776b bVar7 = dqVar.f136165e;
                    if (bVar7 == null) {
                        bVar7 = C51776b.f135842e;
                    }
                    C51780f fVar7 = bVar7.f135846c;
                    if (fVar7 == null) {
                        fVar7 = C51780f.f135862d;
                    }
                    C51778d dVar5 = fVar7.f135866c;
                    if (dVar5 == null) {
                        dVar5 = C51778d.f135848m;
                    }
                    C51782h hVar7 = dVar5.f135860k;
                    if (hVar7 == null) {
                        hVar7 = C51782h.f135867c;
                    }
                    String str8 = hVar7.f135870b;
                    C69664n.m101060f(str8, "clientOp.guiParams.targe…l.messages.translate.text");
                    a4.mo109333f(str8);
                    C51776b bVar8 = dqVar.f136165e;
                    if (bVar8 == null) {
                        bVar8 = C51776b.f135842e;
                    }
                    C51780f fVar8 = bVar8.f135846c;
                    if (fVar8 == null) {
                        fVar8 = C51780f.f135862d;
                    }
                    C51778d dVar6 = fVar8.f135866c;
                    if (dVar6 == null) {
                        dVar6 = C51778d.f135848m;
                    }
                    C51782h hVar8 = dVar6.f135861l;
                    if (hVar8 == null) {
                        hVar8 = C51782h.f135867c;
                    }
                    String str9 = hVar8.f135870b;
                    C69664n.m101060f(str9, "clientOp.guiParams.targe…anel.messages.cancel.text");
                    a4.mo109329b(str9);
                    boolean z2 = aoVar.f356353a;
                    C129964o oVar4 = a4.f356324a;
                    oVar4.copyOnWrite();
                    C129965p pVar3 = (C129965p) oVar4.instance;
                    pVar3.f356458a |= 1;
                    pVar3.f356461d = z2;
                    String str10 = dqVar.f136164d;
                    C69664n.m101060f(str10, "clientOp.targetLanguage");
                    a4.mo109331d(str10);
                    pVar = a4.mo109328a();
                }
                a2.mo109358f(pVar);
                return a2.mo109353a();
            } else if (i2 == 1) {
                C51910dq dqVar2 = ajVar.f356349b;
                if (dqVar2 == null) {
                    dqVar2 = C51910dq.f136159t;
                }
                C69664n.m101060f(dqVar2, "state.clientOp");
                return C129946b.m212133a(qVar, dqVar2);
            } else if (i2 == 2) {
                C129966q qVar3 = ajVar.f356348a;
                if (qVar3 == null) {
                    qVar3 = C129966q.f356466k;
                }
                C69664n.m101060f(qVar3, "state.interpreterState");
                if (qVar3.f356469b == 2) {
                    C129965p pVar4 = (C129965p) qVar3.f356470c;
                    C69664n.m101060f(pVar4, "this.waitingState");
                    C62934bn builder2 = qVar3.toBuilder();
                    C69664n.m101060f(builder2, "this.toBuilder()");
                    C129969t a5 = C69664n.m101061g((C129944c) builder2, "builder");
                    C129960k kVar = (C129960k) C129961l.f356436e.createBuilder();
                    C69664n.m101060f(kVar, "newBuilder()");
                    C129974y a6 = C69664n.m101061g(kVar, "builder");
                    C129960k kVar2 = a6.f356480a;
                    kVar2.copyOnWrite();
                    ((C129961l) kVar2.instance).f356441d = true;
                    String str11 = pVar4.f356462e;
                    C69664n.m101060f(str11, "waitingState.language");
                    a6.mo109361b(str11);
                    a5.mo109357e(a6.mo109360a());
                    C129944c cVar2 = a5.f356478a;
                    cVar2.copyOnWrite();
                    ((C129966q) cVar2.instance).f356476i = 4;
                    return a5.mo109353a();
                }
                C59052c cVar3 = (C59052c) f356414a.mo56226d();
                cVar3.mo56379ah(new C59094n(38635));
                cVar3.mo56386p("Transcription state can only be built from waiting state.");
                return qVar3;
            } else if (i2 != 3) {
                throw new C69677g();
            } else {
                throw new AssertionError();
            }
        } else {
            C59052c cVar4 = (C59052c) f356414a.mo56226d();
            cVar4.mo56379ah(new C59094n(38633));
            cVar4.mo56386p("Ignoring Keyboard update when not in Keyboard Mode");
            return qVar;
        }
    }
}
