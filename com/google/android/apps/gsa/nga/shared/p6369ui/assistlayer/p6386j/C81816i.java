package com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6386j;

/* renamed from: com.google.android.apps.gsa.nga.shared.ui.assistlayer.j.i */
/* compiled from: PG */
final class C81816i extends C81809b {

    /* renamed from: b */
    private final boolean f223758b;

    /* renamed from: c */
    private final int f223759c;

    /* renamed from: d */
    private final int f223760d;

    /* renamed from: e */
    private final int f223761e;

    /* renamed from: f */
    private final int f223762f;

    /* renamed from: g */
    private final int f223763g;

    /* renamed from: h */
    private final int f223764h;

    /* renamed from: i */
    private final int f223765i;

    /* renamed from: j */
    private final float f223766j;

    /* renamed from: k */
    private final int f223767k;

    public C81816i(boolean z, int i, int i2, int i3, int i4, int i5, int i6, int i7, float f, int i8) {
        this.f223758b = z;
        this.f223759c = i;
        this.f223760d = i2;
        this.f223761e = i3;
        this.f223762f = i4;
        this.f223763g = i5;
        this.f223764h = i6;
        this.f223765i = i7;
        this.f223766j = f;
        this.f223767k = i8;
    }

    /* renamed from: a */
    public final float mo75333a() {
        return this.f223766j;
    }

    /* renamed from: b */
    public final int mo75334b() {
        return this.f223764h;
    }

    /* renamed from: c */
    public final int mo75335c() {
        return this.f223767k;
    }

    /* renamed from: d */
    public final int mo75336d() {
        return this.f223761e;
    }

    /* renamed from: e */
    public final int mo75337e() {
        return this.f223760d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C81809b) {
            C81809b bVar = (C81809b) obj;
            return this.f223758b == bVar.mo75342k() && this.f223759c == bVar.mo75338f() && this.f223760d == bVar.mo75337e() && this.f223761e == bVar.mo75336d() && this.f223762f == bVar.mo75340h() && this.f223763g == bVar.mo75339g() && this.f223764h == bVar.mo75334b() && this.f223765i == bVar.mo75341i() && Float.floatToIntBits(this.f223766j) == Float.floatToIntBits(bVar.mo75333a()) && this.f223767k == bVar.mo75335c();
        }
    }

    /* renamed from: f */
    public final int mo75338f() {
        return this.f223759c;
    }

    /* renamed from: g */
    public final int mo75339g() {
        return this.f223763g;
    }

    /* renamed from: h */
    public final int mo75340h() {
        return this.f223762f;
    }

    public final int hashCode() {
        return (((((((((((((((((((true != this.f223758b ? 1237 : 1231) ^ 1000003) * 1000003) ^ this.f223759c) * 1000003) ^ this.f223760d) * 1000003) ^ this.f223761e) * 1000003) ^ this.f223762f) * 1000003) ^ this.f223763g) * 1000003) ^ this.f223764h) * 1000003) ^ this.f223765i) * 1000003) ^ Float.floatToIntBits(this.f223766j)) * 1000003) ^ this.f223767k;
    }

    /* renamed from: i */
    public final int mo75341i() {
        return this.f223765i;
    }

    /* renamed from: k */
    public final boolean mo75342k() {
        return this.f223758b;
    }

    public final String toString() {
        boolean z = this.f223758b;
        int i = this.f223759c;
        int i2 = this.f223760d;
        int i3 = this.f223761e;
        int i4 = this.f223762f;
        int i5 = this.f223763g;
        int i6 = this.f223764h;
        int i7 = this.f223765i;
        float f = this.f223766j;
        int i8 = this.f223767k;
        return "AndroidConfiguration{isDarkMode=" + z + ", rotation=" + i + ", rotatedWidth=" + i2 + ", rotatedHeight=" + i3 + ", screenWidth=" + i4 + ", screenHeight=" + i5 + ", bottomCornerRadius=" + i6 + ", topCornerRadius=" + i7 + ", fontScale=" + f + ", densityDpi=" + i8 + "}";
    }
}
