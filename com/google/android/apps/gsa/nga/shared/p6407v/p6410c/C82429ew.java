package com.google.android.apps.gsa.nga.shared.p6407v.p6410c;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.c.ew */
/* compiled from: PG */
public final class C82429ew extends C82659nj {

    /* renamed from: a */
    private final String f225222a = "NGA_SODA_INITIALIZATION_STATUS3";

    /* renamed from: b */
    private final int f225223b;

    /* renamed from: c */
    private final String f225224c;

    public C82429ew(String str, int i, String str2) {
        this.f225223b = i;
        this.f225224c = str2;
    }

    /* renamed from: b */
    public final int mo76185b() {
        return this.f225223b;
    }

    /* renamed from: c */
    public final String mo76186c() {
        return this.f225224c;
    }

    /* renamed from: d */
    public final String mo75583d() {
        return this.f225222a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C82659nj) {
            C82659nj njVar = (C82659nj) obj;
            return this.f225222a.equals(njVar.mo75583d()) && this.f225223b == njVar.mo76185b() && this.f225224c.equals(njVar.mo76186c());
        }
    }

    public final int hashCode() {
        return ((((this.f225222a.hashCode() ^ 1000003) * 1000003) ^ this.f225223b) * 1000003) ^ this.f225224c.hashCode();
    }

    public final String toString() {
        String str = this.f225222a;
        int i = this.f225223b;
        String str2 = this.f225224c;
        return "NgaSodaInitializationStatusEvent{token=" + str + ", lpVersion=" + i + ", status=" + str2 + "}";
    }
}
