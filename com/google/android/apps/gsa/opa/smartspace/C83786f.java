package com.google.android.apps.gsa.opa.smartspace;

import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58597ky;

/* renamed from: com.google.android.apps.gsa.opa.smartspace.f */
/* compiled from: PG */
public final class C83786f extends C83804t {

    /* renamed from: a */
    private final C58485gu f228362a;

    /* renamed from: b */
    private final C58485gu f228363b;

    public C83786f(C58485gu guVar, C58485gu guVar2) {
        this.f228362a = guVar;
        this.f228363b = guVar2;
    }

    /* renamed from: a */
    public final C58485gu mo77131a() {
        return this.f228362a;
    }

    /* renamed from: b */
    public final C58485gu mo77132b() {
        return this.f228363b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C83804t) {
            C83804t tVar = (C83804t) obj;
            return C58597ky.m90218i(this.f228362a, tVar.mo77131a()) && C58597ky.m90218i(this.f228363b, tVar.mo77132b());
        }
    }

    public final int hashCode() {
        return ((this.f228362a.hashCode() ^ 1000003) * 1000003) ^ this.f228363b.hashCode();
    }

    public final String toString() {
        String obj = this.f228362a.toString();
        String obj2 = this.f228363b.toString();
        return "SmartspaceContentResponse{smartspaceCardsList=" + obj + ", smartspaceChipsList=" + obj2 + "}";
    }
}
