package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p800b.p819f.p820a;

import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p800b.p819f.C12612e;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C12991i;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60845bz;
import com.google.net.p4726a.p4727a.C62722b;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeoutException;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.b.b.f.a.b */
/* compiled from: PG */
final class C12600b implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C12612e f39564a;

    /* renamed from: b */
    final /* synthetic */ C12601c f39565b;

    public C12600b(C12601c cVar, C12612e eVar) {
        this.f39565b = cVar;
        this.f39564a = eVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C62722b bVar;
        boolean z = th instanceof CancellationException;
        if (z || (th instanceof TimeoutException)) {
            C12601c cVar = this.f39565b;
            C12991i b = this.f39564a.mo20676b();
            if (z) {
                bVar = C62722b.CANCELLED;
            } else {
                bVar = C62722b.DEADLINE_EXCEEDED;
            }
            cVar.mo20673b(b, bVar);
            if (((Boolean) this.f39565b.f39567b.mo17428b()).booleanValue()) {
                C59104x b2 = C12601c.f39566a.mo56224b();
                b2.mo56378ag(C58975e.f156826a, "TextInteractionMgr");
                ((C59052c) ((C59052c) b2).mo56372aa(44314)).mo56386p("Text request execution cancelled or timed out.");
                return;
            }
            C59104x d = C12601c.f39566a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "TextInteractionMgr");
            ((C59052c) ((C59052c) ((C59052c) d).mo56382g(th)).mo56372aa(44313)).mo56386p("Text request execution failed");
            return;
        }
        this.f39565b.mo20673b(this.f39564a.mo20676b(), C62722b.UNKNOWN);
        C59104x d2 = C12601c.f39566a.mo56226d();
        d2.mo56378ag(C58975e.f156826a, "TextInteractionMgr");
        ((C59052c) ((C59052c) ((C59052c) d2).mo56382g(th)).mo56372aa(44315)).mo56386p("Text request execution failed");
    }

    /* renamed from: gm */
    public final /* synthetic */ void mo17911gm(Object obj) {
        Void voidR = (Void) obj;
        C58976aa aaVar = C58975e.f156826a;
    }
}
