package com.google.android.libraries.assistant.auto.tng.suggestions.p1256i.p1259b;

import com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.C16090ap;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1168a.p1171b.C15777d;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1173b.p1202g.p1203a.C15938h;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1212d.C15949a;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1264l.p1265a.p1266a.C16391a;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1264l.p1267b.C16392a;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.android.libraries.search.p2871b.p2872a.p2875c.C37179a;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import java.util.ArrayList;
import java.util.Collections;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.i.b.o */
/* compiled from: PG */
public final /* synthetic */ class C16299o implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C16300p f47964a;

    /* renamed from: b */
    public final /* synthetic */ C15777d f47965b;

    /* renamed from: c */
    public final /* synthetic */ C15938h f47966c;

    public /* synthetic */ C16299o(C16300p pVar, C15777d dVar, C15938h hVar) {
        this.f47964a = pVar;
        this.f47965b = dVar;
        this.f47966c = hVar;
    }

    public final C60870cx apply(Object obj) {
        C58485gu guVar;
        C16300p pVar = this.f47964a;
        C15777d dVar = this.f47965b;
        C15938h hVar = this.f47966c;
        C16090ap g = dVar.mo22544b().mo22733g();
        ((C37215b) pVar.f47970d.mo17428b()).mo19974a(C37179a.f97406E.mo40816j("displayTypeWithTrigger", C16300p.m33314c(g, hVar)));
        C58485gu a = ((C15949a) pVar.f47972f.mo17428b()).mo22623a(dVar, (C58485gu) obj, hVar);
        ((C37215b) pVar.f47970d.mo17428b()).mo19974a(C37179a.f97404C.mo40816j("displayTypeWithTrigger", C16300p.m33314c(g, hVar)));
        C16391a aVar = pVar.f47981o;
        C58976aa aaVar = C58975e.f156826a;
        if (dVar.mo22544b().mo22733g().equals(C16090ap.MORRIS_DRIVING_SCREEN)) {
            C59104x b = C16391a.f48243a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "SuggestionRanker");
            ((C59052c) ((C59052c) b).mo56372aa(46706)).mo56386p("Skip ranking for Morris Driving Screen");
            guVar = C58485gu.m89842j(a);
        } else if (((Boolean) aVar.f48247e.mo17428b()).booleanValue()) {
            C59104x b2 = C16391a.f48243a.mo56224b();
            b2.mo56378ag(C58975e.f156826a, "SuggestionRanker");
            ((C59052c) ((C59052c) b2).mo56372aa(46705)).mo56386p("Run HeuristicRanker");
            guVar = C58485gu.m89842j(((C16392a) aVar.f48245c.mo27525b()).mo22894a(a, dVar));
        } else if (((Boolean) aVar.f48246d.mo17428b()).booleanValue()) {
            C59104x b3 = C16391a.f48243a.mo56224b();
            b3.mo56378ag(C58975e.f156826a, "SuggestionRanker");
            ((C59052c) ((C59052c) b3).mo56372aa(46704)).mo56386p("Run DebugRanker");
            guVar = C58485gu.m89842j(((C16392a) aVar.f48244b.mo27525b()).mo22894a(a, dVar));
        } else {
            C59104x b4 = C16391a.f48243a.mo56224b();
            b4.mo56378ag(C58975e.f156826a, "SuggestionRanker");
            ((C59052c) ((C59052c) b4).mo56372aa(46702)).mo56386p("Run Random shuffle");
            ArrayList arrayList = new ArrayList(a);
            Collections.shuffle(arrayList);
            guVar = C58485gu.m89842j(arrayList);
        }
        ((C37215b) pVar.f47970d.mo17428b()).mo19974a(C37179a.f97405D.mo40816j("displayTypeWithTrigger", C16300p.m33314c(g, hVar)));
        C58485gu a2 = pVar.f47976j.mo22871a(guVar, dVar);
        a2.size();
        dVar.mo22544b().mo22735i();
        return pVar.f47969c.mo22660q(a2, dVar.mo22544b());
    }
}
