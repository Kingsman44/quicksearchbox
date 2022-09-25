package com.google.android.libraries.elements.interfaces;

/* renamed from: com.google.android.libraries.elements.interfaces.i */
/* compiled from: PG */
public final class C21302i extends C21295ck {

    /* renamed from: a */
    public final float f59674a;

    /* renamed from: b */
    public final float f59675b;

    public C21302i(float f, float f2) {
        this.f59674a = f;
        this.f59675b = f2;
    }

    /* renamed from: a */
    public final float mo26795a() {
        return this.f59674a;
    }

    /* renamed from: b */
    public final float mo26796b() {
        return this.f59675b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C21295ck) {
            C21295ck ckVar = (C21295ck) obj;
            return Float.floatToIntBits(this.f59674a) == Float.floatToIntBits(ckVar.mo26795a()) && Float.floatToIntBits(this.f59675b) == Float.floatToIntBits(ckVar.mo26796b());
        }
    }

    public final int hashCode() {
        return ((Float.floatToIntBits(this.f59674a) ^ 1000003) * 1000003) ^ Float.floatToIntBits(this.f59675b);
    }

    public final String toString() {
        float f = this.f59674a;
        float f2 = this.f59675b;
        return "TouchLocation{x=" + f + ", y=" + f2 + "}";
    }
}
