package com.google.ads.interactivemedia.p367v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.aki */
/* compiled from: PG */
final class aki implements agu {

    /* renamed from: a */
    final /* synthetic */ Class f20778a;

    /* renamed from: b */
    final /* synthetic */ Class f20779b;

    /* renamed from: c */
    final /* synthetic */ agt f20780c;

    public aki(Class cls, Class cls2, agt agt) {
        this.f20778a = cls;
        this.f20779b = cls2;
        this.f20780c = agt;
    }

    /* renamed from: a */
    public final agt mo14748a(age age, akz akz) {
        Class a = akz.mo14887a();
        if (a == this.f20778a || a == this.f20779b) {
            return this.f20780c;
        }
        return null;
    }

    public final String toString() {
        return "Factory[type=" + this.f20779b.getName() + "+" + this.f20778a.getName() + ",adapter=" + this.f20780c + "]";
    }
}
