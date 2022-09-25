package com.google.android.apps.gsa.nga.shared.p6407v.p6410c;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.c.gl */
/* compiled from: PG */
public final class C82472gl extends C82701oy {

    /* renamed from: a */
    private final String f225345a = "NGA_WARM_ACTIONS_SUW_INELIGIBILITY_REASON";

    /* renamed from: b */
    private final String f225346b;

    public C82472gl(String str, String str2) {
        this.f225346b = str2;
    }

    /* renamed from: b */
    public final String mo76373b() {
        return this.f225346b;
    }

    /* renamed from: d */
    public final String mo75583d() {
        return this.f225345a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C82701oy) {
            C82701oy oyVar = (C82701oy) obj;
            return this.f225345a.equals(oyVar.mo75583d()) && this.f225346b.equals(oyVar.mo76373b());
        }
    }

    public final int hashCode() {
        return ((this.f225345a.hashCode() ^ 1000003) * 1000003) ^ this.f225346b.hashCode();
    }

    public final String toString() {
        String str = this.f225345a;
        String str2 = this.f225346b;
        return "NgaWarmActionsSuwIneligibilityReasonEvent{token=" + str + ", ineligibilityReason=" + str2 + "}";
    }
}
