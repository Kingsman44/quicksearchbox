package com.google.android.apps.gsa.tasks;

import androidx.work.C4395as;
import com.google.android.libraries.gsa.p1876k.C22868d;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.tasks.cp */
/* compiled from: PG */
final class C118541cp implements C22868d {

    /* renamed from: a */
    final /* synthetic */ int f329131a;

    /* renamed from: b */
    final /* synthetic */ C118542cq f329132b;

    public C118541cp(C118542cq cqVar, int i) {
        this.f329132b = cqVar;
        this.f329131a = i;
    }

    /* renamed from: gl */
    public final void mo17701gl(Throwable th) {
        C59104x c = C118542cq.f329133a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "WMEngineAGSAC");
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g(th)).mo56372aa(34008)).mo56386p("Failed to retrieve work info for cancellation.");
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17702gm(Object obj) {
        List list = (List) obj;
        if (list.isEmpty()) {
            C59104x c = C118542cq.f329133a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "WMEngineAGSAC");
            ((C59052c) ((C59052c) c).mo56372aa(34010)).mo56387q("No work scheduled with the requested task ID: %d", this.f329131a);
            return;
        }
        if (list.size() > 1) {
            C59104x c2 = C118542cq.f329133a.mo56225c();
            c2.mo56378ag(C58975e.f156826a, "WMEngineAGSAC");
            ((C59052c) ((C59052c) c2).mo56372aa(34009)).mo56387q("Multiple work requests scheduled with the task ID: %d", this.f329131a);
        }
        this.f329132b.f329134b.mo17428b().mo50549e(((C4395as) list.get(0)).f14026a);
    }
}
