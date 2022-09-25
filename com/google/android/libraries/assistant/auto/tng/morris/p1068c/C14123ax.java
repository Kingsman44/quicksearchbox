package com.google.android.libraries.assistant.auto.tng.morris.p1068c;

import com.google.android.libraries.search.p2871b.p2895i.C37253b;
import com.google.android.libraries.search.p2871b.p2895i.C37254c;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.c.ax */
/* compiled from: PG */
public final /* synthetic */ class C14123ax implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C14124ay f42824a;

    /* renamed from: b */
    public final /* synthetic */ C37254c f42825b;

    public /* synthetic */ C14123ax(C14124ay ayVar, C37254c cVar) {
        this.f42824a = ayVar;
        this.f42825b = cVar;
    }

    public final void run() {
        C14124ay ayVar = this.f42824a;
        C37254c cVar = this.f42825b;
        if (ayVar.f42832g) {
            ayVar.f42828c.mo19974a(cVar);
            return;
        }
        C59104x b = C14124ay.f42826a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "Morris.PhoneAppFlowLog");
        ((C59052c) ((C59052c) b).mo56372aa(45832)).mo56387q("Milestone event %s logged without an active flow, ignoring.", ((C37253b) cVar).f98999a.f98876a.f98906a);
    }
}
