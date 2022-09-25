package com.google.android.libraries.gsa.conversation.p1838b;

/* renamed from: com.google.android.libraries.gsa.conversation.b.a */
/* compiled from: PG */
final class C22347a extends C22351e {

    /* renamed from: a */
    private final long f61688a;

    /* renamed from: b */
    private final long f61689b;

    /* renamed from: c */
    private final long f61690c;

    public C22347a(long j, long j2, long j3) {
        this.f61688a = j;
        this.f61689b = j2;
        this.f61690c = j3;
    }

    /* renamed from: a */
    public final long mo27570a() {
        return this.f61689b;
    }

    /* renamed from: b */
    public final long mo27571b() {
        return this.f61690c;
    }

    /* renamed from: c */
    public final long mo27572c() {
        return this.f61688a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C22351e) {
            C22351e eVar = (C22351e) obj;
            return this.f61688a == eVar.mo27572c() && this.f61689b == eVar.mo27570a() && this.f61690c == eVar.mo27571b();
        }
    }

    public final int hashCode() {
        long j = this.f61688a;
        long j2 = this.f61689b;
        long j3 = this.f61690c;
        return ((int) ((j3 >>> 32) ^ j3)) ^ ((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003);
    }

    public final String toString() {
        long j = this.f61688a;
        long j2 = this.f61689b;
        long j3 = this.f61690c;
        return "AggregateLatency{min=" + j + ", avg=" + j2 + ", max=" + j3 + "}";
    }
}
