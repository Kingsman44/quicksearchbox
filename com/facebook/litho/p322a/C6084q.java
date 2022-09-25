package com.facebook.litho.p322a;

/* renamed from: com.facebook.litho.a.q */
/* compiled from: PG */
public final class C6084q {

    /* renamed from: a */
    public final C6085r f17975a;

    /* renamed from: b */
    public final float f17976b;

    public C6084q(C6085r rVar, float f) {
        this.f17975a = rVar;
        this.f17976b = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C6084q qVar = (C6084q) obj;
            return Float.compare(qVar.f17976b, this.f17976b) == 0 && this.f17975a.equals(qVar.f17975a);
        }
    }

    public final int hashCode() {
        int hashCode = this.f17975a.hashCode() * 31;
        float f = this.f17976b;
        return hashCode + (f != 0.0f ? Float.floatToIntBits(f) : 0);
    }

    public final String toString() {
        String obj = this.f17975a.toString();
        float f = this.f17976b;
        return "PropertyAnimation{ PropertyHandle=" + obj + ", TargetValue=" + f + "}";
    }
}
