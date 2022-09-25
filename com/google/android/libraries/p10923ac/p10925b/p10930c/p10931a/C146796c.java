package com.google.android.libraries.p10923ac.p10925b.p10930c.p10931a;

/* renamed from: com.google.android.libraries.ac.b.c.a.c */
/* compiled from: PG */
public final class C146796c extends C146801h {

    /* renamed from: b */
    private final long f396351b;

    /* renamed from: c */
    private final long f396352c;

    /* renamed from: d */
    private final long f396353d;

    public C146796c(long j, long j2, long j3) {
        this.f396351b = j;
        this.f396352c = j2;
        this.f396353d = j3;
    }

    /* renamed from: a */
    public final long mo123658a() {
        return this.f396352c;
    }

    /* renamed from: b */
    public final long mo123659b() {
        return this.f396351b;
    }

    /* renamed from: c */
    public final long mo123660c() {
        return this.f396353d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C146801h) {
            C146801h hVar = (C146801h) obj;
            return this.f396351b == hVar.mo123659b() && this.f396352c == hVar.mo123658a() && this.f396353d == hVar.mo123660c();
        }
    }

    public final int hashCode() {
        long j = this.f396351b;
        long j2 = this.f396352c;
        long j3 = this.f396353d;
        return ((int) ((j3 >>> 32) ^ j3)) ^ ((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003);
    }

    public final String toString() {
        long j = this.f396351b;
        long j2 = this.f396352c;
        long j3 = this.f396353d;
        return "CoreSyncStatus{elapsedRealtimeMillisAtLastSync=" + j + ", currentTimeMillisAtLastSync=" + j2 + ", serverTimeMillisAtLastSync=" + j3 + "}";
    }
}
