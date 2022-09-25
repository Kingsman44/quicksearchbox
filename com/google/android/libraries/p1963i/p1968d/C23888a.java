package com.google.android.libraries.p1963i.p1968d;

/* renamed from: com.google.android.libraries.i.d.a */
/* compiled from: PG */
final class C23888a extends C23892e {

    /* renamed from: a */
    public final long f65358a;

    /* renamed from: b */
    public final long f65359b;

    /* renamed from: c */
    public final long f65360c;

    public C23888a(long j, long j2, long j3) {
        this.f65358a = j;
        this.f65359b = j2;
        this.f65360c = j3;
    }

    /* renamed from: a */
    public final long mo29283a() {
        return this.f65358a;
    }

    /* renamed from: b */
    public final long mo29284b() {
        return this.f65360c;
    }

    /* renamed from: c */
    public final long mo29285c() {
        return this.f65359b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C23892e) {
            C23892e eVar = (C23892e) obj;
            return this.f65358a == eVar.mo29283a() && this.f65359b == eVar.mo29285c() && this.f65360c == eVar.mo29284b();
        }
    }

    public final int hashCode() {
        long j = this.f65358a;
        long j2 = this.f65359b;
        long j3 = this.f65360c;
        return ((int) ((j3 >>> 32) ^ j3)) ^ ((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003);
    }

    public final String toString() {
        long j = this.f65358a;
        long j2 = this.f65359b;
        long j3 = this.f65360c;
        return "SchedStat{cpuTimeNs=" + j + ", runDelayNs=" + j2 + ", runCount=" + j3 + "}";
    }
}
