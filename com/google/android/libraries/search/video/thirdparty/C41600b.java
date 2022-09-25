package com.google.android.libraries.search.video.thirdparty;

/* renamed from: com.google.android.libraries.search.video.thirdparty.b */
/* compiled from: PG */
final class C41600b extends C41599ac {

    /* renamed from: a */
    private final boolean f108749a;

    /* renamed from: b */
    private final boolean f108750b;

    /* renamed from: c */
    private final boolean f108751c;

    /* renamed from: d */
    private final boolean f108752d;

    /* renamed from: e */
    private final boolean f108753e;

    public C41600b(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.f108749a = z;
        this.f108750b = z2;
        this.f108751c = z3;
        this.f108752d = z4;
        this.f108753e = z5;
    }

    /* renamed from: a */
    public final boolean mo44159a() {
        return this.f108749a;
    }

    /* renamed from: b */
    public final boolean mo44160b() {
        return this.f108752d;
    }

    /* renamed from: c */
    public final boolean mo44161c() {
        return this.f108750b;
    }

    /* renamed from: d */
    public final boolean mo44162d() {
        return this.f108751c;
    }

    /* renamed from: e */
    public final boolean mo44163e() {
        return this.f108753e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C41599ac) {
            C41599ac acVar = (C41599ac) obj;
            return this.f108749a == acVar.mo44159a() && this.f108750b == acVar.mo44161c() && this.f108751c == acVar.mo44162d() && this.f108752d == acVar.mo44160b() && this.f108753e == acVar.mo44163e();
        }
    }

    public final int hashCode() {
        int i = 1237;
        int i2 = ((((((((true != this.f108749a ? 1237 : 1231) ^ 1000003) * 1000003) ^ (true != this.f108750b ? 1237 : 1231)) * 1000003) ^ (true != this.f108751c ? 1237 : 1231)) * 1000003) ^ (true != this.f108752d ? 1237 : 1231)) * 1000003;
        if (true == this.f108753e) {
            i = 1231;
        }
        return i2 ^ i;
    }

    public final String toString() {
        boolean z = this.f108749a;
        boolean z2 = this.f108750b;
        boolean z3 = this.f108751c;
        boolean z4 = this.f108752d;
        boolean z5 = this.f108753e;
        return "ThirdPartyVideoPlayerUIOptions{enableControls=" + z + ", hideVideoOnEnd=" + z2 + ", hideVideoOnPause=" + z3 + ", enableSubtitleButton=" + z4 + ", isStampAutoplay=" + z5 + "}";
    }
}
