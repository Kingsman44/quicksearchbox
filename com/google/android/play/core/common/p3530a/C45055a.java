package com.google.android.play.core.common.p3530a;

/* renamed from: com.google.android.play.core.common.a.a */
/* compiled from: PG */
public final class C45055a extends C45056b {

    /* renamed from: a */
    private final int f117698a;

    /* renamed from: b */
    private final long f117699b;

    public C45055a(int i, long j) {
        this.f117698a = i;
        this.f117699b = j;
    }

    /* renamed from: a */
    public final int mo48892a() {
        return this.f117698a;
    }

    /* renamed from: b */
    public final long mo48893b() {
        return this.f117699b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C45056b) {
            C45056b bVar = (C45056b) obj;
            return this.f117698a == bVar.mo48892a() && this.f117699b == bVar.mo48893b();
        }
    }

    public final int hashCode() {
        int i = this.f117698a;
        long j = this.f117699b;
        return ((i ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        int i = this.f117698a;
        long j = this.f117699b;
        return "EventRecord{eventType=" + i + ", eventTimestamp=" + j + "}";
    }
}
