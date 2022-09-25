package com.google.android.apps.gsa.staticplugins.opa.util;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.util.q */
/* compiled from: PG */
final class C113886q extends C113888s {

    /* renamed from: a */
    private final String f315320a;

    public C113886q(String str) {
        this.f315320a = str;
    }

    /* renamed from: a */
    public final String mo100708a() {
        return this.f315320a;
    }

    /* renamed from: b */
    public final int mo100709b() {
        return 2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C113857cl) {
            C113857cl clVar = (C113857cl) obj;
            if (clVar.mo100709b() != 2 || !this.f315320a.equals(clVar.mo100708a())) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f315320a.hashCode();
    }

    public final String toString() {
        String str = this.f315320a;
        return "InteractionInfo{cgi=" + str + "}";
    }
}
