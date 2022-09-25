package com.google.android.libraries.lens.view.vision;

/* renamed from: com.google.android.libraries.lens.view.vision.h */
/* compiled from: PG */
public final class C28166h extends C28183y {

    /* renamed from: a */
    private final float f76685a;

    /* renamed from: b */
    private final float f76686b;

    /* renamed from: c */
    private final float f76687c;

    public C28166h(float f, float f2, float f3) {
        this.f76685a = f;
        this.f76686b = f2;
        this.f76687c = f3;
    }

    /* renamed from: a */
    public final float mo33685a() {
        return this.f76685a;
    }

    /* renamed from: b */
    public final float mo33686b() {
        return this.f76686b;
    }

    /* renamed from: c */
    public final float mo33687c() {
        return this.f76687c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C28183y) {
            C28183y yVar = (C28183y) obj;
            return Float.floatToIntBits(this.f76685a) == Float.floatToIntBits(yVar.mo33685a()) && Float.floatToIntBits(this.f76686b) == Float.floatToIntBits(yVar.mo33686b()) && Float.floatToIntBits(this.f76687c) == Float.floatToIntBits(yVar.mo33687c());
        }
    }

    public final int hashCode() {
        return ((((Float.floatToIntBits(this.f76685a) ^ 1000003) * 1000003) ^ Float.floatToIntBits(this.f76686b)) * 1000003) ^ Float.floatToIntBits(this.f76687c);
    }
}
