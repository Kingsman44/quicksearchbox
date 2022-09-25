package com.google.android.apps.gsa.staticplugins.opa.tapas.p8491c.p8492a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.c.a.b */
/* compiled from: PG */
public final class C111239b extends C111240c {

    /* renamed from: a */
    private final String f309556a;

    public C111239b(String str) {
        this.f309556a = str;
    }

    /* renamed from: b */
    public final int mo99060b() {
        return 1;
    }

    /* renamed from: c */
    public final String mo99064c() {
        return this.f309556a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C111254q) {
            C111254q qVar = (C111254q) obj;
            if (qVar.mo99060b() != 1 || !this.f309556a.equals(qVar.mo99064c())) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f309556a.hashCode();
    }

    public final String toString() {
        String str = this.f309556a;
        return "LogEntry{text=" + str + "}";
    }
}
