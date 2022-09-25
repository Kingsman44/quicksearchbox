package com.google.android.apps.gsa.staticplugins.opa.tapas.p8572q;

import com.google.android.apps.gsa.shared.p7066m.C90075e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.q.ac */
/* compiled from: PG */
final class C113118ac extends C113122ag {

    /* renamed from: a */
    private final C90075e f313415a;

    public C113118ac(C90075e eVar) {
        this.f313415a = eVar;
    }

    /* renamed from: b */
    public final C113128am mo99858b() {
        return C113128am.DOUBLE_PARAM;
    }

    /* renamed from: c */
    public final C90075e mo99862c() {
        return this.f313415a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C113129an) {
            C113129an anVar = (C113129an) obj;
            if (C113128am.DOUBLE_PARAM != anVar.mo99858b() || !this.f313415a.equals(anVar.mo99862c())) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f313415a.hashCode();
    }

    public final String toString() {
        String obj = this.f313415a.toString();
        return "FlagParamOneOf{doubleParam=" + obj + "}";
    }
}
