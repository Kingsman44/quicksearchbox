package com.google.ads.interactivemedia.p367v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.ik */
/* compiled from: PG */
public final class C7012ik {

    /* renamed from: a */
    public int f22425a;

    /* renamed from: b */
    public String f22426b;

    /* renamed from: c */
    public int f22427c;

    /* renamed from: d */
    public int f22428d;

    /* renamed from: e */
    public int f22429e;

    /* renamed from: f */
    public int f22430f;

    /* renamed from: g */
    public int f22431g;

    /* renamed from: a */
    public final boolean mo16016a(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        if (!C7013il.m20774l(i) || (i2 = (i >>> 19) & 3) == 1 || (i3 = (i >>> 17) & 3) == 0 || (i4 = (i >>> 12) & 15) == 0 || i4 == 15 || (i5 = (i >>> 10) & 3) == 3) {
            return false;
        }
        this.f22425a = i2;
        this.f22426b = C7013il.f22432a[3 - i3];
        int i8 = C7013il.f22433b[i5];
        this.f22428d = i8;
        int i9 = 2;
        if (i2 == 2) {
            i8 /= 2;
            this.f22428d = i8;
        } else if (i2 == 0) {
            i8 /= 4;
            this.f22428d = i8;
        }
        int i10 = (i >>> 9) & 1;
        this.f22431g = C7013il.m20775m(i2, i3);
        if (i3 == 3) {
            if (i2 == 3) {
                i7 = C7013il.f22434c[i4 - 1];
            } else {
                i7 = C7013il.f22435d[i4 - 1];
            }
            this.f22430f = i7;
            this.f22427c = (((i7 * 12) / i8) + i10) * 4;
        } else {
            int i11 = 144;
            if (i2 == 3) {
                if (i3 == 2) {
                    i6 = C7013il.f22436e[i4 - 1];
                } else {
                    i6 = C7013il.f22437f[i4 - 1];
                }
                this.f22430f = i6;
                this.f22427c = ((i6 * 144) / i8) + i10;
            } else {
                int i12 = C7013il.f22438g[i4 - 1];
                this.f22430f = i12;
                if (i3 == 1) {
                    i11 = 72;
                }
                this.f22427c = ((i11 * i12) / i8) + i10;
            }
        }
        if (((i >> 6) & 3) == 3) {
            i9 = 1;
        }
        this.f22429e = i9;
        return true;
    }
}
