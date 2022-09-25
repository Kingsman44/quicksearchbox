package com.google.android.apps.gsa.nga.engine.screen.annotations.impl;

import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.screen.annotations.impl.b */
/* compiled from: PG */
final class C77922b extends C77939s {

    /* renamed from: a */
    public final Optional f214655a;

    /* renamed from: b */
    public final Optional f214656b;

    /* renamed from: c */
    public final Optional f214657c;

    public C77922b(Optional optional, Optional optional2, Optional optional3) {
        this.f214655a = optional;
        this.f214656b = optional2;
        this.f214657c = optional3;
    }

    /* renamed from: a */
    public final C77938r mo72904a() {
        return new C77914a(this);
    }

    /* renamed from: b */
    public final Optional mo72905b() {
        return this.f214655a;
    }

    /* renamed from: c */
    public final Optional mo72906c() {
        return this.f214656b;
    }

    /* renamed from: d */
    public final Optional mo72907d() {
        return this.f214657c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C77939s) {
            C77939s sVar = (C77939s) obj;
            return this.f214655a.equals(sVar.mo72905b()) && this.f214656b.equals(sVar.mo72906c()) && this.f214657c.equals(sVar.mo72907d());
        }
    }

    public final int hashCode() {
        return ((((this.f214655a.hashCode() ^ 1000003) * 1000003) ^ this.f214656b.hashCode()) * 1000003) ^ this.f214657c.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f214655a);
        String valueOf2 = String.valueOf(this.f214656b);
        String valueOf3 = String.valueOf(this.f214657c);
        return "ParsingState{nativeScreenContent=" + valueOf + ", parsingRequest=" + valueOf2 + ", screenContent=" + valueOf3 + "}";
    }
}
