package com.google.android.apps.gsa.nga.shared.p6407v.p6410c;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.c.gu */
/* compiled from: PG */
public final class C82481gu extends C82711ph {

    /* renamed from: a */
    private final String f225369a = "OPA_CLOUD_FULFILLMENT_GRAPH_PRODUCER_LATENCY";

    /* renamed from: b */
    private final Double f225370b;

    /* renamed from: c */
    private final String f225371c;

    /* renamed from: d */
    private final String f225372d;

    public C82481gu(String str, Double d, String str2, String str3) {
        this.f225370b = d;
        this.f225371c = str2;
        this.f225372d = str3;
    }

    /* renamed from: b */
    public final Double mo76415b() {
        return this.f225370b;
    }

    /* renamed from: c */
    public final String mo76416c() {
        return this.f225371c;
    }

    /* renamed from: d */
    public final String mo75583d() {
        return this.f225369a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C82711ph) {
            C82711ph phVar = (C82711ph) obj;
            return this.f225369a.equals(phVar.mo75583d()) && this.f225370b.equals(phVar.mo76415b()) && this.f225371c.equals(phVar.mo76416c()) && this.f225372d.equals(phVar.mo76418f());
        }
    }

    /* renamed from: f */
    public final String mo76418f() {
        return this.f225372d;
    }

    public final int hashCode() {
        return ((((((this.f225369a.hashCode() ^ 1000003) * 1000003) ^ this.f225370b.hashCode()) * 1000003) ^ this.f225371c.hashCode()) * 1000003) ^ this.f225372d.hashCode();
    }

    public final String toString() {
        String str = this.f225369a;
        Double d = this.f225370b;
        String str2 = this.f225371c;
        String str3 = this.f225372d;
        return "OpaCloudFulfillmentGraphProducerLatencyEvent{token=" + str + ", value=" + d + ", producerName=" + str2 + ", status=" + str3 + "}";
    }
}
