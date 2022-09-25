package com.google.common.p4522b;

import java.io.Serializable;

/* renamed from: com.google.common.b.ej */
/* compiled from: PG */
final class C58420ej implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: a */
    private final C58419ei f156032a;

    public C58420ej(C58419ei eiVar) {
        this.f156032a = eiVar;
    }

    private Object readResolve() {
        return new C58421ek(this.f156032a);
    }
}
