package com.google.ads.interactivemedia.p367v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.akh */
/* compiled from: PG */
final class akh implements agu {

    /* renamed from: a */
    final /* synthetic */ Class f20776a;

    /* renamed from: b */
    final /* synthetic */ agt f20777b;

    public akh(Class cls, agt agt) {
        this.f20776a = cls;
        this.f20777b = agt;
    }

    /* renamed from: a */
    public final agt mo14748a(age age, akz akz) {
        if (akz.mo14887a() == this.f20776a) {
            return this.f20777b;
        }
        return null;
    }

    public final String toString() {
        return "Factory[type=" + this.f20776a.getName() + ",adapter=" + this.f20777b + "]";
    }
}
