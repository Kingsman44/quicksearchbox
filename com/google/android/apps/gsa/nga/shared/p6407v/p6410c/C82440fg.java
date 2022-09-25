package com.google.android.apps.gsa.nga.shared.p6407v.p6410c;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.c.fg */
/* compiled from: PG */
public final class C82440fg extends C82669nt {

    /* renamed from: a */
    private final String f225259a = "NGA_TCLIB_RESOURCE_ERRORS_SUMMARY";

    /* renamed from: b */
    private final String f225260b;

    /* renamed from: c */
    private final int f225261c;

    /* renamed from: d */
    private final String f225262d;

    public C82440fg(String str, String str2, int i, String str3) {
        this.f225260b = str2;
        this.f225261c = i;
        this.f225262d = str3;
    }

    /* renamed from: b */
    public final int mo76229b() {
        return this.f225261c;
    }

    /* renamed from: c */
    public final String mo76230c() {
        return this.f225260b;
    }

    /* renamed from: d */
    public final String mo75583d() {
        return this.f225259a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C82669nt) {
            C82669nt ntVar = (C82669nt) obj;
            return this.f225259a.equals(ntVar.mo75583d()) && this.f225260b.equals(ntVar.mo76230c()) && this.f225261c == ntVar.mo76229b() && this.f225262d.equals(ntVar.mo76232f());
        }
    }

    /* renamed from: f */
    public final String mo76232f() {
        return this.f225262d;
    }

    public final int hashCode() {
        return ((((((this.f225259a.hashCode() ^ 1000003) * 1000003) ^ this.f225260b.hashCode()) * 1000003) ^ this.f225261c) * 1000003) ^ this.f225262d.hashCode();
    }

    public final String toString() {
        String str = this.f225259a;
        String str2 = this.f225260b;
        int i = this.f225261c;
        String str3 = this.f225262d;
        return "NgaTclibResourceErrorsSummary{token=" + str + ", model=" + str2 + ", modelVersion=" + i + ", status=" + str3 + "}";
    }
}
