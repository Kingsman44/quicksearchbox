package com.google.android.apps.gsa.nga.shared.p6407v.p6410c;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.c.dj */
/* compiled from: PG */
public final class C82389dj extends C82618lw {

    /* renamed from: a */
    private final String f225095a = "NGA_MIC_EXCLUSIVE2";

    /* renamed from: b */
    private final String f225096b;

    /* renamed from: c */
    private final int f225097c;

    public C82389dj(String str, String str2, int i) {
        this.f225096b = str2;
        this.f225097c = i;
    }

    /* renamed from: b */
    public final int mo75986b() {
        return this.f225097c;
    }

    /* renamed from: c */
    public final String mo75987c() {
        return this.f225096b;
    }

    /* renamed from: d */
    public final String mo75583d() {
        return this.f225095a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C82618lw) {
            C82618lw lwVar = (C82618lw) obj;
            return this.f225095a.equals(lwVar.mo75583d()) && this.f225096b.equals(lwVar.mo75987c()) && this.f225097c == lwVar.mo75986b();
        }
    }

    public final int hashCode() {
        return ((((this.f225095a.hashCode() ^ 1000003) * 1000003) ^ this.f225096b.hashCode()) * 1000003) ^ this.f225097c;
    }

    public final String toString() {
        String str = this.f225095a;
        String str2 = this.f225096b;
        int i = this.f225097c;
        return "NgaMicExclusiveEvent{token=" + str + ", status=" + str2 + ", sdk=" + i + "}";
    }
}
