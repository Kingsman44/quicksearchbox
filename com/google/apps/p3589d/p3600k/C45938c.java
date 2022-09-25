package com.google.apps.p3589d.p3600k;

/* renamed from: com.google.apps.d.k.c */
/* compiled from: PG */
public final class C45938c extends C45946k {

    /* renamed from: a */
    public final double f120727a;

    /* renamed from: b */
    public final double f120728b;

    /* renamed from: c */
    public final double f120729c;

    /* renamed from: d */
    public final double f120730d;

    public C45938c(double d, double d2, double d3, double d4) {
        this.f120727a = d;
        this.f120728b = d2;
        this.f120729c = d3;
        this.f120730d = d4;
    }

    /* renamed from: a */
    public final double mo50047a() {
        return this.f120729c;
    }

    /* renamed from: b */
    public final double mo50048b() {
        return this.f120730d;
    }

    /* renamed from: c */
    public final double mo50049c() {
        return this.f120727a;
    }

    /* renamed from: d */
    public final double mo50050d() {
        return this.f120728b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C45946k) {
            C45946k kVar = (C45946k) obj;
            return Double.doubleToLongBits(this.f120727a) == Double.doubleToLongBits(kVar.mo50049c()) && Double.doubleToLongBits(this.f120728b) == Double.doubleToLongBits(kVar.mo50050d()) && Double.doubleToLongBits(this.f120729c) == Double.doubleToLongBits(kVar.mo50047a()) && Double.doubleToLongBits(this.f120730d) == Double.doubleToLongBits(kVar.mo50048b());
        }
    }

    public final int hashCode() {
        return ((int) ((Double.doubleToLongBits(this.f120730d) >>> 32) ^ Double.doubleToLongBits(this.f120730d))) ^ ((((((((int) ((Double.doubleToLongBits(this.f120727a) >>> 32) ^ Double.doubleToLongBits(this.f120727a))) ^ 1000003) * 1000003) ^ ((int) ((Double.doubleToLongBits(this.f120728b) >>> 32) ^ Double.doubleToLongBits(this.f120728b)))) * 1000003) ^ ((int) ((Double.doubleToLongBits(this.f120729c) >>> 32) ^ Double.doubleToLongBits(this.f120729c)))) * 1000003);
    }

    public final String toString() {
        double d = this.f120727a;
        double d2 = this.f120728b;
        double d3 = this.f120729c;
        double d4 = this.f120730d;
        return "Rect{minX=" + d + ", minY=" + d2 + ", maxX=" + d3 + ", maxY=" + d4 + "}";
    }
}
