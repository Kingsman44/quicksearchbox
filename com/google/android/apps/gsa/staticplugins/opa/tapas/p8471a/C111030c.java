package com.google.android.apps.gsa.staticplugins.opa.tapas.p8471a;

import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.a.c */
/* compiled from: PG */
final class C111030c extends C111070t {

    /* renamed from: a */
    private final Optional f309224a;

    /* renamed from: b */
    private final Optional f309225b;

    public C111030c(Optional optional, Optional optional2) {
        if (optional != null) {
            this.f309224a = optional;
            if (optional2 != null) {
                this.f309225b = optional2;
                return;
            }
            throw new NullPointerException("Null appIcon");
        }
        throw new NullPointerException("Null appLabel");
    }

    /* renamed from: a */
    public final Optional mo99023a() {
        return this.f309225b;
    }

    /* renamed from: b */
    public final Optional mo99024b() {
        return this.f309224a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C111070t) {
            C111070t tVar = (C111070t) obj;
            return this.f309224a.equals(tVar.mo99024b()) && this.f309225b.equals(tVar.mo99023a());
        }
    }

    public final int hashCode() {
        return ((this.f309224a.hashCode() ^ 1000003) * 1000003) ^ this.f309225b.hashCode();
    }

    public final String toString() {
        String obj = this.f309224a.toString();
        String obj2 = this.f309225b.toString();
        return "AppLabelAndIcon{appLabel=" + obj + ", appIcon=" + obj2 + "}";
    }
}
