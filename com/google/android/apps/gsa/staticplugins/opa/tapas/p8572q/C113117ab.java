package com.google.android.apps.gsa.staticplugins.opa.tapas.p8572q;

import com.google.android.apps.gsa.shared.p7066m.C90048d;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.q.ab */
/* compiled from: PG */
final class C113117ab extends C113122ag {

    /* renamed from: a */
    private final C90048d f313414a;

    public C113117ab(C90048d dVar) {
        this.f313414a = dVar;
    }

    /* renamed from: a */
    public final C90048d mo99857a() {
        return this.f313414a;
    }

    /* renamed from: b */
    public final C113128am mo99858b() {
        return C113128am.BOOL_PARAM;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C113129an) {
            C113129an anVar = (C113129an) obj;
            if (C113128am.BOOL_PARAM != anVar.mo99858b() || !this.f313414a.equals(anVar.mo99857a())) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f313414a.hashCode();
    }

    public final String toString() {
        String obj = this.f313414a.toString();
        return "FlagParamOneOf{boolParam=" + obj + "}";
    }
}
