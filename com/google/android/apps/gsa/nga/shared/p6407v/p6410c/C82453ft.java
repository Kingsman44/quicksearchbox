package com.google.android.apps.gsa.nga.shared.p6407v.p6410c;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.c.ft */
/* compiled from: PG */
public final class C82453ft extends C82683og {

    /* renamed from: a */
    private final String f225291a = "NGA_USER_ELIGIBLE";

    /* renamed from: b */
    private final String f225292b;

    public C82453ft(String str, String str2) {
        this.f225292b = str2;
    }

    /* renamed from: b */
    public final String mo76287b() {
        return this.f225292b;
    }

    /* renamed from: d */
    public final String mo75583d() {
        return this.f225291a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C82683og) {
            C82683og ogVar = (C82683og) obj;
            return this.f225291a.equals(ogVar.mo75583d()) && this.f225292b.equals(ogVar.mo76287b());
        }
    }

    public final int hashCode() {
        return ((this.f225291a.hashCode() ^ 1000003) * 1000003) ^ this.f225292b.hashCode();
    }

    public final String toString() {
        String str = this.f225291a;
        String str2 = this.f225292b;
        return "NgaUserEligibleEvent{token=" + str + ", eligibilityReason=" + str2 + "}";
    }
}
