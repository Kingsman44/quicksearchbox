package com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6079b.p6087h.p6088a;

import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.b.h.a.f */
/* compiled from: PG */
final class C76902f extends C76905i {

    /* renamed from: a */
    public final Optional f212359a;

    /* renamed from: b */
    public final Optional f212360b;

    public C76902f(Optional optional, Optional optional2) {
        this.f212359a = optional;
        this.f212360b = optional2;
    }

    /* renamed from: a */
    public final Optional mo72343a() {
        return this.f212360b;
    }

    /* renamed from: b */
    public final Optional mo72344b() {
        return this.f212359a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C76905i) {
            C76905i iVar = (C76905i) obj;
            return this.f212359a.equals(iVar.mo72344b()) && this.f212360b.equals(iVar.mo72343a());
        }
    }

    public final int hashCode() {
        return ((this.f212359a.hashCode() ^ 1000003) * 1000003) ^ this.f212360b.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f212359a);
        String valueOf2 = String.valueOf(this.f212360b);
        return "ConfigOverrides{intentName=" + valueOf + ", intentFlag=" + valueOf2 + "}";
    }
}
