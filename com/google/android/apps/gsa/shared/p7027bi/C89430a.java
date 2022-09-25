package com.google.android.apps.gsa.shared.p7027bi;

/* renamed from: com.google.android.apps.gsa.shared.bi.a */
/* compiled from: PG */
public final class C89430a extends C89431b {

    /* renamed from: a */
    public final int f242424a;

    /* renamed from: b */
    public final int f242425b;

    /* renamed from: c */
    public final int f242426c;

    /* renamed from: d */
    public final int f242427d;

    /* renamed from: e */
    public final int f242428e;

    /* renamed from: f */
    public final int f242429f;

    /* renamed from: g */
    public final int f242430g;

    /* renamed from: h */
    public final int f242431h;

    public C89430a(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.f242424a = i;
        this.f242425b = i2;
        this.f242426c = i3;
        this.f242427d = i4;
        this.f242428e = i5;
        this.f242429f = i6;
        this.f242430g = i7;
        this.f242431h = i8;
    }

    /* renamed from: a */
    public final int mo83331a() {
        return this.f242425b;
    }

    /* renamed from: b */
    public final int mo83332b() {
        return this.f242426c;
    }

    /* renamed from: c */
    public final int mo83333c() {
        return this.f242424a;
    }

    /* renamed from: d */
    public final int mo83334d() {
        return this.f242427d;
    }

    /* renamed from: e */
    public final int mo83335e() {
        return this.f242429f;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C89431b) {
            C89431b bVar = (C89431b) obj;
            return this.f242424a == bVar.mo83333c() && this.f242425b == bVar.mo83331a() && this.f242426c == bVar.mo83332b() && this.f242427d == bVar.mo83334d() && this.f242428e == bVar.mo83339h() && this.f242429f == bVar.mo83335e() && this.f242430g == bVar.mo83337f() && this.f242431h == bVar.mo83338g();
        }
    }

    /* renamed from: f */
    public final int mo83337f() {
        return this.f242430g;
    }

    /* renamed from: g */
    public final int mo83338g() {
        return this.f242431h;
    }

    /* renamed from: h */
    public final int mo83339h() {
        return this.f242428e;
    }

    public final int hashCode() {
        return ((((((((((((((this.f242424a ^ 1000003) * 1000003) ^ this.f242425b) * 1000003) ^ this.f242426c) * 1000003) ^ this.f242427d) * 1000003) ^ this.f242428e) * 1000003) ^ this.f242429f) * 1000003) ^ this.f242430g) * 1000003) ^ this.f242431h;
    }

    public final String toString() {
        int i = this.f242424a;
        int i2 = this.f242425b;
        int i3 = this.f242426c;
        int i4 = this.f242427d;
        int i5 = this.f242428e;
        int i6 = this.f242429f;
        int i7 = this.f242430g;
        int i8 = this.f242431h;
        return "CardViewInformation{cardTopPixels=" + i + ", cardHeightPixels=" + i2 + ", cardLeftPixels=" + i3 + ", cardWidthPixels=" + i4 + ", viewportTopPixels=" + i5 + ", viewportBottomPixels=" + i6 + ", viewportLeftPixels=" + i7 + ", viewportRightPixels=" + i8 + "}";
    }
}
