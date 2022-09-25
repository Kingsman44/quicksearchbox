package com.google.android.apps.gsa.staticplugins.opa.tapas.p8491c.p8492a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.c.a.a */
/* compiled from: PG */
final class C111238a extends C111240c {

    /* renamed from: a */
    private final C111252o f309555a;

    public C111238a(C111252o oVar) {
        this.f309555a = oVar;
    }

    /* renamed from: a */
    public final C111252o mo99059a() {
        return this.f309555a;
    }

    /* renamed from: b */
    public final int mo99060b() {
        return 2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C111254q) {
            C111254q qVar = (C111254q) obj;
            if (qVar.mo99060b() != 2 || !this.f309555a.equals(qVar.mo99059a())) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f309555a.hashCode();
    }

    public final String toString() {
        String obj = this.f309555a.toString();
        return "LogEntry{expandable=" + obj + "}";
    }
}
