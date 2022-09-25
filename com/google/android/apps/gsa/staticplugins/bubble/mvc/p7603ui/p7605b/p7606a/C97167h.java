package com.google.android.apps.gsa.staticplugins.bubble.mvc.p7603ui.p7605b.p7606a;

import com.google.android.libraries.logging.C28292j;

/* renamed from: com.google.android.apps.gsa.staticplugins.bubble.mvc.ui.b.a.h */
/* compiled from: PG */
final class C97167h extends C97173n {

    /* renamed from: a */
    public final C28292j f271497a;

    /* renamed from: b */
    public final C28292j f271498b;

    /* renamed from: c */
    public final C28292j f271499c;

    /* renamed from: d */
    public final C28292j f271500d;

    public C97167h(C28292j jVar, C28292j jVar2, C28292j jVar3, C28292j jVar4) {
        this.f271497a = jVar;
        this.f271498b = jVar2;
        this.f271499c = jVar3;
        this.f271500d = jVar4;
    }

    /* renamed from: a */
    public final C28292j mo90558a() {
        return this.f271500d;
    }

    /* renamed from: b */
    public final C28292j mo90559b() {
        return this.f271497a;
    }

    /* renamed from: c */
    public final C28292j mo90560c() {
        return this.f271498b;
    }

    /* renamed from: d */
    public final C28292j mo90561d() {
        return this.f271499c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C97173n) {
            C97173n nVar = (C97173n) obj;
            return this.f271497a.equals(nVar.mo90559b()) && this.f271498b.equals(nVar.mo90560c()) && this.f271499c.equals(nVar.mo90561d()) && this.f271500d.equals(nVar.mo90558a());
        }
    }

    public final int hashCode() {
        return ((((((this.f271497a.hashCode() ^ 1000003) * 1000003) ^ this.f271498b.hashCode()) * 1000003) ^ this.f271499c.hashCode()) * 1000003) ^ this.f271500d.hashCode();
    }

    public final String toString() {
        String obj = this.f271497a.toString();
        String obj2 = this.f271498b.toString();
        String obj3 = this.f271499c.toString();
        String obj4 = this.f271500d.toString();
        return "VisualElementsHolder{rootVe=" + obj + ", titleWhenCollapsedVe=" + obj2 + ", titleWhenExpandedVe=" + obj3 + ", contentWhenExpandedVe=" + obj4 + "}";
    }
}
