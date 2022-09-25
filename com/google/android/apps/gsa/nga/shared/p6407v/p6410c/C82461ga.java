package com.google.android.apps.gsa.nga.shared.p6407v.p6410c;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.c.ga */
/* compiled from: PG */
public final class C82461ga extends C82690on {

    /* renamed from: a */
    private final String f225315a = "NGA_WARM_ACTIONS_CONTEXT_INELIGIBILITY_REASON";

    /* renamed from: b */
    private final int f225316b;

    /* renamed from: c */
    private final String f225317c;

    public C82461ga(String str, int i, String str2) {
        this.f225316b = i;
        this.f225317c = str2;
    }

    /* renamed from: b */
    public final int mo76321b() {
        return this.f225316b;
    }

    /* renamed from: c */
    public final String mo76322c() {
        return this.f225317c;
    }

    /* renamed from: d */
    public final String mo75583d() {
        return this.f225315a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C82690on) {
            C82690on onVar = (C82690on) obj;
            return this.f225315a.equals(onVar.mo75583d()) && this.f225316b == onVar.mo76321b() && this.f225317c.equals(onVar.mo76322c());
        }
    }

    public final int hashCode() {
        return ((((this.f225315a.hashCode() ^ 1000003) * 1000003) ^ this.f225316b) * 1000003) ^ this.f225317c.hashCode();
    }

    public final String toString() {
        String str = this.f225315a;
        int i = this.f225316b;
        String str2 = this.f225317c;
        return "NgaWarmActionsContextIneligibilityReasonEvent{token=" + str + ", contextType=" + i + ", ineligibilityReason=" + str2 + "}";
    }
}
