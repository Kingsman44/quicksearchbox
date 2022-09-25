package com.google.android.apps.gsa.staticplugins.bubble.mvc.p7596b;

/* renamed from: com.google.android.apps.gsa.staticplugins.bubble.mvc.b.b */
/* compiled from: PG */
public final class C97051b extends C97062m {

    /* renamed from: a */
    public final long f271188a;

    /* renamed from: b */
    public final long f271189b;

    public C97051b(long j, long j2) {
        this.f271188a = j;
        this.f271189b = j2;
    }

    /* renamed from: a */
    public final long mo90414a() {
        return this.f271189b;
    }

    /* renamed from: b */
    public final long mo90415b() {
        return this.f271188a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C97062m) {
            C97062m mVar = (C97062m) obj;
            return this.f271188a == mVar.mo90415b() && this.f271189b == mVar.mo90414a();
        }
    }

    public final int hashCode() {
        long j = this.f271188a;
        long j2 = this.f271189b;
        return ((int) (j2 ^ (j2 >>> 32))) ^ ((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003);
    }

    public final String toString() {
        long j = this.f271188a;
        long j2 = this.f271189b;
        return "PollingFrequencies{whenScreenOnMs=" + j + ", whenScreenOffMs=" + j2 + "}";
    }
}
