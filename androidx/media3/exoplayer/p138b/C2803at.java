package androidx.media3.exoplayer.p138b;

import androidx.media3.common.p136b.C2601a;
import java.util.Arrays;
import org.chromium.net.PrivateKeyType;

/* renamed from: androidx.media3.exoplayer.b.at */
/* compiled from: PG */
final class C2803at {

    /* renamed from: a */
    public final int f7789a;

    /* renamed from: b */
    public final float f7790b;

    /* renamed from: c */
    public final float f7791c;

    /* renamed from: d */
    public final float f7792d;

    /* renamed from: e */
    public final int f7793e;

    /* renamed from: f */
    public short[] f7794f;

    /* renamed from: g */
    public int f7795g;

    /* renamed from: h */
    public short[] f7796h;

    /* renamed from: i */
    public int f7797i;

    /* renamed from: j */
    public int f7798j;

    /* renamed from: k */
    public int f7799k;

    /* renamed from: l */
    public int f7800l;

    /* renamed from: m */
    public int f7801m;

    /* renamed from: n */
    public int f7802n;

    /* renamed from: o */
    public int f7803o;

    /* renamed from: p */
    public int f7804p;

    /* renamed from: q */
    public int f7805q;

    /* renamed from: r */
    private final int f7806r;

    /* renamed from: s */
    private final int f7807s;

    /* renamed from: t */
    private final int f7808t;

    /* renamed from: u */
    private final short[] f7809u;

    /* renamed from: v */
    private short[] f7810v;

    public C2803at(int i, int i2, float f, float f2, int i3) {
        this.f7806r = i;
        this.f7789a = i2;
        this.f7790b = f;
        this.f7791c = f2;
        this.f7792d = ((float) i) / ((float) i3);
        this.f7807s = i / 400;
        int i4 = i / 65;
        this.f7808t = i4;
        int i5 = i4 + i4;
        this.f7793e = i5;
        this.f7809u = new short[i5];
        int i6 = i5 * i2;
        this.f7794f = new short[i6];
        this.f7796h = new short[i6];
        this.f7810v = new short[i6];
    }

    /* renamed from: d */
    private final int m7729d(short[] sArr, int i, int i2, int i3) {
        int i4 = i * this.f7789a;
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
        this.f7804p = i6 / i7;
        this.f7805q = i8 / i5;
        return i7;
    }

    /* renamed from: e */
    private final void m7730e(short[] sArr, int i, int i2) {
        short[] c = mo6539c(this.f7796h, this.f7797i, i2);
        this.f7796h = c;
        int i3 = this.f7789a;
        System.arraycopy(sArr, i * i3, c, this.f7797i * i3, i3 * i2);
        this.f7797i += i2;
    }

    /* renamed from: f */
    private final void m7731f(short[] sArr, int i, int i2) {
        int i3 = this.f7793e / i2;
        int i4 = this.f7789a;
        int i5 = i2 * i4;
        int i6 = i * i4;
        for (int i7 = 0; i7 < i3; i7++) {
            int i8 = 0;
            for (int i9 = 0; i9 < i5; i9++) {
                i8 += sArr[(i7 * i5) + i6 + i9];
            }
            this.f7809u[i7] = (short) (i8 / i5);
        }
    }

    /* renamed from: g */
    private static void m7732g(int i, int i2, short[] sArr, int i3, short[] sArr2, int i4, short[] sArr3, int i5) {
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
    public final int mo6537a() {
        int i = this.f7797i * this.f7789a;
        return i + i;
    }

    /* renamed from: c */
    public final short[] mo6539c(short[] sArr, int i, int i2) {
        int length = sArr.length;
        int i3 = this.f7789a;
        int i4 = length / i3;
        if (i + i2 <= i4) {
            return sArr;
        }
        return Arrays.copyOf(sArr, (((i4 * 3) / 2) + i2) * i3);
    }

    /* renamed from: b */
    public final void mo6538b() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9 = this.f7797i;
        float f = this.f7790b;
        float f2 = this.f7791c;
        float f3 = f / f2;
        float f4 = this.f7792d * f2;
        double d = (double) f3;
        float f5 = 1.0f;
        int i10 = 1;
        if (d > 1.00001d || d < 0.99999d) {
            int i11 = this.f7795g;
            if (i11 >= this.f7793e) {
                int i12 = 0;
                while (true) {
                    int i13 = this.f7801m;
                    if (i13 > 0) {
                        int min = Math.min(this.f7793e, i13);
                        m7730e(this.f7794f, i12, min);
                        this.f7801m -= min;
                        i12 += min;
                    } else {
                        short[] sArr = this.f7794f;
                        int i14 = this.f7806r;
                        int i15 = i14 > 4000 ? i14 / 4000 : 1;
                        if (this.f7789a == i10 && i15 == i10) {
                            i5 = m7729d(sArr, i12, this.f7807s, this.f7808t);
                        } else {
                            m7731f(sArr, i12, i15);
                            int d2 = m7729d(this.f7809u, 0, this.f7807s / i15, this.f7808t / i15);
                            if (i15 != i10) {
                                int i16 = d2 * i15;
                                int i17 = i15 * 4;
                                int i18 = i16 - i17;
                                int i19 = i16 + i17;
                                int i20 = this.f7807s;
                                if (i18 < i20) {
                                    i18 = i20;
                                }
                                int i21 = this.f7808t;
                                if (i19 > i21) {
                                    i19 = i21;
                                }
                                if (this.f7789a == i10) {
                                    i5 = m7729d(sArr, i12, i18, i19);
                                } else {
                                    m7731f(sArr, i12, i10);
                                    i5 = m7729d(this.f7809u, 0, i18, i19);
                                }
                            } else {
                                i5 = d2;
                            }
                        }
                        int i22 = this.f7804p;
                        int i23 = (i22 == 0 || (i8 = this.f7802n) == 0 || this.f7805q > i22 * 3 || i22 + i22 <= this.f7803o * 3) ? i5 : i8;
                        this.f7803o = i22;
                        this.f7802n = i5;
                        if (d > 1.0d) {
                            short[] sArr2 = this.f7794f;
                            if (f3 >= 2.0f) {
                                i7 = (int) (((float) i23) / (-1.0f + f3));
                            } else {
                                this.f7801m = (int) ((((float) i23) * (2.0f - f3)) / (-1.0f + f3));
                                i7 = i23;
                            }
                            short[] c = mo6539c(this.f7796h, this.f7797i, i7);
                            this.f7796h = c;
                            int i24 = i7;
                            short[] sArr3 = sArr2;
                            m7732g(i7, this.f7789a, c, this.f7797i, sArr3, i12, sArr3, i12 + i23);
                            this.f7797i += i24;
                            i12 += i23 + i24;
                        } else {
                            int i25 = i23;
                            short[] sArr4 = this.f7794f;
                            if (f3 < 0.5f) {
                                i6 = (int) ((((float) i25) * f3) / (f5 - f3));
                            } else {
                                this.f7801m = (int) ((((float) i25) * ((f3 + f3) - 4.0f)) / (f5 - f3));
                                i6 = i25;
                            }
                            int i26 = i25 + i6;
                            short[] c2 = mo6539c(this.f7796h, this.f7797i, i26);
                            this.f7796h = c2;
                            int i27 = this.f7789a;
                            System.arraycopy(sArr4, i12 * i27, c2, this.f7797i * i27, i27 * i25);
                            m7732g(i6, this.f7789a, this.f7796h, this.f7797i + i25, sArr4, i12 + i25, sArr4, i12);
                            this.f7797i += i26;
                            i12 += i6;
                        }
                    }
                    if (this.f7793e + i12 > i11) {
                        break;
                    }
                    f5 = 1.0f;
                    i10 = 1;
                }
                int i28 = this.f7795g - i12;
                short[] sArr5 = this.f7794f;
                int i29 = this.f7789a;
                System.arraycopy(sArr5, i12 * i29, sArr5, 0, i29 * i28);
                this.f7795g = i28;
                f5 = 1.0f;
            }
        } else {
            m7730e(this.f7794f, 0, this.f7795g);
            this.f7795g = 0;
        }
        if (f4 != f5 && this.f7797i != i9) {
            int i30 = this.f7806r;
            int i31 = (int) (((float) i30) / f4);
            while (true) {
                if (i31 <= 16384 && i30 <= 16384) {
                    break;
                }
                i31 /= 2;
                i30 /= 2;
            }
            int i32 = this.f7797i - i9;
            short[] c3 = mo6539c(this.f7810v, this.f7798j, i32);
            this.f7810v = c3;
            short[] sArr6 = this.f7796h;
            int i33 = this.f7789a;
            System.arraycopy(sArr6, i9 * i33, c3, this.f7798j * i33, i33 * i32);
            this.f7797i = i9;
            this.f7798j += i32;
            int i34 = 0;
            while (true) {
                i = this.f7798j;
                i2 = i - 1;
                if (i34 >= i2) {
                    break;
                }
                while (true) {
                    i3 = this.f7799k + 1;
                    i4 = this.f7800l;
                    if (i3 * i31 <= i4 * i30) {
                        break;
                    }
                    this.f7796h = mo6539c(this.f7796h, this.f7797i, 1);
                    int i35 = 0;
                    while (true) {
                        int i36 = this.f7789a;
                        if (i35 >= i36) {
                            break;
                        }
                        short[] sArr7 = this.f7796h;
                        int i37 = this.f7797i;
                        short[] sArr8 = this.f7810v;
                        int i38 = (i34 * i36) + i35;
                        short s = sArr8[i38];
                        short s2 = sArr8[i38 + i36];
                        int i39 = this.f7800l;
                        int i40 = this.f7799k;
                        int i41 = (i40 + 1) * i31;
                        int i42 = i41 - (i39 * i30);
                        int i43 = i41 - (i40 * i31);
                        sArr7[(i37 * i36) + i35] = (short) (((s * i42) + ((i43 - i42) * s2)) / i43);
                        i35++;
                    }
                    this.f7800l++;
                    this.f7797i++;
                }
                this.f7799k = i3;
                if (i3 == i30) {
                    this.f7799k = 0;
                    C2601a.m6832d(i4 == i31);
                    this.f7800l = 0;
                }
                i34++;
            }
            if (i2 != 0) {
                short[] sArr9 = this.f7810v;
                int i44 = this.f7789a;
                System.arraycopy(sArr9, i2 * i44, sArr9, 0, (i - i2) * i44);
                this.f7798j -= i2;
            }
        }
    }
}
