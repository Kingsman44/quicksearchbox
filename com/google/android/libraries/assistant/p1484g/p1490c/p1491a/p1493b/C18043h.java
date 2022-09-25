package com.google.android.libraries.assistant.p1484g.p1490c.p1491a.p1493b;

import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.g.c.a.b.h */
/* compiled from: PG */
final class C18043h extends C17982ar {

    /* renamed from: a */
    private final Optional f51500a;

    /* renamed from: b */
    private final String f51501b;

    /* renamed from: c */
    private final boolean f51502c;

    /* renamed from: d */
    private final String f51503d;

    /* renamed from: e */
    private final Optional f51504e;

    public C18043h(Optional optional, String str, boolean z, String str2, Optional optional2) {
        this.f51500a = optional;
        this.f51501b = str;
        this.f51502c = z;
        this.f51503d = str2;
        this.f51504e = optional2;
    }

    /* renamed from: a */
    public final Optional mo23547a() {
        return this.f51500a;
    }

    /* renamed from: b */
    public final Optional mo23520b() {
        return this.f51504e;
    }

    /* renamed from: c */
    public final String mo23521c() {
        return this.f51503d;
    }

    /* renamed from: d */
    public final String mo23522d() {
        return this.f51501b;
    }

    /* renamed from: e */
    public final boolean mo23523e() {
        return this.f51502c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C17982ar) {
            C17982ar arVar = (C17982ar) obj;
            return this.f51500a.equals(arVar.mo23547a()) && this.f51501b.equals(arVar.mo23522d()) && this.f51502c == arVar.mo23523e() && this.f51503d.equals(arVar.mo23521c()) && this.f51504e.equals(arVar.mo23520b());
        }
    }

    public final int hashCode() {
        return ((((((((this.f51500a.hashCode() ^ 1000003) * 1000003) ^ this.f51501b.hashCode()) * 1000003) ^ (true != this.f51502c ? 1237 : 1231)) * 1000003) ^ this.f51503d.hashCode()) * 1000003) ^ this.f51504e.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f51500a);
        String str = this.f51501b;
        boolean z = this.f51502c;
        String str2 = this.f51503d;
        String valueOf2 = String.valueOf(this.f51504e);
        return "Arguments{experimentIds=" + valueOf + ", name=" + str + ", showErrorOnFailure=" + z + ", intent=" + str2 + ", searchQuery=" + valueOf2 + "}";
    }
}
