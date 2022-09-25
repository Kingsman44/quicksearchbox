package com.google.apps.tiktok.cache;

/* renamed from: com.google.apps.tiktok.cache.c */
/* compiled from: PG */
final class C46388c extends C46396k {

    /* renamed from: a */
    private final int f121421a;

    /* renamed from: b */
    private final long f121422b;

    public C46388c(int i, long j) {
        this.f121421a = i;
        this.f121422b = j;
    }

    /* renamed from: a */
    public final int mo50352a() {
        return this.f121421a;
    }

    /* renamed from: b */
    public final long mo50353b() {
        return this.f121422b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C46396k) {
            C46396k kVar = (C46396k) obj;
            return this.f121421a == kVar.mo50352a() && this.f121422b == kVar.mo50353b();
        }
    }

    public final int hashCode() {
        int i = this.f121421a;
        long j = this.f121422b;
        return ((i ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        int i = this.f121421a;
        long j = this.f121422b;
        return "InMemoryKeyValueCacheConfig{maxSizeBytes=" + i + ", filterAfterWriteMs=" + j + "}";
    }
}
