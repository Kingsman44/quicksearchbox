package com.google.android.libraries.search.assistant.performer.communication.p2741f;

import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.search.assistant.performer.communication.f.b */
/* compiled from: PG */
final class C35734b extends C35758z {

    /* renamed from: a */
    private final String f93655a;

    /* renamed from: b */
    private final Optional f93656b;

    /* renamed from: c */
    private final Optional f93657c;

    /* renamed from: d */
    private final boolean f93658d;

    public C35734b(String str, Optional optional, Optional optional2, boolean z) {
        this.f93655a = str;
        this.f93656b = optional;
        this.f93657c = optional2;
        this.f93658d = z;
    }

    /* renamed from: a */
    public final Optional mo39818a() {
        return this.f93657c;
    }

    /* renamed from: b */
    public final Optional mo39819b() {
        return this.f93656b;
    }

    /* renamed from: c */
    public final String mo39820c() {
        return this.f93655a;
    }

    /* renamed from: d */
    public final boolean mo39821d() {
        return this.f93658d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C35758z) {
            C35758z zVar = (C35758z) obj;
            return this.f93655a.equals(zVar.mo39820c()) && this.f93656b.equals(zVar.mo39819b()) && this.f93657c.equals(zVar.mo39818a()) && this.f93658d == zVar.mo39821d();
        }
    }

    public final int hashCode() {
        return ((((((this.f93655a.hashCode() ^ 1000003) * 1000003) ^ this.f93656b.hashCode()) * 1000003) ^ this.f93657c.hashCode()) * 1000003) ^ (true != this.f93658d ? 1237 : 1231);
    }

    public final String toString() {
        String str = this.f93655a;
        String valueOf = String.valueOf(this.f93656b);
        String valueOf2 = String.valueOf(this.f93657c);
        boolean z = this.f93658d;
        return "PhoneInfo{number=" + str + ", type=" + valueOf + ", label=" + valueOf2 + ", isPrimary=" + z + "}";
    }
}
