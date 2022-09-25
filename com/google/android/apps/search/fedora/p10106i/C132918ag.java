package com.google.android.apps.search.fedora.p10106i;

import com.google.android.apps.search.fedora.p10110k.p10111a.C133005c;
import com.google.android.apps.search.fedora.p10110k.p10111a.C133009g;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.apps.search.fedora.i.ag */
/* compiled from: PG */
public final /* synthetic */ class C132918ag implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C132924am f362577a;

    public /* synthetic */ C132918ag(C132924am amVar) {
        this.f362577a = amVar;
    }

    public final C60870cx apply(Object obj) {
        C132924am amVar = this.f362577a;
        Void voidR = (Void) obj;
        if (!amVar.f362593j) {
            return C60866ct.f164955a;
        }
        C133009g gVar = (C133009g) amVar.f362590g.mo17428b();
        C59104x b = C133009g.f362724a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "FedoraTrainRegClient");
        ((C59052c) ((C59052c) b).mo56372aa(39972)).mo56386p("registerTraining");
        C133005c cVar = new C133005c(gVar);
        return C60856cj.m92905n(C47810es.m84965e(cVar), gVar.f362726c);
    }
}
