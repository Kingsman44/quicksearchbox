package com.google.android.libraries.assistant.auto.tng.p1028l;

import androidx.p104d.p105a.C2164c;
import com.google.android.libraries.search.p2871b.p2872a.p2875c.C37179a;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60904dr;
import com.google.knowledge.p4661a.p4662a.C61752n;
import com.google.speech.recognizer.p5233a.C67438ag;
import java.util.concurrent.Executor;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.auto.tng.l.ch */
/* compiled from: PG */
final class C13809ch implements C13754bg {

    /* renamed from: a */
    final /* synthetic */ C13811cj f42032a;

    /* renamed from: b */
    private final C60870cx f42033b;

    /* renamed from: c */
    private final C60870cx f42034c;

    /* renamed from: d */
    private final Executor f42035d;

    public C13809ch(C13811cj cjVar, C60870cx cxVar, C60870cx cxVar2) {
        this.f42032a = cjVar;
        this.f42033b = cxVar;
        this.f42034c = cxVar2;
        this.f42035d = new C60904dr(cjVar.f42063g);
    }

    /* renamed from: a */
    public final void mo21250a(C13725ai aiVar) {
        C58976aa aaVar = C58975e.f156826a;
        C46459k.m82829b(this.f42032a.f42042C.mo21231a(aiVar, false, this.f42033b, this.f42034c), "Error Logging Endpointer Event", new Object[0]);
        C46459k.m82829b(this.f42032a.f42064h.mo21344a(aiVar), "processing endpointer event", new Object[0]);
        Optional a = C13726aj.m29976a(aiVar);
        if (!a.isEmpty()) {
            if (this.f42032a.f42041B.isPresent()) {
                ((C13872dx) this.f42032a.f42041B.get()).mo21323a((C67438ag) a.get());
            }
            C13863do doVar = this.f42032a.f42043D;
            C67438ag agVar = (C67438ag) a.get();
            C60870cx cxVar = this.f42033b;
            C60870cx cxVar2 = this.f42034c;
            doVar.mo21314e(agVar);
            C46459k.m82829b(doVar.mo21312a(agVar, cxVar, cxVar2), "Error Logging Recognition Event", new Object[0]);
            C13808cg cgVar = new C13808cg(this, a);
            C60856cj.m92911t(this.f42032a.f42059c, C47810es.m84974n(cgVar), this.f42035d);
            C60856cj.m92911t(this.f42032a.f42058b, C47810es.m84974n(cgVar), this.f42035d);
        }
        if ((aiVar.f41857a & 4) != 0) {
            C58485gu guVar = (C58485gu) this.f42032a.f42068l.mo17428b();
            C61752n nVar = aiVar.f41859c;
            if (nVar == null) {
                nVar = C61752n.f166808f;
            }
            if (guVar.contains(nVar.f166811b)) {
                C59104x b = C13811cj.f42039a.mo56224b();
                b.mo56378ag(C58975e.f156826a, "HybridFOPolicy");
                ((C59052c) ((C59052c) b).mo56372aa(45015)).mo56386p("high confidence offline intent found");
                this.f42032a.f42061e.f42086b.mo19974a(C37179a.f97443aO);
                C2164c cVar = this.f42032a.f42076t;
                cVar.getClass();
                cVar.mo5437b((Object) null);
            }
        }
    }
}
