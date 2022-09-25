package com.google.android.apps.search.assistant.verticals.ambient.p9930k.p9931a;

import com.google.assistant.p4016z.C53738w;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.k.a.a */
/* compiled from: PG */
final class C130840a extends C130856q {

    /* renamed from: a */
    private final C53738w f358095a;

    /* renamed from: b */
    private final double f358096b;

    public C130840a(C53738w wVar, double d) {
        if (wVar != null) {
            this.f358095a = wVar;
            this.f358096b = d;
            return;
        }
        throw new NullPointerException("Null location");
    }

    /* renamed from: a */
    public final double mo109837a() {
        return this.f358096b;
    }

    /* renamed from: b */
    public final C53738w mo109838b() {
        return this.f358095a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C130856q) {
            C130856q qVar = (C130856q) obj;
            return this.f358095a.equals(qVar.mo109838b()) && Double.doubleToLongBits(this.f358096b) == Double.doubleToLongBits(qVar.mo109837a());
        }
    }

    public final int hashCode() {
        return ((this.f358095a.hashCode() ^ 1000003) * 1000003) ^ ((int) ((Double.doubleToLongBits(this.f358096b) >>> 32) ^ Double.doubleToLongBits(this.f358096b)));
    }

    public final String toString() {
        String obj = this.f358095a.toString();
        double d = this.f358096b;
        return "LocationWithProbability{location=" + obj + ", probability=" + d + "}";
    }
}
