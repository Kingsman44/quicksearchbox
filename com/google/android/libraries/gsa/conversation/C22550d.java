package com.google.android.libraries.gsa.conversation;

import com.google.android.libraries.gsa.conversation.p1839c.C22365l;
import com.google.android.libraries.gsa.conversation.p1851e.C22571j;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60845bz;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4449cd.p4456g.C57981b;

/* renamed from: com.google.android.libraries.gsa.conversation.d */
/* compiled from: PG */
final class C22550d implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C60870cx f62157a;

    /* renamed from: b */
    final /* synthetic */ C22573f f62158b;

    /* renamed from: c */
    final /* synthetic */ C22365l f62159c;

    public C22550d(C22573f fVar, C22365l lVar, C60870cx cxVar) {
        this.f62158b = fVar;
        this.f62159c = lVar;
        this.f62157a = cxVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C59104x c = C22594g.f62235a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "ConversationManager");
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g(th)).mo56372aa(48218)).mo56386p("Error receiving delta stream from server");
        this.f62158b.mo27664c(this.f62159c, this.f62157a);
    }

    /* renamed from: gm */
    public final /* synthetic */ void mo17911gm(Object obj) {
        C58833ax axVar = (C58833ax) obj;
        if (!axVar.mo56113h()) {
            C58976aa aaVar = C58975e.f156826a;
            this.f62158b.mo27664c(this.f62159c, this.f62157a);
            return;
        }
        C22573f fVar = this.f62158b;
        if (fVar.f62208b) {
            fVar.mo27663b(this.f62159c);
            C58976aa aaVar2 = C58975e.f156826a;
            return;
        }
        C22571j jVar = fVar.f62207a;
        this.f62158b.f62209c.f62237c.mo27738d((C57981b) axVar.mo56107c(), new C22727l(this.f62159c, this.f62158b.f62209c, new C22571j(jVar.f62205a.mo27655a("DeltaStream", "CCL"), jVar.f62206b)));
    }
}
