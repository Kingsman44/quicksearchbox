package com.google.common.p4522b;

import java.io.Serializable;

/* renamed from: com.google.common.b.pn */
/* compiled from: PG */
final class C58721pn implements Serializable {

    /* renamed from: a */
    final C58714pg f156463a;

    /* renamed from: b */
    final C58419ei f156464b;

    public C58721pn(C58714pg pgVar, C58419ei eiVar) {
        this.f156463a = pgVar;
        this.f156464b = eiVar;
    }

    private Object readResolve() {
        return new C58722po(this.f156463a, this.f156464b);
    }
}
