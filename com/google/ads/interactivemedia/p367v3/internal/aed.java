package com.google.ads.interactivemedia.p367v3.internal;

import org.chromium.net.PrivateKeyType;

/* renamed from: com.google.ads.interactivemedia.v3.internal.aed */
/* compiled from: PG */
public final class aed {

    /* renamed from: a */
    public byte[] f20421a;

    /* renamed from: b */
    private int f20422b;

    /* renamed from: c */
    private int f20423c;

    /* renamed from: d */
    private int f20424d;

    public aed() {
        this.f20421a = aeu.f20471f;
    }

    /* renamed from: n */
    private final void m18368n() {
        int i;
        int i2 = this.f20422b;
        boolean z = false;
        if (i2 >= 0 && (i2 < (i = this.f20424d) || (i2 == i && this.f20423c == 0))) {
            z = true;
        }
        ary.m19464q(z);
    }

    /* renamed from: a */
    public final void mo14524a(byte[] bArr) {
        mo14525b(bArr, bArr.length);
    }

    /* renamed from: b */
    public final void mo14525b(byte[] bArr, int i) {
        this.f20421a = bArr;
        this.f20422b = 0;
        this.f20423c = 0;
        this.f20424d = i;
    }

    /* renamed from: c */
    public final int mo14526c() {
        return ((this.f20424d - this.f20422b) * 8) - this.f20423c;
    }

    /* renamed from: d */
    public final int mo14527d() {
        return (this.f20422b * 8) + this.f20423c;
    }

    /* renamed from: e */
    public final void mo14528e(int i) {
        int i2 = i / 8;
        this.f20422b = i2;
        this.f20423c = i - (i2 * 8);
        m18368n();
    }

    /* renamed from: f */
    public final void mo14529f() {
        int i = this.f20423c + 1;
        this.f20423c = i;
        if (i == 8) {
            this.f20423c = 0;
            this.f20422b++;
        }
        m18368n();
    }

    /* renamed from: g */
    public final void mo14530g(int i) {
        int i2 = i / 8;
        int i3 = this.f20422b + i2;
        this.f20422b = i3;
        int i4 = this.f20423c + (i - (i2 * 8));
        this.f20423c = i4;
        if (i4 > 7) {
            this.f20422b = i3 + 1;
            this.f20423c = i4 - 8;
        }
        m18368n();
    }

    /* renamed from: h */
    public final boolean mo14531h() {
        boolean z = (this.f20421a[this.f20422b] & (128 >> this.f20423c)) != 0;
        mo14529f();
        return z;
    }

    /* renamed from: i */
    public final int mo14532i(int i) {
        int i2;
        if (i == 0) {
            return 0;
        }
        this.f20423c += i;
        int i3 = 0;
        while (true) {
            i2 = this.f20423c;
            if (i2 <= 8) {
                break;
            }
            int i4 = i2 - 8;
            this.f20423c = i4;
            byte[] bArr = this.f20421a;
            int i5 = this.f20422b;
            this.f20422b = i5 + 1;
            i3 |= (bArr[i5] & 255) << i4;
        }
        byte[] bArr2 = this.f20421a;
        int i6 = this.f20422b;
        int i7 = (-1 >>> (32 - i)) & (i3 | ((bArr2[i6] & 255) >> (8 - i2)));
        if (i2 == 8) {
            this.f20423c = 0;
            this.f20422b = i6 + 1;
        }
        m18368n();
        return i7;
    }

    /* renamed from: j */
    public final void mo14533j() {
        if (this.f20423c != 0) {
            this.f20423c = 0;
            this.f20422b++;
            m18368n();
        }
    }

    /* renamed from: k */
    public final void mo14534k(int i) {
        ary.m19464q(this.f20423c == 0);
        this.f20422b += i;
        m18368n();
    }

    /* renamed from: l */
    public final void mo14535l(int i) {
        int i2 = i & 16383;
        int min = Math.min(8 - this.f20423c, 14);
        int i3 = this.f20423c;
        int i4 = (8 - i3) - min;
        byte[] bArr = this.f20421a;
        int i5 = this.f20422b;
        byte b = (byte) (((65280 >> i3) | ((1 << i4) - 1)) & bArr[i5]);
        bArr[i5] = b;
        int i6 = 14 - min;
        bArr[i5] = (byte) (b | ((i2 >>> i6) << i4));
        int i7 = i5 + 1;
        while (i6 > 8) {
            i6 -= 8;
            this.f20421a[i7] = (byte) (i2 >>> i6);
            i7++;
        }
        int i8 = 8 - i6;
        byte[] bArr2 = this.f20421a;
        byte b2 = (byte) (bArr2[i7] & ((1 << i8) - 1));
        bArr2[i7] = b2;
        bArr2[i7] = (byte) (((i2 & ((1 << i6) - 1)) << i8) | b2);
        mo14530g(14);
        m18368n();
    }

    /* renamed from: m */
    public final void mo14536m(byte[] bArr, int i) {
        int i2 = i >> 3;
        for (int i3 = 0; i3 < i2; i3++) {
            byte[] bArr2 = this.f20421a;
            int i4 = this.f20422b;
            int i5 = i4 + 1;
            this.f20422b = i5;
            byte b = bArr2[i4];
            int i6 = this.f20423c;
            byte b2 = (byte) (b << i6);
            bArr[i3] = b2;
            bArr[i3] = (byte) (((255 & bArr2[i5]) >> (8 - i6)) | b2);
        }
        int i7 = i & 7;
        if (i7 != 0) {
            byte b3 = (byte) (bArr[i2] & (PrivateKeyType.INVALID >> i7));
            bArr[i2] = b3;
            int i8 = this.f20423c;
            if (i8 + i7 > 8) {
                byte[] bArr3 = this.f20421a;
                int i9 = this.f20422b;
                this.f20422b = i9 + 1;
                b3 = (byte) (b3 | ((bArr3[i9] & 255) << i8));
                bArr[i2] = b3;
                i8 -= 8;
            }
            int i10 = i8 + i7;
            this.f20423c = i10;
            byte[] bArr4 = this.f20421a;
            int i11 = this.f20422b;
            bArr[i2] = (byte) (((byte) (((255 & bArr4[i11]) >> (8 - i10)) << (8 - i7))) | b3);
            if (i10 == 8) {
                this.f20423c = 0;
                this.f20422b = i11 + 1;
            }
            m18368n();
        }
    }

    public aed(byte[] bArr) {
        int length = bArr.length;
        this.f20421a = bArr;
        this.f20424d = length;
    }
}
