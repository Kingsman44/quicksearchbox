package com.google.android.apps.gsa.nga.shared.p6407v.p6410c;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.c.hf */
/* compiled from: PG */
public final class C82493hf extends C82722ps {

    /* renamed from: a */
    private final String f225405a = "S3_NETWORK_LATENCY";

    /* renamed from: b */
    private final Double f225406b;

    public C82493hf(String str, Double d) {
        this.f225406b = d;
    }

    /* renamed from: b */
    public final Double mo76462b() {
        return this.f225406b;
    }

    /* renamed from: d */
    public final String mo75583d() {
        return this.f225405a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C82722ps) {
            C82722ps psVar = (C82722ps) obj;
            return this.f225405a.equals(psVar.mo75583d()) && this.f225406b.equals(psVar.mo76462b());
        }
    }

    public final int hashCode() {
        return ((this.f225405a.hashCode() ^ 1000003) * 1000003) ^ this.f225406b.hashCode();
    }

    public final String toString() {
        String str = this.f225405a;
        Double d = this.f225406b;
        return "S3NetworkLatencyEvent{token=" + str + ", value=" + d + "}";
    }
}
