package com.google.android.libraries.p10923ac.p10924a;

/* renamed from: com.google.android.libraries.ac.a.c */
/* compiled from: PG */
public final class C146760c extends C146766i {

    /* renamed from: a */
    public final long f396290a;

    /* renamed from: b */
    private final long f396291b;

    /* renamed from: c */
    private final long f396292c;

    public C146760c(long j, long j2, long j3) {
        this.f396291b = j;
        this.f396292c = j2;
        this.f396290a = j3;
    }

    /* renamed from: a */
    public final long mo123607a() {
        return this.f396292c;
    }

    /* renamed from: b */
    public final long mo123608b() {
        return this.f396291b;
    }

    /* renamed from: c */
    public final long mo123609c() {
        return this.f396290a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C146766i) {
            C146766i iVar = (C146766i) obj;
            return this.f396291b == iVar.mo123608b() && this.f396292c == iVar.mo123607a() && this.f396290a == iVar.mo123609c();
        }
    }

    public final int hashCode() {
        long j = this.f396291b;
        long j2 = this.f396292c;
        long j3 = this.f396290a;
        return ((int) ((j3 >>> 32) ^ j3)) ^ ((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003);
    }

    public final String toString() {
        long j = this.f396291b;
        long j2 = this.f396292c;
        long j3 = this.f396290a;
        return "SyncStatus{elapsedRealtimeMillisAtLastSync=" + j + ", currentTimeMillisAtLastSync=" + j2 + ", serverTimeMillisAtLastSync=" + j3 + "}";
    }
}
