package com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8560e;

import com.google.android.apps.gsa.staticplugins.opa.tapas.p8491c.p8492a.C111255r;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8556a.C112138e;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8556a.C112139f;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113405ep;
import com.google.android.apps.search.assistant.platform.p9171i.p9217c.p9220b.p9224d.C121438d;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;
import java.util.Map;
import p3186j$.util.Map;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.l.e.bq */
/* compiled from: PG */
public final /* synthetic */ class C112349bq implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C112360ca f311745a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f311746b;

    /* renamed from: c */
    public final /* synthetic */ C60870cx f311747c;

    /* renamed from: d */
    public final /* synthetic */ C113405ep f311748d;

    /* renamed from: e */
    public final /* synthetic */ Map f311749e;

    /* renamed from: f */
    public final /* synthetic */ long f311750f;

    public /* synthetic */ C112349bq(C112360ca caVar, C60870cx cxVar, C60870cx cxVar2, C113405ep epVar, Map map, long j) {
        this.f311745a = caVar;
        this.f311746b = cxVar;
        this.f311747c = cxVar2;
        this.f311748d = epVar;
        this.f311749e = map;
        this.f311750f = j;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C112360ca caVar = this.f311745a;
        C60870cx cxVar = this.f311746b;
        C60870cx cxVar2 = this.f311747c;
        C113405ep epVar = this.f311748d;
        Map map = this.f311749e;
        long j = this.f311750f;
        caVar.f311772i = (C58495hd) C60856cj.m92909r(cxVar2);
        if (!((Boolean) C60856cj.m92909r(cxVar)).booleanValue()) {
            C59104x d = C112360ca.f311767d.mo56226d();
            d.mo56378ag(C58975e.f156826a, "ReflectionAdjuster");
            ((C59052c) ((C59052c) d).mo56372aa(27721)).mo56386p("Disable Reflection inference due to personal data is not allowed.");
            return C60856cj.m92900i(C121438d.f337093a);
        }
        caVar.f311769f.mo99076a(C111255r.REFLECTION_LOG, String.format("Prefix: [%s]", new Object[]{epVar.mo100033p()}));
        C59104x b = C112360ca.f311767d.mo56224b();
        b.mo56378ag(C58975e.f156826a, "ReflectionAdjuster");
        ((C59052c) ((C59052c) b).mo56372aa(27720)).mo56386p("reflection scores map:");
        Map.EL.forEach(caVar.f311772i, new C112348bp(caVar));
        return C112139f.f311399a.mo105234c("adjustRecordLatency", new C112138e(caVar, map, caVar.f311771h, j));
    }
}
