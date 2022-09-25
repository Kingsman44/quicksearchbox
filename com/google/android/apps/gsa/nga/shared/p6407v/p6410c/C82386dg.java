package com.google.android.apps.gsa.nga.shared.p6407v.p6410c;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.c.dg */
/* compiled from: PG */
public final class C82386dg extends C82615lt {

    /* renamed from: a */
    private final String f225086a = "NGA_MEMORY_LAST_TRIM_LEVEL";

    /* renamed from: b */
    private final String f225087b;

    /* renamed from: c */
    private final int f225088c;

    public C82386dg(String str, String str2, int i) {
        this.f225087b = str2;
        this.f225088c = i;
    }

    /* renamed from: b */
    public final int mo75975b() {
        return this.f225088c;
    }

    /* renamed from: c */
    public final String mo75976c() {
        return this.f225087b;
    }

    /* renamed from: d */
    public final String mo75583d() {
        return this.f225086a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C82615lt) {
            C82615lt ltVar = (C82615lt) obj;
            return this.f225086a.equals(ltVar.mo75583d()) && this.f225087b.equals(ltVar.mo75976c()) && this.f225088c == ltVar.mo75975b();
        }
    }

    public final int hashCode() {
        return ((((this.f225086a.hashCode() ^ 1000003) * 1000003) ^ this.f225087b.hashCode()) * 1000003) ^ this.f225088c;
    }

    public final String toString() {
        String str = this.f225086a;
        String str2 = this.f225087b;
        int i = this.f225088c;
        return "NgaMemoryLastTrimLevelEvent{token=" + str + ", deviceRamGb=" + str2 + ", trimLevel=" + i + "}";
    }
}
