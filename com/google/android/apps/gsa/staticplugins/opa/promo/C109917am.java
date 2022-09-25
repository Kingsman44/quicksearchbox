package com.google.android.apps.gsa.staticplugins.opa.promo;

import com.google.android.apps.gsa.assistant.shared.bm;
import com.google.android.apps.gsa.assistant.shared.bo;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.tasks.C118476ak;
import com.google.android.apps.gsa.tasks.C118549h;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.promo.am */
/* compiled from: PG */
public final class C109917am implements C118549h {

    /* renamed from: a */
    private final bo f306265a;

    /* renamed from: b */
    private final C86124t f306266b;

    /* renamed from: c */
    private final bm f306267c;

    public C109917am(bo boVar, C86124t tVar, bm bmVar) {
        this.f306265a = boVar;
        this.f306266b = tVar;
        this.f306267c = bmVar;
    }

    /* renamed from: a */
    public final C60870cx mo65234a(C118476ak akVar) {
        C58976aa aaVar = C58975e.f156826a;
        if (this.f306266b.mo79746e(C90014bt.f247268du) && this.f306267c.n()) {
            if (this.f306265a.b(8, -1) == 2) {
                this.f306265a.o(8, 1);
            }
            if (this.f306265a.b(4, -1) == 2) {
                this.f306265a.o(4, 1);
            }
            this.f306265a.o(8, 2);
            this.f306265a.h(8);
            if (this.f306265a.q()) {
                this.f306265a.l(TimeUnit.MINUTES.toMillis(this.f306266b.mo79743a(C90014bt.f247473hn)));
            }
        } else if (this.f306265a.s(false, 1)) {
            this.f306265a.x(2, 2);
        }
        return C118826c.f331423b;
    }
}
