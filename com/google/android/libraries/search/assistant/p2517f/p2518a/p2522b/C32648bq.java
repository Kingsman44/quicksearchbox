package com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b;

/* renamed from: com.google.android.libraries.search.assistant.f.a.b.bq */
/* compiled from: PG */
public final class C32648bq {

    /* renamed from: a */
    public final int f87512a;

    /* renamed from: b */
    private final int f87513b;

    public C32648bq(int i, int i2) {
        this.f87512a = i;
        this.f87513b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C32648bq)) {
            return false;
        }
        C32648bq bqVar = (C32648bq) obj;
        return this.f87512a == bqVar.f87512a && this.f87513b == bqVar.f87513b;
    }

    public final int hashCode() {
        return (this.f87512a * 31) + this.f87513b;
    }

    public final String toString() {
        int i = this.f87512a;
        int i2 = this.f87513b;
        return "CacheSize(completedPartSizeBytes=" + i + ", estimatedPartSizeBytes=" + i2 + ")";
    }
}
