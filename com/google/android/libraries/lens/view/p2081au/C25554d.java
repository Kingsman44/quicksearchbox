package com.google.android.libraries.lens.view.p2081au;

import com.google.android.libraries.lens.p2014e.C24227s;
import com.google.common.base.C58833ax;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56220aa;

/* renamed from: com.google.android.libraries.lens.view.au.d */
/* compiled from: PG */
final class C25554d extends C25560j {

    /* renamed from: a */
    public final C24227s f69561a;

    /* renamed from: b */
    public final C56220aa f69562b;

    /* renamed from: c */
    public final C58833ax f69563c;

    public C25554d(C24227s sVar, C56220aa aaVar, C58833ax axVar) {
        this.f69561a = sVar;
        this.f69562b = aaVar;
        this.f69563c = axVar;
    }

    /* renamed from: a */
    public final C24227s mo30614a() {
        return this.f69561a;
    }

    /* renamed from: b */
    public final C25559i mo30615b() {
        return new C25553c(this);
    }

    /* renamed from: c */
    public final C58833ax mo30616c() {
        return this.f69563c;
    }

    /* renamed from: d */
    public final C56220aa mo30617d() {
        return this.f69562b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C25560j) {
            C25560j jVar = (C25560j) obj;
            return this.f69561a.equals(jVar.mo30614a()) && this.f69562b.equals(jVar.mo30617d()) && this.f69563c.equals(jVar.mo30616c());
        }
    }

    public final int hashCode() {
        return ((((this.f69561a.hashCode() ^ 1000003) * 1000003) ^ this.f69562b.hashCode()) * 1000003) ^ this.f69563c.hashCode();
    }

    public final String toString() {
        String obj = this.f69561a.toString();
        String obj2 = this.f69562b.toString();
        String valueOf = String.valueOf(this.f69563c);
        return "LensPrefetchImage{image=" + obj + ", predictedObjects=" + obj2 + ", prefetchMetadata=" + valueOf + "}";
    }
}
