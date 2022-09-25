package com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8560e;

import com.google.android.apps.gsa.shared.p7066m.C90063do;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8491c.p8492a.C111255r;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113405ep;
import com.google.android.apps.search.assistant.platform.p9171i.p9217c.p9220b.p9224d.C121438d;
import com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.C121537f;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.Map;
import p3186j$.util.function.Supplier;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.l.e.bm */
/* compiled from: PG */
public final /* synthetic */ class C112345bm implements Supplier {

    /* renamed from: a */
    public final /* synthetic */ C112360ca f311739a;

    /* renamed from: b */
    public final /* synthetic */ C113405ep f311740b;

    /* renamed from: c */
    public final /* synthetic */ Map f311741c;

    public /* synthetic */ C112345bm(C112360ca caVar, C113405ep epVar, Map map) {
        this.f311739a = caVar;
        this.f311740b = epVar;
        this.f311741c = map;
    }

    public final Object get() {
        C60870cx cxVar;
        C112360ca caVar = this.f311739a;
        C113405ep epVar = this.f311740b;
        Map map = this.f311741c;
        long b = caVar.f311771h.mo26870b();
        if (((C112312ag) caVar.f311768e.mo27525b()).f311684p.isEmpty()) {
            C59104x c = C112360ca.f311767d.mo56225c();
            c.mo56378ag(C58975e.f156826a, "ReflectionAdjuster");
            ((C59052c) ((C59052c) c).mo56372aa(27719)).mo56386p("Expected at least one predictor enum.");
            caVar.f311769f.mo99076a(C111255r.REFLECTION_LOG, "Error: Expected at least one predictor enum.");
            return C60856cj.m92900i(C121438d.f337093a);
        }
        C121537f fVar = C112360ca.f311766c;
        if (!caVar.f311770g.mo79746e(C90063do.f249407cu) || !caVar.f311770g.mo79746e(C90063do.f249408cv)) {
            C112312ag agVar = (C112312ag) caVar.f311768e.mo27525b();
            C121537f fVar2 = C112312ag.f311669a;
            cxVar = agVar.f311674f.mo28209i(agVar.f311680l.mo100135a(), "userDataControlsStatus.isPersonalResponseAllowedLatest()", new C112380n(agVar));
            fVar2.mo105244m("isPersonalDataAllowed", cxVar);
        } else {
            cxVar = ((C112312ag) caVar.f311768e.mo27525b()).mo99493b();
        }
        fVar.mo105244m("isPersonalDataAllowed", cxVar);
        C60870cx c2 = C112312ag.f311669a.mo105234c("predict", new C112309ad((C112312ag) caVar.f311768e.mo27525b(), epVar, map));
        return C60856cj.m92895d(cxVar, c2).mo57335b(new C112349bq(caVar, cxVar, c2, epVar, map, b), caVar.f311773j.mo85210c("TapasLightweightExecutor"));
    }
}
