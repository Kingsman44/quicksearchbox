package com.google.android.apps.search.fedora.p10106i;

import com.google.android.apps.search.fedora.metrics.C133072j;
import com.google.android.apps.search.fedora.p10110k.p10111a.C133006d;
import com.google.android.apps.search.fedora.p10110k.p10111a.C133009g;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;

/* renamed from: com.google.android.apps.search.fedora.i.x */
/* compiled from: PG */
public final /* synthetic */ class C132950x implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C132924am f362636a;

    public /* synthetic */ C132950x(C132924am amVar) {
        this.f362636a = amVar;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C60870cx cxVar;
        C132924am amVar = this.f362636a;
        ((C133072j) amVar.f362591h.mo17428b()).mo110963a("Fedora.Synclet.NumExecutions");
        if (amVar.f362593j) {
            C133009g gVar = (C133009g) amVar.f362590g.mo17428b();
            C59104x b = C133009g.f362724a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "FedoraTrainRegClient");
            ((C59052c) ((C59052c) b).mo56372aa(39973)).mo56386p("unRegisterTraining");
            C133006d dVar = new C133006d(gVar);
            cxVar = C60856cj.m92905n(C47810es.m84965e(dVar), gVar.f362726c);
        } else {
            cxVar = C60866ct.f164955a;
        }
        return C47633f.m84733g(cxVar).mo51516i(new C132915ad(amVar), amVar.f362594k).mo51516i(new C132916ae(amVar), amVar.f362594k).mo51516i(new C132917af(amVar), amVar.f362594k).mo51516i(new C132918ag(amVar), amVar.f362594k);
    }
}
