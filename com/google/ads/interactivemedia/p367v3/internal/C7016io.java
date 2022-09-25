package com.google.ads.interactivemedia.p367v3.internal;

import java.nio.ShortBuffer;
import java.util.Arrays;
import org.chromium.net.PrivateKeyType;

/* renamed from: com.google.ads.interactivemedia.v3.internal.io */
/* compiled from: PG */
final class C7016io {

    /* renamed from: a */
    private final int f22451a;

    /* renamed from: b */
    private final int f22452b;

    /* renamed from: c */
    private final float f22453c;

    /* renamed from: d */
    private final float f22454d;

    /* renamed from: e */
    private final float f22455e;

    /* renamed from: f */
    private final int f22456f;

    /* renamed from: g */
    private final int f22457g;

    /* renamed from: h */
    private final int f22458h;

    /* renamed from: i */
    private final short[] f22459i;

    /* renamed from: j */
    private short[] f22460j;

    /* renamed from: k */
    private int f22461k;

    /* renamed from: l */
    private short[] f22462l;

    /* renamed from: m */
    private int f22463m;

    /* renamed from: n */
    private short[] f22464n;

    /* renamed from: o */
    private int f22465o;

    /* renamed from: p */
    private int f22466p;

    /* renamed from: q */
    private int f22467q;

    /* renamed from: r */
    private int f22468r;

    /* renamed from: s */
    private int f22469s;

    /* renamed from: t */
    private int f22470t;

    /* renamed from: u */
    private int f22471u;

    /* renamed from: v */
    private int f22472v;

    public C7016io(int i, int i2, float f, float f2, int i3) {
        this.f22451a = i;
        this.f22452b = i2;
        this.f22453c = f;
        this.f22454d = f2;
        this.f22455e = ((float) i) / ((float) i3);
        this.f22456f = i / 400;
        int i4 = i / 65;
        this.f22457g = i4;
        int i5 = i4 + i4;
        this.f22458h = i5;
        this.f22459i = new short[i5];
        int i6 = i5 * i2;
        this.f22460j = new short[i6];
        this.f22462l = new short[i6];
        this.f22464n = new short[i6];
    }

    /* renamed from: f */
    private final short[] m20790f(short[] sArr, int i, int i2) {
        int length = sArr.length;
        int i3 = this.f22452b;
        int i4 = length / i3;
        if (i + i2 <= i4) {
            return sArr;
        }
        return Arrays.copyOf(sArr, (((i4 * 3) / 2) + i2) * i3);
    }

    /* renamed from: g */
    private final void m20791g(short[] sArr, int i, int i2) {
        short[] f = m20790f(this.f22462l, this.f22463m, i2);
        this.f22462l = f;
        int i3 = this.f22452b;
        System.arraycopy(sArr, i * i3, f, this.f22463m * i3, i3 * i2);
        this.f22463m += i2;
    }

    /* renamed from: h */
    private final void m20792h(short[] sArr, int i, int i2) {
        int i3 = this.f22458h / i2;
        int i4 = this.f22452b;
        int i5 = i2 * i4;
        int i6 = i * i4;
        for (int i7 = 0; i7 < i3; i7++) {
            int i8 = 0;
            for (int i9 = 0; i9 < i5; i9++) {
                i8 += sArr[(i7 * i5) + i6 + i9];
            }
            this.f22459i[i7] = (short) (i8 / i5);
        }
    }

    /* renamed from: i */
    private final int m20793i(short[] sArr, int i, int i2, int i3) {
        int i4 = i * this.f22452b;
        int i5 = PrivateKeyType.INVALID;
        int i6 = 1;
        int i7 = 0;
        int i8 = 0;
        while (i2 <= i3) {
            int i9 = 0;
            for (int i10 = 0; i10 < i2; i10++) {
                i9 += Math.abs(sArr[i4 + i10] - sArr[(i4 + i2) + i10]);
            }
            int i11 = i9 * i7;
            int i12 = i6 * i2;
            if (i11 < i12) {
                i6 = i9;
            }
            if (i11 < i12) {
                i7 = i2;
            }
            int i13 = i9 * i5;
            int i14 = i8 * i2;
            if (i13 > i14) {
                i8 = i9;
            }
            if (i13 > i14) {
                i5 = i2;
            }
            i2++;
        }
        this.f22471u = i6 / i7;
        this.f22472v = i8 / i5;
        return i7;
    }

    /* renamed from: k */
    private static void m20795k(int i, int i2, short[] sArr, int i3, short[] sArr2, int i4, short[] sArr3, int i5) {
        for (int i6 = 0; i6 < i2; i6++) {
            int i7 = (i3 * i2) + i6;
            int i8 = (i5 * i2) + i6;
            int i9 = (i4 * i2) + i6;
            for (int i10 = 0; i10 < i; i10++) {
                sArr[i7] = (short) (((sArr2[i9] * (i - i10)) + (sArr3[i8] * i10)) / i);
                i7 += i2;
                i9 += i2;
                i8 += i2;
            }
        }
    }

    /* renamed from: a */
    public final void mo16019a(ShortBuffer shortBuffer) {
        int remaining = shortBuffer.remaining();
        int i = this.f22452b;
        int i2 = remaining / i;
        int i3 = i * i2;
        short[] f = m20790f(this.f22460j, this.f22461k, i2);
        this.f22460j = f;
        shortBuffer.get(f, this.f22461k * this.f22452b, (i3 + i3) / 2);
        this.f22461k += i2;
        m20794j();
    }

    /* renamed from: b */
    public final void mo16020b(ShortBuffer shortBuffer) {
        int min = Math.min(shortBuffer.remaining() / this.f22452b, this.f22463m);
        shortBuffer.put(this.f22462l, 0, this.f22452b * min);
        int i = this.f22463m - min;
        this.f22463m = i;
        short[] sArr = this.f22462l;
        int i2 = this.f22452b;
        System.arraycopy(sArr, min * i2, sArr, 0, i * i2);
    }

    /* renamed from: c */
    public final void mo16021c() {
        int i;
        int i2 = this.f22461k;
        float f = this.f22453c;
        float f2 = this.f22454d;
        int i3 = this.f22463m + ((int) ((((((float) i2) / (f / f2)) + ((float) this.f22465o)) / (this.f22455e * f2)) + 0.5f));
        short[] sArr = this.f22460j;
        int i4 = this.f22458h;
        this.f22460j = m20790f(sArr, i2, i4 + i4 + i2);
        int i5 = 0;
        while (true) {
            int i6 = this.f22458h;
            i = i6 + i6;
            int i7 = this.f22452b;
            if (i5 >= i * i7) {
                break;
            }
            this.f22460j[(i7 * i2) + i5] = 0;
            i5++;
        }
        this.f22461k += i;
        m20794j();
        if (this.f22463m > i3) {
            this.f22463m = i3;
        }
        this.f22461k = 0;
        this.f22468r = 0;
        this.f22465o = 0;
    }

    /* renamed from: d */
    public final void mo16022d() {
        this.f22461k = 0;
        this.f22463m = 0;
        this.f22465o = 0;
        this.f22466p = 0;
        this.f22467q = 0;
        this.f22468r = 0;
        this.f22469s = 0;
        this.f22470t = 0;
        this.f22471u = 0;
        this.f22472v = 0;
    }

    /* renamed from: e */
    public final int mo16023e() {
        int i = this.f22463m * this.f22452b;
        return i + i;
    }

    /* renamed from: j */
    private final void m20794j() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9 = this.f22463m;
        float f = this.f22453c;
        float f2 = this.f22454d;
        float f3 = f / f2;
        float f4 = this.f22455e * f2;
        double d = (double) f3;
        float f5 = 1.0f;
        int i10 = 1;
        if (d > 1.00001d || d < 0.99999d) {
            int i11 = this.f22461k;
            if (i11 >= this.f22458h) {
                int i12 = 0;
                while (true) {
                    int i13 = this.f22468r;
                    if (i13 > 0) {
                        int min = Math.min(this.f22458h, i13);
                        m20791g(this.f22460j, i12, min);
                        this.f22468r -= min;
                        i12 += min;
                    } else {
                        short[] sArr = this.f22460j;
                        int i14 = this.f22451a;
                        int i15 = i14 > 4000 ? i14 / 4000 : 1;
                        if (this.f22452b == i10 && i15 == i10) {
                            i5 = m20793i(sArr, i12, this.f22456f, this.f22457g);
                        } else {
                            m20792h(sArr, i12, i15);
                            int i16 = m20793i(this.f22459i, 0, this.f22456f / i15, this.f22457g / i15);
                            if (i15 != i10) {
                                int i17 = i16 * i15;
                                int i18 = i15 * 4;
                                int i19 = i17 - i18;
                                int i20 = i17 + i18;
                                int i21 = this.f22456f;
                                if (i19 < i21) {
                                    i19 = i21;
                                }
                                int i22 = this.f22457g;
                                if (i20 > i22) {
                                    i20 = i22;
                                }
                                if (this.f22452b == i10) {
                                    i5 = m20793i(sArr, i12, i19, i20);
                                } else {
                                    m20792h(sArr, i12, i10);
                                    i5 = m20793i(this.f22459i, 0, i19, i20);
                                }
                            } else {
                                i5 = i16;
                            }
                        }
                        int i23 = this.f22471u;
                        int i24 = (i23 == 0 || (i8 = this.f22469s) == 0 || this.f22472v > i23 * 3 || i23 + i23 <= this.f22470t * 3) ? i5 : i8;
                        this.f22470t = i23;
                        this.f22469s = i5;
                        if (d > 1.0d) {
                            short[] sArr2 = this.f22460j;
                            if (f3 >= 2.0f) {
                                i7 = (int) (((float) i24) / (-1.0f + f3));
                            } else {
                                this.f22468r = (int) ((((float) i24) * (2.0f - f3)) / (-1.0f + f3));
                                i7 = i24;
                            }
                            short[] f6 = m20790f(this.f22462l, this.f22463m, i7);
                            this.f22462l = f6;
                            int i25 = i7;
                            short[] sArr3 = sArr2;
                            m20795k(i7, this.f22452b, f6, this.f22463m, sArr3, i12, sArr3, i12 + i24);
                            this.f22463m += i25;
                            i12 += i24 + i25;
                        } else {
                            int i26 = i24;
                            short[] sArr4 = this.f22460j;
                            if (f3 < 0.5f) {
                                i6 = (int) ((((float) i26) * f3) / (f5 - f3));
                            } else {
                                this.f22468r = (int) ((((float) i26) * ((f3 + f3) - 4.0f)) / (f5 - f3));
                                i6 = i26;
                            }
                            int i27 = i26 + i6;
                            short[] f7 = m20790f(this.f22462l, this.f22463m, i27);
                            this.f22462l = f7;
                            int i28 = this.f22452b;
                            System.arraycopy(sArr4, i12 * i28, f7, this.f22463m * i28, i28 * i26);
                            m20795k(i6, this.f22452b, this.f22462l, this.f22463m + i26, sArr4, i12 + i26, sArr4, i12);
                            this.f22463m += i27;
                            i12 += i6;
                        }
                    }
                    if (this.f22458h + i12 > i11) {
                        break;
                    }
                    f5 = 1.0f;
                    i10 = 1;
                }
                int i29 = this.f22461k - i12;
                short[] sArr5 = this.f22460j;
                int i30 = this.f22452b;
                System.arraycopy(sArr5, i12 * i30, sArr5, 0, i30 * i29);
                this.f22461k = i29;
                f5 = 1.0f;
            }
        } else {
            m20791g(this.f22460j, 0, this.f22461k);
            this.f22461k = 0;
        }
        if (f4 != f5 && this.f22463m != i9) {
            int i31 = this.f22451a;
            int i32 = (int) (((float) i31) / f4);
            while (true) {
                if (i32 <= 16384 && i31 <= 16384) {
                    break;
                }
                i32 /= 2;
                i31 /= 2;
            }
            int i33 = this.f22463m - i9;
            short[] f8 = m20790f(this.f22464n, this.f22465o, i33);
            this.f22464n = f8;
            short[] sArr6 = this.f22462l;
            int i34 = this.f22452b;
            System.arraycopy(sArr6, i9 * i34, f8, this.f22465o * i34, i34 * i33);
            this.f22463m = i9;
            this.f22465o += i33;
            int i35 = 0;
            while (true) {
                i = this.f22465o;
                i2 = i - 1;
                if (i35 >= i2) {
                    break;
                }
                while (true) {
                    i3 = this.f22466p + 1;
                    i4 = this.f22467q;
                    if (i3 * i32 <= i4 * i31) {
                        break;
                    }
                    this.f22462l = m20790f(this.f22462l, this.f22463m, 1);
                    int i36 = 0;
                    while (true) {
                        int i37 = this.f22452b;
                        if (i36 >= i37) {
                            break;
                        }
                        short[] sArr7 = this.f22462l;
                        int i38 = this.f22463m;
                        short[] sArr8 = this.f22464n;
                        int i39 = (i35 * i37) + i36;
                        short s = sArr8[i39];
                        short s2 = sArr8[i39 + i37];
                        int i40 = this.f22467q;
                        int i41 = this.f22466p;
                        int i42 = (i41 + 1) * i32;
                        int i43 = i42 - (i40 * i31);
                        int i44 = i42 - (i41 * i32);
                        sArr7[(i38 * i37) + i36] = (short) (((s * i43) + ((i44 - i43) * s2)) / i44);
                        i36++;
                    }
                    this.f22467q++;
                    this.f22463m++;
                }
                this.f22466p = i3;
                if (i3 == i31) {
                    this.f22466p = 0;
                    ary.m19464q(i4 == i32);
                    this.f22467q = 0;
                }
                i35++;
            }
            if (i2 != 0) {
                short[] sArr9 = this.f22464n;
                int i45 = this.f22452b;
                System.arraycopy(sArr9, i2 * i45, sArr9, 0, (i - i2) * i45);
                this.f22465o -= i2;
            }
        }
    }
}
