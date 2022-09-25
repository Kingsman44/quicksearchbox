package com.google.android.libraries.assistant.p1484g.p1490c.p1491a.p1493b;

import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.g.c.a.b.p */
/* compiled from: PG */
final class C18051p extends C18037cs {

    /* renamed from: a */
    private final String f51526a;

    /* renamed from: b */
    private final Optional f51527b;

    public C18051p(String str, Optional optional) {
        this.f51526a = str;
        this.f51527b = optional;
    }

    /* renamed from: a */
    public final Optional mo23552a() {
        return this.f51527b;
    }

    /* renamed from: b */
    public final String mo23553b() {
        return this.f51526a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C18037cs) {
            C18037cs csVar = (C18037cs) obj;
            return this.f51526a.equals(csVar.mo23553b()) && this.f51527b.equals(csVar.mo23552a());
        }
    }

    public final int hashCode() {
        return ((this.f51526a.hashCode() ^ 1000003) * 1000003) ^ this.f51527b.hashCode();
    }

    public final String toString() {
        String str = this.f51526a;
        String valueOf = String.valueOf(this.f51527b);
        return "Arguments{searchQuery=" + str + ", experimentIds=" + valueOf + "}";
    }
}
