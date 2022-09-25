package com.google.android.libraries.lens.view.p2113h.p2114a;

/* renamed from: com.google.android.libraries.lens.view.h.a.a */
/* compiled from: PG */
public final class C26640a extends C26645f {

    /* renamed from: a */
    public final float f72646a;

    /* renamed from: b */
    public final float f72647b;

    /* renamed from: c */
    public final long f72648c;

    public C26640a(float f, float f2, long j) {
        this.f72646a = f;
        this.f72647b = f2;
        this.f72648c = j;
    }

    /* renamed from: a */
    public final float mo31920a() {
        return this.f72646a;
    }

    /* renamed from: b */
    public final float mo31921b() {
        return this.f72647b;
    }

    /* renamed from: c */
    public final long mo31922c() {
        return this.f72648c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C26645f) {
            C26645f fVar = (C26645f) obj;
            return Float.floatToIntBits(this.f72646a) == Float.floatToIntBits(fVar.mo31920a()) && Float.floatToIntBits(this.f72647b) == Float.floatToIntBits(fVar.mo31921b()) && this.f72648c == fVar.mo31922c();
        }
    }

    public final int hashCode() {
        int floatToIntBits = Float.floatToIntBits(this.f72646a);
        int floatToIntBits2 = Float.floatToIntBits(this.f72647b);
        long j = this.f72648c;
        return ((((floatToIntBits ^ 1000003) * 1000003) ^ floatToIntBits2) * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }
}
