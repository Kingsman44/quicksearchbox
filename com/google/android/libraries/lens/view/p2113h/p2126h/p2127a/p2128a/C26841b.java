package com.google.android.libraries.lens.view.p2113h.p2126h.p2127a.p2128a;

/* renamed from: com.google.android.libraries.lens.view.h.h.a.a.b */
/* compiled from: PG */
final class C26841b extends C26844e {

    /* renamed from: a */
    private final int f73142a;

    /* renamed from: b */
    private final int f73143b;

    /* renamed from: c */
    private final int f73144c;

    public C26841b(int i, int i2, int i3) {
        this.f73142a = i;
        this.f73143b = i2;
        this.f73144c = i3;
    }

    /* renamed from: a */
    public final int mo32211a() {
        return this.f73142a;
    }

    /* renamed from: b */
    public final int mo32212b() {
        return this.f73143b;
    }

    /* renamed from: c */
    public final int mo32213c() {
        return this.f73144c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C26844e) {
            C26844e eVar = (C26844e) obj;
            return this.f73142a == eVar.mo32211a() && this.f73143b == eVar.mo32212b() && this.f73144c == eVar.mo32213c();
        }
    }

    public final int hashCode() {
        return ((((this.f73142a ^ 1000003) * 1000003) ^ this.f73143b) * 1000003) ^ this.f73144c;
    }

    public final String toString() {
        int i = this.f73142a;
        int i2 = this.f73143b;
        int i3 = this.f73144c;
        return "ImageBuffers{framebuffer=" + i + ", pbo=" + i2 + ", texture=" + i3 + "}";
    }
}
