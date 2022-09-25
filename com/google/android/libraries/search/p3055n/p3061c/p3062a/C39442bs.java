package com.google.android.libraries.search.p3055n.p3061c.p3062a;

import com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.p2589a.p2590a.C33497h;
import com.google.android.libraries.search.p3055n.C39264an;
import com.google.android.libraries.search.p3055n.C39265ao;
import com.google.android.libraries.search.p3055n.C39267aq;
import com.google.android.libraries.search.p3055n.C39268ar;
import com.google.android.libraries.search.p3055n.C39356be;
import com.google.android.libraries.search.p3055n.C39357bf;
import com.google.android.libraries.search.p3055n.p3061c.p3062a.p3064b.C39419h;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60930r;
import com.google.protobuf.C62940bt;
import com.google.speech.p5218j.C67086kn;
import com.google.speech.p5218j.C67087ko;

/* renamed from: com.google.android.libraries.search.n.c.a.bs */
/* compiled from: PG */
public final /* synthetic */ class C39442bs implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C39479cu f103834a;

    /* renamed from: b */
    public final /* synthetic */ C39264an f103835b;

    public /* synthetic */ C39442bs(C39479cu cuVar, C39264an anVar) {
        this.f103834a = cuVar;
        this.f103835b = anVar;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C39479cu cuVar = this.f103834a;
        C39264an anVar = this.f103835b;
        C58833ax axVar = cuVar.f103939A;
        boolean z = false;
        if (axVar.mo56113h()) {
            C39357bf bfVar = ((C39419h) axVar.mo56107c()).mo41825a().f104599c;
            if (bfVar == null) {
                bfVar = C39357bf.f103644d;
            }
            C39356be a = C39356be.m68761a(bfVar.f103647b);
            if (a == null) {
                a = C39356be.DEFAULT_PERSONAL;
            }
            if (a == C39356be.EXTERNAL) {
                z = true;
            }
        }
        ((C59052c) ((C59052c) C39387ac.f103702a.mo56224b()).mo56372aa(53520)).mo56389s("isExternalHotwordVerificationMode: %b", Boolean.valueOf(z));
        if (!z) {
            C59104x d = C39479cu.f103938a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "SodaTriggeringFrontend");
            ((C59052c) ((C59052c) d).mo56372aa(53611)).mo56386p("HDM is not in the right mode to do external hotword verification!");
            C67086kn knVar = (C67086kn) C67087ko.f182366n.createBuilder();
            C62940bt btVar = C39268ar.f103440e;
            C39265ao aoVar = (C39265ao) C39268ar.f103439d.createBuilder();
            C39267aq aqVar = C39267aq.INVALID_REQUEST;
            aoVar.copyOnWrite();
            C39268ar arVar = (C39268ar) aoVar.instance;
            arVar.f103443b = aqVar.f103438e;
            arVar.f103442a = 1 | arVar.f103442a;
            aoVar.copyOnWrite();
            C39268ar arVar2 = (C39268ar) aoVar.instance;
            arVar2.f103442a |= 2;
            arVar2.f103444c = "HDM is not in the right mode to do external hotword verification!";
            knVar.mo58885m(btVar, (C39268ar) aoVar.build());
            return C60856cj.m92900i((C67087ko) knVar.build());
        }
        if (!cuVar.f103974y.mo56113h()) {
            C59104x b = C39479cu.f103938a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "SodaTriggeringFrontend");
            ((C59052c) ((C59052c) b).mo56372aa(53610)).mo56386p("Create a HotwordDetectorManager for external hotword verification.");
            cuVar.f103974y = C58833ax.m90834k(cuVar.f103952c.mo41819a((C33497h) cuVar.f103964o.mo56107c(), ((C39419h) cuVar.f103939A.mo56107c()).mo41828d(), (C39396al) cuVar.f103940B.mo56107c(), cuVar.f103970u));
        }
        cuVar.f103944F = C39428be.m68860a(new C39478ct(cuVar, anVar));
        C39406av avVar = (C39406av) cuVar.f103974y.mo56107c();
        C39390af afVar = cuVar.f103944F;
        afVar.getClass();
        return C60922j.m93045h(avVar.f103748b.mo51512b(new C39405au(avVar, anVar, afVar), avVar.f103749c), C47810es.m84966f(new C39459ca(cuVar)), cuVar.f103953d);
    }
}
