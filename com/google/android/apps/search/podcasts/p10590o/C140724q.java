package com.google.android.apps.search.podcasts.p10590o;

import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60845bz;

/* renamed from: com.google.android.apps.search.podcasts.o.q */
/* compiled from: PG */
final class C140724q implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ Runnable f382147a;

    /* renamed from: b */
    final /* synthetic */ C140725r f382148b;

    public C140724q(C140725r rVar, Runnable runnable) {
        this.f382148b = rVar;
        this.f382147a = runnable;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C59104x d = C140725r.f382149a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "ReactionManager");
        ((C59052c) ((C59052c) ((C59052c) d).mo56382g(th)).mo56372aa(41642)).mo56386p("Failed to sync reactions.");
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        Void voidR = (Void) obj;
        this.f382148b.mo115843e(C140723p.f382146a, this.f382147a);
        this.f382147a.run();
    }
}
