package com.google.android.libraries.assistant.auto.tng.morris.p1068c;

import com.google.android.libraries.search.p2871b.p2895i.C37253b;
import com.google.android.libraries.search.p2871b.p2895i.C37254c;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.c.av */
/* compiled from: PG */
public final /* synthetic */ class C14121av implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C14124ay f42820a;

    /* renamed from: b */
    public final /* synthetic */ C37254c f42821b;

    public /* synthetic */ C14121av(C14124ay ayVar, C37254c cVar) {
        this.f42820a = ayVar;
        this.f42821b = cVar;
    }

    public final void run() {
        C14124ay ayVar = this.f42820a;
        C37254c cVar = this.f42821b;
        if (ayVar.f42832g) {
            C60870cx cxVar = ayVar.f42833h;
            if (cxVar != null) {
                cxVar.cancel(false);
                ayVar.f42833h = null;
            }
            ayVar.f42828c.mo19974a(cVar);
            ayVar.f42832g = false;
            return;
        }
        C59104x b = C14124ay.f42826a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "Morris.PhoneAppFlowLog");
        ((C59052c) ((C59052c) b).mo56372aa(45831)).mo56387q("logEndEvent (%s) called without an active flow existing.", ((C37253b) cVar).f98999a.f98876a.f98906a);
    }
}
