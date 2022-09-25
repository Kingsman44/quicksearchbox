package com.google.android.apps.gsa.staticplugins.opa.tapas.shared;

import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.shared.bd */
/* compiled from: PG */
final class C113279bd extends C113421fb {

    /* renamed from: a */
    private final Optional f313720a;

    /* renamed from: b */
    private final Optional f313721b;

    /* renamed from: c */
    private final Optional f313722c;

    /* renamed from: d */
    private final Optional f313723d;

    /* renamed from: e */
    private final Optional f313724e;

    public C113279bd(Optional optional, Optional optional2, Optional optional3, Optional optional4, Optional optional5) {
        this.f313720a = optional;
        this.f313721b = optional2;
        this.f313722c = optional3;
        this.f313723d = optional4;
        this.f313724e = optional5;
    }

    /* renamed from: a */
    public final Optional mo100063a() {
        return this.f313720a;
    }

    /* renamed from: b */
    public final Optional mo100064b() {
        return this.f313722c;
    }

    /* renamed from: c */
    public final Optional mo100065c() {
        return this.f313721b;
    }

    /* renamed from: d */
    public final Optional mo100066d() {
        return this.f313723d;
    }

    /* renamed from: e */
    public final Optional mo100067e() {
        return this.f313724e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C113421fb) {
            C113421fb fbVar = (C113421fb) obj;
            return this.f313720a.equals(fbVar.mo100063a()) && this.f313721b.equals(fbVar.mo100065c()) && this.f313722c.equals(fbVar.mo100064b()) && this.f313723d.equals(fbVar.mo100066d()) && this.f313724e.equals(fbVar.mo100067e());
        }
    }

    public final int hashCode() {
        return ((((((((this.f313720a.hashCode() ^ 1000003) * 1000003) ^ this.f313721b.hashCode()) * 1000003) ^ this.f313722c.hashCode()) * 1000003) ^ this.f313723d.hashCode()) * 1000003) ^ this.f313724e.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f313720a);
        String valueOf2 = String.valueOf(this.f313721b);
        String valueOf3 = String.valueOf(this.f313722c);
        String valueOf4 = String.valueOf(this.f313723d);
        String valueOf5 = String.valueOf(this.f313724e);
        return "TextItemRenderingParams{iconDrawable=" + valueOf + ", packageNameForIcon=" + valueOf2 + ", iconUrl=" + valueOf3 + ", primaryText=" + valueOf4 + ", secondaryText=" + valueOf5 + "}";
    }
}
