package com.google.android.libraries.p1963i.p1968d;

/* renamed from: com.google.android.libraries.i.d.b */
/* compiled from: PG */
final class C23889b extends C23893f {

    /* renamed from: a */
    private final int f65361a;

    /* renamed from: b */
    private final long f65362b;

    /* renamed from: c */
    private final String f65363c;

    /* renamed from: d */
    private final String f65364d;

    public C23889b(int i, long j, String str, String str2) {
        this.f65361a = i;
        this.f65362b = j;
        if (str != null) {
            this.f65363c = str;
            this.f65364d = str2;
            return;
        }
        throw new NullPointerException("Null name");
    }

    /* renamed from: a */
    public final int mo29289a() {
        return this.f65361a;
    }

    /* renamed from: b */
    public final long mo29290b() {
        return this.f65362b;
    }

    /* renamed from: c */
    public final String mo29291c() {
        return this.f65363c;
    }

    /* renamed from: d */
    public final String mo29292d() {
        return this.f65364d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C23893f) {
            C23893f fVar = (C23893f) obj;
            return this.f65361a == fVar.mo29289a() && this.f65362b == fVar.mo29290b() && this.f65363c.equals(fVar.mo29291c()) && this.f65364d.equals(fVar.mo29292d());
        }
    }

    public final int hashCode() {
        int i = this.f65361a;
        long j = this.f65362b;
        return ((((((i ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ this.f65363c.hashCode()) * 1000003) ^ this.f65364d.hashCode();
    }

    public final String toString() {
        int i = this.f65361a;
        long j = this.f65362b;
        String str = this.f65363c;
        String str2 = this.f65364d;
        return "ThreadIdentifier{tid=" + i + ", id=" + j + ", name=" + str + ", threadPoolName=" + str2 + "}";
    }
}
