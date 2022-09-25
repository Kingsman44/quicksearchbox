package com.google.android.apps.gsa.nga.shared.p6407v.p6410c;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.c.bv */
/* compiled from: PG */
public final class C82347bv extends C82577ki {

    /* renamed from: a */
    private final String f224946a = "NGA_FILE_PROVIDER_LATENCY";

    /* renamed from: b */
    private final Double f224947b;

    /* renamed from: c */
    private final int f224948c;

    /* renamed from: d */
    private final int f224949d;

    /* renamed from: e */
    private final boolean f224950e;

    public C82347bv(String str, Double d, int i, int i2, boolean z) {
        this.f224947b = d;
        this.f224948c = i;
        this.f224949d = i2;
        this.f224950e = z;
    }

    /* renamed from: b */
    public final int mo75798b() {
        return this.f224948c;
    }

    /* renamed from: c */
    public final int mo75799c() {
        return this.f224949d;
    }

    /* renamed from: d */
    public final String mo75583d() {
        return this.f224946a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C82577ki) {
            C82577ki kiVar = (C82577ki) obj;
            return this.f224946a.equals(kiVar.mo75583d()) && this.f224947b.equals(kiVar.mo75801f()) && this.f224948c == kiVar.mo75798b() && this.f224949d == kiVar.mo75799c() && this.f224950e == kiVar.mo75802g();
        }
    }

    /* renamed from: f */
    public final Double mo75801f() {
        return this.f224947b;
    }

    /* renamed from: g */
    public final boolean mo75802g() {
        return this.f224950e;
    }

    public final int hashCode() {
        return ((((((((this.f224946a.hashCode() ^ 1000003) * 1000003) ^ this.f224947b.hashCode()) * 1000003) ^ this.f224948c) * 1000003) ^ this.f224949d) * 1000003) ^ (true != this.f224950e ? 1237 : 1231);
    }

    public final String toString() {
        String str = this.f224946a;
        Double d = this.f224947b;
        int i = this.f224948c;
        int i2 = this.f224949d;
        boolean z = this.f224950e;
        return "NgaFileProviderLatency{token=" + str + ", value=" + d + ", fileProviderSource=" + i + ", groupId=" + i2 + ", foundGroup=" + z + "}";
    }
}
