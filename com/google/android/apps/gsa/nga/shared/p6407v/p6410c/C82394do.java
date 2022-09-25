package com.google.android.apps.gsa.nga.shared.p6407v.p6410c;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.c.do */
/* compiled from: PG */
public final class C82394do extends C82624mb {

    /* renamed from: a */
    private final String f225113a = "NGA_NETWORK_UPSTREAM_BANDWIDTH";

    /* renamed from: b */
    private final Double f225114b;

    /* renamed from: c */
    private final String f225115c;

    /* renamed from: d */
    private final String f225116d;

    public C82394do(String str, Double d, String str2, String str3) {
        this.f225114b = d;
        this.f225115c = str2;
        this.f225116d = str3;
    }

    /* renamed from: b */
    public final Double mo76014b() {
        return this.f225114b;
    }

    /* renamed from: c */
    public final String mo76015c() {
        return this.f225115c;
    }

    /* renamed from: d */
    public final String mo75583d() {
        return this.f225113a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C82624mb) {
            C82624mb mbVar = (C82624mb) obj;
            return this.f225113a.equals(mbVar.mo75583d()) && this.f225114b.equals(mbVar.mo76014b()) && this.f225115c.equals(mbVar.mo76015c()) && this.f225116d.equals(mbVar.mo76017f());
        }
    }

    /* renamed from: f */
    public final String mo76017f() {
        return this.f225116d;
    }

    public final int hashCode() {
        return ((((((this.f225113a.hashCode() ^ 1000003) * 1000003) ^ this.f225114b.hashCode()) * 1000003) ^ this.f225115c.hashCode()) * 1000003) ^ this.f225116d.hashCode();
    }

    public final String toString() {
        String str = this.f225113a;
        Double d = this.f225114b;
        String str2 = this.f225115c;
        String str3 = this.f225116d;
        return "NgaNetworkUpstreamBandwidthEvent{token=" + str + ", value=" + d + ", deviceModel=" + str2 + ", networkType=" + str3 + "}";
    }
}
