package com.google.android.apps.gsa.nga.shared.p6407v.p6410c;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.c.di */
/* compiled from: PG */
final class C82388di extends C82617lv {

    /* renamed from: a */
    private final String f225092a;

    /* renamed from: b */
    private final Double f225093b;

    /* renamed from: c */
    private final String f225094c;

    public C82388di(String str, Double d, String str2) {
        this.f225092a = str;
        this.f225093b = d;
        this.f225094c = str2;
    }

    /* renamed from: b */
    public final Double mo75981b() {
        return this.f225093b;
    }

    /* renamed from: c */
    public final String mo75982c() {
        return this.f225094c;
    }

    /* renamed from: d */
    public final String mo75583d() {
        return this.f225092a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C82617lv) {
            C82617lv lvVar = (C82617lv) obj;
            return this.f225092a.equals(lvVar.mo75583d()) && this.f225093b.equals(lvVar.mo75981b()) && this.f225094c.equals(lvVar.mo75982c());
        }
    }

    public final int hashCode() {
        return ((((this.f225092a.hashCode() ^ 1000003) * 1000003) ^ this.f225093b.hashCode()) * 1000003) ^ this.f225094c.hashCode();
    }

    public final String toString() {
        String str = this.f225092a;
        Double d = this.f225093b;
        String str2 = this.f225094c;
        return "NgaMemoryUsageEvent{token=" + str + ", value=" + d + ", memoryType=" + str2 + "}";
    }
}
