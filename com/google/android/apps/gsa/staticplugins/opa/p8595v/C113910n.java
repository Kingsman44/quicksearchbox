package com.google.android.apps.gsa.staticplugins.opa.p8595v;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.shared.search.C90499g;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.speech.dumper.C90544ag;
import com.google.android.apps.gsa.shared.speech.dumper.C90563p;
import com.google.android.apps.gsa.shared.speech.dumper.C90570w;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60845bz;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.v.n */
/* compiled from: PG */
final class C113910n implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C113916t f315368a;

    public C113910n(C113916t tVar) {
        this.f315368a = tVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C59104x c = C113916t.f315389a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "QueryEndStateTracker");
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g(th)).mo56372aa(24298)).mo56386p("Failed to record hotword rejection timestamp in query app flow metadata");
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        Long l = (Long) obj;
        if (l.longValue() >= 0 && ((Query) this.f315368a.f315395e.mo56107c()).mo84316bA() && C90499g.m147583c((Query) this.f315368a.f315395e.mo56107c(), l.longValue())) {
            C118826c.m197213c(((C90544ag) this.f315368a.f315398h.mo27525b()).f253129b.mo46039a(C90563p.f253162a, C60826bg.f164896a));
        }
        if (((Query) this.f315368a.f315395e.mo56107c()).mo84456dj()) {
            C118826c.m197213c(((C90544ag) this.f315368a.f315398h.mo27525b()).f253129b.mo46039a(C90570w.f253169a, C60826bg.f164896a));
        }
    }
}
