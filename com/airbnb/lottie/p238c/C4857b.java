package com.airbnb.lottie.p238c;

/* renamed from: com.airbnb.lottie.c.b */
/* compiled from: PG */
public final class C4857b {

    /* renamed from: a */
    public final String f15439a;

    /* renamed from: b */
    public final String f15440b;

    /* renamed from: c */
    public final float f15441c;

    /* renamed from: d */
    public final int f15442d;

    /* renamed from: e */
    public final float f15443e;

    /* renamed from: f */
    public final float f15444f;

    /* renamed from: g */
    public final int f15445g;

    /* renamed from: h */
    public final int f15446h;

    /* renamed from: i */
    public final float f15447i;

    /* renamed from: j */
    public final boolean f15448j;

    /* renamed from: k */
    public final int f15449k;

    public C4857b(String str, String str2, float f, int i, int i2, float f2, float f3, int i3, int i4, float f4, boolean z) {
        this.f15439a = str;
        this.f15440b = str2;
        this.f15441c = f;
        this.f15449k = i;
        this.f15442d = i2;
        this.f15443e = f2;
        this.f15444f = f3;
        this.f15445g = i3;
        this.f15446h = i4;
        this.f15447i = f4;
        this.f15448j = z;
    }

    public final int hashCode() {
        int hashCode = ((int) (((float) (((this.f15439a.hashCode() * 31) + this.f15440b.hashCode()) * 31)) + this.f15441c)) * 31;
        int i = this.f15449k;
        int i2 = i - 1;
        if (i != 0) {
            int i3 = this.f15442d;
            long floatToRawIntBits = (long) Float.floatToRawIntBits(this.f15443e);
            return ((((((hashCode + i2) * 31) + i3) * 31) + ((int) ((floatToRawIntBits >>> 32) ^ floatToRawIntBits))) * 31) + this.f15445g;
        }
        throw null;
    }
}
