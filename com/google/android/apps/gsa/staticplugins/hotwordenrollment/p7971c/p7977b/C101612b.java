package com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7971c.p7977b;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.c.b.b */
/* compiled from: PG */
final class C101612b extends C101628r {

    /* renamed from: a */
    private final boolean f283539a;

    /* renamed from: b */
    private final boolean f283540b;

    /* renamed from: c */
    private final boolean f283541c;

    /* renamed from: d */
    private final boolean f283542d;

    /* renamed from: e */
    private final int f283543e;

    public C101612b(int i, boolean z, boolean z2, boolean z3, boolean z4) {
        this.f283543e = i;
        this.f283539a = z;
        this.f283540b = z2;
        this.f283541c = z3;
        this.f283542d = z4;
    }

    /* renamed from: a */
    public final boolean mo92430a() {
        return this.f283542d;
    }

    /* renamed from: b */
    public final boolean mo92431b() {
        return this.f283539a;
    }

    /* renamed from: c */
    public final boolean mo92432c() {
        return this.f283540b;
    }

    /* renamed from: d */
    public final boolean mo92433d() {
        return this.f283541c;
    }

    /* renamed from: e */
    public final int mo92434e() {
        return this.f283543e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C101628r) {
            C101628r rVar = (C101628r) obj;
            return this.f283543e == rVar.mo92434e() && this.f283539a == rVar.mo92431b() && this.f283540b == rVar.mo92432c() && this.f283541c == rVar.mo92433d() && this.f283542d == rVar.mo92430a();
        }
    }

    public final int hashCode() {
        int i = 1237;
        int i2 = (((((((this.f283543e ^ 1000003) * 1000003) ^ (true != this.f283539a ? 1237 : 1231)) * 1000003) ^ (true != this.f283540b ? 1237 : 1231)) * 1000003) ^ (true != this.f283541c ? 1237 : 1231)) * 1000003;
        if (true == this.f283542d) {
            i = 1231;
        }
        return i2 ^ i;
    }

    public final String toString() {
        int i = this.f283543e;
        String str = i != 1 ? i != 2 ? "DO_NOT_GENERATE" : "ALWAYS_FRESH_ENROLLMENT" : "PREFER_CLOUD_ENROLLMENT";
        boolean z = this.f283539a;
        boolean z2 = this.f283540b;
        boolean z3 = this.f283541c;
        boolean z4 = this.f283542d;
        return "PhoneEnrollFlowConfig{mode=" + str + ", showParentSelection=" + z + ", showSummaryScreen=" + z2 + ", showVoiceAndAudioConsent=" + z3 + ", showHandBackScreenForUnicorn=" + z4 + "}";
    }
}
