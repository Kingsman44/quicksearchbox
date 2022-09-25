package com.google.android.apps.gsa.staticplugins.opa.tapas.shared.p8579c;

import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.shared.c.a */
/* compiled from: PG */
public final class C113303a extends C113323t {

    /* renamed from: a */
    private final String f313782a;

    /* renamed from: b */
    private final String f313783b;

    /* renamed from: c */
    private final String f313784c;

    /* renamed from: d */
    private final String f313785d;

    /* renamed from: e */
    private final String f313786e;

    /* renamed from: f */
    private final Optional f313787f;

    /* renamed from: g */
    private final String f313788g;

    public C113303a(String str, String str2, String str3, String str4, String str5, Optional optional, String str6) {
        this.f313782a = str;
        this.f313783b = str2;
        this.f313784c = str3;
        this.f313785d = str4;
        this.f313786e = str5;
        this.f313787f = optional;
        this.f313788g = str6;
    }

    /* renamed from: a */
    public final Optional mo100098a() {
        return this.f313787f;
    }

    /* renamed from: b */
    public final String mo100099b() {
        return this.f313785d;
    }

    /* renamed from: c */
    public final String mo100100c() {
        return this.f313783b;
    }

    /* renamed from: d */
    public final String mo100101d() {
        return this.f313788g;
    }

    /* renamed from: e */
    public final String mo100102e() {
        return this.f313784c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C113323t) {
            C113323t tVar = (C113323t) obj;
            return this.f313782a.equals(tVar.mo100104f()) && this.f313783b.equals(tVar.mo100100c()) && this.f313784c.equals(tVar.mo100102e()) && this.f313785d.equals(tVar.mo100099b()) && this.f313786e.equals(tVar.mo100105g()) && this.f313787f.equals(tVar.mo100098a()) && this.f313788g.equals(tVar.mo100101d());
        }
    }

    /* renamed from: f */
    public final String mo100104f() {
        return this.f313782a;
    }

    /* renamed from: g */
    public final String mo100105g() {
        return this.f313786e;
    }

    public final int hashCode() {
        return ((((((((((((this.f313782a.hashCode() ^ 1000003) * 1000003) ^ this.f313783b.hashCode()) * 1000003) ^ this.f313784c.hashCode()) * 1000003) ^ this.f313785d.hashCode()) * 1000003) ^ this.f313786e.hashCode()) * 1000003) ^ this.f313787f.hashCode()) * 1000003) ^ this.f313788g.hashCode();
    }

    public final String toString() {
        String str = this.f313782a;
        String str2 = this.f313783b;
        String str3 = this.f313784c;
        String str4 = this.f313785d;
        String str5 = this.f313786e;
        String valueOf = String.valueOf(this.f313787f);
        String str6 = this.f313788g;
        return "MessageSuggestionParams{lastSenderName=" + str + ", concatenatedMessage=" + str2 + ", lastNotificationMessage=" + str3 + ", appName=" + str4 + ", packageName=" + str5 + ", groupName=" + valueOf + ", lastNotificationKey=" + str6 + "}";
    }
}
