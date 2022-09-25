package com.google.android.apps.gsa.nga.shared.p6407v.p6410c;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.c.cc */
/* compiled from: PG */
public final class C82355cc extends C82584kp {

    /* renamed from: a */
    private final String f224982a = "NGA_FULFILLMENT_ABORT_REASON_TYPED";

    /* renamed from: b */
    private final int f224983b;

    /* renamed from: c */
    private final int f224984c;

    public C82355cc(String str, int i, int i2) {
        this.f224983b = i;
        this.f224984c = i2;
    }

    /* renamed from: b */
    public final int mo75840b() {
        return this.f224983b;
    }

    /* renamed from: c */
    public final int mo75841c() {
        return this.f224984c;
    }

    /* renamed from: d */
    public final String mo75583d() {
        return this.f224982a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C82584kp) {
            C82584kp kpVar = (C82584kp) obj;
            return this.f224982a.equals(kpVar.mo75583d()) && this.f224983b == kpVar.mo75840b() && this.f224984c == kpVar.mo75841c();
        }
    }

    public final int hashCode() {
        return ((((this.f224982a.hashCode() ^ 1000003) * 1000003) ^ this.f224983b) * 1000003) ^ this.f224984c;
    }

    public final String toString() {
        String str = this.f224982a;
        int i = this.f224983b;
        int i2 = this.f224984c;
        return "NgaFulfillmentAbortReasonTypedEvent{token=" + str + ", abortReason=" + i + ", fulfillerType=" + i2 + "}";
    }
}
