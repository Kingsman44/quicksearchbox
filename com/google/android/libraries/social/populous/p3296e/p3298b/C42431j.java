package com.google.android.libraries.social.populous.p3296e.p3298b;

/* renamed from: com.google.android.libraries.social.populous.e.b.j */
/* compiled from: PG */
final class C42431j extends C42421ar {

    /* renamed from: a */
    private final C42419ap f111338a;

    /* renamed from: b */
    private final double f111339b;

    /* renamed from: c */
    private final double f111340c;

    public C42431j(C42419ap apVar, double d, double d2) {
        this.f111338a = apVar;
        this.f111339b = d;
        this.f111340c = d2;
    }

    /* renamed from: a */
    public final double mo45444a() {
        return this.f111340c;
    }

    /* renamed from: b */
    public final double mo45445b() {
        return this.f111339b;
    }

    /* renamed from: c */
    public final C42419ap mo45446c() {
        return this.f111338a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C42421ar) {
            C42421ar arVar = (C42421ar) obj;
            return this.f111338a.equals(arVar.mo45446c()) && Double.doubleToLongBits(this.f111339b) == Double.doubleToLongBits(arVar.mo45445b()) && Double.doubleToLongBits(this.f111340c) == Double.doubleToLongBits(arVar.mo45444a());
        }
    }

    public final int hashCode() {
        return ((((this.f111338a.hashCode() ^ 1000003) * 1000003) ^ ((int) ((Double.doubleToLongBits(this.f111339b) >>> 32) ^ Double.doubleToLongBits(this.f111339b)))) * 1000003) ^ ((int) ((Double.doubleToLongBits(this.f111340c) >>> 32) ^ Double.doubleToLongBits(this.f111340c)));
    }

    public final String toString() {
        String obj = this.f111338a.toString();
        double d = this.f111339b;
        double d2 = this.f111340c;
        return "RankingScoringParam{featureType=" + obj + ", weight=" + d + ", exponent=" + d2 + "}";
    }
}
