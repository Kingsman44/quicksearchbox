package com.google.android.apps.gsa.staticplugins.opa.tapas.p8572q;

import com.google.android.apps.gsa.shared.p7066m.C90129h;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.q.af */
/* compiled from: PG */
final class C113121af extends C113122ag {

    /* renamed from: a */
    private final C90129h f313418a;

    public C113121af(C90129h hVar) {
        this.f313418a = hVar;
    }

    /* renamed from: b */
    public final C113128am mo99858b() {
        return C113128am.STRING_PARAM;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C113129an) {
            C113129an anVar = (C113129an) obj;
            if (C113128am.STRING_PARAM != anVar.mo99858b() || !this.f313418a.equals(anVar.mo99875f())) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final C90129h mo99875f() {
        return this.f313418a;
    }

    public final int hashCode() {
        return this.f313418a.hashCode();
    }

    public final String toString() {
        String obj = this.f313418a.toString();
        return "FlagParamOneOf{stringParam=" + obj + "}";
    }
}
