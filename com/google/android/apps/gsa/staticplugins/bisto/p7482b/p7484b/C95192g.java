package com.google.android.apps.gsa.staticplugins.bisto.p7482b.p7484b;

import com.google.android.libraries.gsa.p1876k.C22870f;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.b.b.g */
/* compiled from: PG */
final class C95192g implements AutoCloseable {

    /* renamed from: a */
    private final C60870cx f266328a;

    private C95192g(C60870cx cxVar) {
        this.f266328a = cxVar;
    }

    /* renamed from: a */
    public static C95192g m157348a(C22871g gVar, long j, C22870f fVar) {
        C58976aa aaVar = C58975e.f156826a;
        return new C95192g(gVar.mo28208h("timer", j, fVar));
    }

    public final void close() {
        C58976aa aaVar = C58975e.f156826a;
        this.f266328a.cancel(false);
    }
}
