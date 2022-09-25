package com.google.android.libraries.search.p3055n.p3061c.p3062a.p3064b;

import com.google.android.libraries.search.p3055n.C39356be;
import com.google.android.libraries.search.p3055n.C39357bf;
import com.google.android.libraries.search.p3055n.p3061c.p3062a.C39389ae;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.libraries.search.n.c.a.b.l */
/* compiled from: PG */
public final class C39423l implements C39420i {

    /* renamed from: a */
    private static final C59071e f103799a = C59071e.m91332i("com.google.android.libraries.search.n.c.a.b.l");

    /* renamed from: a */
    public final int mo41839a(C39419h hVar) {
        C39389ae a = hVar.mo41826b().mo41820a();
        C59071e eVar = f103799a;
        C59104x b = eVar.mo56224b();
        b.mo56378ag(C58975e.f156826a, "SharedDecisionMaker");
        C59052c cVar = (C59052c) ((C59052c) b).mo56372aa(53646);
        C39357bf bfVar = hVar.mo41825a().f104599c;
        if (bfVar == null) {
            bfVar = C39357bf.f103644d;
        }
        C39356be a2 = C39356be.m68761a(bfVar.f103647b);
        if (a2 == null) {
            a2 = C39356be.DEFAULT_PERSONAL;
        }
        cVar.mo56354G("#getNextAction for requester %s, mode %s ", a, a2.name());
        if (hVar.mo41832g() || hVar.mo41835i()) {
            if (a == C39389ae.HOTWORD_DETECTED_DISCONNECT_FUTURE_FINISHED_PROPERLY || a == C39389ae.HOTWORD_DETECTED_DISCONNECT_FUTURE_EXCEPTION) {
                return 3;
            }
            if (hVar.mo41833h()) {
                C59104x d = eVar.mo56226d();
                d.mo56378ag(C58975e.f156826a, "SharedDecisionMaker");
                ((C59052c) ((C59052c) d).mo56372aa(53649)).mo56386p("Hotword detection is running ready! NO_OP for now");
                return 4;
            }
            C59104x b2 = eVar.mo56224b();
            b2.mo56378ag(C58975e.f156826a, "SharedDecisionMaker");
            ((C59052c) ((C59052c) b2).mo56372aa(53648)).mo56386p("NextAction.START");
            return 1;
        } else if (hVar.mo41833h()) {
            C59104x b3 = eVar.mo56224b();
            b3.mo56378ag(C58975e.f156826a, "SharedDecisionMaker");
            ((C59052c) ((C59052c) b3).mo56372aa(53651)).mo56386p("Hotword is running while the screen is off on non-DSP device. Stop hotword detection.");
            return 2;
        } else {
            C59104x b4 = eVar.mo56224b();
            b4.mo56378ag(C58975e.f156826a, "SharedDecisionMaker");
            ((C59052c) ((C59052c) b4).mo56372aa(53650)).mo56386p("Screen is off on non-DSP device, no operation needed since hotword is not running.");
            return 4;
        }
    }
}
