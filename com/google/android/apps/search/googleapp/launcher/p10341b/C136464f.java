package com.google.android.apps.search.googleapp.launcher.p10341b;

/* renamed from: com.google.android.apps.search.googleapp.launcher.b.f */
/* compiled from: PG */
final class C136464f extends C136443b {

    /* renamed from: a */
    private final boolean f371538a;

    /* renamed from: b */
    private final boolean f371539b;

    /* renamed from: c */
    private final boolean f371540c;

    /* renamed from: d */
    private final boolean f371541d;

    /* renamed from: e */
    private final boolean f371542e;

    /* renamed from: f */
    private final boolean f371543f;

    /* renamed from: g */
    private final int f371544g;

    public C136464f(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, int i) {
        this.f371538a = z;
        this.f371539b = z2;
        this.f371540c = z3;
        this.f371541d = z4;
        this.f371542e = z5;
        this.f371543f = z6;
        this.f371544g = i;
    }

    /* renamed from: a */
    public final int mo113042a() {
        return this.f371544g;
    }

    /* renamed from: d */
    public final boolean mo113043d() {
        return this.f371542e;
    }

    /* renamed from: e */
    public final boolean mo113044e() {
        return this.f371539b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C136443b) {
            C136443b bVar = (C136443b) obj;
            return this.f371538a == bVar.mo113045f() && this.f371539b == bVar.mo113044e() && this.f371540c == bVar.mo113047h() && this.f371541d == bVar.mo113048i() && this.f371542e == bVar.mo113043d() && this.f371543f == bVar.mo113046g() && this.f371544g == bVar.mo113042a();
        }
    }

    /* renamed from: f */
    public final boolean mo113045f() {
        return this.f371538a;
    }

    /* renamed from: g */
    public final boolean mo113046g() {
        return this.f371543f;
    }

    /* renamed from: h */
    public final boolean mo113047h() {
        return this.f371540c;
    }

    public final int hashCode() {
        int i = 1237;
        int i2 = ((((((((((true != this.f371538a ? 1237 : 1231) ^ 1000003) * 1000003) ^ (true != this.f371539b ? 1237 : 1231)) * 1000003) ^ (true != this.f371540c ? 1237 : 1231)) * 1000003) ^ (true != this.f371541d ? 1237 : 1231)) * 1000003) ^ (true != this.f371542e ? 1237 : 1231)) * 1000003;
        if (true == this.f371543f) {
            i = 1231;
        }
        return ((i2 ^ i) * 1000003) ^ this.f371544g;
    }

    /* renamed from: i */
    public final boolean mo113048i() {
        return this.f371541d;
    }

    public final String toString() {
        boolean z = this.f371538a;
        boolean z2 = this.f371539b;
        boolean z3 = this.f371540c;
        boolean z4 = this.f371541d;
        boolean z5 = this.f371542e;
        boolean z6 = this.f371543f;
        int i = this.f371544g;
        return "AcetoneOptions{overlayEnabled=" + z + ", hotwordEnabled=" + z2 + ", pixelSuggestEnabled=" + z3 + ", sharedOverlayEnabled=" + z4 + ", googleOverlayActive=" + z5 + ", overlayVisible=" + z6 + ", bottomInsetOverride=" + i + "}";
    }
}
