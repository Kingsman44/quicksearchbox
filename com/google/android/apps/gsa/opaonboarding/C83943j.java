package com.google.android.apps.gsa.opaonboarding;

/* renamed from: com.google.android.apps.gsa.opaonboarding.j */
/* compiled from: PG */
final class C83943j extends C83882ap {

    /* renamed from: a */
    private final C83956t f228632a;

    /* renamed from: b */
    private final C83904bj f228633b;

    public C83943j(C83956t tVar, C83904bj bjVar) {
        this.f228632a = tVar;
        this.f228633b = bjVar;
    }

    /* renamed from: a */
    public final C83956t mo77244a() {
        return this.f228632a;
    }

    /* renamed from: b */
    public final C83904bj mo77245b() {
        return this.f228633b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C83882ap) {
            C83882ap apVar = (C83882ap) obj;
            return this.f228632a.equals(apVar.mo77244a()) && this.f228633b.equals(apVar.mo77245b());
        }
    }

    public final int hashCode() {
        return ((this.f228632a.hashCode() ^ 1000003) * 1000003) ^ this.f228633b.hashCode();
    }

    public final String toString() {
        String obj = this.f228632a.toString();
        String obj2 = this.f228633b.toString();
        return "NamedSequenceSpec{sequence=" + obj + ", resultFactory=" + obj2 + "}";
    }
}
