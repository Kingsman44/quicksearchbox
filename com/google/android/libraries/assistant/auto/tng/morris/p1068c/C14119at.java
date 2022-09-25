package com.google.android.libraries.assistant.auto.tng.morris.p1068c;

import com.google.android.libraries.search.p2871b.p2895i.C37254c;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.c.at */
/* compiled from: PG */
public final /* synthetic */ class C14119at implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C14124ay f42818a;

    public /* synthetic */ C14119at(C14124ay ayVar) {
        this.f42818a = ayVar;
    }

    public final void run() {
        C14124ay ayVar = this.f42818a;
        if (ayVar.f42832g) {
            C37254c a = ayVar.f42830e.mo21432a();
            C59104x d = C14124ay.f42826a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "Morris.PhoneAppFlowLog");
            ((C59052c) ((C59052c) d).mo56372aa(45830)).mo56387q("Phone call AppFlow timed out. Closing flow with event %s", a.mo40778b().f98906a);
            ayVar.f42828c.mo19974a(a);
            ayVar.f42833h = null;
            ayVar.f42832g = false;
            return;
        }
        C59104x d2 = C14124ay.f42826a.mo56226d();
        d2.mo56378ag(C58975e.f156826a, "Morris.PhoneAppFlowLog");
        ((C59052c) ((C59052c) d2).mo56372aa(45829)).mo56386p("Phone AppFlow timeout triggered but flow is inactive.");
    }
}
