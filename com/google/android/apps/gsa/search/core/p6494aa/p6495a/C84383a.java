package com.google.android.apps.gsa.search.core.p6494aa.p6495a;

import com.google.android.apps.gsa.search.core.p6805i.C86109e;
import com.google.android.apps.gsa.search.core.p6805i.C86117m;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.logger.p7055e.C89910d;
import com.google.common.p4552o.C59791fs;
import java.util.Random;

/* renamed from: com.google.android.apps.gsa.search.core.aa.a.a */
/* compiled from: PG */
final class C84383a implements C86109e {

    /* renamed from: a */
    private final C89910d f229641a;

    /* renamed from: b */
    private final Random f229642b;

    public C84383a(C89910d dVar, Random random) {
        this.f229641a = dVar;
        this.f229642b = random;
    }

    /* renamed from: a */
    public final void mo70818a(C86124t tVar, C86117m mVar) {
        this.f229641a.mo83753f();
        this.f229641a.mo83752e(C59791fs.WORKER);
        if (this.f229642b.nextDouble() < 0.01d) {
            this.f229641a.mo83752e(C59791fs.RUNNER);
        }
    }

    /* renamed from: b */
    public final void mo70819b(C86124t tVar) {
        mo70818a(tVar, C86117m.f232762a);
    }
}
