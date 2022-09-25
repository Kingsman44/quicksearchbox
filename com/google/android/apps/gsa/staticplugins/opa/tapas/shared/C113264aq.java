package com.google.android.apps.gsa.staticplugins.opa.tapas.shared;

import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.shared.aq */
/* compiled from: PG */
final class C113264aq extends C113284bi {

    /* renamed from: a */
    private final Optional f313633a;

    /* renamed from: b */
    private final Optional f313634b;

    /* renamed from: c */
    private final Optional f313635c;

    /* renamed from: d */
    private final Optional f313636d;

    public C113264aq(Optional optional, Optional optional2, Optional optional3, Optional optional4) {
        this.f313633a = optional;
        this.f313634b = optional2;
        this.f313635c = optional3;
        this.f313636d = optional4;
    }

    /* renamed from: a */
    public final Optional mo99959a() {
        return this.f313636d;
    }

    /* renamed from: b */
    public final Optional mo99960b() {
        return this.f313634b;
    }

    /* renamed from: c */
    public final Optional mo99961c() {
        return this.f313633a;
    }

    /* renamed from: d */
    public final Optional mo99962d() {
        return this.f313635c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C113284bi) {
            C113284bi biVar = (C113284bi) obj;
            return this.f313633a.equals(biVar.mo99961c()) && this.f313634b.equals(biVar.mo99960b()) && this.f313635c.equals(biVar.mo99962d()) && this.f313636d.equals(biVar.mo99959a());
        }
    }

    public final int hashCode() {
        return ((((((this.f313633a.hashCode() ^ 1000003) * 1000003) ^ this.f313634b.hashCode()) * 1000003) ^ this.f313635c.hashCode()) * 1000003) ^ this.f313636d.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f313633a);
        String valueOf2 = String.valueOf(this.f313634b);
        String valueOf3 = String.valueOf(this.f313635c);
        String valueOf4 = String.valueOf(this.f313636d);
        return "IconShortcutSuggestionParams{primaryIconSource=" + valueOf + ", clickIntent=" + valueOf2 + ", shortcutInfo=" + valueOf3 + ", appLabelFuture=" + valueOf4 + "}";
    }
}
