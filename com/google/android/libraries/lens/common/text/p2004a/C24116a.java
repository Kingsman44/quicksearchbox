package com.google.android.libraries.lens.common.text.p2004a;

/* renamed from: com.google.android.libraries.lens.common.text.a.a */
/* compiled from: PG */
final class C24116a extends C24123b {

    /* renamed from: a */
    public final float f65843a;

    /* renamed from: b */
    public final float f65844b;

    public C24116a(float f, float f2) {
        this.f65843a = f;
        this.f65844b = f2;
    }

    /* renamed from: a */
    public final float mo29518a() {
        return this.f65843a;
    }

    /* renamed from: b */
    public final float mo29519b() {
        return this.f65844b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C24123b) {
            C24123b bVar = (C24123b) obj;
            return Float.floatToIntBits(this.f65843a) == Float.floatToIntBits(bVar.mo29518a()) && Float.floatToIntBits(this.f65844b) == Float.floatToIntBits(bVar.mo29519b());
        }
    }

    public final int hashCode() {
        return ((Float.floatToIntBits(this.f65843a) ^ 1000003) * 1000003) ^ Float.floatToIntBits(this.f65844b);
    }

    public final String toString() {
        float f = this.f65843a;
        float f2 = this.f65844b;
        return "TextSizeProperties{textSize=" + f + ", textWidth=" + f2 + "}";
    }
}
