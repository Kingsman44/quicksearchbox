package com.google.android.apps.gsa.staticplugins.opa.tapas.p8572q;

import com.google.android.apps.gsa.shared.p7066m.C90102f;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.q.ad */
/* compiled from: PG */
final class C113119ad extends C113122ag {

    /* renamed from: a */
    private final C90102f f313416a;

    public C113119ad(C90102f fVar) {
        this.f313416a = fVar;
    }

    /* renamed from: b */
    public final C113128am mo99858b() {
        return C113128am.INT_PARAM;
    }

    /* renamed from: d */
    public final C90102f mo99866d() {
        return this.f313416a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C113129an) {
            C113129an anVar = (C113129an) obj;
            if (C113128am.INT_PARAM != anVar.mo99858b() || !this.f313416a.equals(anVar.mo99866d())) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f313416a.hashCode();
    }

    public final String toString() {
        String obj = this.f313416a.toString();
        return "FlagParamOneOf{intParam=" + obj + "}";
    }
}
