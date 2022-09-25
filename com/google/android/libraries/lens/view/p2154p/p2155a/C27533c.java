package com.google.android.libraries.lens.view.p2154p.p2155a;

/* renamed from: com.google.android.libraries.lens.view.p.a.c */
/* compiled from: PG */
final class C27533c extends C27540j {

    /* renamed from: a */
    private final int f75311a;

    /* renamed from: b */
    private final int f75312b;

    public C27533c(int i, int i2) {
        this.f75311a = i;
        this.f75312b = i2;
    }

    /* renamed from: a */
    public final int mo33084a() {
        return this.f75312b;
    }

    /* renamed from: b */
    public final int mo33085b() {
        return this.f75311a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C27540j) {
            C27540j jVar = (C27540j) obj;
            return this.f75311a == jVar.mo33085b() && this.f75312b == jVar.mo33084a();
        }
    }

    public final int hashCode() {
        return ((this.f75311a ^ 1000003) * 1000003) ^ this.f75312b;
    }

    public final String toString() {
        int i = this.f75311a;
        int i2 = this.f75312b;
        return "Size{width=" + i + ", height=" + i2 + "}";
    }
}
