package com.google.android.libraries.geller.p1815c;

import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58597ky;

/* renamed from: com.google.android.libraries.geller.c.a */
/* compiled from: PG */
final class C21760a extends C21766g {

    /* renamed from: a */
    private final String f60060a;

    /* renamed from: b */
    private final C58485gu f60061b;

    public C21760a(String str, C58485gu guVar) {
        this.f60060a = str;
        if (guVar != null) {
            this.f60061b = guVar;
            return;
        }
        throw new NullPointerException("Null aliases");
    }

    /* renamed from: a */
    public final C58485gu mo27095a() {
        return this.f60061b;
    }

    /* renamed from: b */
    public final String mo27096b() {
        return this.f60060a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C21766g) {
            C21766g gVar = (C21766g) obj;
            return this.f60060a.equals(gVar.mo27096b()) && C58597ky.m90218i(this.f60061b, gVar.mo27095a());
        }
    }

    public final int hashCode() {
        return ((this.f60060a.hashCode() ^ 1000003) * 1000003) ^ this.f60061b.hashCode();
    }

    public final String toString() {
        String str = this.f60060a;
        String obj = this.f60061b.toString();
        return "RelationshipName{canonical=" + str + ", aliases=" + obj + "}";
    }
}
