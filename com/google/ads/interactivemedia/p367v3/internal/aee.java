package com.google.ads.interactivemedia.p367v3.internal;

import com.evernote.android.state.BuildConfig;
import java.nio.charset.Charset;

/* renamed from: com.google.ads.interactivemedia.v3.internal.aee */
/* compiled from: PG */
public final class aee {

    /* renamed from: a */
    private byte[] f20425a;

    /* renamed from: b */
    private int f20426b;

    /* renamed from: c */
    private int f20427c;

    public aee() {
        this.f20425a = aeu.f20471f;
    }

    public aee(byte[] bArr, int i) {
        this.f20425a = bArr;
        this.f20427c = i;
    }

    /* renamed from: A */
    public final int mo14537A() {
        return (mo14560n() << 21) | (mo14560n() << 14) | (mo14560n() << 7) | mo14560n();
    }

    /* renamed from: B */
    public final int mo14538B() {
        int v = mo14568v();
        if (v >= 0) {
            return v;
        }
        StringBuilder sb = new StringBuilder(29);
        sb.append("Top bit not zero: ");
        sb.append(v);
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: C */
    public final int mo14539C() {
        int w = mo14569w();
        if (w >= 0) {
            return w;
        }
        StringBuilder sb = new StringBuilder(29);
        sb.append("Top bit not zero: ");
        sb.append(w);
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: D */
    public final long mo14540D() {
        long x = mo14570x();
        if (x >= 0) {
            return x;
        }
        StringBuilder sb = new StringBuilder(38);
        sb.append("Top bit not zero: ");
        sb.append(x);
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: E */
    public final String mo14541E(int i) {
        return mo14542F(i, apv.f21364b);
    }

    /* renamed from: F */
    public final String mo14542F(int i, Charset charset) {
        byte[] bArr = this.f20425a;
        int i2 = this.f20426b;
        String str = new String(bArr, i2, i, charset);
        this.f20426b = i2 + i;
        return str;
    }

    /* renamed from: G */
    public final String mo14543G(int i) {
        if (i == 0) {
            return BuildConfig.FLAVOR;
        }
        int i2 = this.f20426b;
        int i3 = (i2 + i) - 1;
        String x = aeu.m18554x(this.f20425a, i2, (i3 >= this.f20427c || this.f20425a[i3] != 0) ? i : i - 1);
        this.f20426b += i;
        return x;
    }

    /* renamed from: H */
    public final String mo14544H() {
        if (mo14550d() == 0) {
            return null;
        }
        int i = this.f20426b;
        while (i < this.f20427c && this.f20425a[i] != 0) {
            i++;
        }
        byte[] bArr = this.f20425a;
        int i2 = this.f20426b;
        String x = aeu.m18554x(bArr, i2, i - i2);
        this.f20426b = i;
        if (i < this.f20427c) {
            this.f20426b = i + 1;
        }
        return x;
    }

    /* renamed from: I */
    public final String mo14545I() {
        if (mo14550d() == 0) {
            return null;
        }
        int i = this.f20426b;
        while (i < this.f20427c && !aeu.m18484B(this.f20425a[i])) {
            i++;
        }
        int i2 = this.f20426b;
        if (i - i2 >= 3) {
            byte[] bArr = this.f20425a;
            if (bArr[i2] == -17 && bArr[i2 + 1] == -69 && bArr[i2 + 2] == -65) {
                i2 += 3;
                this.f20426b = i2;
            }
        }
        String x = aeu.m18554x(this.f20425a, i2, i - i2);
        this.f20426b = i;
        int i3 = this.f20427c;
        if (i == i3) {
            return x;
        }
        byte[] bArr2 = this.f20425a;
        if (bArr2[i] == 13) {
            i++;
            this.f20426b = i;
            if (i == i3) {
                return x;
            }
        }
        if (bArr2[i] == 10) {
            this.f20426b = i + 1;
        }
        return x;
    }

    /* renamed from: J */
    public final long mo14546J() {
        int i;
        int i2;
        long j = (long) this.f20425a[this.f20426b];
        int i3 = 7;
        while (true) {
            i = 0;
            i2 = 1;
            if (i3 < 0) {
                break;
            }
            int i4 = 1 << i3;
            if ((((long) i4) & j) != 0) {
                i3--;
            } else if (i3 < 6) {
                j &= (long) (i4 - 1);
                i = 7 - i3;
            } else if (i3 == 7) {
                i = 1;
            }
        }
        if (i != 0) {
            while (i2 < i) {
                byte b = this.f20425a[this.f20426b + i2];
                if ((b & 192) == 128) {
                    j = (j << 6) | ((long) (b & 63));
                    i2++;
                } else {
                    StringBuilder sb = new StringBuilder(62);
                    sb.append("Invalid UTF-8 sequence continuation byte: ");
                    sb.append(j);
                    throw new NumberFormatException(sb.toString());
                }
            }
            this.f20426b += i;
            return j;
        }
        StringBuilder sb2 = new StringBuilder(55);
        sb2.append("Invalid UTF-8 sequence first byte: ");
        sb2.append(j);
        throw new NumberFormatException(sb2.toString());
    }

    /* renamed from: a */
    public final void mo14547a(int i) {
        mo14549c(mo14556j() < i ? new byte[i] : this.f20425a, i);
    }

    /* renamed from: b */
    public final void mo14548b(byte[] bArr) {
        mo14549c(bArr, bArr.length);
    }

    /* renamed from: c */
    public final void mo14549c(byte[] bArr, int i) {
        this.f20425a = bArr;
        this.f20427c = i;
        this.f20426b = 0;
    }

    /* renamed from: d */
    public final int mo14550d() {
        return this.f20427c - this.f20426b;
    }

    /* renamed from: e */
    public final int mo14551e() {
        return this.f20427c;
    }

    /* renamed from: f */
    public final void mo14552f(int i) {
        boolean z = false;
        if (i >= 0 && i <= this.f20425a.length) {
            z = true;
        }
        ary.m19462o(z);
        this.f20427c = i;
    }

    /* renamed from: g */
    public final int mo14553g() {
        return this.f20426b;
    }

    /* renamed from: h */
    public final void mo14554h(int i) {
        boolean z = false;
        if (i >= 0 && i <= this.f20427c) {
            z = true;
        }
        ary.m19462o(z);
        this.f20426b = i;
    }

    /* renamed from: i */
    public final byte[] mo14555i() {
        return this.f20425a;
    }

    /* renamed from: j */
    public final int mo14556j() {
        return this.f20425a.length;
    }

    /* renamed from: k */
    public final void mo14557k(int i) {
        mo14554h(this.f20426b + i);
    }

    /* renamed from: l */
    public final void mo14558l(aed aed, int i) {
        mo14559m(aed.f20421a, 0, i);
        aed.mo14528e(0);
    }

    /* renamed from: m */
    public final void mo14559m(byte[] bArr, int i, int i2) {
        System.arraycopy(this.f20425a, this.f20426b, bArr, i, i2);
        this.f20426b += i2;
    }

    /* renamed from: n */
    public final int mo14560n() {
        byte[] bArr = this.f20425a;
        int i = this.f20426b;
        this.f20426b = i + 1;
        return bArr[i] & 255;
    }

    /* renamed from: o */
    public final int mo14561o() {
        byte[] bArr = this.f20425a;
        int i = this.f20426b;
        int i2 = i + 1;
        byte b = bArr[i];
        this.f20426b = i2 + 1;
        return (bArr[i2] & 255) | ((b & 255) << 8);
    }

    /* renamed from: p */
    public final int mo14562p() {
        byte[] bArr = this.f20425a;
        int i = this.f20426b;
        int i2 = i + 1;
        byte b = bArr[i];
        this.f20426b = i2 + 1;
        return ((bArr[i2] & 255) << 8) | (b & 255);
    }

    /* renamed from: q */
    public final short mo14563q() {
        byte[] bArr = this.f20425a;
        int i = this.f20426b;
        int i2 = i + 1;
        byte b = bArr[i];
        this.f20426b = i2 + 1;
        return (short) ((bArr[i2] & 255) | ((b & 255) << 8));
    }

    /* renamed from: r */
    public final int mo14564r() {
        byte[] bArr = this.f20425a;
        int i = this.f20426b;
        int i2 = i + 1;
        byte b = bArr[i];
        int i3 = i2 + 1;
        byte b2 = bArr[i2];
        this.f20426b = i3 + 1;
        return (bArr[i3] & 255) | ((b & 255) << 16) | ((b2 & 255) << 8);
    }

    /* renamed from: s */
    public final int mo14565s() {
        byte[] bArr = this.f20425a;
        int i = this.f20426b;
        int i2 = i + 1;
        byte b = bArr[i];
        int i3 = i2 + 1;
        byte b2 = bArr[i2];
        this.f20426b = i3 + 1;
        return (bArr[i3] & 255) | (((b & 255) << 24) >> 8) | ((b2 & 255) << 8);
    }

    /* renamed from: t */
    public final long mo14566t() {
        byte[] bArr = this.f20425a;
        int i = this.f20426b;
        int i2 = i + 1;
        byte b = bArr[i];
        int i3 = i2 + 1;
        byte b2 = bArr[i2];
        int i4 = i3 + 1;
        byte b3 = bArr[i3];
        this.f20426b = i4 + 1;
        return ((((long) b2) & 255) << 16) | ((((long) b) & 255) << 24) | ((((long) b3) & 255) << 8) | (((long) bArr[i4]) & 255);
    }

    /* renamed from: u */
    public final long mo14567u() {
        byte[] bArr = this.f20425a;
        int i = this.f20426b;
        int i2 = i + 1;
        byte b = bArr[i];
        int i3 = i2 + 1;
        byte b2 = bArr[i2];
        int i4 = i3 + 1;
        byte b3 = bArr[i3];
        this.f20426b = i4 + 1;
        return ((((long) b2) & 255) << 8) | (((long) b) & 255) | ((((long) b3) & 255) << 16) | ((((long) bArr[i4]) & 255) << 24);
    }

    /* renamed from: v */
    public final int mo14568v() {
        byte[] bArr = this.f20425a;
        int i = this.f20426b;
        int i2 = i + 1;
        byte b = bArr[i];
        int i3 = i2 + 1;
        byte b2 = bArr[i2];
        int i4 = i3 + 1;
        byte b3 = bArr[i3];
        this.f20426b = i4 + 1;
        return (bArr[i4] & 255) | ((b & 255) << 24) | ((b2 & 255) << 16) | ((b3 & 255) << 8);
    }

    /* renamed from: w */
    public final int mo14569w() {
        byte[] bArr = this.f20425a;
        int i = this.f20426b;
        int i2 = i + 1;
        byte b = bArr[i];
        int i3 = i2 + 1;
        byte b2 = bArr[i2];
        int i4 = i3 + 1;
        byte b3 = bArr[i3];
        this.f20426b = i4 + 1;
        return ((bArr[i4] & 255) << 24) | (b & 255) | ((b2 & 255) << 8) | ((b3 & 255) << 16);
    }

    /* renamed from: x */
    public final long mo14570x() {
        byte[] bArr = this.f20425a;
        int i = this.f20426b;
        int i2 = i + 1;
        byte b = bArr[i];
        int i3 = i2 + 1;
        byte b2 = bArr[i2];
        int i4 = i3 + 1;
        byte b3 = bArr[i3];
        int i5 = i4 + 1;
        byte b4 = bArr[i4];
        int i6 = i5 + 1;
        byte b5 = bArr[i5];
        int i7 = i6 + 1;
        byte b6 = bArr[i6];
        int i8 = i7 + 1;
        byte b7 = bArr[i7];
        this.f20426b = i8 + 1;
        return ((((long) b2) & 255) << 48) | ((((long) b) & 255) << 56) | ((((long) b3) & 255) << 40) | ((((long) b4) & 255) << 32) | ((((long) b5) & 255) << 24) | ((((long) b6) & 255) << 16) | ((((long) b7) & 255) << 8) | (((long) bArr[i8]) & 255);
    }

    /* renamed from: y */
    public final long mo14571y() {
        byte[] bArr = this.f20425a;
        int i = this.f20426b;
        int i2 = i + 1;
        byte b = bArr[i];
        int i3 = i2 + 1;
        byte b2 = bArr[i2];
        int i4 = i3 + 1;
        byte b3 = bArr[i3];
        int i5 = i4 + 1;
        byte b4 = bArr[i4];
        int i6 = i5 + 1;
        byte b5 = bArr[i5];
        int i7 = i6 + 1;
        byte b6 = bArr[i6];
        int i8 = i7 + 1;
        byte b7 = bArr[i7];
        this.f20426b = i8 + 1;
        return ((((long) b2) & 255) << 8) | (((long) b) & 255) | ((((long) b3) & 255) << 16) | ((((long) b4) & 255) << 24) | ((((long) b5) & 255) << 32) | ((((long) b6) & 255) << 40) | ((((long) b7) & 255) << 48) | ((((long) bArr[i8]) & 255) << 56);
    }

    /* renamed from: z */
    public final int mo14572z() {
        byte[] bArr = this.f20425a;
        int i = this.f20426b;
        int i2 = i + 1;
        byte b = bArr[i];
        byte b2 = bArr[i2];
        this.f20426b = i2 + 1 + 2;
        return (b2 & 255) | ((b & 255) << 8);
    }

    public aee(int i) {
        this.f20425a = new byte[i];
        this.f20427c = i;
    }

    public aee(byte[] bArr) {
        this.f20425a = bArr;
        this.f20427c = bArr.length;
    }
}
