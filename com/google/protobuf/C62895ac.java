package com.google.protobuf;

import com.evernote.android.state.BuildConfig;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.google.protobuf.ac */
/* compiled from: PG */
final class C62895ac extends C62897ae {

    /* renamed from: a */
    private final InputStream f169810a;

    /* renamed from: b */
    private final byte[] f169811b;

    /* renamed from: h */
    private int f169812h;

    /* renamed from: i */
    private int f169813i;

    /* renamed from: j */
    private int f169814j;

    /* renamed from: k */
    private int f169815k;

    /* renamed from: l */
    private int f169816l;

    /* renamed from: m */
    private int f169817m = Integer.MAX_VALUE;

    public C62895ac(InputStream inputStream) {
        C62972cr.m95549i(inputStream, "input");
        this.f169810a = inputStream;
        this.f169811b = new byte[4096];
        this.f169812h = 0;
        this.f169814j = 0;
        this.f169816l = 0;
    }

    /* renamed from: P */
    private final List m95031P(int i) {
        ArrayList arrayList = new ArrayList();
        while (i > 0) {
            int min = Math.min(i, 4096);
            byte[] bArr = new byte[min];
            int i2 = 0;
            while (i2 < min) {
                int read = this.f169810a.read(bArr, i2, min - i2);
                if (read != -1) {
                    this.f169816l += read;
                    i2 += read;
                } else {
                    throw C62974ct.m95559i();
                }
            }
            i -= min;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    /* renamed from: Q */
    private final void m95032Q() {
        int i = this.f169812h + this.f169813i;
        this.f169812h = i;
        int i2 = this.f169816l + i;
        int i3 = this.f169817m;
        if (i2 > i3) {
            int i4 = i2 - i3;
            this.f169813i = i4;
            this.f169812h = i - i4;
            return;
        }
        this.f169813i = 0;
    }

    /* renamed from: R */
    private final void m95033R(int i) {
        if (m95034S(i)) {
            return;
        }
        if (i > (this.f169830e - this.f169816l) - this.f169814j) {
            throw C62974ct.m95558h();
        }
        throw C62974ct.m95559i();
    }

    /* renamed from: S */
    private final boolean m95034S(int i) {
        int i2 = this.f169814j;
        int i3 = this.f169812h;
        if (i2 + i > i3) {
            int i4 = this.f169830e;
            int i5 = this.f169816l;
            if (i > (i4 - i5) - i2 || i5 + i2 + i > this.f169817m) {
                return false;
            }
            if (i2 > 0) {
                if (i3 > i2) {
                    byte[] bArr = this.f169811b;
                    System.arraycopy(bArr, i2, bArr, 0, i3 - i2);
                }
                i5 = this.f169816l + i2;
                this.f169816l = i5;
                i3 = this.f169812h - i2;
                this.f169812h = i3;
                this.f169814j = 0;
            }
            try {
                int read = this.f169810a.read(this.f169811b, i3, Math.min(4096 - i3, (this.f169830e - i5) - i3));
                if (read == 0 || read < -1 || read > 4096) {
                    throw new IllegalStateException(String.valueOf(this.f169810a.getClass()) + "#read(byte[]) returned invalid result: " + read + "\nThe InputStream implementation is buggy.");
                } else if (read <= 0) {
                    return false;
                } else {
                    this.f169812h += read;
                    m95032Q();
                    if (this.f169812h >= i) {
                        return true;
                    }
                    return m95034S(i);
                }
            } catch (C62974ct e) {
                e.f170012a = true;
                throw e;
            }
        } else {
            throw new IllegalStateException("refillBuffer() called when " + i + " bytes were already available in buffer");
        }
    }

    /* renamed from: T */
    private final byte[] m95035T(int i) {
        if (i == 0) {
            return C62972cr.f170010b;
        }
        if (i >= 0) {
            int i2 = this.f169816l;
            int i3 = this.f169814j;
            int i4 = i2 + i3 + i;
            if (i4 - this.f169830e <= 0) {
                int i5 = this.f169817m;
                if (i4 <= i5) {
                    int i6 = this.f169812h - i3;
                    int i7 = i - i6;
                    if (i7 >= 4096) {
                        try {
                            if (i7 > this.f169810a.available()) {
                                return null;
                            }
                        } catch (C62974ct e) {
                            e.f170012a = true;
                            throw e;
                        }
                    }
                    byte[] bArr = new byte[i];
                    System.arraycopy(this.f169811b, this.f169814j, bArr, 0, i6);
                    this.f169816l += this.f169812h;
                    this.f169814j = 0;
                    this.f169812h = 0;
                    while (i6 < i) {
                        try {
                            int read = this.f169810a.read(bArr, i6, i - i6);
                            if (read != -1) {
                                this.f169816l += read;
                                i6 += read;
                            } else {
                                throw C62974ct.m95559i();
                            }
                        } catch (C62974ct e2) {
                            e2.f170012a = true;
                            throw e2;
                        }
                    }
                    return bArr;
                }
                mo58660C((i5 - i2) - i3);
                throw C62974ct.m95559i();
            }
            throw C62974ct.m95558h();
        }
        throw C62974ct.m95555e();
    }

    /* renamed from: U */
    private final byte[] m95036U(int i) {
        byte[] T = m95035T(i);
        if (T != null) {
            return T;
        }
        int i2 = this.f169814j;
        int i3 = this.f169812h;
        int i4 = i3 - i2;
        this.f169816l += i3;
        this.f169814j = 0;
        this.f169812h = 0;
        List<byte[]> P = m95031P(i - i4);
        byte[] bArr = new byte[i];
        System.arraycopy(this.f169811b, i2, bArr, 0, i4);
        for (byte[] bArr2 : P) {
            int length = bArr2.length;
            System.arraycopy(bArr2, 0, bArr, i4, length);
            i4 += length;
        }
        return bArr;
    }

    /* renamed from: A */
    public final void mo58658A(int i) {
        if (this.f169815k != i) {
            throw C62974ct.m95551a();
        }
    }

    /* renamed from: B */
    public final void mo58659B(int i) {
        this.f169817m = i;
        m95032Q();
    }

    /* renamed from: C */
    public final void mo58660C(int i) {
        int i2 = this.f169812h;
        int i3 = this.f169814j;
        int i4 = i2 - i3;
        if (i <= i4 && i >= 0) {
            this.f169814j = i3 + i;
        } else if (i >= 0) {
            int i5 = this.f169816l;
            int i6 = i5 + i3;
            int i7 = this.f169817m;
            if (i6 + i <= i7) {
                this.f169816l = i6;
                this.f169812h = 0;
                this.f169814j = 0;
                while (i4 < i) {
                    try {
                        long j = (long) (i - i4);
                        long skip = this.f169810a.skip(j);
                        if (skip < 0 || skip > j) {
                            throw new IllegalStateException(String.valueOf(this.f169810a.getClass()) + "#skip returned invalid result: " + skip + "\nThe InputStream implementation is buggy.");
                        } else if (skip == 0) {
                            break;
                        } else {
                            i4 += (int) skip;
                        }
                    } catch (C62974ct e) {
                        e.f170012a = true;
                        throw e;
                    } catch (Throwable th) {
                        this.f169816l += i4;
                        m95032Q();
                        throw th;
                    }
                }
                this.f169816l += i4;
                m95032Q();
                if (i4 < i) {
                    int i8 = this.f169812h;
                    int i9 = i8 - this.f169814j;
                    this.f169814j = i8;
                    m95033R(1);
                    while (true) {
                        int i10 = i - i9;
                        int i11 = this.f169812h;
                        if (i10 > i11) {
                            i9 += i11;
                            this.f169814j = i11;
                            m95033R(1);
                        } else {
                            this.f169814j = i10;
                            return;
                        }
                    }
                }
            } else {
                mo58660C((i7 - i5) - i3);
                throw C62974ct.m95559i();
            }
        } else {
            throw C62974ct.m95555e();
        }
    }

    /* renamed from: D */
    public final boolean mo58661D() {
        return this.f169814j == this.f169812h && !m95034S(1);
    }

    /* renamed from: E */
    public final boolean mo58662E() {
        return mo58700r() != 0;
    }

    /* renamed from: G */
    public final byte[] mo58664G() {
        int j = mo58675j();
        int i = this.f169812h;
        int i2 = this.f169814j;
        if (j > i - i2 || j <= 0) {
            return m95036U(j);
        }
        byte[] copyOfRange = Arrays.copyOfRange(this.f169811b, i2, i2 + j);
        this.f169814j += j;
        return copyOfRange;
    }

    /* renamed from: a */
    public final byte mo58697a() {
        if (this.f169814j == this.f169812h) {
            m95033R(1);
        }
        byte[] bArr = this.f169811b;
        int i = this.f169814j;
        this.f169814j = i + 1;
        return bArr[i];
    }

    /* renamed from: b */
    public final double mo58667b() {
        return Double.longBitsToDouble(mo58699q());
    }

    /* renamed from: c */
    public final float mo58668c() {
        return Float.intBitsToFloat(mo58698i());
    }

    /* renamed from: d */
    public final int mo58669d() {
        return this.f169816l + this.f169814j;
    }

    /* renamed from: e */
    public final int mo58670e(int i) {
        if (i >= 0) {
            int i2 = i + this.f169816l + this.f169814j;
            int i3 = this.f169817m;
            if (i2 <= i3) {
                this.f169817m = i2;
                m95032Q();
                return i3;
            }
            throw C62974ct.m95559i();
        }
        throw C62974ct.m95555e();
    }

    /* renamed from: f */
    public final int mo58671f() {
        return mo58675j();
    }

    /* renamed from: g */
    public final int mo58672g() {
        return mo58698i();
    }

    /* renamed from: h */
    public final int mo58673h() {
        return mo58675j();
    }

    /* renamed from: i */
    public final int mo58698i() {
        int i = this.f169814j;
        if (this.f169812h - i < 4) {
            m95033R(4);
            i = this.f169814j;
        }
        byte[] bArr = this.f169811b;
        this.f169814j = i + 4;
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    /* renamed from: k */
    public final int mo58676k() {
        return mo58698i();
    }

    /* renamed from: l */
    public final int mo58677l() {
        return m95107I(mo58675j());
    }

    /* renamed from: m */
    public final int mo58678m() {
        if (mo58661D()) {
            this.f169815k = 0;
            return 0;
        }
        int j = mo58675j();
        this.f169815k = j;
        if ((j >>> 3) != 0) {
            return j;
        }
        throw C62974ct.m95552b();
    }

    /* renamed from: n */
    public final int mo58679n() {
        return mo58675j();
    }

    /* renamed from: o */
    public final long mo58680o() {
        return mo58699q();
    }

    /* renamed from: p */
    public final long mo58681p() {
        return mo58700r();
    }

    /* renamed from: q */
    public final long mo58699q() {
        int i = this.f169814j;
        if (this.f169812h - i < 8) {
            m95033R(8);
            i = this.f169814j;
        }
        byte[] bArr = this.f169811b;
        this.f169814j = i + 8;
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public final long mo58701s() {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            byte a = mo58697a();
            j |= ((long) (a & Byte.MAX_VALUE)) << i;
            if ((a & 128) == 0) {
                return j;
            }
        }
        throw C62974ct.m95554d();
    }

    /* renamed from: t */
    public final long mo58685t() {
        return mo58699q();
    }

    /* renamed from: u */
    public final long mo58686u() {
        return m95109K(mo58700r());
    }

    /* renamed from: v */
    public final long mo58687v() {
        return mo58700r();
    }

    /* renamed from: w */
    public final C63088z mo58688w() {
        int j = mo58675j();
        int i = this.f169812h;
        int i2 = this.f169814j;
        if (j <= i - i2 && j > 0) {
            C63088z D = C63088z.m96142D(this.f169811b, i2, j);
            this.f169814j += j;
            return D;
        } else if (j == 0) {
            return C63088z.f170246b;
        } else {
            byte[] T = m95035T(j);
            if (T != null) {
                return C63088z.m96139A(T);
            }
            int i3 = this.f169814j;
            int i4 = this.f169812h;
            int i5 = i4 - i3;
            this.f169816l += i4;
            this.f169814j = 0;
            this.f169812h = 0;
            List<byte[]> P = m95031P(j - i5);
            byte[] bArr = new byte[j];
            System.arraycopy(this.f169811b, i3, bArr, 0, i5);
            for (byte[] bArr2 : P) {
                int length = bArr2.length;
                System.arraycopy(bArr2, 0, bArr, i5, length);
                i5 += length;
            }
            return C63088z.m96145G(bArr);
        }
    }

    /* renamed from: x */
    public final MessageLite mo58689x(C63010eb ebVar, C62921ba baVar) {
        int j = mo58675j();
        mo58707L();
        int e = mo58670e(j);
        this.f169828c++;
        MessageLite messageLite = (MessageLite) ebVar.mo58879p(this, baVar);
        mo58658A(0);
        this.f169828c--;
        int i = this.f169817m;
        if (i == Integer.MAX_VALUE || i - (this.f169816l + this.f169814j) != 0) {
            throw C62974ct.m95559i();
        }
        this.f169817m = e;
        m95032Q();
        return messageLite;
    }

    /* renamed from: y */
    public final String mo58690y() {
        int j = mo58675j();
        if (j > 0) {
            int i = this.f169812h;
            int i2 = this.f169814j;
            if (j <= i - i2) {
                String str = new String(this.f169811b, i2, j, C62972cr.f170009a);
                this.f169814j += j;
                return str;
            }
        }
        if (j == 0) {
            return BuildConfig.FLAVOR;
        }
        if (j > this.f169812h) {
            return new String(m95036U(j), C62972cr.f170009a);
        }
        m95033R(j);
        String str2 = new String(this.f169811b, this.f169814j, j, C62972cr.f170009a);
        this.f169814j += j;
        return str2;
    }

    /* renamed from: z */
    public final String mo58691z() {
        byte[] bArr;
        int j = mo58675j();
        int i = this.f169814j;
        int i2 = this.f169812h;
        if (j <= i2 - i && j > 0) {
            bArr = this.f169811b;
            this.f169814j = i + j;
        } else if (j == 0) {
            return BuildConfig.FLAVOR;
        } else {
            i = 0;
            if (j <= i2) {
                m95033R(j);
                bArr = this.f169811b;
                this.f169814j = j;
            } else {
                bArr = m95036U(j);
            }
        }
        return C63059fx.f170178a.mo59146d(bArr, i, j);
    }

    /* renamed from: H */
    public final byte[] mo58665H(int i) {
        int i2 = this.f169814j;
        if (i > this.f169812h - i2 || i <= 0) {
            return m95036U(i);
        }
        int i3 = i + i2;
        this.f169814j = i3;
        return Arrays.copyOfRange(this.f169811b, i2, i3);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0067, code lost:
        if (r2[r3] >= 0) goto L_0x0069;
     */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo58675j() {
        /*
            r5 = this;
            int r0 = r5.f169814j
            int r1 = r5.f169812h
            if (r1 != r0) goto L_0x0007
            goto L_0x006c
        L_0x0007:
            byte[] r2 = r5.f169811b
            int r3 = r0 + 1
            byte r0 = r2[r0]
            if (r0 < 0) goto L_0x0012
            r5.f169814j = r3
            return r0
        L_0x0012:
            int r1 = r1 - r3
            r4 = 9
            if (r1 < r4) goto L_0x006c
            int r1 = r3 + 1
            byte r3 = r2[r3]
            int r3 = r3 << 7
            r0 = r0 ^ r3
            if (r0 >= 0) goto L_0x0023
            r0 = r0 ^ -128(0xffffffffffffff80, float:NaN)
            goto L_0x0069
        L_0x0023:
            int r3 = r1 + 1
            byte r1 = r2[r1]
            int r1 = r1 << 14
            r0 = r0 ^ r1
            if (r0 < 0) goto L_0x0030
            r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
        L_0x002e:
            r1 = r3
            goto L_0x0069
        L_0x0030:
            int r1 = r3 + 1
            byte r3 = r2[r3]
            int r3 = r3 << 21
            r0 = r0 ^ r3
            if (r0 >= 0) goto L_0x003e
            r2 = -2080896(0xffffffffffe03f80, float:NaN)
            r0 = r0 ^ r2
            goto L_0x0069
        L_0x003e:
            int r3 = r1 + 1
            byte r1 = r2[r1]
            int r4 = r1 << 28
            r0 = r0 ^ r4
            r4 = 266354560(0xfe03f80, float:2.2112565E-29)
            r0 = r0 ^ r4
            if (r1 >= 0) goto L_0x002e
            int r1 = r3 + 1
            byte r3 = r2[r3]
            if (r3 >= 0) goto L_0x0069
            int r3 = r1 + 1
            byte r1 = r2[r1]
            if (r1 >= 0) goto L_0x002e
            int r1 = r3 + 1
            byte r3 = r2[r3]
            if (r3 >= 0) goto L_0x0069
            int r3 = r1 + 1
            byte r1 = r2[r1]
            if (r1 >= 0) goto L_0x002e
            int r1 = r3 + 1
            byte r2 = r2[r3]
            if (r2 < 0) goto L_0x006c
        L_0x0069:
            r5.f169814j = r1
            return r0
        L_0x006c:
            long r0 = r5.mo58701s()
            int r1 = (int) r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C62895ac.mo58675j():int");
    }

    /* renamed from: F */
    public final boolean mo58663F(int i) {
        int m;
        int i2 = i & 7;
        int i3 = 0;
        if (i2 == 0) {
            if (this.f169812h - this.f169814j >= 10) {
                while (i3 < 10) {
                    byte[] bArr = this.f169811b;
                    int i4 = this.f169814j;
                    this.f169814j = i4 + 1;
                    if (bArr[i4] < 0) {
                        i3++;
                    }
                }
                throw C62974ct.m95554d();
            }
            while (i3 < 10) {
                if (mo58697a() < 0) {
                    i3++;
                }
            }
            throw C62974ct.m95554d();
            return true;
        } else if (i2 == 1) {
            mo58660C(8);
            return true;
        } else if (i2 == 2) {
            mo58660C(mo58675j());
            return true;
        } else if (i2 == 3) {
            do {
                m = mo58678m();
                if (m == 0 || !mo58663F(m)) {
                    mo58658A(((i >>> 3) << 3) | 4);
                }
                m = mo58678m();
                break;
            } while (!mo58663F(m));
            mo58658A(((i >>> 3) << 3) | 4);
            return true;
        } else if (i2 == 4) {
            return false;
        } else {
            if (i2 == 5) {
                mo58660C(4);
                return true;
            }
            throw new C62973cs();
        }
    }

    /* renamed from: r */
    public final long mo58700r() {
        long j;
        long j2;
        long j3;
        long j4;
        byte b;
        int i = this.f169814j;
        int i2 = this.f169812h;
        if (i2 != i) {
            byte[] bArr = this.f169811b;
            int i3 = i + 1;
            byte b2 = bArr[i];
            if (b2 >= 0) {
                this.f169814j = i3;
                return (long) b2;
            } else if (i2 - i3 >= 9) {
                int i4 = i3 + 1;
                byte b3 = b2 ^ (bArr[i3] << 7);
                if (b3 < 0) {
                    b = b3 ^ Byte.MIN_VALUE;
                } else {
                    int i5 = i4 + 1;
                    byte b4 = b3 ^ (bArr[i4] << 14);
                    if (b4 >= 0) {
                        j2 = (long) (b4 ^ 16256);
                    } else {
                        i4 = i5 + 1;
                        byte b5 = b4 ^ (bArr[i5] << 21);
                        if (b5 < 0) {
                            b = b5 ^ -2080896;
                        } else {
                            i5 = i4 + 1;
                            long j5 = (((long) bArr[i4]) << 28) ^ ((long) b5);
                            if (j5 >= 0) {
                                j4 = 266354560;
                            } else {
                                int i6 = i5 + 1;
                                long j6 = j5 ^ (((long) bArr[i5]) << 35);
                                if (j6 < 0) {
                                    j3 = -34093383808L;
                                } else {
                                    i5 = i6 + 1;
                                    j5 = j6 ^ (((long) bArr[i6]) << 42);
                                    if (j5 >= 0) {
                                        j4 = 4363953127296L;
                                    } else {
                                        i6 = i5 + 1;
                                        j6 = j5 ^ (((long) bArr[i5]) << 49);
                                        if (j6 < 0) {
                                            j3 = -558586000294016L;
                                        } else {
                                            i5 = i6 + 1;
                                            j2 = (j6 ^ (((long) bArr[i6]) << 56)) ^ 71499008037633920L;
                                            if (j2 < 0) {
                                                i6 = i5 + 1;
                                                if (((long) bArr[i5]) >= 0) {
                                                    j = j2;
                                                    i4 = i6;
                                                    this.f169814j = i4;
                                                    return j;
                                                }
                                            }
                                        }
                                    }
                                }
                                j = j3 ^ j6;
                                i4 = i6;
                                this.f169814j = i4;
                                return j;
                            }
                            j2 = j5 ^ j4;
                        }
                    }
                    i4 = i5;
                    j = j2;
                    this.f169814j = i4;
                    return j;
                }
                j = (long) b;
                this.f169814j = i4;
                return j;
            }
        }
        return mo58701s();
    }
}
