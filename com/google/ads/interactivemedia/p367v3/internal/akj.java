package com.google.ads.interactivemedia.p367v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.akj */
/* compiled from: PG */
final class akj implements agu {

    /* renamed from: a */
    final /* synthetic */ Class f20781a;

    /* renamed from: b */
    final /* synthetic */ Class f20782b;

    /* renamed from: c */
    final /* synthetic */ agt f20783c;

    public akj(Class cls, Class cls2, agt agt) {
        this.f20781a = cls;
        this.f20782b = cls2;
        this.f20783c = agt;
    }

    /* renamed from: a */
    public final agt mo14748a(age age, akz akz) {
        Class a = akz.mo14887a();
        if (a == this.f20781a || a == this.f20782b) {
            return this.f20783c;
        }
        return null;
    }

    public final String toString() {
        return "Factory[type=" + this.f20781a.getName() + "+" + this.f20782b.getName() + ",adapter=" + this.f20783c + "]";
    }
}
