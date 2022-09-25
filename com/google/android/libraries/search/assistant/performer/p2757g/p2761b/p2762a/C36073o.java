package com.google.android.libraries.search.assistant.performer.p2757g.p2761b.p2762a;

import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60845bz;

/* renamed from: com.google.android.libraries.search.assistant.performer.g.b.a.o */
/* compiled from: PG */
final class C36073o implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C36074p f94364a;

    public C36073o(C36074p pVar) {
        this.f94364a = pVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C59104x d = C36075q.f94370a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "MediaPerformerExecutor");
        ((C59052c) ((C59052c) ((C59052c) d).mo56382g(th)).mo56372aa(52169)).mo56389s("Failed to start open app intent activity for package: %s", this.f94364a.f94367c.mo1039g());
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        Void voidR = (Void) obj;
        C59104x b = C36075q.f94370a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "MediaPerformerExecutor");
        ((C59052c) ((C59052c) b).mo56372aa(52170)).mo56389s("Successfully started open app intent activity for package: %s", this.f94364a.f94367c.mo1039g());
    }
}
