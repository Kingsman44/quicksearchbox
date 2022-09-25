package com.google.android.apps.gsa.nga.shared.p6407v.p6410c;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.c.be */
/* compiled from: PG */
public final class C82330be extends C82559jr {

    /* renamed from: a */
    private final String f224909a = "NGA_CLOUD_REASON";

    /* renamed from: b */
    private final int f224910b;

    public C82330be(String str, int i) {
        this.f224910b = i;
    }

    /* renamed from: b */
    public final int mo75739b() {
        return this.f224910b;
    }

    /* renamed from: d */
    public final String mo75583d() {
        return this.f224909a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C82559jr) {
            C82559jr jrVar = (C82559jr) obj;
            return this.f224909a.equals(jrVar.mo75583d()) && this.f224910b == jrVar.mo75739b();
        }
    }

    public final int hashCode() {
        return ((this.f224909a.hashCode() ^ 1000003) * 1000003) ^ this.f224910b;
    }

    public final String toString() {
        String str = this.f224909a;
        int i = this.f224910b;
        return "NgaCloudReasonEvent{token=" + str + ", cloudReason=" + i + "}";
    }
}
