package com.google.android.libraries.lens.view.p2148l;

/* renamed from: com.google.android.libraries.lens.view.l.e */
/* compiled from: PG */
public final class C27225e extends C27231k {

    /* renamed from: a */
    private final float f74484a;

    /* renamed from: b */
    private final float f74485b;

    public C27225e(float f, float f2) {
        this.f74484a = f;
        this.f74485b = f2;
    }

    /* renamed from: a */
    public final float mo32722a() {
        return this.f74484a;
    }

    /* renamed from: b */
    public final float mo32723b() {
        return this.f74485b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C27231k) {
            C27231k kVar = (C27231k) obj;
            return Float.floatToIntBits(this.f74484a) == Float.floatToIntBits(kVar.mo32722a()) && Float.floatToIntBits(this.f74485b) == Float.floatToIntBits(kVar.mo32723b());
        }
    }

    public final int hashCode() {
        return ((Float.floatToIntBits(this.f74484a) ^ 1000003) * 1000003) ^ Float.floatToIntBits(this.f74485b);
    }

    public final String toString() {
        float f = this.f74484a;
        float f2 = this.f74485b;
        return "LensTapLocation{centerX=" + f + ", centerY=" + f2 + "}";
    }
}
