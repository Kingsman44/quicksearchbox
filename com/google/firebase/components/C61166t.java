package com.google.firebase.components;

/* renamed from: com.google.firebase.components.t */
/* compiled from: PG */
public final class C61166t {

    /* renamed from: a */
    public final Class f165505a;

    /* renamed from: b */
    public final int f165506b;

    /* renamed from: c */
    private final int f165507c;

    public C61166t(Class cls, int i, int i2) {
        this.f165505a = cls;
        this.f165506b = i;
        this.f165507c = i2;
    }

    /* renamed from: a */
    public static C61166t m93533a(Class cls) {
        return new C61166t(cls, 0, 1);
    }

    /* renamed from: b */
    public static C61166t m93534b(Class cls) {
        return new C61166t(cls, 1, 0);
    }

    /* renamed from: c */
    public static C61166t m93535c(Class cls) {
        return new C61166t(cls, 2, 0);
    }

    /* renamed from: d */
    public final boolean mo57727d() {
        return this.f165507c == 0;
    }

    /* renamed from: e */
    public final boolean mo57728e() {
        return this.f165506b == 2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C61166t) {
            C61166t tVar = (C61166t) obj;
            if (this.f165505a == tVar.f165505a && this.f165506b == tVar.f165506b && this.f165507c == tVar.f165507c) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f165505a.hashCode() ^ 1000003) * 1000003) ^ this.f165506b) * 1000003) ^ this.f165507c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Dependency{anInterface=");
        sb.append(this.f165505a);
        sb.append(", type=");
        int i = this.f165506b;
        sb.append(i == 1 ? "required" : i == 0 ? "optional" : "set");
        sb.append(", injection=");
        sb.append(this.f165507c != 0 ? "provider" : "direct");
        sb.append("}");
        return sb.toString();
    }
}
