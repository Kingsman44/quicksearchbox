package com.google.apps.p3589d.p3595f;

/* renamed from: com.google.apps.d.f.c */
/* compiled from: PG */
final class C45800c extends C45813p {

    /* renamed from: a */
    private final int f120426a;

    /* renamed from: b */
    private final double f120427b;

    /* renamed from: c */
    private final double f120428c;

    /* renamed from: d */
    private final double f120429d;

    /* renamed from: e */
    private final int f120430e;

    public C45800c(int i, double d, double d2, double d3, int i2) {
        this.f120426a = i;
        this.f120427b = d;
        this.f120428c = d2;
        this.f120429d = d3;
        this.f120430e = i2;
    }

    /* renamed from: a */
    public final double mo49932a() {
        return this.f120429d;
    }

    /* renamed from: b */
    public final double mo49933b() {
        return this.f120427b;
    }

    /* renamed from: c */
    public final double mo49934c() {
        return this.f120428c;
    }

    /* renamed from: d */
    public final int mo49935d() {
        return this.f120426a;
    }

    /* renamed from: e */
    public final int mo49936e() {
        return this.f120430e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C45813p) {
            C45813p pVar = (C45813p) obj;
            return this.f120426a == pVar.mo49935d() && Double.doubleToLongBits(this.f120427b) == Double.doubleToLongBits(pVar.mo49933b()) && Double.doubleToLongBits(this.f120428c) == Double.doubleToLongBits(pVar.mo49934c()) && Double.doubleToLongBits(this.f120429d) == Double.doubleToLongBits(pVar.mo49932a()) && this.f120430e == pVar.mo49936e();
        }
    }

    public final int hashCode() {
        return ((((((((this.f120426a ^ 1000003) * 1000003) ^ ((int) ((Double.doubleToLongBits(this.f120427b) >>> 32) ^ Double.doubleToLongBits(this.f120427b)))) * 1000003) ^ ((int) ((Double.doubleToLongBits(this.f120428c) >>> 32) ^ Double.doubleToLongBits(this.f120428c)))) * 1000003) ^ ((int) ((Double.doubleToLongBits(this.f120429d) >>> 32) ^ Double.doubleToLongBits(this.f120429d)))) * 1000003) ^ this.f120430e;
    }

    public final String toString() {
        int i = this.f120426a;
        double d = this.f120427b;
        double d2 = this.f120428c;
        double d3 = this.f120429d;
        int i2 = this.f120430e;
        return "GlyphPartRecord{glyph=" + i + ", fullAdvance=" + d + ", startConnectorLength=" + d2 + ", endConnectorLength=" + d3 + ", partFlags=" + i2 + "}";
    }
}
