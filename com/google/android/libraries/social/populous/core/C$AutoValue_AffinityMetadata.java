package com.google.android.libraries.social.populous.core;

/* renamed from: com.google.android.libraries.social.populous.core.$AutoValue_AffinityMetadata  reason: invalid class name */
/* compiled from: PG */
abstract class C$AutoValue_AffinityMetadata extends AffinityMetadata {

    /* renamed from: a */
    public final boolean f110603a;

    /* renamed from: b */
    public final boolean f110604b;

    /* renamed from: c */
    public final boolean f110605c;

    /* renamed from: d */
    public final double f110606d;

    /* renamed from: e */
    public final double f110607e;

    public C$AutoValue_AffinityMetadata(boolean z, boolean z2, boolean z3, double d, double d2) {
        this.f110603a = z;
        this.f110604b = z2;
        this.f110605c = z3;
        this.f110606d = d;
        this.f110607e = d2;
    }

    /* renamed from: a */
    public final double mo44937a() {
        return this.f110606d;
    }

    /* renamed from: b */
    public final double mo44938b() {
        return this.f110607e;
    }

    /* renamed from: c */
    public final boolean mo44939c() {
        return this.f110604b;
    }

    /* renamed from: d */
    public final boolean mo44940d() {
        return this.f110605c;
    }

    /* renamed from: e */
    public final boolean mo44941e() {
        return this.f110603a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AffinityMetadata) {
            AffinityMetadata affinityMetadata = (AffinityMetadata) obj;
            return this.f110603a == affinityMetadata.mo44941e() && this.f110604b == affinityMetadata.mo44939c() && this.f110605c == affinityMetadata.mo44940d() && Double.doubleToLongBits(this.f110606d) == Double.doubleToLongBits(affinityMetadata.mo44937a()) && Double.doubleToLongBits(this.f110607e) == Double.doubleToLongBits(affinityMetadata.mo44938b());
        }
    }

    public final int hashCode() {
        int i = 1237;
        int i2 = ((((true != this.f110603a ? 1237 : 1231) ^ 1000003) * 1000003) ^ (true != this.f110604b ? 1237 : 1231)) * 1000003;
        if (true == this.f110605c) {
            i = 1231;
        }
        return ((((i2 ^ i) * 1000003) ^ ((int) ((Double.doubleToLongBits(this.f110606d) >>> 32) ^ Double.doubleToLongBits(this.f110606d)))) * 1000003) ^ ((int) ((Double.doubleToLongBits(this.f110607e) >>> 32) ^ Double.doubleToLongBits(this.f110607e)));
    }

    public final String toString() {
        boolean z = this.f110603a;
        boolean z2 = this.f110604b;
        boolean z3 = this.f110605c;
        double d = this.f110606d;
        double d2 = this.f110607e;
        return "AffinityMetadata{isPopulated=" + z + ", isDeviceDataKnown=" + z2 + ", isDirectClientInteraction=" + z3 + ", cloudScore=" + d + ", deviceScore=" + d2 + "}";
    }
}
