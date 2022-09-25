package com.google.android.libraries.assistant.auto.tng.media.mediabrowser;

import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60845bz;
import java.util.Iterator;

/* renamed from: com.google.android.libraries.assistant.auto.tng.media.mediabrowser.c */
/* compiled from: PG */
final class C14028c implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C14043e f42644a;

    public C14028c(C14043e eVar) {
        this.f42644a = eVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C59104x c = C14043e.f42662a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "AssistantNewsUpdate");
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g(th)).mo56372aa(45267)).mo56386p("Failed to update playMediaArgs.");
    }

    /* renamed from: gm */
    public final /* synthetic */ void mo17911gm(Object obj) {
        Void voidR = (Void) obj;
        C58976aa aaVar = C58975e.f156826a;
        Iterator it = this.f42644a.f42665d.iterator();
        while (it.hasNext()) {
            C14054p pVar = (C14054p) it.next();
            pVar.f42678b.f42681c.mo5830a(pVar.f42677a);
        }
    }
}
