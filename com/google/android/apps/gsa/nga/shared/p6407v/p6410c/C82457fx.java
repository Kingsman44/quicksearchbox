package com.google.android.apps.gsa.nga.shared.p6407v.p6410c;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.c.fx */
/* compiled from: PG */
public final class C82457fx extends C82687ok {

    /* renamed from: a */
    private final String f225303a = "NGA_WARM_ACTIONS_ANSWERED_CALL_DURATION";

    /* renamed from: b */
    private final Double f225304b;

    public C82457fx(String str, Double d) {
        this.f225304b = d;
    }

    /* renamed from: b */
    public final Double mo76307b() {
        return this.f225304b;
    }

    /* renamed from: d */
    public final String mo75583d() {
        return this.f225303a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C82687ok) {
            C82687ok okVar = (C82687ok) obj;
            return this.f225303a.equals(okVar.mo75583d()) && this.f225304b.equals(okVar.mo76307b());
        }
    }

    public final int hashCode() {
        return ((this.f225303a.hashCode() ^ 1000003) * 1000003) ^ this.f225304b.hashCode();
    }

    public final String toString() {
        String str = this.f225303a;
        Double d = this.f225304b;
        return "NgaWarmActionsAnsweredCallDurationEvent{token=" + str + ", value=" + d + "}";
    }
}
