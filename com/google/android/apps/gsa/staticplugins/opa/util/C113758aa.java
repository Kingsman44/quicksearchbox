package com.google.android.apps.gsa.staticplugins.opa.util;

import com.google.android.apps.gsa.search.core.p6805i.C86123s;
import com.google.android.apps.gsa.shared.util.p7159c.C90883aq;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.concurrent.CancellationException;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.util.aa */
/* compiled from: PG */
final class C113758aa extends C90883aq {

    /* renamed from: a */
    final /* synthetic */ C86123s f315059a;

    /* renamed from: b */
    final /* synthetic */ C113759ab f315060b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C113758aa(C113759ab abVar, C86123s sVar) {
        super("OpaInitialConfigFlagSyncDone", 2, 0);
        this.f315060b = abVar;
        this.f315059a = sVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        if (th instanceof CancellationException) {
            C59104x b = C113759ab.f315061a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "GsaConfigFlagsSyncer");
            ((C59052c) ((C59052c) b).mo56372aa(28412)).mo56386p("Flag sync cancelled.");
        } else {
            C59104x c = C113759ab.f315061a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "GsaConfigFlagsSyncer");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(th)).mo56372aa(28411)).mo56386p("Flag sync errored");
        }
        this.f315060b.f315062b.mo79740k(this.f315059a);
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        Boolean bool = (Boolean) obj;
        C59104x b = C113759ab.f315061a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "GsaConfigFlagsSyncer");
        ((C59052c) ((C59052c) b).mo56372aa(28413)).mo56386p("Flag sync successful.");
        this.f315060b.f315062b.mo79740k(this.f315059a);
    }
}
