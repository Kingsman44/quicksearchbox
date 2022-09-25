package com.facebook.litho;

import com.facebook.yoga.C6569e;
import com.facebook.yoga.C6571g;
import java.util.Arrays;

/* renamed from: com.facebook.litho.bt */
/* compiled from: PG */
public final class C6139bt implements C6142bw {

    /* renamed from: a */
    public static final int f18162a = 9;

    /* renamed from: b */
    private static final int f18163b = 8;

    /* renamed from: c */
    private static final int f18164c = 6;

    /* renamed from: d */
    private static final int f18165d = 7;

    /* renamed from: e */
    private long f18166e = -1;

    /* renamed from: f */
    private float[] f18167f;

    /* renamed from: g */
    private boolean f18168g;

    static {
        C6571g.m17940c();
    }

    /* renamed from: f */
    private final byte m16192f(int i) {
        return (byte) ((int) ((this.f18166e >> (i * 4)) & 15));
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ boolean mo13057a(Object obj) {
        C6139bt btVar = (C6139bt) obj;
        if (this == btVar) {
            return true;
        }
        return btVar != null && this.f18166e == btVar.f18166e && this.f18168g == btVar.f18168g && Arrays.equals(this.f18167f, btVar.f18167f);
    }

    /* renamed from: b */
    public final float mo13119b(int i) {
        byte f = m16192f(i);
        if (f == 15) {
            return Float.NaN;
        }
        return this.f18167f[f];
    }

    /* renamed from: c */
    public final float mo13120c(int i) {
        if (this.f18166e != -1) {
            byte f = m16192f(i - 1);
            if (f != 15) {
                return this.f18167f[f];
            }
            if (this.f18168g) {
                int i2 = 7;
                if (!(i == 2 || i == 4)) {
                    i2 = 6;
                }
                byte f2 = m16192f(i2);
                if (f2 != 15) {
                    return this.f18167f[f2];
                }
                if (m16192f(8) != 15) {
                    return this.f18167f[m16192f(8)];
                }
            }
        }
        return 0.0f;
    }

    /* renamed from: d */
    public final float mo13121d(int i) {
        byte f = m16192f(i - 1);
        if (f == 15) {
            return Float.NaN;
        }
        return this.f18167f[f];
    }

    /* renamed from: e */
    public final void mo13122e(int i, float f) {
        byte b;
        int i2 = i - 1;
        float b2 = mo13119b(i2);
        if (Float.isNaN(b2) || Float.isNaN(f)) {
            if (Float.isNaN(b2) && Float.isNaN(f)) {
                return;
            }
        } else if (Math.abs(f - b2) < 1.0E-5f) {
            return;
        }
        byte f2 = m16192f(i2);
        boolean z = false;
        if (C6569e.m17936a(f)) {
            this.f18166e = (15 << (i2 * 4)) | this.f18166e;
            this.f18167f[f2] = Float.NaN;
        } else if (f2 == 15) {
            if (this.f18167f != null) {
                int i3 = 0;
                while (true) {
                    float[] fArr = this.f18167f;
                    int length = fArr.length;
                    if (i3 >= length) {
                        float[] fArr2 = new float[Math.min(length + length, 9)];
                        this.f18167f = fArr2;
                        System.arraycopy(fArr, 0, fArr2, 0, length);
                        float[] fArr3 = this.f18167f;
                        Arrays.fill(fArr3, length, fArr3.length, Float.NaN);
                        b = (byte) length;
                        break;
                    } else if (C6569e.m17936a(fArr[i3])) {
                        b = (byte) i3;
                        break;
                    } else {
                        i3++;
                    }
                }
            } else {
                this.f18167f = new float[]{Float.NaN, Float.NaN};
                b = 0;
            }
            if (b < 9) {
                int i4 = i2 * 4;
                this.f18166e = (this.f18166e & ((15 << i4) ^ -1)) | (((long) b) << i4);
                this.f18167f[b] = f;
            } else {
                throw new IllegalStateException("The newIndex for the array cannot be bigger than the amount of Yoga Edges.");
            }
        } else {
            this.f18167f[f2] = f;
        }
        if (((((int) (this.f18166e >> 24)) ^ -1) & 4095) != 0) {
            z = true;
        }
        this.f18168g = z;
    }
}
