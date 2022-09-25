package com.google.android.libraries.search.assistant.invocation.p2651n.p2654c;

import android.os.Bundle;
import com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.p2589a.p2590a.C33497h;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C62942bv;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.invocation.n.c.u */
/* compiled from: PG */
public final class C34004u {
    /* renamed from: a */
    public static final C34002s m62667a(C33497h hVar, Bundle bundle) {
        try {
            C69664n.m101061g(bundle, "hints");
            hVar.f89651a.setUiHints(bundle);
            C34001r rVar = (C34001r) C34002s.f90631c.createBuilder();
            C69664n.m101060f(rVar, "newBuilder()");
            C33984aa a = C69664n.m101061g(rVar, "builder");
            C33997n nVar = (C33997n) C33998o.f90626a.createBuilder();
            C69664n.m101060f(nVar, "newBuilder()");
            C69664n.m101061g(nVar, "builder");
            C62942bv build = nVar.build();
            C69664n.m101060f(build, "_builder.build()");
            C33998o oVar = (C33998o) build;
            C69664n.m101061g(oVar, "value");
            C34001r rVar2 = a.f90609a;
            rVar2.copyOnWrite();
            C34002s sVar = (C34002s) rVar2.instance;
            oVar.getClass();
            sVar.f90634b = oVar;
            sVar.f90633a = 1;
            return a.mo39177a();
        } catch (Exception e) {
            C59052c cVar = (C59052c) C34008y.f90653a.mo56226d();
            cVar.mo56378ag(C58975e.f156826a, "INV.SystemUI");
            C59052c cVar2 = (C59052c) cVar.mo56382g(e);
            cVar2.mo56379ah(new C59094n(51321));
            cVar2.mo56386p("setUiHints (Backend): Caught exception");
            C34001r rVar3 = (C34001r) C34002s.f90631c.createBuilder();
            C69664n.m101060f(rVar3, "newBuilder()");
            C33984aa a2 = C69664n.m101061g(rVar3, "builder");
            C33994k kVar = (C33994k) C33996m.f90622c.createBuilder();
            C69664n.m101060f(kVar, "newBuilder()");
            C33991h a3 = C69664n.m101061g(kVar, "builder");
            String message = e.getMessage();
            if (message == null) {
                message = "Exception when calling setUiHints";
            }
            a3.mo39182b(message);
            a2.mo39178b(a3.mo39181a());
            return a2.mo39177a();
        }
    }
}
