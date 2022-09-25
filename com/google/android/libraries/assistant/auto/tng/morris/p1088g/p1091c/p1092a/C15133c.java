package com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1091c.p1092a;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.g.c.a.c */
/* compiled from: PG */
public final class C15133c extends C15134d {

    /* renamed from: a */
    public final float f45420a;

    /* renamed from: b */
    public final float f45421b;

    public C15133c(float f, float f2) {
        this.f45420a = f;
        this.f45421b = f2;
    }

    /* renamed from: a */
    public final float mo21997a() {
        return this.f45420a;
    }

    /* renamed from: b */
    public final float mo21998b() {
        return this.f45421b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C15134d) {
            C15134d dVar = (C15134d) obj;
            return Float.floatToIntBits(this.f45420a) == Float.floatToIntBits(dVar.mo21997a()) && Float.floatToIntBits(this.f45421b) == Float.floatToIntBits(dVar.mo21998b());
        }
    }

    public final int hashCode() {
        return ((Float.floatToIntBits(this.f45420a) ^ 1000003) * 1000003) ^ Float.floatToIntBits(this.f45421b);
    }

    public final String toString() {
        float f = this.f45420a;
        float f2 = this.f45421b;
        return "ImmutablePoint{x=" + f + ", y=" + f2 + "}";
    }
}
