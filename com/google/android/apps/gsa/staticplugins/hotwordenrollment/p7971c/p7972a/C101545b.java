package com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7971c.p7972a;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.c.a.b */
/* compiled from: PG */
final class C101545b extends C101606q {

    /* renamed from: a */
    private final boolean f283370a;

    /* renamed from: b */
    private final boolean f283371b;

    /* renamed from: c */
    private final boolean f283372c;

    /* renamed from: d */
    private final boolean f283373d;

    /* renamed from: e */
    private final boolean f283374e;

    /* renamed from: f */
    private final boolean f283375f;

    /* renamed from: g */
    private final boolean f283376g;

    /* renamed from: h */
    private final boolean f283377h;

    public C101545b(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8) {
        this.f283370a = z;
        this.f283371b = z2;
        this.f283372c = z3;
        this.f283373d = z4;
        this.f283374e = z5;
        this.f283375f = z6;
        this.f283376g = z7;
        this.f283377h = z8;
    }

    /* renamed from: a */
    public final boolean mo92386a() {
        return this.f283374e;
    }

    /* renamed from: b */
    public final boolean mo92387b() {
        return this.f283370a;
    }

    /* renamed from: c */
    public final boolean mo92388c() {
        return this.f283375f;
    }

    /* renamed from: d */
    public final boolean mo92389d() {
        return this.f283372c;
    }

    /* renamed from: e */
    public final boolean mo92390e() {
        return this.f283373d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C101606q) {
            C101606q qVar = (C101606q) obj;
            return this.f283370a == qVar.mo92387b() && this.f283371b == qVar.mo92393g() && this.f283372c == qVar.mo92389d() && this.f283373d == qVar.mo92390e() && this.f283374e == qVar.mo92386a() && this.f283375f == qVar.mo92388c() && this.f283376g == qVar.mo92394h() && this.f283377h == qVar.mo92392f();
        }
    }

    /* renamed from: f */
    public final boolean mo92392f() {
        return this.f283377h;
    }

    /* renamed from: g */
    public final boolean mo92393g() {
        return this.f283371b;
    }

    /* renamed from: h */
    public final boolean mo92394h() {
        return this.f283376g;
    }

    public final int hashCode() {
        int i = 1237;
        int i2 = ((((((((((((((true != this.f283370a ? 1237 : 1231) ^ 1000003) * 1000003) ^ (true != this.f283371b ? 1237 : 1231)) * 1000003) ^ (true != this.f283372c ? 1237 : 1231)) * 1000003) ^ (true != this.f283373d ? 1237 : 1231)) * 1000003) ^ (true != this.f283374e ? 1237 : 1231)) * 1000003) ^ (true != this.f283375f ? 1237 : 1231)) * 1000003) ^ (true != this.f283376g ? 1237 : 1231)) * 1000003;
        if (true == this.f283377h) {
            i = 1231;
        }
        return i2 ^ i;
    }

    public final String toString() {
        boolean z = this.f283370a;
        boolean z2 = this.f283371b;
        boolean z3 = this.f283372c;
        boolean z4 = this.f283373d;
        boolean z5 = this.f283374e;
        boolean z6 = this.f283375f;
        boolean z7 = this.f283376g;
        boolean z8 = this.f283377h;
        return "HomeFlowConfig{showDeviceDiscoveryScreen=" + z + ", showProgressUpdateScreenAfterFreshEnroll=" + z2 + ", showGetParentScreen=" + z3 + ", showHandBackToParentScreen=" + z4 + ", finishAfterVaa=" + z5 + ", showFaceMatch=" + z6 + ", showSummaryScreen=" + z7 + ", showPersonalResultScreen=" + z8 + "}";
    }
}
