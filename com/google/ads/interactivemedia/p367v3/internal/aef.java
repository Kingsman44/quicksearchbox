package com.google.ads.interactivemedia.p367v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.aef */
/* compiled from: PG */
public final class aef {

    /* renamed from: a */
    private byte[] f20428a;

    /* renamed from: b */
    private int f20429b;

    /* renamed from: c */
    private int f20430c;

    /* renamed from: d */
    private int f20431d;

    public aef(byte[] bArr, int i, int i2) {
        mo14573a(bArr, i, i2);
    }

    /* renamed from: j */
    private final int m18418j() {
        int i = 0;
        int i2 = 0;
        while (!mo14577e()) {
            i2++;
        }
        int i3 = (1 << i2) - 1;
        if (i2 > 0) {
            i = mo14578f(i2);
        }
        return i3 + i;
    }

    /* renamed from: k */
    private final boolean m18419k(int i) {
        if (i < 2 || i >= this.f20429b) {
            return false;
        }
        byte[] bArr = this.f20428a;
        return bArr[i] == 3 && bArr[i + -2] == 0 && bArr[i + -1] == 0;
    }

    /* renamed from: l */
    private final void m18420l() {
        int i;
        int i2 = this.f20430c;
        boolean z = false;
        if (i2 >= 0 && (i2 < (i = this.f20429b) || (i2 == i && this.f20431d == 0))) {
            z = true;
        }
        ary.m19464q(z);
    }

    /* renamed from: a */
    public final void mo14573a(byte[] bArr, int i, int i2) {
        this.f20428a = bArr;
        this.f20430c = i;
        this.f20429b = i2;
        this.f20431d = 0;
        m18420l();
    }

    /* renamed from: b */
    public final void mo14574b() {
        int i = 1;
        int i2 = this.f20431d + 1;
        this.f20431d = i2;
        if (i2 == 8) {
            this.f20431d = 0;
            int i3 = this.f20430c;
            if (true == m18419k(i3 + 1)) {
                i = 2;
            }
            this.f20430c = i3 + i;
        }
        m18420l();
    }

    /* renamed from: c */
    public final void mo14575c(int i) {
        int i2 = this.f20430c;
        int i3 = i / 8;
        int i4 = i2 + i3;
        this.f20430c = i4;
        int i5 = this.f20431d + (i - (i3 * 8));
        this.f20431d = i5;
        if (i5 > 7) {
            this.f20430c = i4 + 1;
            this.f20431d = i5 - 8;
        }
        while (true) {
            i2++;
            if (i2 > this.f20430c) {
                m18420l();
                return;
            } else if (m18419k(i2)) {
                this.f20430c++;
                i2 += 2;
            }
        }
    }

    /* renamed from: d */
    public final boolean mo14576d(int i) {
        int i2 = this.f20430c;
        int i3 = i / 8;
        int i4 = i2 + i3;
        int i5 = (this.f20431d + i) - (i3 * 8);
        if (i5 > 7) {
            i4++;
            i5 -= 8;
        }
        while (true) {
            i2++;
            if (i2 > i4 || i4 >= this.f20429b) {
                int i6 = this.f20429b;
            } else if (m18419k(i2)) {
                i4++;
                i2 += 2;
            }
        }
        int i62 = this.f20429b;
        if (i4 >= i62) {
            return i4 == i62 && i5 == 0;
        }
        return true;
    }

    /* renamed from: e */
    public final boolean mo14577e() {
        boolean z = (this.f20428a[this.f20430c] & (128 >> this.f20431d)) != 0;
        mo14574b();
        return z;
    }

    /* renamed from: f */
    public final int mo14578f(int i) {
        int i2;
        int i3;
        this.f20431d += i;
        int i4 = 0;
        while (true) {
            i2 = this.f20431d;
            i3 = 2;
            if (i2 <= 8) {
                break;
            }
            int i5 = i2 - 8;
            this.f20431d = i5;
            byte[] bArr = this.f20428a;
            int i6 = this.f20430c;
            i4 |= (bArr[i6] & 255) << i5;
            if (true != m18419k(i6 + 1)) {
                i3 = 1;
            }
            this.f20430c = i6 + i3;
        }
        byte[] bArr2 = this.f20428a;
        int i7 = this.f20430c;
        int i8 = (-1 >>> (32 - i)) & (i4 | ((bArr2[i7] & 255) >> (8 - i2)));
        if (i2 == 8) {
            this.f20431d = 0;
            if (true != m18419k(i7 + 1)) {
                i3 = 1;
            }
            this.f20430c = i7 + i3;
        }
        m18420l();
        return i8;
    }

    /* renamed from: g */
    public final boolean mo14579g() {
        int i = this.f20430c;
        int i2 = this.f20431d;
        int i3 = 0;
        while (this.f20430c < this.f20429b && !mo14577e()) {
            i3++;
        }
        int i4 = this.f20430c;
        int i5 = this.f20429b;
        this.f20430c = i;
        this.f20431d = i2;
        return i4 != i5 && mo14576d((i3 + i3) + 1);
    }

    /* renamed from: h */
    public final int mo14580h() {
        return m18418j();
    }

    /* renamed from: i */
    public final int mo14581i() {
        int j = m18418j();
        return (j % 2 == 0 ? -1 : 1) * ((j + 1) / 2);
    }
}
