package com.google.android.libraries.gsa.conversation.p1853g.p1854a;

import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60845bz;

/* renamed from: com.google.android.libraries.gsa.conversation.g.a.h */
/* compiled from: PG */
final class C22603h implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C22607l f62265a;

    public C22603h(C22607l lVar) {
        this.f62265a = lVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C59104x c = C22607l.f62272a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "JwnLibraryManager");
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g(th)).mo56372aa(48392)).mo56386p("Failed to load JWN libraries record");
        synchronized (this.f62265a) {
            this.f62265a.f62277f = C22606k.UNINITIALIZED;
            this.f62265a.f62275d.mo57357o(th);
        }
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        C58833ax axVar = (C58833ax) obj;
        synchronized (this.f62265a) {
            if (axVar.mo56113h() && this.f62265a.f62274c.isEmpty()) {
                this.f62265a.f62274c.addAll(((C22602g) axVar.mo56107c()).f62264a);
            }
            this.f62265a.mo27718e();
            this.f62265a.f62277f = C22606k.INITIALIZED;
        }
    }
}
