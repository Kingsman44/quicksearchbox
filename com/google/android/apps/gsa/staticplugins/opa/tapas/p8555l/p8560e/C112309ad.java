package com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8560e;

import com.google.android.apps.gsa.shared.p7066m.C90063do;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113405ep;
import com.google.common.p4522b.C58729pv;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.research.p5181a.p5188f.C66376a;
import java.util.Map;
import p3186j$.util.Optional;
import p3186j$.util.function.Supplier;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.l.e.ad */
/* compiled from: PG */
public final /* synthetic */ class C112309ad implements Supplier {

    /* renamed from: a */
    public final /* synthetic */ C112312ag f311664a;

    /* renamed from: b */
    public final /* synthetic */ C113405ep f311665b;

    /* renamed from: c */
    public final /* synthetic */ Map f311666c;

    public /* synthetic */ C112309ad(C112312ag agVar, C113405ep epVar, Map map) {
        this.f311664a = agVar;
        this.f311665b = epVar;
        this.f311666c = map;
    }

    public final Object get() {
        C112312ag agVar = this.f311664a;
        C113405ep epVar = this.f311665b;
        Map map = this.f311666c;
        if (agVar.f311675g.mo79746e(C90063do.f249374cN)) {
            C58976aa aaVar = C58975e.f156826a;
            epVar.mo100026i().isDone();
        }
        Optional optional = (Optional) C112312ag.f311669a.mo105238g("predict", agVar, new C112392z(agVar, (C66376a) C112367ch.f311789a.mo105235d("eventFromRequest", new C112366cg(agVar.f311672d, epVar, map))));
        if (Thread.interrupted()) {
            return C60856cj.m92900i(C58729pv.f156485a);
        }
        if (optional.isEmpty()) {
            return C60856cj.m92900i(C58729pv.f156485a);
        }
        return agVar.f311674f.mo28209i((C60870cx) optional.get(), "rankFuture", C112306aa.f311661a);
    }
}
