package com.google.android.apps.gsa.staticplugins.hotwordenrollment;

import com.google.android.apps.gsa.opaonboarding.p6463ui.C84011f;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.b */
/* compiled from: PG */
final class C101499b extends C102229r {

    /* renamed from: a */
    private final int f283247a;

    /* renamed from: b */
    private final C84011f f283248b;

    /* renamed from: c */
    private final C84011f f283249c;

    /* renamed from: d */
    private final CharSequence f283250d;

    /* renamed from: e */
    private final CharSequence f283251e;

    public C101499b(int i, C84011f fVar, C84011f fVar2, CharSequence charSequence, CharSequence charSequence2) {
        this.f283247a = i;
        this.f283248b = fVar;
        this.f283249c = fVar2;
        this.f283250d = charSequence;
        this.f283251e = charSequence2;
    }

    /* renamed from: a */
    public final int mo92340a() {
        return this.f283247a;
    }

    /* renamed from: b */
    public final C84011f mo92341b() {
        return this.f283248b;
    }

    /* renamed from: c */
    public final C84011f mo92342c() {
        return this.f283249c;
    }

    /* renamed from: d */
    public final CharSequence mo92343d() {
        return this.f283250d;
    }

    /* renamed from: e */
    public final CharSequence mo92344e() {
        return this.f283251e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C102229r) {
            C102229r rVar = (C102229r) obj;
            return this.f283247a == rVar.mo92340a() && this.f283248b.equals(rVar.mo92341b()) && this.f283249c.equals(rVar.mo92342c()) && this.f283250d.equals(rVar.mo92343d()) && this.f283251e.equals(rVar.mo92344e());
        }
    }

    public final int hashCode() {
        return ((((((((this.f283247a ^ 1000003) * 1000003) ^ this.f283248b.hashCode()) * 1000003) ^ this.f283249c.hashCode()) * 1000003) ^ this.f283250d.hashCode()) * 1000003) ^ this.f283251e.hashCode();
    }

    public final String toString() {
        int i = this.f283247a;
        String obj = this.f283248b.toString();
        String obj2 = this.f283249c.toString();
        CharSequence charSequence = this.f283250d;
        CharSequence charSequence2 = this.f283251e;
        return "FooterSpecs{footerType=" + i + ", primaryButtonSpec=" + obj + ", secondaryButtonSpec=" + obj2 + ", opaPrimaryButtonContentDescription=" + ((String) charSequence) + ", opaSecondaryButtonContentDescription=" + ((String) charSequence2) + "}";
    }
}
