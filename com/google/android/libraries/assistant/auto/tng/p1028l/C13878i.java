package com.google.android.libraries.assistant.auto.tng.p1028l;

import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.libraries.assistant.auto.tng.l.i */
/* compiled from: PG */
public final /* synthetic */ class C13878i implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C13883n f42287a;

    public /* synthetic */ C13878i(C13883n nVar) {
        this.f42287a = nVar;
    }

    public final void run() {
        C13883n nVar = this.f42287a;
        C59104x b = C13883n.f42295a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "ConversationContext");
        ((C59052c) ((C59052c) b).mo56372aa(44973)).mo56386p("#markTurnHandledOnline");
        nVar.f42297c = C13882m.ONLINE;
    }
}
