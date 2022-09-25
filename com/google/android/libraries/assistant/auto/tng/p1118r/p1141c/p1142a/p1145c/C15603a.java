package com.google.android.libraries.assistant.auto.tng.p1118r.p1141c.p1142a.p1145c;

import com.google.android.libraries.assistant.auto.tng.p1118r.p1141c.p1152b.C15666r;
import com.google.android.libraries.assistant.auto.tng.p1118r.p1141c.p1152b.C15668t;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;

/* renamed from: com.google.android.libraries.assistant.auto.tng.r.c.a.c.a */
/* compiled from: PG */
public final /* synthetic */ class C15603a implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C15609g f46654a;

    /* renamed from: b */
    public final /* synthetic */ C15666r f46655b;

    public /* synthetic */ C15603a(C15609g gVar, C15666r rVar) {
        this.f46654a = gVar;
        this.f46655b = rVar;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C15609g gVar = this.f46654a;
        C15666r rVar = this.f46655b;
        int b = rVar.mo22476b().mo22462b();
        int i = b - 1;
        if (b == 0) {
            throw null;
        } else if (i == 0) {
            C58976aa aaVar = C58975e.f156826a;
            return gVar.mo22422b(rVar, C60856cj.m92904m(C47810es.m84978r(new C15605c(gVar, rVar, rVar.mo22476b().mo22461a())), gVar.f46675l));
        } else if (i == 1) {
            C59104x b2 = C15609g.f46664a.mo56224b();
            b2.mo56378ag(C58975e.f156826a, "PortableDispatcher");
            ((C59052c) ((C59052c) b2).mo56372aa(46199)).mo56386p("dispatchIntentQuery");
            return gVar.mo22422b(rVar, C60856cj.m92904m(C47810es.m84978r(new C15608f(gVar, rVar.mo22476b().mo22470d())), gVar.f46675l));
        } else if (i != 2) {
            C59104x d = C15609g.f46664a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "PortableDispatcher");
            ((C59052c) ((C59052c) d).mo56372aa(46200)).mo56386p("Unknown NLU type.");
            return C60856cj.m92900i(C15668t.m32460b());
        } else {
            C58976aa aaVar2 = C58975e.f156826a;
            return gVar.mo22422b(rVar, C60856cj.m92904m(C47810es.m84978r(new C15607e(gVar)), gVar.f46675l));
        }
    }
}
