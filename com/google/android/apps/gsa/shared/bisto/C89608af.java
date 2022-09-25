package com.google.android.apps.gsa.shared.bisto;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.apps.gsa.shared.bisto.af */
/* compiled from: PG */
public final /* synthetic */ class C89608af implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C89618ap f242669a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f242670b;

    /* renamed from: c */
    public final /* synthetic */ C60870cx f242671c;

    public /* synthetic */ C89608af(C89618ap apVar, C60870cx cxVar, C60870cx cxVar2) {
        this.f242669a = apVar;
        this.f242670b = cxVar;
        this.f242671c = cxVar2;
    }

    public final Object call() {
        C89618ap apVar = this.f242669a;
        C60870cx cxVar = this.f242670b;
        C60870cx cxVar2 = this.f242671c;
        C59104x b = C89618ap.f242682a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "HotwordModelMapsAccessor");
        ((C59052c) ((C59052c) b).mo56372aa(10256)).mo56386p("model map update futures resolved.");
        try {
            C58495hd hdVar = (C58495hd) C60856cj.m92909r(cxVar);
            C58495hd hdVar2 = (C58495hd) C60856cj.m92909r(cxVar2);
            apVar.f242686e = hdVar2;
            if (!hdVar.isEmpty()) {
                apVar.f242685d = hdVar;
            }
            if (!hdVar2.isEmpty()) {
                apVar.f242686e = hdVar2;
            }
            apVar.f242687f = true;
        } catch (Throwable th) {
            C59104x c = C89618ap.f242682a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "HotwordModelMapsAccessor");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(th)).mo56372aa(10257)).mo56386p("Could not update maps.");
        }
        return C118826c.f331422a;
    }
}
