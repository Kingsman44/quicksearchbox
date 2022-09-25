package com.google.android.libraries.lens.common.text.p2004a.p2005a;

/* renamed from: com.google.android.libraries.lens.common.text.a.a.b */
/* compiled from: PG */
public class C24118b extends C24121e {

    /* renamed from: a */
    public final float f65851a;

    /* renamed from: b */
    public final float f65852b;

    /* renamed from: c */
    public final float f65853c;

    /* renamed from: d */
    public final float f65854d;

    /* renamed from: e */
    public final float f65855e;

    public C24118b(float f, float f2, float f3, float f4, float f5) {
        this.f65851a = f;
        this.f65852b = f2;
        this.f65853c = f3;
        this.f65854d = f4;
        this.f65855e = f5;
    }

    /* renamed from: a */
    public final float mo29528a() {
        return this.f65855e;
    }

    /* renamed from: b */
    public final float mo29529b() {
        return this.f65854d;
    }

    /* renamed from: c */
    public final float mo29530c() {
        return this.f65853c;
    }

    /* renamed from: d */
    public final float mo29531d() {
        return this.f65851a;
    }

    /* renamed from: e */
    public final float mo29532e() {
        return this.f65852b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C24121e) {
            C24121e eVar = (C24121e) obj;
            return Float.floatToIntBits(this.f65851a) == Float.floatToIntBits(eVar.mo29531d()) && Float.floatToIntBits(this.f65852b) == Float.floatToIntBits(eVar.mo29532e()) && Float.floatToIntBits(this.f65853c) == Float.floatToIntBits(eVar.mo29530c()) && Float.floatToIntBits(this.f65854d) == Float.floatToIntBits(eVar.mo29529b()) && Float.floatToIntBits(this.f65855e) == Float.floatToIntBits(eVar.mo29528a());
        }
    }

    public final int hashCode() {
        return ((((((((Float.floatToIntBits(this.f65851a) ^ 1000003) * 1000003) ^ Float.floatToIntBits(this.f65852b)) * 1000003) ^ Float.floatToIntBits(this.f65853c)) * 1000003) ^ Float.floatToIntBits(this.f65854d)) * 1000003) ^ Float.floatToIntBits(this.f65855e);
    }

    public final String toString() {
        float f = this.f65851a;
        float f2 = this.f65852b;
        float f3 = this.f65853c;
        float f4 = this.f65854d;
        float f5 = this.f65855e;
        return "RenderProperties{highlightHorizontalMargin=" + f + ", highlightVerticalMargin=" + f2 + ", cornerRadius=" + f3 + ", backgroundUnderlayMinFontSizePx=" + f4 + ", backgroundUnderlayMaxFontSizePx=" + f5 + "}";
    }
}
