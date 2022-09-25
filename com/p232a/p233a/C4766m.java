package com.p232a.p233a;

/* renamed from: com.a.a.m */
/* compiled from: PG */
public final class C4766m implements Cloneable {

    /* renamed from: a */
    public float f15101a;

    /* renamed from: b */
    public float f15102b;

    /* renamed from: c */
    public float f15103c;

    /* renamed from: d */
    public float f15104d;

    public C4766m(float f, float f2, float f3, float f4) {
        this.f15101a = f;
        this.f15102b = f2;
        this.f15103c = f3;
        this.f15104d = f4;
    }

    /* renamed from: a */
    public static C4766m m13276a(float f, float f2, float f3, float f4) {
        return new C4766m(f, f2, f3 - f, f4 - f2);
    }

    public final String toString() {
        float f = this.f15101a;
        float f2 = this.f15102b;
        float f3 = this.f15103c;
        float f4 = this.f15104d;
        return "[" + f + " " + f2 + " " + f3 + " " + f4 + "]";
    }
}
