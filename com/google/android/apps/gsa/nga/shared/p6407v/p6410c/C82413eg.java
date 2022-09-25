package com.google.android.apps.gsa.nga.shared.p6407v.p6410c;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.c.eg */
/* compiled from: PG */
public final class C82413eg extends C82642mt {

    /* renamed from: a */
    private final String f225157a = "NGA_POP_FULFILLMENT_STATS";

    /* renamed from: b */
    private final int f225158b;

    /* renamed from: c */
    private final boolean f225159c;

    /* renamed from: d */
    private final String f225160d;

    /* renamed from: e */
    private final int f225161e;

    /* renamed from: f */
    private final String f225162f;

    /* renamed from: g */
    private final int f225163g;

    /* renamed from: h */
    private final String f225164h;

    public C82413eg(String str, int i, boolean z, String str2, int i2, String str3, int i3, String str4) {
        this.f225158b = i;
        this.f225159c = true;
        this.f225160d = str2;
        this.f225161e = i2;
        this.f225162f = str3;
        this.f225163g = i3;
        this.f225164h = str4;
    }

    /* renamed from: b */
    public final int mo76096b() {
        return this.f225158b;
    }

    /* renamed from: c */
    public final int mo76097c() {
        return this.f225161e;
    }

    /* renamed from: d */
    public final String mo75583d() {
        return this.f225157a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C82642mt) {
            C82642mt mtVar = (C82642mt) obj;
            return this.f225157a.equals(mtVar.mo75583d()) && this.f225158b == mtVar.mo76096b() && !mtVar.mo76105k() && mtVar.mo76104j() && this.f225160d.equals(mtVar.mo76101h()) && this.f225161e == mtVar.mo76097c() && this.f225162f.equals(mtVar.mo76100g()) && this.f225163g == mtVar.mo76099f() && this.f225164h.equals(mtVar.mo76103i());
        }
    }

    /* renamed from: f */
    public final int mo76099f() {
        return this.f225163g;
    }

    /* renamed from: g */
    public final String mo76100g() {
        return this.f225162f;
    }

    /* renamed from: h */
    public final String mo76101h() {
        return this.f225160d;
    }

    public final int hashCode() {
        return ((((((((((((((((this.f225157a.hashCode() ^ 1000003) * 1000003) ^ this.f225158b) * 1000003) ^ 1237) * 1000003) ^ 1231) * 1000003) ^ this.f225160d.hashCode()) * 1000003) ^ this.f225161e) * 1000003) ^ this.f225162f.hashCode()) * 1000003) ^ this.f225163g) * 1000003) ^ this.f225164h.hashCode();
    }

    /* renamed from: i */
    public final String mo76103i() {
        return this.f225164h;
    }

    /* renamed from: j */
    public final boolean mo76104j() {
        return true;
    }

    /* renamed from: k */
    public final boolean mo76105k() {
        return false;
    }

    public final String toString() {
        String str = this.f225157a;
        int i = this.f225158b;
        String str2 = this.f225160d;
        int i2 = this.f225161e;
        String str3 = this.f225162f;
        int i3 = this.f225163g;
        String str4 = this.f225164h;
        return "NgaPopFulfillmentStatsEvent{token=" + str + ", missingContextRetries=" + i + ", isPopEnabled=false, isGrpcEnabled=true, locale=" + str2 + ", popGroup=" + i2 + ", contextFailures=" + str3 + ", status=" + i3 + ", webrefGroup=" + str4 + "}";
    }
}
