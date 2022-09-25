package androidx.work.impl.p204a;

/* renamed from: androidx.work.impl.a.b */
/* compiled from: PG */
public final class C4425b {

    /* renamed from: a */
    public final boolean f14104a;

    /* renamed from: b */
    public final boolean f14105b;

    /* renamed from: c */
    public final boolean f14106c;

    /* renamed from: d */
    public final boolean f14107d;

    public C4425b(boolean z, boolean z2, boolean z3, boolean z4) {
        this.f14104a = z;
        this.f14105b = z2;
        this.f14106c = z3;
        this.f14107d = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4425b)) {
            return false;
        }
        C4425b bVar = (C4425b) obj;
        return this.f14104a == bVar.f14104a && this.f14105b == bVar.f14105b && this.f14106c == bVar.f14106c && this.f14107d == bVar.f14107d;
    }

    public final int hashCode() {
        return ((((((this.f14104a ? 1 : 0) * true) + (this.f14105b ? 1 : 0)) * 31) + (this.f14106c ? 1 : 0)) * 31) + (this.f14107d ? 1 : 0);
    }

    public final String toString() {
        return "NetworkState(isConnected=" + this.f14104a + ", isValidated=" + this.f14105b + ", isMetered=" + this.f14106c + ", isNotRoaming=" + this.f14107d + ')';
    }
}
