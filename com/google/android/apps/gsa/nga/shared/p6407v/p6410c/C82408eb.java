package com.google.android.apps.gsa.nga.shared.p6407v.p6410c;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.c.eb */
/* compiled from: PG */
public final class C82408eb extends C82637mo {

    /* renamed from: a */
    private final String f225141a = "NGA_PIE_ELIGIBILITY";

    /* renamed from: b */
    private final String f225142b;

    public C82408eb(String str, String str2) {
        this.f225142b = str2;
    }

    /* renamed from: b */
    public final String mo76070b() {
        return this.f225142b;
    }

    /* renamed from: d */
    public final String mo75583d() {
        return this.f225141a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C82637mo) {
            C82637mo moVar = (C82637mo) obj;
            return this.f225141a.equals(moVar.mo75583d()) && this.f225142b.equals(moVar.mo76070b());
        }
    }

    public final int hashCode() {
        return ((this.f225141a.hashCode() ^ 1000003) * 1000003) ^ this.f225142b.hashCode();
    }

    public final String toString() {
        String str = this.f225141a;
        String str2 = this.f225142b;
        return "NgaPieEligibilityEvent{token=" + str + ", eligibility=" + str2 + "}";
    }
}
