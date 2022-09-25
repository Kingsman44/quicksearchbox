package com.google.android.apps.gsa.nga.shared.p6407v.p6410c;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.c.al */
/* compiled from: PG */
final class C82310al extends C82538ix {

    /* renamed from: a */
    private final String f224836a;

    /* renamed from: b */
    private final Double f224837b;

    /* renamed from: c */
    private final int f224838c;

    /* renamed from: d */
    private final boolean f224839d;

    public C82310al(String str, Double d, int i, boolean z) {
        this.f224836a = str;
        this.f224837b = d;
        this.f224838c = i;
        this.f224839d = z;
    }

    /* renamed from: b */
    public final int mo75634b() {
        return this.f224838c;
    }

    /* renamed from: c */
    public final Double mo75635c() {
        return this.f224837b;
    }

    /* renamed from: d */
    public final String mo75583d() {
        return this.f224836a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C82538ix) {
            C82538ix ixVar = (C82538ix) obj;
            return this.f224836a.equals(ixVar.mo75583d()) && this.f224837b.equals(ixVar.mo75635c()) && this.f224838c == ixVar.mo75634b() && this.f224839d == ixVar.mo75637f();
        }
    }

    /* renamed from: f */
    public final boolean mo75637f() {
        return this.f224839d;
    }

    public final int hashCode() {
        return ((((((this.f224836a.hashCode() ^ 1000003) * 1000003) ^ this.f224837b.hashCode()) * 1000003) ^ this.f224838c) * 1000003) ^ (true != this.f224839d ? 1237 : 1231);
    }

    public final String toString() {
        String str = this.f224836a;
        Double d = this.f224837b;
        int i = this.f224838c;
        boolean z = this.f224839d;
        return "IcingClockContextOutdatedLatencyEvent{token=" + str + ", value=" + d + ", contextType=" + i + ", isOutOfDate=" + z + "}";
    }
}
