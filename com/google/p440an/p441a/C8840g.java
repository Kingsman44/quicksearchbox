package com.google.p440an.p441a;

import java.io.Serializable;

/* renamed from: com.google.an.a.g */
/* compiled from: PG */
final class C8840g implements Serializable {
    private static final long serialVersionUID = 1;

    /* renamed from: a */
    private final String f30227a;

    public C8840g(C8841h hVar) {
        this.f30227a = hVar.f30255g;
    }

    private Object readResolve() {
        return C8841h.m23466a(this.f30227a);
    }
}
