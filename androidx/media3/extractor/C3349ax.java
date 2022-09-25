package androidx.media3.extractor;

import androidx.media3.common.p136b.C2601a;

/* renamed from: androidx.media3.extractor.ax */
/* compiled from: PG */
public final class C3349ax {

    /* renamed from: a */
    private byte[] f10118a;

    /* renamed from: b */
    private int f10119b;

    /* renamed from: c */
    private int f10120c;

    /* renamed from: d */
    private int f10121d;

    public C3349ax(byte[] bArr, int i, int i2) {
        mo7339d(bArr, i, i2);
    }

    /* renamed from: j */
    private final void m9700j() {
        int i;
        int i2 = this.f10120c;
        boolean z = false;
        if (i2 >= 0 && (i2 < (i = this.f10119b) || (i2 == i && this.f10121d == 0))) {
            z = true;
        }
        C2601a.m6832d(z);
    }

    /* renamed from: k */
    private final boolean m9701k(int i) {
        if (i < 2 || i >= this.f10119b) {
            return false;
        }
        byte[] bArr = this.f10118a;
        return bArr[i] == 3 && bArr[i + -2] == 0 && bArr[i + -1] == 0;
    }

    /* renamed from: a */
    public final int mo7336a(int i) {
        int i2;
        int i3;
        this.f10121d += i;
        int i4 = 0;
        while (true) {
            i2 = this.f10121d;
            i3 = 2;
            if (i2 <= 8) {
                break;
            }
            int i5 = i2 - 8;
            this.f10121d = i5;
            byte[] bArr = this.f10118a;
            int i6 = this.f10120c;
            i4 |= (bArr[i6] & 255) << i5;
            if (true != m9701k(i6 + 1)) {
                i3 = 1;
            }
            this.f10120c = i6 + i3;
        }
        byte[] bArr2 = this.f10118a;
        int i7 = this.f10120c;
        int i8 = (-1 >>> (32 - i)) & (i4 | ((bArr2[i7] & 255) >> (8 - i2)));
        if (i2 == 8) {
            this.f10121d = 0;
            if (true != m9701k(i7 + 1)) {
                i3 = 1;
            }
            this.f10120c = i7 + i3;
        }
        m9700j();
        return i8;
    }

    /* renamed from: b */
    public final int mo7337b() {
        int i = 0;
        int i2 = 0;
        while (!mo7344i()) {
            i2++;
        }
        int i3 = (1 << i2) - 1;
        if (i2 > 0) {
            i = mo7336a(i2);
        }
        return i3 + i;
    }

    /* renamed from: c */
    public final int mo7338c() {
        int b = mo7337b();
        return (b % 2 == 0 ? -1 : 1) * ((b + 1) / 2);
    }

    /* renamed from: d */
    public final void mo7339d(byte[] bArr, int i, int i2) {
        this.f10118a = bArr;
        this.f10120c = i;
        this.f10119b = i2;
        this.f10121d = 0;
        m9700j();
    }

    /* renamed from: e */
    public final void mo7340e() {
        int i = 1;
        int i2 = this.f10121d + 1;
        this.f10121d = i2;
        if (i2 == 8) {
            this.f10121d = 0;
            int i3 = this.f10120c;
            if (true == m9701k(i3 + 1)) {
                i = 2;
            }
            this.f10120c = i3 + i;
        }
        m9700j();
    }

    /* renamed from: f */
    public final void mo7341f(int i) {
        int i2 = this.f10120c;
        int i3 = i / 8;
        int i4 = i2 + i3;
        this.f10120c = i4;
        int i5 = this.f10121d + (i - (i3 * 8));
        this.f10121d = i5;
        if (i5 > 7) {
            this.f10120c = i4 + 1;
            this.f10121d = i5 - 8;
        }
        while (true) {
            i2++;
            if (i2 > this.f10120c) {
                m9700j();
                return;
            } else if (m9701k(i2)) {
                this.f10120c++;
                i2 += 2;
            }
        }
    }

    /* renamed from: g */
    public final boolean mo7342g(int i) {
        int i2 = this.f10120c;
        int i3 = i / 8;
        int i4 = i2 + i3;
        int i5 = (this.f10121d + i) - (i3 * 8);
        if (i5 > 7) {
            i4++;
            i5 -= 8;
        }
        while (true) {
            i2++;
            if (i2 > i4 || i4 >= this.f10119b) {
                int i6 = this.f10119b;
            } else if (m9701k(i2)) {
                i4++;
                i2 += 2;
            }
        }
        int i62 = this.f10119b;
        if (i4 >= i62) {
            return i4 == i62 && i5 == 0;
        }
        return true;
    }

    /* renamed from: h */
    public final boolean mo7343h() {
        int i = this.f10120c;
        int i2 = this.f10121d;
        int i3 = 0;
        while (this.f10120c < this.f10119b && !mo7344i()) {
            i3++;
        }
        int i4 = this.f10120c;
        int i5 = this.f10119b;
        this.f10120c = i;
        this.f10121d = i2;
        return i4 != i5 && mo7342g((i3 + i3) + 1);
    }

    /* renamed from: i */
    public final boolean mo7344i() {
        boolean z = (this.f10118a[this.f10120c] & (128 >> this.f10121d)) != 0;
        mo7340e();
        return z;
    }
}
