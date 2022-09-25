package com.google.android.apps.gsa.staticplugins.fedass.ipc.service;

import com.google.android.apps.gsa.staticplugins.fedass.p7939a.C100742h;
import com.google.android.libraries.assistant.trainingcache.p1615a.p1616a.C19409m;
import com.google.android.libraries.assistant.trainingcache.p1615a.p1616a.C19415s;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.apps.gsa.staticplugins.fedass.ipc.service.p */
/* compiled from: PG */
public final /* synthetic */ class C101003p implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C101012y f282091a;

    /* renamed from: b */
    public final /* synthetic */ String f282092b;

    /* renamed from: c */
    public final /* synthetic */ boolean f282093c;

    public /* synthetic */ C101003p(C101012y yVar, String str, boolean z) {
        this.f282091a = yVar;
        this.f282092b = str;
        this.f282093c = z;
    }

    public final C60870cx apply(Object obj) {
        C101012y yVar = this.f282091a;
        String str = this.f282092b;
        boolean z = this.f282093c;
        Void voidR = (Void) obj;
        C59104x b = C101012y.f282104a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "TrainCommBinder");
        ((C59052c) ((C59052c) b).mo56372aa(19614)).mo56386p("registerTraining()");
        if (!yVar.f282109f.mo92030a()) {
            C59104x d = C101012y.f282104a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "TrainCommBinder");
            ((C59052c) ((C59052c) d).mo56372aa(19615)).mo56386p("Unsupported GMS version. Must be Y2019w21OrGreater");
            return C60866ct.f164955a;
        }
        C100742h c = C100742h.m166944c(C60866ct.f164955a);
        for (C19409m bVar : yVar.f282107d) {
            c = c.mo92035e(new C100989b(bVar, str)).mo92035e(new C100998k(yVar, z)).mo92033b(Throwable.class, C100999l.f282084a);
        }
        for (C19415s sVar : yVar.f282108e) {
            c = c.mo92035e(new C101000m(sVar, str)).mo92035e(new C101001n(yVar, z, sVar)).mo92033b(Throwable.class, C101002o.f282090a);
        }
        return c.f281631a;
    }
}
