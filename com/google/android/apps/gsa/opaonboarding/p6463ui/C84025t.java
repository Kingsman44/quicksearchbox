package com.google.android.apps.gsa.opaonboarding.p6463ui;

import com.google.android.apps.gsa.opaonboarding.C83956t;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.util.concurrent.C60870cx;
import p5460g.p5461a.C69464a;
import p5488io.grpc.C70761fa;

/* renamed from: com.google.android.apps.gsa.opaonboarding.ui.t */
/* compiled from: PG */
public final class C84025t implements C83956t {

    /* renamed from: a */
    private final C22871g f228870a;

    /* renamed from: b */
    private final C60870cx f228871b;

    /* renamed from: c */
    private final C69464a f228872c;

    public C84025t(C60870cx cxVar, C69464a aVar, C22871g gVar) {
        this.f228871b = cxVar;
        this.f228872c = aVar;
        this.f228870a = gVar;
    }

    /* renamed from: c */
    public final C58833ax mo77209c() {
        if (this.f228871b.isDone()) {
            return C58836b.f156633a;
        }
        C84021p pVar = (C84021p) this.f228872c.mo17428b();
        C90873ag agVar = new C90873ag(this.f228871b, this.f228870a, "LoadingResultFuture", new C84022q(pVar));
        agVar.mo85224b(C70761fa.class, new C84023r(pVar));
        agVar.mo85223a(new C84024s(pVar));
        return C58833ax.m90834k(pVar);
    }
}
