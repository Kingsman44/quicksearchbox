package com.google.android.apps.search.assistant.verticals.ambient.p9946p.p9949b;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.p.b.c */
/* compiled from: PG */
final class C131131c extends C131141m {

    /* renamed from: a */
    private final int f358628a;

    /* renamed from: b */
    private final int f358629b;

    public C131131c(int i, int i2) {
        this.f358628a = i;
        this.f358629b = i2;
    }

    /* renamed from: a */
    public final int mo110093a() {
        return this.f358629b;
    }

    /* renamed from: b */
    public final int mo110094b() {
        return this.f358628a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C131141m) {
            C131141m mVar = (C131141m) obj;
            return this.f358628a == mVar.mo110094b() && this.f358629b == mVar.mo110093a();
        }
    }

    public final int hashCode() {
        return ((this.f358628a ^ 1000003) * 1000003) ^ this.f358629b;
    }

    public final String toString() {
        int i = this.f358628a;
        int i2 = this.f358629b;
        return "SectionInfo{offset=" + i + ", end=" + i2 + "}";
    }
}
