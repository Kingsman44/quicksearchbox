package com.google.android.apps.gsa.nga.shared.p6407v.p6410c;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.c.gc */
/* compiled from: PG */
public final class C82463gc extends C82692op {

    /* renamed from: a */
    private final String f225321a = "NGA_WARM_ACTIONS_INELIGIBILITY_REASON";

    /* renamed from: b */
    private final String f225322b;

    public C82463gc(String str, String str2) {
        this.f225322b = str2;
    }

    /* renamed from: b */
    public final String mo76331b() {
        return this.f225322b;
    }

    /* renamed from: d */
    public final String mo75583d() {
        return this.f225321a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C82692op) {
            C82692op opVar = (C82692op) obj;
            return this.f225321a.equals(opVar.mo75583d()) && this.f225322b.equals(opVar.mo76331b());
        }
    }

    public final int hashCode() {
        return ((this.f225321a.hashCode() ^ 1000003) * 1000003) ^ this.f225322b.hashCode();
    }

    public final String toString() {
        String str = this.f225321a;
        String str2 = this.f225322b;
        return "NgaWarmActionsIneligibilityReasonEvent{token=" + str + ", ineligibilityReason=" + str2 + "}";
    }
}
