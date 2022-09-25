package com.google.android.apps.gsa.staticplugins.opa.tapas.p8572q;

import com.google.android.apps.gsa.shared.p7066m.C90128g;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.q.ae */
/* compiled from: PG */
final class C113120ae extends C113122ag {

    /* renamed from: a */
    private final C90128g f313417a;

    public C113120ae(C90128g gVar) {
        this.f313417a = gVar;
    }

    /* renamed from: b */
    public final C113128am mo99858b() {
        return C113128am.PROTO_PARAM;
    }

    /* renamed from: e */
    public final C90128g mo99870e() {
        return this.f313417a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C113129an) {
            C113129an anVar = (C113129an) obj;
            if (C113128am.PROTO_PARAM != anVar.mo99858b() || !this.f313417a.equals(anVar.mo99870e())) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f313417a.hashCode();
    }

    public final String toString() {
        String obj = this.f313417a.toString();
        return "FlagParamOneOf{protoParam=" + obj + "}";
    }
}
