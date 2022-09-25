package com.google.android.libraries.search.p3055n.p3061c.p3062a;

/* renamed from: com.google.android.libraries.search.n.c.a.u */
/* compiled from: PG */
final class C39639u extends C39393ai {

    /* renamed from: a */
    private final C39392ah f104352a;

    /* renamed from: b */
    private final String f104353b;

    public C39639u(C39392ah ahVar, String str) {
        this.f104352a = ahVar;
        this.f104353b = str;
    }

    /* renamed from: a */
    public final C39392ah mo41808a() {
        return this.f104352a;
    }

    /* renamed from: b */
    public final String mo41809b() {
        return this.f104353b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C39393ai) {
            C39393ai aiVar = (C39393ai) obj;
            return this.f104352a.equals(aiVar.mo41808a()) && this.f104353b.equals(aiVar.mo41809b());
        }
    }

    public final int hashCode() {
        return ((this.f104352a.hashCode() ^ 1000003) * 1000003) ^ this.f104353b.hashCode();
    }

    public final String toString() {
        String obj = this.f104352a.toString();
        String str = this.f104353b;
        return "HotwordDetectionError{code=" + obj + ", message=" + str + "}";
    }
}
