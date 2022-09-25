package com.google.android.gms.car;

/* renamed from: com.google.android.gms.car.cy */
/* compiled from: PG */
public final class C143169cy {

    /* renamed from: a */
    public final boolean f388211a;

    /* renamed from: b */
    public final boolean f388212b;

    /* renamed from: c */
    public final boolean f388213c;

    /* renamed from: d */
    public final int f388214d;

    /* renamed from: e */
    public final int f388215e;

    public C143169cy(boolean z, boolean z2, boolean z3, int i, int i2) {
        this.f388211a = z;
        this.f388212b = z2;
        this.f388213c = z3;
        this.f388214d = i;
        this.f388215e = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C143169cy cyVar = (C143169cy) obj;
            if (this.f388211a == cyVar.f388211a && this.f388212b == cyVar.f388212b && this.f388213c == cyVar.f388213c && this.f388214d == cyVar.f388214d && this.f388215e == cyVar.f388215e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.f388211a ? 1 : 0) * true) + (this.f388212b ? 1 : 0)) * 31) + (this.f388213c ? 1 : 0)) * 31) + this.f388214d) * 31) + this.f388215e;
    }

    public final String toString() {
        boolean z = this.f388211a;
        boolean z2 = this.f388212b;
        boolean z3 = this.f388213c;
        int i = this.f388214d;
        int i2 = this.f388215e;
        return "Config{hasTouchScreen=" + z + ", hasRotaryController=" + z2 + ", hasTouchpadForNavigation=" + z3 + ", touchpadMoveThresholdPx=" + i + ", touchpadMultimoveThresholdPx=" + i2 + "}";
    }
}
