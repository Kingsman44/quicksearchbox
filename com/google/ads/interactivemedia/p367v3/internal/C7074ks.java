package com.google.ads.interactivemedia.p367v3.internal;

import org.chromium.net.PrivateKeyType;

/* renamed from: com.google.ads.interactivemedia.v3.internal.ks */
/* compiled from: PG */
public final class C7074ks {

    /* renamed from: a */
    private final byte[] f22636a;

    /* renamed from: b */
    private final int f22637b;

    /* renamed from: c */
    private int f22638c;

    /* renamed from: d */
    private int f22639d;

    public C7074ks(byte[] bArr) {
        this.f22636a = bArr;
        this.f22637b = bArr.length;
    }

    /* renamed from: a */
    public final boolean mo16136a() {
        byte b = this.f22636a[this.f22638c];
        int i = this.f22639d;
        mo16138c(1);
        if ((((b & 255) >> i) & 1) != 1) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public final int mo16137b(int i) {
        int i2 = this.f22638c;
        int min = Math.min(i, 8 - this.f22639d);
        int i3 = i2 + 1;
        int i4 = ((this.f22636a[i2] & 255) >> this.f22639d) & (PrivateKeyType.INVALID >> (8 - min));
        while (min < i) {
            i4 |= (this.f22636a[i3] & 255) << min;
            min += 8;
            i3++;
        }
        mo16138c(i);
        return (-1 >>> (32 - i)) & i4;
    }

    /* renamed from: c */
    public final void mo16138c(int i) {
        int i2;
        int i3 = i / 8;
        int i4 = this.f22638c + i3;
        this.f22638c = i4;
        int i5 = this.f22639d + (i - (i3 * 8));
        this.f22639d = i5;
        if (i5 > 7) {
            i4++;
            this.f22638c = i4;
            i5 -= 8;
            this.f22639d = i5;
        }
        boolean z = false;
        if (i4 >= 0 && (i4 < (i2 = this.f22637b) || (i4 == i2 && i5 == 0))) {
            z = true;
        }
        ary.m19464q(z);
    }

    /* renamed from: d */
    public final int mo16139d() {
        return (this.f22638c * 8) + this.f22639d;
    }
}
