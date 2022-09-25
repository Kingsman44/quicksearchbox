package com.google.android.apps.gsa.nga.shared.p6407v.p6410c;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.c.dt */
/* compiled from: PG */
public final class C82399dt extends C82629mg {

    /* renamed from: a */
    private final String f225125a = "NGA_OPA_HANDOVER_GRAPH_FAILED_REASON";

    /* renamed from: b */
    private final int f225126b;

    public C82399dt(String str, int i) {
        this.f225126b = i;
    }

    /* renamed from: b */
    public final int mo76036b() {
        return this.f225126b;
    }

    /* renamed from: d */
    public final String mo75583d() {
        return this.f225125a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C82629mg) {
            C82629mg mgVar = (C82629mg) obj;
            return this.f225125a.equals(mgVar.mo75583d()) && this.f225126b == mgVar.mo76036b();
        }
    }

    public final int hashCode() {
        return ((this.f225125a.hashCode() ^ 1000003) * 1000003) ^ this.f225126b;
    }

    public final String toString() {
        String str = this.f225125a;
        int i = this.f225126b;
        return "NgaOpaHandoverGraphFailedReasonEvent{token=" + str + ", gsaErrorCode=" + i + "}";
    }
}
