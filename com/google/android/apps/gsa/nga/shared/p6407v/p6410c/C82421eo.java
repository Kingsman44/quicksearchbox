package com.google.android.apps.gsa.nga.shared.p6407v.p6410c;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.c.eo */
/* compiled from: PG */
public final class C82421eo extends C82651nb {

    /* renamed from: a */
    private final String f225194a = "NGA_SAA_ENABLED";

    /* renamed from: b */
    private final boolean f225195b;

    public C82421eo(String str, boolean z) {
        this.f225195b = z;
    }

    /* renamed from: b */
    public final boolean mo76144b() {
        return this.f225195b;
    }

    /* renamed from: d */
    public final String mo75583d() {
        return this.f225194a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C82651nb) {
            C82651nb nbVar = (C82651nb) obj;
            return this.f225194a.equals(nbVar.mo75583d()) && this.f225195b == nbVar.mo76144b();
        }
    }

    public final int hashCode() {
        return ((this.f225194a.hashCode() ^ 1000003) * 1000003) ^ (true != this.f225195b ? 1237 : 1231);
    }

    public final String toString() {
        String str = this.f225194a;
        boolean z = this.f225195b;
        return "NgaSaaEnabledEvent{token=" + str + ", saaEnabled=" + z + "}";
    }
}
