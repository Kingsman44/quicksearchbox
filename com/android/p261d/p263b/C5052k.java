package com.android.p261d.p263b;

/* renamed from: com.android.d.b.k */
/* compiled from: PG */
public final class C5052k {

    /* renamed from: a */
    public final long f16088a;

    /* renamed from: b */
    public final long f16089b;

    public C5052k(long j, long j2) {
        this.f16088a = j;
        this.f16089b = j2;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof C5052k) {
            C5052k kVar = (C5052k) obj;
            return this.f16088a == kVar.f16088a && this.f16089b == kVar.f16089b;
        }
    }

    public final String toString() {
        long j = this.f16088a;
        long j2 = this.f16089b;
        return j + "/" + j2;
    }
}
