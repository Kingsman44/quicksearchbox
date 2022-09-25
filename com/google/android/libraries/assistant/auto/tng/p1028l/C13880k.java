package com.google.android.libraries.assistant.auto.tng.p1028l;

import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.libraries.assistant.auto.tng.l.k */
/* compiled from: PG */
public final /* synthetic */ class C13880k implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C13883n f42289a;

    public /* synthetic */ C13880k(C13883n nVar) {
        this.f42289a = nVar;
    }

    public final Object call() {
        boolean z = this.f42289a.f42297c != C13882m.NONE;
        C59104x b = C13883n.f42295a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "ConversationContext");
        Boolean valueOf = Boolean.valueOf(z);
        ((C59052c) ((C59052c) b).mo56372aa(44970)).mo56389s("#isInConversation %b", valueOf);
        return valueOf;
    }
}
