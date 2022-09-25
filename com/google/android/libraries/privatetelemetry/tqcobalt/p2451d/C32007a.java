package com.google.android.libraries.privatetelemetry.tqcobalt.p2451d;

/* renamed from: com.google.android.libraries.privatetelemetry.tqcobalt.d.a */
/* compiled from: PG */
public final class C32007a extends C32009c {

    /* renamed from: a */
    private final int f86020a;

    /* renamed from: b */
    private final long f86021b;

    /* renamed from: c */
    private final long f86022c;

    public C32007a(int i, long j, long j2) {
        this.f86020a = i;
        this.f86021b = j;
        this.f86022c = j2;
    }

    /* renamed from: a */
    public final int mo37768a() {
        return this.f86020a;
    }

    /* renamed from: b */
    public final long mo37769b() {
        return this.f86022c;
    }

    /* renamed from: c */
    public final long mo37770c() {
        return this.f86021b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C32009c) {
            C32009c cVar = (C32009c) obj;
            return this.f86020a == cVar.mo37768a() && this.f86021b == cVar.mo37770c() && this.f86022c == cVar.mo37769b();
        }
    }

    public final int hashCode() {
        int i = this.f86020a;
        long j = this.f86021b;
        long j2 = this.f86022c;
        return ((((i ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2));
    }

    public final String toString() {
        int i = this.f86020a;
        long j = this.f86021b;
        long j2 = this.f86022c;
        return "MetricId{customerId=" + i + ", projectId=" + j + ", metricId=" + j2 + "}";
    }
}
