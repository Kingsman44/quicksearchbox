package com.google.android.apps.gsa.nga.shared.p6407v.p6410c;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.c.x */
/* compiled from: PG */
final class C82746x extends C82524ij {

    /* renamed from: a */
    private final String f225503a;

    /* renamed from: b */
    private final String f225504b;

    /* renamed from: c */
    private final int f225505c;

    /* renamed from: d */
    private final int f225506d;

    public C82746x(String str, String str2, int i, int i2) {
        this.f225503a = str;
        this.f225504b = str2;
        this.f225505c = i;
        this.f225506d = i2;
    }

    /* renamed from: b */
    public final int mo76567b() {
        return this.f225506d;
    }

    /* renamed from: c */
    public final int mo76568c() {
        return this.f225505c;
    }

    /* renamed from: d */
    public final String mo75583d() {
        return this.f225503a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C82524ij) {
            C82524ij ijVar = (C82524ij) obj;
            return this.f225503a.equals(ijVar.mo75583d()) && this.f225504b.equals(ijVar.mo76569f()) && this.f225505c == ijVar.mo76568c() && this.f225506d == ijVar.mo76567b();
        }
    }

    /* renamed from: f */
    public final String mo76569f() {
        return this.f225504b;
    }

    public final int hashCode() {
        return ((((((this.f225503a.hashCode() ^ 1000003) * 1000003) ^ this.f225504b.hashCode()) * 1000003) ^ this.f225505c) * 1000003) ^ this.f225506d;
    }

    public final String toString() {
        String str = this.f225503a;
        String str2 = this.f225504b;
        int i = this.f225505c;
        int i2 = this.f225506d;
        return "DidQueryClassifierLoadingErrorCount{token=" + str + ", errorMessage=" + str2 + ", resourceVersion=" + i + ", resourceStatus=" + i2 + "}";
    }
}
