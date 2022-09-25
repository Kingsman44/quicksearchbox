package com.google.android.libraries.assistant.auto.tng.morris.p1068c;

import com.google.android.libraries.search.p2871b.p2895i.C37253b;
import com.google.android.libraries.search.p2871b.p2895i.C37254c;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.c.aw */
/* compiled from: PG */
public final /* synthetic */ class C14122aw implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C14124ay f42822a;

    /* renamed from: b */
    public final /* synthetic */ C37254c f42823b;

    public /* synthetic */ C14122aw(C14124ay ayVar, C37254c cVar) {
        this.f42822a = ayVar;
        this.f42823b = cVar;
    }

    public final void run() {
        C14124ay ayVar = this.f42822a;
        C37254c cVar = this.f42823b;
        if (!ayVar.f42832g) {
            ayVar.f42828c.mo19974a(cVar);
            ayVar.f42832g = true;
            C14120au auVar = new C14120au(ayVar);
            ayVar.f42833h = C60856cj.m92902k(C47810es.m84965e(auVar), C14124ay.f42827b.toMillis(), TimeUnit.MILLISECONDS, ayVar.f42829d);
            return;
        }
        C59104x b = C14124ay.f42826a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "Morris.PhoneAppFlowLog");
        ((C59052c) ((C59052c) b).mo56372aa(45833)).mo56387q("logStartEvent (%s) called while existing flow is active.", ((C37253b) cVar).f98999a.f98876a.f98906a);
    }
}
