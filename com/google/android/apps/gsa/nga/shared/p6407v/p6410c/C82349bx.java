package com.google.android.apps.gsa.nga.shared.p6407v.p6410c;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.c.bx */
/* compiled from: PG */
public final class C82349bx extends C82579kk {

    /* renamed from: a */
    private final String f224955a = "NGA_FIRST_GET_STATE_LATENCY";

    /* renamed from: b */
    private final Double f224956b;

    /* renamed from: c */
    private final boolean f224957c;

    /* renamed from: d */
    private final boolean f224958d;

    /* renamed from: e */
    private final String f224959e;

    public C82349bx(String str, Double d, boolean z, boolean z2, String str2) {
        this.f224956b = d;
        this.f224957c = z;
        this.f224958d = z2;
        this.f224959e = str2;
    }

    /* renamed from: b */
    public final Double mo75811b() {
        return this.f224956b;
    }

    /* renamed from: c */
    public final String mo75812c() {
        return this.f224959e;
    }

    /* renamed from: d */
    public final String mo75583d() {
        return this.f224955a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C82579kk) {
            C82579kk kkVar = (C82579kk) obj;
            return this.f224955a.equals(kkVar.mo75583d()) && this.f224956b.equals(kkVar.mo75811b()) && this.f224957c == kkVar.mo75815g() && this.f224958d == kkVar.mo75814f() && this.f224959e.equals(kkVar.mo75812c());
        }
    }

    /* renamed from: f */
    public final boolean mo75814f() {
        return this.f224958d;
    }

    /* renamed from: g */
    public final boolean mo75815g() {
        return this.f224957c;
    }

    public final int hashCode() {
        int i = 1237;
        int hashCode = (((((this.f224955a.hashCode() ^ 1000003) * 1000003) ^ this.f224956b.hashCode()) * 1000003) ^ (true != this.f224957c ? 1237 : 1231)) * 1000003;
        if (true == this.f224958d) {
            i = 1231;
        }
        return ((hashCode ^ i) * 1000003) ^ this.f224959e.hashCode();
    }

    public final String toString() {
        String str = this.f224955a;
        Double d = this.f224956b;
        boolean z = this.f224957c;
        boolean z2 = this.f224958d;
        String str2 = this.f224959e;
        return "NgaFirstGetStateLatencyEvent{token=" + str + ", value=" + d + ", ngaEligible=" + z + ", dasherAccountPresent=" + z2 + ", deviceRamGb=" + str2 + "}";
    }
}
