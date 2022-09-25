package com.google.android.libraries.assistant.auto.tng.p1028l;

import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.libraries.assistant.auto.tng.l.h */
/* compiled from: PG */
public final /* synthetic */ class C13877h implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C13883n f42286a;

    public /* synthetic */ C13877h(C13883n nVar) {
        this.f42286a = nVar;
    }

    public final Object call() {
        C13883n nVar = this.f42286a;
        C59104x b = C13883n.f42295a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "ConversationContext");
        ((C59052c) ((C59052c) b).mo56372aa(44971)).mo56389s("#wasPreviousTurnHandledOnline %s", nVar.f42297c);
        return Boolean.valueOf(nVar.f42297c == C13882m.ONLINE);
    }
}
