package com.google.apps.tiktok.p3640f.p3641a.p3642a;

/* renamed from: com.google.apps.tiktok.f.a.a.a */
/* compiled from: PG */
public final class C47073a extends C47078f {

    /* renamed from: a */
    private final long f122667a;

    /* renamed from: b */
    private final long f122668b;

    public C47073a(long j, long j2) {
        this.f122667a = j;
        this.f122668b = j2;
    }

    /* renamed from: a */
    public final long mo51002a() {
        return this.f122668b;
    }

    /* renamed from: b */
    public final long mo51003b() {
        return this.f122667a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C47078f) {
            C47078f fVar = (C47078f) obj;
            return this.f122667a == fVar.mo51003b() && this.f122668b == fVar.mo51002a();
        }
    }

    public final int hashCode() {
        long j = this.f122667a;
        long j2 = this.f122668b;
        return ((int) (j2 ^ (j2 >>> 32))) ^ ((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003);
    }

    public final String toString() {
        long j = this.f122667a;
        long j2 = this.f122668b;
        return "LogReport{timestampMillis=" + j + ", size=" + j2 + "}";
    }
}
