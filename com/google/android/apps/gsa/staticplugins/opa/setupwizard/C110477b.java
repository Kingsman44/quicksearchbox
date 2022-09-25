package com.google.android.apps.gsa.staticplugins.opa.setupwizard;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.setupwizard.b */
/* compiled from: PG */
final class C110477b extends C110502z {

    /* renamed from: a */
    private final boolean f307987a;

    /* renamed from: b */
    private final boolean f307988b;

    /* renamed from: c */
    private final String f307989c;

    /* renamed from: d */
    private final int f307990d;

    /* renamed from: e */
    private final boolean f307991e;

    public C110477b(boolean z, boolean z2, String str, int i, boolean z3) {
        this.f307987a = z;
        this.f307988b = z2;
        this.f307989c = str;
        this.f307990d = i;
        this.f307991e = z3;
    }

    /* renamed from: a */
    public final int mo98721a() {
        return this.f307990d;
    }

    /* renamed from: b */
    public final String mo98722b() {
        return this.f307989c;
    }

    /* renamed from: c */
    public final boolean mo98723c() {
        return this.f307991e;
    }

    /* renamed from: d */
    public final boolean mo98724d() {
        return this.f307987a;
    }

    /* renamed from: e */
    public final boolean mo98725e() {
        return this.f307988b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C110502z) {
            C110502z zVar = (C110502z) obj;
            return this.f307987a == zVar.mo98724d() && this.f307988b == zVar.mo98725e() && this.f307989c.equals(zVar.mo98722b()) && this.f307990d == zVar.mo98721a() && this.f307991e == zVar.mo98723c();
        }
    }

    public final int hashCode() {
        int i = 1237;
        int hashCode = ((((((((true != this.f307987a ? 1237 : 1231) ^ 1000003) * 1000003) ^ (true != this.f307988b ? 1237 : 1231)) * 1000003) ^ this.f307989c.hashCode()) * 1000003) ^ this.f307990d) * 1000003;
        if (true == this.f307991e) {
            i = 1231;
        }
        return hashCode ^ i;
    }

    public final String toString() {
        boolean z = this.f307987a;
        boolean z2 = this.f307988b;
        String str = this.f307989c;
        int i = this.f307990d;
        boolean z3 = this.f307991e;
        return "OpaSuwContentSequenceConfig{isMinorAccount=" + z + ", isUnicornAccount=" + z2 + ", accountGivenName=" + str + ", accountStandardGender=" + i + ", biometricsDisabledByAdmin=" + z3 + "}";
    }
}
