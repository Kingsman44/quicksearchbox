package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p800b.p806c.p807a;

import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p800b.p806c.C12479e;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C12991i;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60845bz;
import com.google.net.p4726a.p4727a.C62722b;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeoutException;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.b.b.c.a.g */
/* compiled from: PG */
final class C12467g implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C12479e f39353a;

    /* renamed from: b */
    final /* synthetic */ C12468h f39354b;

    public C12467g(C12468h hVar, C12479e eVar) {
        this.f39354b = hVar;
        this.f39353a = eVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C62722b bVar;
        C59104x c = C12468h.f39355a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "MssgInteractionManImpl");
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g(th)).mo56372aa(44255)).mo56386p("Message request execution failed");
        boolean z = th instanceof CancellationException;
        if (z || (th instanceof TimeoutException)) {
            C12468h hVar = this.f39354b;
            C12991i c2 = this.f39353a.mo20623c();
            if (z) {
                bVar = C62722b.CANCELLED;
            } else {
                bVar = C62722b.DEADLINE_EXCEEDED;
            }
            hVar.mo20619e(c2, bVar);
            C59104x b = C12468h.f39355a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "MssgInteractionManImpl");
            ((C59052c) ((C59052c) b).mo56372aa(44256)).mo56386p("Message request execution cancelled or timed out.");
            return;
        }
        this.f39354b.mo20619e(this.f39353a.mo20623c(), C62722b.UNKNOWN);
        C59104x d = C12468h.f39355a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "MssgInteractionManImpl");
        ((C59052c) ((C59052c) ((C59052c) d).mo56382g(th)).mo56372aa(44257)).mo56386p("Message request execution failed");
    }

    /* renamed from: gm */
    public final /* synthetic */ void mo17911gm(Object obj) {
        Void voidR = (Void) obj;
        C58976aa aaVar = C58975e.f156826a;
    }
}
