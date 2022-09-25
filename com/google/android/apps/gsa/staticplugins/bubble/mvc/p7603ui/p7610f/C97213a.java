package com.google.android.apps.gsa.staticplugins.bubble.mvc.p7603ui.p7610f;

/* renamed from: com.google.android.apps.gsa.staticplugins.bubble.mvc.ui.f.a */
/* compiled from: PG */
public final class C97213a extends C97214b {

    /* renamed from: a */
    public final float f271607a;

    /* renamed from: b */
    public final float f271608b;

    public C97213a(float f, float f2) {
        this.f271607a = f;
        this.f271608b = f2;
    }

    /* renamed from: a */
    public final float mo90592a() {
        return this.f271607a;
    }

    /* renamed from: b */
    public final float mo90593b() {
        return this.f271608b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C97214b) {
            C97214b bVar = (C97214b) obj;
            return Float.floatToIntBits(this.f271607a) == Float.floatToIntBits(bVar.mo90592a()) && Float.floatToIntBits(this.f271608b) == Float.floatToIntBits(bVar.mo90593b());
        }
    }

    public final int hashCode() {
        return ((Float.floatToIntBits(this.f271607a) ^ 1000003) * 1000003) ^ Float.floatToIntBits(this.f271608b);
    }

    public final String toString() {
        float f = this.f271607a;
        float f2 = this.f271608b;
        return "ImmutablePoint{x=" + f + ", y=" + f2 + "}";
    }
}
