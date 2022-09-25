package com.google.protobuf;

import com.evernote.android.state.BuildConfig;
import java.util.Arrays;

/* renamed from: com.google.protobuf.aa */
/* compiled from: PG */
public final class C62893aa extends C62897ae {

    /* renamed from: a */
    public int f169792a;

    /* renamed from: b */
    public final int f169793b;

    /* renamed from: h */
    private final byte[] f169794h;

    /* renamed from: i */
    private int f169795i;

    /* renamed from: j */
    private int f169796j;

    /* renamed from: k */
    private int f169797k;

    /* renamed from: l */
    private int f169798l = Integer.MAX_VALUE;

    public C62893aa(byte[] bArr, int i, int i2) {
        this.f169794h = bArr;
        this.f169795i = i2 + i;
        this.f169792a = i;
        this.f169793b = i;
    }

    /* renamed from: P */
    private final void m94957P() {
        int i = this.f169795i + this.f169796j;
        this.f169795i = i;
        int i2 = i - this.f169793b;
        int i3 = this.f169798l;
        if (i2 > i3) {
            int i4 = i2 - i3;
            this.f169796j = i4;
            this.f169795i = i - i4;
            return;
        }
        this.f169796j = 0;
    }

    /* renamed from: A */
    public final void mo58658A(int i) {
        if (this.f169797k != i) {
            throw C62974ct.m95551a();
        }
    }

    /* renamed from: B */
    public final void mo58659B(int i) {
        this.f169798l = i;
        m94957P();
    }

    /* renamed from: C */
    public final void mo58660C(int i) {
        if (i >= 0) {
            int i2 = this.f169795i;
            int i3 = this.f169792a;
            if (i <= i2 - i3) {
                this.f169792a = i3 + i;
                return;
            }
        }
        if (i < 0) {
            throw C62974ct.m95555e();
        }
        throw C62974ct.m95559i();
    }

    /* renamed from: D */
    public final boolean mo58661D() {
        return this.f169792a == this.f169795i;
    }

    /* renamed from: E */
    public final boolean mo58662E() {
        return mo58683r() != 0;
    }

    /* renamed from: G */
    public final byte[] mo58664G() {
        return mo58665H(mo58675j());
    }

    /* renamed from: H */
    public final byte[] mo58665H(int i) {
        if (i > 0) {
            int i2 = this.f169795i;
            int i3 = this.f169792a;
            if (i <= i2 - i3) {
                int i4 = i + i3;
                this.f169792a = i4;
                return Arrays.copyOfRange(this.f169794h, i3, i4);
            }
        }
        if (i > 0) {
            throw C62974ct.m95559i();
        } else if (i == 0) {
            return C62972cr.f170010b;
        } else {
            throw C62974ct.m95555e();
        }
    }

    /* renamed from: a */
    public final byte mo58666a() {
        int i = this.f169792a;
        if (i != this.f169795i) {
            byte[] bArr = this.f169794h;
            this.f169792a = i + 1;
            return bArr[i];
        }
        throw C62974ct.m95559i();
    }

    /* renamed from: b */
    public final double mo58667b() {
        return Double.longBitsToDouble(mo58682q());
    }

    /* renamed from: c */
    public final float mo58668c() {
        return Float.intBitsToFloat(mo58674i());
    }

    /* renamed from: d */
    public final int mo58669d() {
        return this.f169792a - this.f169793b;
    }

    /* renamed from: e */
    public final int mo58670e(int i) {
        if (i >= 0) {
            int i2 = i + (this.f169792a - this.f169793b);
            if (i2 >= 0) {
                int i3 = this.f169798l;
                if (i2 <= i3) {
                    this.f169798l = i2;
                    m94957P();
                    return i3;
                }
                throw C62974ct.m95559i();
            }
            throw C62974ct.m95556f();
        }
        throw C62974ct.m95555e();
    }

    /* renamed from: f */
    public final int mo58671f() {
        return mo58675j();
    }

    /* renamed from: g */
    public final int mo58672g() {
        return mo58674i();
    }

    /* renamed from: h */
    public final int mo58673h() {
        return mo58675j();
    }

    /* renamed from: i */
    public final int mo58674i() {
        int i = this.f169792a;
        if (this.f169795i - i >= 4) {
            byte[] bArr = this.f169794h;
            this.f169792a = i + 4;
            return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
        }
        throw C62974ct.m95559i();
    }

    /* renamed from: k */
    public final int mo58676k() {
        return mo58674i();
    }

    /* renamed from: l */
    public final int mo58677l() {
        return m95107I(mo58675j());
    }

    /* renamed from: m */
    public final int mo58678m() {
        if (mo58661D()) {
            this.f169797k = 0;
            return 0;
        }
        int j = mo58675j();
        this.f169797k = j;
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
        return mo58682q();
    }

    /* renamed from: p */
    public final long mo58681p() {
        return mo58683r();
    }

    /* renamed from: q */
    public final long mo58682q() {
        int i = this.f169792a;
        if (this.f169795i - i >= 8) {
            byte[] bArr = this.f169794h;
            this.f169792a = i + 8;
            return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
        }
        throw C62974ct.m95559i();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public final long mo58684s() {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            byte a = mo58666a();
            j |= ((long) (a & Byte.MAX_VALUE)) << i;
            if ((a & 128) == 0) {
                return j;
            }
        }
        throw C62974ct.m95554d();
    }

    /* renamed from: t */
    public final long mo58685t() {
        return mo58682q();
    }

    /* renamed from: u */
    public final long mo58686u() {
        return m95109K(mo58683r());
    }

    /* renamed from: v */
    public final long mo58687v() {
        return mo58683r();
    }

    /* renamed from: w */
    public final C63088z mo58688w() {
        int j = mo58675j();
        if (j > 0) {
            int i = this.f169795i;
            int i2 = this.f169792a;
            if (j <= i - i2) {
                C63088z D = C63088z.m96142D(this.f169794h, i2, j);
                this.f169792a += j;
                return D;
            }
        }
        if (j == 0) {
            return C63088z.f170246b;
        }
        return C63088z.m96145G(mo58665H(j));
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
        int i = this.f169798l;
        if (i == Integer.MAX_VALUE || i - (this.f169792a - this.f169793b) != 0) {
            throw C62974ct.m95559i();
        }
        this.f169798l = e;
        m94957P();
        return messageLite;
    }

    /* renamed from: y */
    public final String mo58690y() {
        int j = mo58675j();
        if (j > 0) {
            int i = this.f169795i;
            int i2 = this.f169792a;
            if (j <= i - i2) {
                String str = new String(this.f169794h, i2, j, C62972cr.f170009a);
                this.f169792a += j;
                return str;
            }
        }
        if (j == 0) {
            return BuildConfig.FLAVOR;
        }
        if (j < 0) {
            throw C62974ct.m95555e();
        }
        throw C62974ct.m95559i();
    }

    /* renamed from: z */
    public final String mo58691z() {
        int j = mo58675j();
        if (j > 0) {
            int i = this.f169795i;
            int i2 = this.f169792a;
            if (j <= i - i2) {
                String d = C63059fx.f170178a.mo59146d(this.f169794h, i2, j);
                this.f169792a += j;
                return d;
            }
        }
        if (j == 0) {
            return BuildConfig.FLAVOR;
        }
        if (j <= 0) {
            throw C62974ct.m95555e();
        }
        throw C62974ct.m95559i();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0067, code lost:
        if (r2[r3] >= 0) goto L_0x0069;
     */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo58675j() {
        /*
            r5 = this;
            int r0 = r5.f169792a
            int r1 = r5.f169795i
            if (r1 != r0) goto L_0x0007
            goto L_0x006c
        L_0x0007:
            byte[] r2 = r5.f169794h
            int r3 = r0 + 1
            byte r0 = r2[r0]
            if (r0 < 0) goto L_0x0012
            r5.f169792a = r3
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
            r5.f169792a = r1
            return r0
        L_0x006c:
            long r0 = r5.mo58684s()
            int r1 = (int) r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C62893aa.mo58675j():int");
    }

    /* renamed from: F */
    public final boolean mo58663F(int i) {
        int m;
        int i2 = i & 7;
        int i3 = 0;
        if (i2 == 0) {
            if (this.f169795i - this.f169792a >= 10) {
                while (i3 < 10) {
                    byte[] bArr = this.f169794h;
                    int i4 = this.f169792a;
                    this.f169792a = i4 + 1;
                    if (bArr[i4] < 0) {
                        i3++;
                    }
                }
                throw C62974ct.m95554d();
            }
            while (i3 < 10) {
                if (mo58666a() < 0) {
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
    public final long mo58683r() {
        long j;
        long j2;
        long j3;
        long j4;
        byte b;
        int i = this.f169792a;
        int i2 = this.f169795i;
        if (i2 != i) {
            byte[] bArr = this.f169794h;
            int i3 = i + 1;
            byte b2 = bArr[i];
            if (b2 >= 0) {
                this.f169792a = i3;
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
                                                    this.f169792a = i4;
                                                    return j;
                                                }
                                            }
                                        }
                                    }
                                }
                                j = j3 ^ j6;
                                i4 = i6;
                                this.f169792a = i4;
                                return j;
                            }
                            j2 = j5 ^ j4;
                        }
                    }
                    i4 = i5;
                    j = j2;
                    this.f169792a = i4;
                    return j;
                }
                j = (long) b;
                this.f169792a = i4;
                return j;
            }
        }
        return mo58684s();
    }
}
