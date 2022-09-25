package com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9011b.p9012a.p9016d;

import com.google.android.libraries.search.assistant.p2511d.C32534ai;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.search.assistant.platform.b.a.b.a.d.d */
/* compiled from: PG */
public final /* synthetic */ class C119685d implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C119692k f333485a;

    /* renamed from: b */
    public final /* synthetic */ Throwable f333486b;

    public /* synthetic */ C119685d(C119692k kVar, Throwable th) {
        this.f333485a = kVar;
        this.f333486b = th;
    }

    public final void run() {
        C119692k kVar = this.f333485a;
        Throwable th = this.f333486b;
        if (th != null) {
            C59104x d = C119692k.f333497a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "ConvEngine.DynamicServices");
            ((C59052c) ((C59052c) ((C59052c) d).mo56382g(th)).mo56372aa(34561)).mo56386p("AssistantStreamChunk data ended with error.");
        }
        for (C32534ai c : kVar.f333502f.values()) {
            c.mo38135c(th);
        }
        kVar.f333504h = true;
        C58976aa aaVar = C58975e.f156826a;
    }
}
