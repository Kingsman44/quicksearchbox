package com.google.android.apps.gsa.shared.p7012bb.p7016d;

/* renamed from: com.google.android.apps.gsa.shared.bb.d.a */
/* compiled from: PG */
final class C89363a extends C89379g {

    /* renamed from: a */
    private final long f242296a;

    /* renamed from: b */
    private final int f242297b;

    /* renamed from: c */
    private final int f242298c;

    public C89363a(long j, int i, int i2) {
        this.f242296a = j;
        this.f242297b = i;
        this.f242298c = i2;
    }

    /* renamed from: a */
    public final int mo83292a() {
        return 0;
    }

    /* renamed from: b */
    public final int mo83293b() {
        return this.f242298c;
    }

    /* renamed from: c */
    public final int mo83294c() {
        return this.f242297b;
    }

    /* renamed from: d */
    public final long mo83295d() {
        return this.f242296a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C89379g) {
            C89379g gVar = (C89379g) obj;
            return this.f242296a == gVar.mo83295d() && this.f242297b == gVar.mo83294c() && this.f242298c == gVar.mo83293b() && gVar.mo83292a() == 0;
        }
    }

    public final int hashCode() {
        long j = this.f242296a;
        return (((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.f242297b) * 1000003) ^ this.f242298c) * 1000003;
    }

    public final String toString() {
        long j = this.f242296a;
        int i = this.f242297b;
        int i2 = this.f242298c;
        return "CustomEvent{timestampNanos=" + j + ", type=" + i + ", id=" + i2 + ", group=0}";
    }
}
