package com.google.common.p4526f;

import com.google.common.p4526f.p4534f.C59081b;

/* renamed from: com.google.common.f.ab */
/* compiled from: PG */
final class C58977ab implements C59096p {

    /* renamed from: a */
    private final C59096p f156832a;

    /* renamed from: b */
    private final Object f156833b;

    public C58977ab(C59096p pVar, Object obj) {
        C59081b.m91349a(pVar, "log site key");
        this.f156832a = pVar;
        C59081b.m91349a(obj, "log site qualifier");
        this.f156833b = obj;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C58977ab)) {
            return false;
        }
        C58977ab abVar = (C58977ab) obj;
        if (!this.f156832a.equals(abVar.f156832a) || !this.f156833b.equals(abVar.f156833b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f156832a.hashCode() ^ this.f156833b.hashCode();
    }

    public final String toString() {
        String obj = this.f156832a.toString();
        String obj2 = this.f156833b.toString();
        return "SpecializedLogSiteKey{ delegate='" + obj + "', qualifier='" + obj2 + "' }";
    }
}
