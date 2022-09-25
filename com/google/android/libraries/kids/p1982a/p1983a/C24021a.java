package com.google.android.libraries.kids.p1982a.p1983a;

/* renamed from: com.google.android.libraries.kids.a.a.a */
/* compiled from: PG */
final class C24021a extends C24031k {

    /* renamed from: e */
    private final boolean f65646e;

    /* renamed from: f */
    private final boolean f65647f;

    /* renamed from: g */
    private final boolean f65648g;

    public C24021a(boolean z, boolean z2, boolean z3) {
        this.f65646e = z;
        this.f65647f = z2;
        this.f65648g = z3;
    }

    /* renamed from: a */
    public final boolean mo29420a() {
        return this.f65648g;
    }

    /* renamed from: b */
    public final boolean mo29421b() {
        return this.f65646e;
    }

    /* renamed from: c */
    public final boolean mo29422c() {
        return this.f65647f;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C24031k) {
            C24031k kVar = (C24031k) obj;
            return this.f65646e == kVar.mo29421b() && this.f65647f == kVar.mo29422c() && this.f65648g == kVar.mo29420a();
        }
    }

    public final int hashCode() {
        int i = 1237;
        int i2 = ((((true != this.f65646e ? 1237 : 1231) ^ 1000003) * 1000003) ^ (true != this.f65647f ? 1237 : 1231)) * 1000003;
        if (true == this.f65648g) {
            i = 1231;
        }
        return i2 ^ i;
    }

    public final String toString() {
        boolean z = this.f65646e;
        boolean z2 = this.f65647f;
        boolean z3 = this.f65648g;
        return "SupervisionInfo{supervised=" + z + ", unicorn=" + z2 + ", griffin=" + z3 + "}";
    }
}
