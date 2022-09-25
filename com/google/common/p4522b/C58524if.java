package com.google.common.p4522b;

import java.io.Serializable;

/* renamed from: com.google.common.b.if */
/* compiled from: PG */
final class C58524if implements Serializable {

    /* renamed from: a */
    private final C58485gu f156171a;

    public C58524if(C58485gu guVar) {
        this.f156171a = guVar;
    }

    /* access modifiers changed from: package-private */
    public Object readResolve() {
        if (this.f156171a.isEmpty()) {
            return C58525ig.f156172a;
        }
        if (C58597ky.m90218i(this.f156171a, C58485gu.m89846n(C58714pg.f156455a))) {
            return C58525ig.f156173b;
        }
        return new C58525ig(this.f156171a);
    }
}
