package com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8560e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.l.e.b */
/* compiled from: PG */
public final class C112332b extends C112358bz {

    /* renamed from: a */
    private final double f311712a;

    /* renamed from: b */
    private final int f311713b;

    public C112332b(double d, int i) {
        this.f311712a = d;
        this.f311713b = i;
    }

    /* renamed from: a */
    public final double mo99503a() {
        return this.f311712a;
    }

    /* renamed from: b */
    public final int mo99504b() {
        return this.f311713b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C112358bz) {
            C112358bz bzVar = (C112358bz) obj;
            return Double.doubleToLongBits(this.f311712a) == Double.doubleToLongBits(bzVar.mo99503a()) && this.f311713b == bzVar.mo99504b();
        }
    }

    public final int hashCode() {
        return this.f311713b ^ ((((int) ((Double.doubleToLongBits(this.f311712a) >>> 32) ^ Double.doubleToLongBits(this.f311712a))) ^ 1000003) * 1000003);
    }

    public final String toString() {
        double d = this.f311712a;
        int i = this.f311713b;
        return "Aggregate{logSum=" + d + ", count=" + i + "}";
    }
}
