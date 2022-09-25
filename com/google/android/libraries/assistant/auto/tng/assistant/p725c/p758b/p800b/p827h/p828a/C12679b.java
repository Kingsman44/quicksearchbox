package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p800b.p827h.p828a;

import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p800b.p827h.C12692e;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C12991i;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60845bz;
import com.google.net.p4726a.p4727a.C62722b;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeoutException;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.b.b.h.a.b */
/* compiled from: PG */
final class C12679b implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C12692e f39729a;

    /* renamed from: b */
    final /* synthetic */ C12680c f39730b;

    public C12679b(C12680c cVar, C12692e eVar) {
        this.f39730b = cVar;
        this.f39729a = eVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C62722b bVar;
        boolean z = th instanceof CancellationException;
        if (z || (th instanceof TimeoutException)) {
            C12680c cVar = this.f39730b;
            C12991i b = this.f39729a.mo20721b();
            if (z) {
                bVar = C62722b.CANCELLED;
            } else {
                bVar = C62722b.DEADLINE_EXCEEDED;
            }
            cVar.mo20718b(b, bVar);
            if (((Boolean) this.f39730b.f39732b.mo17428b()).booleanValue()) {
                C59104x b2 = C12680c.f39731a.mo56224b();
                b2.mo56378ag(C58975e.f156826a, "VoiceInteractionMgr");
                ((C59052c) ((C59052c) b2).mo56372aa(44352)).mo56386p("Voice request execution cancelled or timed out.");
                return;
            }
            C59104x d = C12680c.f39731a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "VoiceInteractionMgr");
            ((C59052c) ((C59052c) ((C59052c) d).mo56382g(th)).mo56372aa(44351)).mo56386p("Voice request execution failed");
            return;
        }
        this.f39730b.mo20718b(this.f39729a.mo20721b(), C62722b.UNKNOWN);
        C59104x d2 = C12680c.f39731a.mo56226d();
        d2.mo56378ag(C58975e.f156826a, "VoiceInteractionMgr");
        ((C59052c) ((C59052c) ((C59052c) d2).mo56382g(th)).mo56372aa(44353)).mo56386p("Voice request execution failed");
    }

    /* renamed from: gm */
    public final /* synthetic */ void mo17911gm(Object obj) {
        Void voidR = (Void) obj;
        C58976aa aaVar = C58975e.f156826a;
    }
}
