package com.google.android.libraries.componentview.services.p1701a;

/* renamed from: com.google.android.libraries.componentview.services.a.a */
/* compiled from: PG */
public final class C20527a extends C20536e {

    /* renamed from: a */
    public final float f57670a;

    /* renamed from: b */
    public final float f57671b;

    /* renamed from: c */
    public final float f57672c;

    /* renamed from: d */
    public final float f57673d;

    public C20527a(float f, float f2, float f3, float f4) {
        this.f57670a = f;
        this.f57671b = f2;
        this.f57672c = f3;
        this.f57673d = f4;
    }

    /* renamed from: a */
    public final float mo25442a() {
        return this.f57673d;
    }

    /* renamed from: b */
    public final float mo25443b() {
        return this.f57672c;
    }

    /* renamed from: c */
    public final float mo25444c() {
        return this.f57670a;
    }

    /* renamed from: d */
    public final float mo25445d() {
        return this.f57671b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C20536e) {
            C20536e eVar = (C20536e) obj;
            return Float.floatToIntBits(this.f57670a) == Float.floatToIntBits(eVar.mo25444c()) && Float.floatToIntBits(this.f57671b) == Float.floatToIntBits(eVar.mo25445d()) && Float.floatToIntBits(this.f57672c) == Float.floatToIntBits(eVar.mo25443b()) && Float.floatToIntBits(this.f57673d) == Float.floatToIntBits(eVar.mo25442a());
        }
    }

    public final int hashCode() {
        return ((((((Float.floatToIntBits(this.f57670a) ^ 1000003) * 1000003) ^ Float.floatToIntBits(this.f57671b)) * 1000003) ^ Float.floatToIntBits(this.f57672c)) * 1000003) ^ Float.floatToIntBits(this.f57673d);
    }

    public final String toString() {
        float f = this.f57670a;
        float f2 = this.f57671b;
        float f3 = this.f57672c;
        float f4 = this.f57673d;
        return "CornerRoundingContext{topLeftRadius=" + f + ", topRightRadius=" + f2 + ", bottomRightRadius=" + f3 + ", bottomLeftRadius=" + f4 + "}";
    }
}
