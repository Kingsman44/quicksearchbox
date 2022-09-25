package com.google.android.libraries.lens.view.gleam;

/* renamed from: com.google.android.libraries.lens.view.gleam.c */
/* compiled from: PG */
final class C26495c extends C26452ak {

    /* renamed from: a */
    public final float f72185a;

    /* renamed from: b */
    public final float f72186b;

    /* renamed from: c */
    public final float f72187c;

    public C26495c(float f, float f2, float f3) {
        this.f72185a = f;
        this.f72186b = f2;
        this.f72187c = f3;
    }

    /* renamed from: a */
    public final float mo31687a() {
        return this.f72185a;
    }

    /* renamed from: b */
    public final float mo31688b() {
        return this.f72186b;
    }

    /* renamed from: c */
    public final float mo31689c() {
        return 0.0f;
    }

    /* renamed from: d */
    public final float mo31690d() {
        return 1.0f;
    }

    /* renamed from: e */
    public final float mo31691e() {
        return this.f72187c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C26452ak) {
            C26452ak akVar = (C26452ak) obj;
            return akVar.mo31692f() == -12828605 && Float.floatToIntBits(this.f72185a) == Float.floatToIntBits(akVar.mo31687a()) && Float.floatToIntBits(0.0f) == Float.floatToIntBits(akVar.mo31689c()) && Float.floatToIntBits(1.0f) == Float.floatToIntBits(akVar.mo31690d()) && Float.floatToIntBits(this.f72186b) == Float.floatToIntBits(akVar.mo31688b()) && Float.floatToIntBits(this.f72187c) == Float.floatToIntBits(akVar.mo31691e());
        }
    }

    /* renamed from: f */
    public final int mo31692f() {
        return -12828605;
    }

    public final int hashCode() {
        return ((((((((Float.floatToIntBits(this.f72185a) ^ 249398784) * 1000003) ^ Float.floatToIntBits(0.0f)) * 1000003) ^ Float.floatToIntBits(1.0f)) * 1000003) ^ Float.floatToIntBits(this.f72186b)) * 1000003) ^ Float.floatToIntBits(this.f72187c);
    }

    public final String toString() {
        float f = this.f72185a;
        float f2 = this.f72186b;
        float f3 = this.f72187c;
        return "ShadowProperties{color=-12828605, alpha=" + f + ", offsetX=0.0, offsetY=1.0, blur=" + f2 + ", spread=" + f3 + "}";
    }
}
