package com.google.apps.p3589d.p3600k;

/* renamed from: com.google.apps.d.k.b */
/* compiled from: PG */
public final class C45937b extends C45944i {

    /* renamed from: a */
    public final double f120725a;

    /* renamed from: b */
    public final double f120726b;

    public C45937b(double d, double d2) {
        this.f120725a = d;
        this.f120726b = d2;
    }

    /* renamed from: a */
    public final double mo50042a() {
        return this.f120725a;
    }

    /* renamed from: b */
    public final double mo50043b() {
        return this.f120726b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C45944i) {
            C45944i iVar = (C45944i) obj;
            return Double.doubleToLongBits(this.f120725a) == Double.doubleToLongBits(iVar.mo50042a()) && Double.doubleToLongBits(this.f120726b) == Double.doubleToLongBits(iVar.mo50043b());
        }
    }

    public final int hashCode() {
        return ((int) ((Double.doubleToLongBits(this.f120726b) >>> 32) ^ Double.doubleToLongBits(this.f120726b))) ^ ((((int) ((Double.doubleToLongBits(this.f120725a) >>> 32) ^ Double.doubleToLongBits(this.f120725a))) ^ 1000003) * 1000003);
    }

    public final String toString() {
        double d = this.f120725a;
        double d2 = this.f120726b;
        return "Point{x=" + d + ", y=" + d2 + "}";
    }
}
