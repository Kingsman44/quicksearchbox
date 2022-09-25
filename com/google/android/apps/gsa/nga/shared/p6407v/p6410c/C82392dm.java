package com.google.android.apps.gsa.nga.shared.p6407v.p6410c;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.c.dm */
/* compiled from: PG */
public final class C82392dm extends C82621lz {

    /* renamed from: a */
    private final String f225106a = "NGA_NETWORK_DOWNSTREAM_BANDWIDTH";

    /* renamed from: b */
    private final Double f225107b;

    /* renamed from: c */
    private final String f225108c;

    /* renamed from: d */
    private final String f225109d;

    public C82392dm(String str, Double d, String str2, String str3) {
        this.f225107b = d;
        this.f225108c = str2;
        this.f225109d = str3;
    }

    /* renamed from: b */
    public final Double mo76003b() {
        return this.f225107b;
    }

    /* renamed from: c */
    public final String mo76004c() {
        return this.f225108c;
    }

    /* renamed from: d */
    public final String mo75583d() {
        return this.f225106a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C82621lz) {
            C82621lz lzVar = (C82621lz) obj;
            return this.f225106a.equals(lzVar.mo75583d()) && this.f225107b.equals(lzVar.mo76003b()) && this.f225108c.equals(lzVar.mo76004c()) && this.f225109d.equals(lzVar.mo76006f());
        }
    }

    /* renamed from: f */
    public final String mo76006f() {
        return this.f225109d;
    }

    public final int hashCode() {
        return ((((((this.f225106a.hashCode() ^ 1000003) * 1000003) ^ this.f225107b.hashCode()) * 1000003) ^ this.f225108c.hashCode()) * 1000003) ^ this.f225109d.hashCode();
    }

    public final String toString() {
        String str = this.f225106a;
        Double d = this.f225107b;
        String str2 = this.f225108c;
        String str3 = this.f225109d;
        return "NgaNetworkDownstreamBandwidthEvent{token=" + str + ", value=" + d + ", deviceModel=" + str2 + ", networkType=" + str3 + "}";
    }
}
