package androidx.media3.common.p136b;

import com.evernote.android.state.BuildConfig;
import java.nio.charset.Charset;
import java.util.Arrays;

/* renamed from: androidx.media3.common.b.ac */
/* compiled from: PG */
public final class C2604ac {

    /* renamed from: a */
    public byte[] f7234a;

    /* renamed from: b */
    public int f7235b;

    /* renamed from: c */
    public int f7236c;

    public C2604ac() {
        this.f7234a = C2612ak.f7254f;
    }

    public C2604ac(byte[] bArr, int i) {
        this.f7234a = bArr;
        this.f7236c = i;
    }

    /* renamed from: A */
    public final void mo6131A(int i) {
        boolean z = false;
        if (i >= 0 && i <= this.f7236c) {
            z = true;
        }
        C2601a.m6830b(z);
        this.f7235b = i;
    }

    /* renamed from: B */
    public final String mo6132B() {
        int i = this.f7236c;
        int i2 = this.f7235b;
        if (i - i2 == 0) {
            return null;
        }
        while (i2 < this.f7236c && this.f7234a[i2] != 0) {
            i2++;
        }
        byte[] bArr = this.f7234a;
        int i3 = this.f7235b;
        String M = C2612ak.m6930M(bArr, i3, i2 - i3);
        this.f7235b = i2;
        if (i2 < this.f7236c) {
            this.f7235b = i2 + 1;
        }
        return M;
    }

    /* renamed from: a */
    public final int mo6133a() {
        return this.f7234a[this.f7235b] & 255;
    }

    /* renamed from: b */
    public final int mo6134b() {
        byte[] bArr = this.f7234a;
        int i = this.f7235b;
        int i2 = i + 1;
        byte b = bArr[i];
        int i3 = i2 + 1;
        byte b2 = bArr[i2];
        int i4 = i3 + 1;
        byte b3 = bArr[i3];
        this.f7235b = i4 + 1;
        return (bArr[i4] & 255) | ((b & 255) << 24) | ((b2 & 255) << 16) | ((b3 & 255) << 8);
    }

    /* renamed from: c */
    public final int mo6135c() {
        byte[] bArr = this.f7234a;
        int i = this.f7235b;
        int i2 = i + 1;
        byte b = bArr[i];
        int i3 = i2 + 1;
        byte b2 = bArr[i2];
        int i4 = i3 + 1;
        byte b3 = bArr[i3];
        this.f7235b = i4 + 1;
        return ((bArr[i4] & 255) << 24) | (b & 255) | ((b2 & 255) << 8) | ((b3 & 255) << 16);
    }

    /* renamed from: d */
    public final int mo6136d() {
        int c = mo6135c();
        if (c >= 0) {
            return c;
        }
        throw new IllegalStateException("Top bit not zero: " + c);
    }

    /* renamed from: e */
    public final int mo6137e() {
        byte[] bArr = this.f7234a;
        int i = this.f7235b;
        int i2 = i + 1;
        byte b = bArr[i];
        this.f7235b = i2 + 1;
        return ((bArr[i2] & 255) << 8) | (b & 255);
    }

    /* renamed from: f */
    public final int mo6138f() {
        return (mo6139g() << 21) | (mo6139g() << 14) | (mo6139g() << 7) | mo6139g();
    }

    /* renamed from: g */
    public final int mo6139g() {
        byte[] bArr = this.f7234a;
        int i = this.f7235b;
        this.f7235b = i + 1;
        return bArr[i] & 255;
    }

    /* renamed from: h */
    public final int mo6140h() {
        byte[] bArr = this.f7234a;
        int i = this.f7235b;
        int i2 = i + 1;
        byte b = bArr[i];
        int i3 = i2 + 1;
        byte b2 = bArr[i2];
        this.f7235b = i3 + 1;
        return (bArr[i3] & 255) | ((b & 255) << 16) | ((b2 & 255) << 8);
    }

    /* renamed from: i */
    public final int mo6141i() {
        int b = mo6134b();
        if (b >= 0) {
            return b;
        }
        throw new IllegalStateException("Top bit not zero: " + b);
    }

    /* renamed from: j */
    public final int mo6142j() {
        byte[] bArr = this.f7234a;
        int i = this.f7235b;
        int i2 = i + 1;
        byte b = bArr[i];
        this.f7235b = i2 + 1;
        return (bArr[i2] & 255) | ((b & 255) << 8);
    }

    /* renamed from: k */
    public final long mo6143k() {
        byte[] bArr = this.f7234a;
        int i = this.f7235b;
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
        this.f7235b = i8 + 1;
        return ((((long) b2) & 255) << 8) | (((long) b) & 255) | ((((long) b3) & 255) << 16) | ((((long) b4) & 255) << 24) | ((((long) b5) & 255) << 32) | ((((long) b6) & 255) << 40) | ((((long) b7) & 255) << 48) | ((((long) bArr[i8]) & 255) << 56);
    }

    /* renamed from: l */
    public final long mo6144l() {
        byte[] bArr = this.f7234a;
        int i = this.f7235b;
        int i2 = i + 1;
        byte b = bArr[i];
        int i3 = i2 + 1;
        byte b2 = bArr[i2];
        int i4 = i3 + 1;
        byte b3 = bArr[i3];
        this.f7235b = i4 + 1;
        return ((((long) b2) & 255) << 8) | (((long) b) & 255) | ((((long) b3) & 255) << 16) | ((((long) bArr[i4]) & 255) << 24);
    }

    /* renamed from: m */
    public final long mo6145m() {
        byte[] bArr = this.f7234a;
        int i = this.f7235b;
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
        this.f7235b = i8 + 1;
        return ((((long) b2) & 255) << 48) | ((((long) b) & 255) << 56) | ((((long) b3) & 255) << 40) | ((((long) b4) & 255) << 32) | ((((long) b5) & 255) << 24) | ((((long) b6) & 255) << 16) | ((((long) b7) & 255) << 8) | (((long) bArr[i8]) & 255);
    }

    /* renamed from: n */
    public final long mo6146n() {
        byte[] bArr = this.f7234a;
        int i = this.f7235b;
        int i2 = i + 1;
        byte b = bArr[i];
        int i3 = i2 + 1;
        byte b2 = bArr[i2];
        int i4 = i3 + 1;
        byte b3 = bArr[i3];
        this.f7235b = i4 + 1;
        return ((((long) b2) & 255) << 16) | ((((long) b) & 255) << 24) | ((((long) b3) & 255) << 8) | (((long) bArr[i4]) & 255);
    }

    /* renamed from: o */
    public final long mo6147o() {
        long m = mo6145m();
        if (m >= 0) {
            return m;
        }
        throw new IllegalStateException("Top bit not zero: " + m);
    }

    /* renamed from: p */
    public final long mo6148p() {
        int i;
        int i2;
        long j = (long) this.f7234a[this.f7235b];
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
                byte b = this.f7234a[this.f7235b + i2];
                if ((b & 192) == 128) {
                    j = (j << 6) | ((long) (b & 63));
                    i2++;
                } else {
                    throw new NumberFormatException("Invalid UTF-8 sequence continuation byte: " + j);
                }
            }
            this.f7235b += i;
            return j;
        }
        throw new NumberFormatException("Invalid UTF-8 sequence first byte: " + j);
    }

    /* renamed from: q */
    public final String mo6149q() {
        int i = this.f7236c;
        int i2 = this.f7235b;
        if (i - i2 == 0) {
            return null;
        }
        while (i2 < this.f7236c && !C2612ak.m6957ag(this.f7234a[i2])) {
            i2++;
        }
        int i3 = this.f7235b;
        if (i2 - i3 >= 3) {
            byte[] bArr = this.f7234a;
            if (bArr[i3] == -17 && bArr[i3 + 1] == -69 && bArr[i3 + 2] == -65) {
                i3 += 3;
                this.f7235b = i3;
            }
        }
        String M = C2612ak.m6930M(this.f7234a, i3, i2 - i3);
        this.f7235b = i2;
        int i4 = this.f7236c;
        if (i2 == i4) {
            return M;
        }
        byte[] bArr2 = this.f7234a;
        if (bArr2[i2] == 13) {
            i2++;
            this.f7235b = i2;
            if (i2 == i4) {
                return M;
            }
        }
        if (bArr2[i2] == 10) {
            this.f7235b = i2 + 1;
        }
        return M;
    }

    /* renamed from: r */
    public final String mo6150r(int i) {
        if (i == 0) {
            return BuildConfig.FLAVOR;
        }
        int i2 = this.f7235b;
        int i3 = (i2 + i) - 1;
        String M = C2612ak.m6930M(this.f7234a, i2, (i3 >= this.f7236c || this.f7234a[i3] != 0) ? i : i - 1);
        this.f7235b += i;
        return M;
    }

    /* renamed from: s */
    public final String mo6151s(int i, Charset charset) {
        byte[] bArr = this.f7234a;
        int i2 = this.f7235b;
        String str = new String(bArr, i2, i, charset);
        this.f7235b = i2 + i;
        return str;
    }

    /* renamed from: t */
    public final short mo6152t() {
        byte[] bArr = this.f7234a;
        int i = this.f7235b;
        int i2 = i + 1;
        byte b = bArr[i];
        this.f7235b = i2 + 1;
        return (short) ((bArr[i2] & 255) | ((b & 255) << 8));
    }

    /* renamed from: u */
    public final void mo6153u(int i) {
        byte[] bArr = this.f7234a;
        if (i > bArr.length) {
            this.f7234a = Arrays.copyOf(bArr, i);
        }
    }

    /* renamed from: v */
    public final void mo6154v(C2603ab abVar, int i) {
        mo6155w(abVar.f7230a, 0, i);
        abVar.mo6124i(0);
    }

    /* renamed from: w */
    public final void mo6155w(byte[] bArr, int i, int i2) {
        System.arraycopy(this.f7234a, this.f7235b, bArr, i, i2);
        this.f7235b += i2;
    }

    /* renamed from: x */
    public final void mo6156x(int i) {
        byte[] bArr = this.f7234a;
        if (bArr.length < i) {
            bArr = new byte[i];
        }
        mo6157y(bArr, i);
    }

    /* renamed from: y */
    public final void mo6157y(byte[] bArr, int i) {
        this.f7234a = bArr;
        this.f7236c = i;
        this.f7235b = 0;
    }

    /* renamed from: z */
    public final void mo6158z(int i) {
        boolean z = false;
        if (i >= 0 && i <= this.f7234a.length) {
            z = true;
        }
        C2601a.m6830b(z);
        this.f7236c = i;
    }

    public C2604ac(int i) {
        this.f7234a = new byte[i];
        this.f7236c = i;
    }

    public C2604ac(byte[] bArr) {
        this.f7234a = bArr;
        this.f7236c = bArr.length;
    }
}
