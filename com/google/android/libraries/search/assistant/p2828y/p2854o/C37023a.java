package com.google.android.libraries.search.assistant.p2828y.p2854o;

import com.google.p374ah.C7502d;

/* renamed from: com.google.android.libraries.search.assistant.y.o.a */
/* compiled from: PG */
final class C37023a extends C37052n {

    /* renamed from: a */
    private final double f96433a;

    /* renamed from: b */
    private final C7502d f96434b;

    public C37023a(double d, C7502d dVar) {
        this.f96433a = d;
        if (dVar != null) {
            this.f96434b = dVar;
            return;
        }
        throw new NullPointerException("Null propertyValue");
    }

    /* renamed from: a */
    public final double mo40538a() {
        return this.f96433a;
    }

    /* renamed from: b */
    public final C7502d mo40539b() {
        return this.f96434b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C37052n) {
            C37052n nVar = (C37052n) obj;
            return Double.doubleToLongBits(this.f96433a) == Double.doubleToLongBits(nVar.mo40538a()) && this.f96434b.equals(nVar.mo40539b());
        }
    }

    public final int hashCode() {
        return this.f96434b.hashCode() ^ ((((int) ((Double.doubleToLongBits(this.f96433a) >>> 32) ^ Double.doubleToLongBits(this.f96433a))) ^ 1000003) * 1000003);
    }

    public final String toString() {
        double d = this.f96433a;
        String obj = this.f96434b.toString();
        return "ScoredPropertyValue{score=" + d + ", propertyValue=" + obj + "}";
    }
}
