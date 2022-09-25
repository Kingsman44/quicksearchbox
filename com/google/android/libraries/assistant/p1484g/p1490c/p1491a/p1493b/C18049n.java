package com.google.android.libraries.assistant.p1484g.p1490c.p1491a.p1493b;

import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.g.c.a.b.n */
/* compiled from: PG */
final class C18049n extends C18015bx {

    /* renamed from: a */
    private final String f51520a;

    /* renamed from: b */
    private final boolean f51521b;

    /* renamed from: c */
    private final String f51522c;

    /* renamed from: d */
    private final Optional f51523d;

    public C18049n(String str, boolean z, String str2, Optional optional) {
        this.f51520a = str;
        this.f51521b = z;
        this.f51522c = str2;
        this.f51523d = optional;
    }

    /* renamed from: a */
    public final Optional mo23540a() {
        return this.f51523d;
    }

    /* renamed from: b */
    public final String mo23541b() {
        return this.f51522c;
    }

    /* renamed from: c */
    public final String mo23542c() {
        return this.f51520a;
    }

    /* renamed from: d */
    public final boolean mo23543d() {
        return this.f51521b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C18015bx) {
            C18015bx bxVar = (C18015bx) obj;
            return this.f51520a.equals(bxVar.mo23542c()) && this.f51521b == bxVar.mo23543d() && this.f51522c.equals(bxVar.mo23541b()) && this.f51523d.equals(bxVar.mo23540a());
        }
    }

    public final int hashCode() {
        return ((((((this.f51520a.hashCode() ^ 1000003) * 1000003) ^ (true != this.f51521b ? 1237 : 1231)) * 1000003) ^ this.f51522c.hashCode()) * 1000003) ^ this.f51523d.hashCode();
    }

    public final String toString() {
        String str = this.f51520a;
        boolean z = this.f51521b;
        String str2 = this.f51522c;
        String valueOf = String.valueOf(this.f51523d);
        return "Arguments{name=" + str + ", showErrorOnFailure=" + z + ", intent=" + str2 + ", searchQuery=" + valueOf + "}";
    }
}
