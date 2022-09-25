package com.google.ads.interactivemedia.p367v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.akl */
/* compiled from: PG */
final class akl implements agu {

    /* renamed from: a */
    final /* synthetic */ Class f20786a;

    /* renamed from: b */
    final /* synthetic */ agt f20787b;

    public akl(Class cls, agt agt) {
        this.f20786a = cls;
        this.f20787b = agt;
    }

    /* renamed from: a */
    public final agt mo14748a(age age, akz akz) {
        Class a = akz.mo14887a();
        if (!this.f20786a.isAssignableFrom(a)) {
            return null;
        }
        return new akk(this, a);
    }

    public final String toString() {
        return "Factory[typeHierarchy=" + this.f20786a.getName() + ",adapter=" + this.f20787b + "]";
    }
}
