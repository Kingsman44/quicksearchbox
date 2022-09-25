package com.google.android.apps.gsa.nga.shared.p6407v.p6410c;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.c.bc */
/* compiled from: PG */
public final class C82328bc extends C82557jp {

    /* renamed from: a */
    private final String f224905a = "NGA_CLOUD_FULFILLMENT_STOP_REASON";

    /* renamed from: b */
    private final String f224906b;

    public C82328bc(String str, String str2) {
        this.f224906b = str2;
    }

    /* renamed from: b */
    public final String mo75731b() {
        return this.f224906b;
    }

    /* renamed from: d */
    public final String mo75583d() {
        return this.f224905a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C82557jp) {
            C82557jp jpVar = (C82557jp) obj;
            return this.f224905a.equals(jpVar.mo75583d()) && this.f224906b.equals(jpVar.mo75731b());
        }
    }

    public final int hashCode() {
        return ((this.f224905a.hashCode() ^ 1000003) * 1000003) ^ this.f224906b.hashCode();
    }

    public final String toString() {
        String str = this.f224905a;
        String str2 = this.f224906b;
        return "NgaCloudFulfillmentStopReasonEvent{token=" + str + ", reason=" + str2 + "}";
    }
}
