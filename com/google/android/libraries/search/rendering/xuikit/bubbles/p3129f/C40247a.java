package com.google.android.libraries.search.rendering.xuikit.bubbles.p3129f;

/* renamed from: com.google.android.libraries.search.rendering.xuikit.bubbles.f.a */
/* compiled from: PG */
public final class C40247a extends C40248b {

    /* renamed from: a */
    public final float f105717a;

    /* renamed from: b */
    public final float f105718b;

    public C40247a(float f, float f2) {
        this.f105717a = f;
        this.f105718b = f2;
    }

    /* renamed from: a */
    public final float mo42347a() {
        return this.f105717a;
    }

    /* renamed from: b */
    public final float mo42348b() {
        return this.f105718b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C40248b) {
            C40248b bVar = (C40248b) obj;
            return Float.floatToIntBits(this.f105717a) == Float.floatToIntBits(bVar.mo42347a()) && Float.floatToIntBits(this.f105718b) == Float.floatToIntBits(bVar.mo42348b());
        }
    }

    public final int hashCode() {
        return ((Float.floatToIntBits(this.f105717a) ^ 1000003) * 1000003) ^ Float.floatToIntBits(this.f105718b);
    }

    public final String toString() {
        float f = this.f105717a;
        float f2 = this.f105718b;
        return "ImmutablePoint{x=" + f + ", y=" + f2 + "}";
    }
}
