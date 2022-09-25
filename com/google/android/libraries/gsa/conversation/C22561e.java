package com.google.android.libraries.gsa.conversation;

import com.google.android.libraries.gsa.conversation.p1839c.C22365l;
import com.google.android.libraries.gsa.conversation.p1851e.C22571j;
import com.google.android.libraries.gsa.conversation.p1853g.C22629ap;
import com.google.android.libraries.gsa.conversation.p1853g.C22654bn;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3897e.p3921j.C52081en;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60845bz;

/* renamed from: com.google.android.libraries.gsa.conversation.e */
/* compiled from: PG */
final class C22561e implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C22573f f62193a;

    /* renamed from: b */
    final /* synthetic */ C22365l f62194b;

    public C22561e(C22573f fVar, C22365l lVar) {
        this.f62193a = fVar;
        this.f62194b = lVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C59104x c = C22594g.f62235a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "ConversationManager");
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g(th)).mo56372aa(48221)).mo56386p("Error receiving delta from server");
        this.f62193a.mo27663b(this.f62194b);
    }

    /* renamed from: gm */
    public final /* synthetic */ void mo17911gm(Object obj) {
        C58833ax axVar = (C58833ax) obj;
        if (!axVar.mo56113h()) {
            this.f62193a.f62209c.mo27706j(false);
            C22654bn bnVar = this.f62193a.f62209c.f62237c.f62313a;
            bnVar.f62405c.execute(C47810es.m84977q(new C22629ap(bnVar)));
            C59104x d = C22594g.f62235a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "ConversationManager");
            ((C59052c) ((C59052c) d).mo56372aa(48224)).mo56386p("No delta response received from server.");
            return;
        }
        C22573f fVar = this.f62193a;
        if (fVar.f62208b) {
            fVar.mo27663b(this.f62194b);
            C58976aa aaVar = C58975e.f156826a;
            return;
        }
        C52081en enVar = (C52081en) axVar.mo56107c();
        C22571j b = this.f62193a.f62207a.mo27659b(enVar);
        C58976aa aaVar2 = C58975e.f156826a;
        C22594g gVar = this.f62193a.f62209c;
        gVar.f62237c.mo27737c(enVar, new C22727l(this.f62194b, gVar, b));
    }
}
