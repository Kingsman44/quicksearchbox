package com.google.android.apps.gsa.assist.p501a;

/* renamed from: com.google.android.apps.gsa.assist.a.p */
/* compiled from: PG */
final class C9328p extends C9316d {

    /* renamed from: b */
    private final boolean f32362b;

    /* renamed from: c */
    private final boolean f32363c;

    /* renamed from: d */
    private final int f32364d;

    /* renamed from: e */
    private final int f32365e;

    /* renamed from: f */
    private final int f32366f;

    /* renamed from: g */
    private final int f32367g;

    /* renamed from: h */
    private final boolean f32368h;

    /* renamed from: i */
    private final boolean f32369i;

    public C9328p(boolean z, boolean z2, int i, int i2, int i3, int i4, boolean z3, boolean z4) {
        this.f32362b = z;
        this.f32363c = z2;
        this.f32364d = i;
        this.f32365e = i2;
        this.f32366f = i3;
        this.f32367g = i4;
        this.f32368h = z3;
        this.f32369i = z4;
    }

    /* renamed from: a */
    public final int mo17514a() {
        return this.f32366f;
    }

    /* renamed from: b */
    public final int mo17515b() {
        return this.f32364d;
    }

    /* renamed from: c */
    public final int mo17516c() {
        return this.f32365e;
    }

    /* renamed from: d */
    public final int mo17517d() {
        return this.f32367g;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C9316d) {
            C9316d dVar = (C9316d) obj;
            return this.f32362b == dVar.mo17520h() && this.f32363c == dVar.mo17521i() && this.f32364d == dVar.mo17515b() && this.f32365e == dVar.mo17516c() && this.f32366f == dVar.mo17514a() && this.f32367g == dVar.mo17517d() && this.f32368h == dVar.mo17518f() && this.f32369i == dVar.mo17519g();
        }
    }

    /* renamed from: f */
    public final boolean mo17518f() {
        return this.f32368h;
    }

    /* renamed from: g */
    public final boolean mo17519g() {
        return this.f32369i;
    }

    /* renamed from: h */
    public final boolean mo17520h() {
        return this.f32362b;
    }

    public final int hashCode() {
        int i = 1237;
        int i2 = ((((((((((((((true != this.f32362b ? 1237 : 1231) ^ 1000003) * 1000003) ^ (true != this.f32363c ? 1237 : 1231)) * 1000003) ^ this.f32364d) * 1000003) ^ this.f32365e) * 1000003) ^ this.f32366f) * 1000003) ^ this.f32367g) * 1000003) ^ (true != this.f32368h ? 1237 : 1231)) * 1000003;
        if (true == this.f32369i) {
            i = 1231;
        }
        return i2 ^ i;
    }

    /* renamed from: i */
    public final boolean mo17521i() {
        return this.f32363c;
    }

    public final String toString() {
        boolean z = this.f32362b;
        boolean z2 = this.f32363c;
        int i = this.f32364d;
        int i2 = this.f32365e;
        int i3 = this.f32366f;
        int i4 = this.f32367g;
        boolean z3 = this.f32368h;
        boolean z4 = this.f32369i;
        return "AssistDataConfig{includeScreenshot=" + z + ", includeScreenshotAvailability=" + z2 + ", screenshotCompressionQuality=" + i + ", screenshotScalingPercent=" + i2 + ", dataTimeout=" + i3 + ", screenshotTimeout=" + i4 + ", hasUserOptedToDonateScreenshot=" + z3 + ", includeAssistStructure=" + z4 + "}";
    }
}
