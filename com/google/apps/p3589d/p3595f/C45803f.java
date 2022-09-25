package com.google.apps.p3589d.p3595f;

/* renamed from: com.google.apps.d.f.f */
/* compiled from: PG */
final class C45803f extends C45823z {

    /* renamed from: a */
    private final int f120439a;

    /* renamed from: b */
    private final double f120440b;

    /* renamed from: c */
    private final double f120441c;

    /* renamed from: d */
    private final double f120442d;

    /* renamed from: e */
    private final boolean f120443e;

    public C45803f(int i, double d, double d2, double d3, boolean z) {
        this.f120439a = i;
        this.f120440b = d;
        this.f120441c = d2;
        this.f120442d = d3;
        this.f120443e = z;
    }

    /* renamed from: a */
    public final double mo49954a() {
        return this.f120442d;
    }

    /* renamed from: b */
    public final double mo49955b() {
        return this.f120440b;
    }

    /* renamed from: c */
    public final double mo49956c() {
        return this.f120441c;
    }

    /* renamed from: d */
    public final int mo49957d() {
        return this.f120439a;
    }

    /* renamed from: e */
    public final boolean mo49958e() {
        return this.f120443e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C45823z) {
            C45823z zVar = (C45823z) obj;
            return this.f120439a == zVar.mo49957d() && Double.doubleToLongBits(this.f120440b) == Double.doubleToLongBits(zVar.mo49955b()) && Double.doubleToLongBits(this.f120441c) == Double.doubleToLongBits(zVar.mo49956c()) && Double.doubleToLongBits(this.f120442d) == Double.doubleToLongBits(zVar.mo49954a()) && this.f120443e == zVar.mo49958e();
        }
    }

    public final int hashCode() {
        return ((((((((this.f120439a ^ 1000003) * 1000003) ^ ((int) ((Double.doubleToLongBits(this.f120440b) >>> 32) ^ Double.doubleToLongBits(this.f120440b)))) * 1000003) ^ ((int) ((Double.doubleToLongBits(this.f120441c) >>> 32) ^ Double.doubleToLongBits(this.f120441c)))) * 1000003) ^ ((int) ((Double.doubleToLongBits(this.f120442d) >>> 32) ^ Double.doubleToLongBits(this.f120442d)))) * 1000003) ^ (true != this.f120443e ? 1237 : 1231);
    }

    public final String toString() {
        int i = this.f120439a;
        double d = this.f120440b;
        double d2 = this.f120441c;
        double d3 = this.f120442d;
        boolean z = this.f120443e;
        return "GlyphPart{gid=" + i + ", fullAdvance=" + d + ", startConnectorLength=" + d2 + ", endConnectorLength=" + d3 + ", isExtender=" + z + "}";
    }
}
