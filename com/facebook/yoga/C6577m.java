package com.facebook.yoga;

/* renamed from: com.facebook.yoga.m */
/* compiled from: PG */
public final class C6577m {

    /* renamed from: a */
    public final float f19565a;

    /* renamed from: b */
    public final int f19566b;

    public C6577m(float f, int i) {
        this.f19565a = f;
        this.f19566b = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C6577m) {
            C6577m mVar = (C6577m) obj;
            int i = this.f19566b;
            if (i == mVar.f19566b) {
                if (i == 1 || i == 4 || Float.compare(this.f19565a, mVar.f19565a) == 0) {
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f19565a) + (this.f19566b - 1);
    }

    public final String toString() {
        int i = this.f19566b - 1;
        if (i == 0) {
            return "undefined";
        }
        if (i == 1) {
            return Float.toString(this.f19565a);
        }
        if (i != 2) {
            return "auto";
        }
        return this.f19565a + "%";
    }
}
