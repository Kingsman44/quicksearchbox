package com.google.android.apps.gsa.nga.shared.p6345h.p6346a;

import p3186j$.util.function.Supplier;

/* renamed from: com.google.android.apps.gsa.nga.shared.h.a.a */
/* compiled from: PG */
public final class C81070a extends C81130cf {

    /* renamed from: a */
    public final Supplier f222185a;

    /* renamed from: b */
    public final Supplier f222186b;

    /* renamed from: c */
    public final Supplier f222187c;

    /* renamed from: d */
    public final Supplier f222188d;

    public C81070a(Supplier supplier, Supplier supplier2, Supplier supplier3, Supplier supplier4) {
        this.f222185a = supplier;
        this.f222186b = supplier2;
        this.f222187c = supplier3;
        this.f222188d = supplier4;
    }

    /* renamed from: a */
    public final Supplier mo74846a() {
        return this.f222187c;
    }

    /* renamed from: b */
    public final Supplier mo74847b() {
        return this.f222188d;
    }

    /* renamed from: c */
    public final Supplier mo74848c() {
        return this.f222185a;
    }

    /* renamed from: d */
    public final Supplier mo74849d() {
        return this.f222186b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C81130cf) {
            C81130cf cfVar = (C81130cf) obj;
            return this.f222185a.equals(cfVar.mo74848c()) && this.f222186b.equals(cfVar.mo74849d()) && this.f222187c.equals(cfVar.mo74846a()) && this.f222188d.equals(cfVar.mo74847b());
        }
    }

    public final int hashCode() {
        return ((((((this.f222185a.hashCode() ^ 1000003) * 1000003) ^ this.f222186b.hashCode()) * 1000003) ^ this.f222187c.hashCode()) * 1000003) ^ this.f222188d.hashCode();
    }

    public final String toString() {
        String obj = this.f222185a.toString();
        String obj2 = this.f222186b.toString();
        String obj3 = this.f222187c.toString();
        String obj4 = this.f222188d.toString();
        return "InitialPreferenceValues{startupPreferences=" + obj + ", udcBits=" + obj2 + ", educationPreferences=" + obj3 + ", gboardPreferences=" + obj4 + "}";
    }
}
