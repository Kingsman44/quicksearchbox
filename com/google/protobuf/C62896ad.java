package com.google.protobuf;

import com.evernote.android.state.BuildConfig;
import java.nio.ByteBuffer;

/* renamed from: com.google.protobuf.ad */
/* compiled from: PG */
final class C62896ad extends C62897ae {

    /* renamed from: a */
    private final ByteBuffer f169818a;

    /* renamed from: b */
    private final long f169819b;

    /* renamed from: h */
    private long f169820h;

    /* renamed from: i */
    private long f169821i;

    /* renamed from: j */
    private final long f169822j;

    /* renamed from: k */
    private int f169823k;

    /* renamed from: l */
    private int f169824l;

    /* renamed from: m */
    private int f169825m = Integer.MAX_VALUE;

    public C62896ad(ByteBuffer byteBuffer) {
        this.f169818a = byteBuffer;
        long a = C63054fs.m95962a(byteBuffer);
        this.f169819b = a;
        this.f169820h = ((long) byteBuffer.limit()) + a;
        long position = a + ((long) byteBuffer.position());
        this.f169821i = position;
        this.f169822j = position;
    }

    /* renamed from: P */
    private final int m95071P() {
        return (int) (this.f169820h - this.f169821i);
    }

    /* renamed from: Q */
    private final void m95072Q() {
        long j = this.f169820h + ((long) this.f169823k);
        this.f169820h = j;
        int i = (int) (j - this.f169822j);
        int i2 = this.f169825m;
        if (i > i2) {
            int i3 = i - i2;
            this.f169823k = i3;
            this.f169820h = j - ((long) i3);
            return;
        }
        this.f169823k = 0;
    }

    /* renamed from: A */
    public final void mo58658A(int i) {
        if (this.f169824l != i) {
            throw C62974ct.m95551a();
        }
    }

    /* renamed from: B */
    public final void mo58659B(int i) {
        this.f169825m = i;
        m95072Q();
    }

    /* renamed from: C */
    public final void mo58660C(int i) {
        if (i >= 0 && i <= m95071P()) {
            this.f169821i += (long) i;
        } else if (i < 0) {
            throw C62974ct.m95555e();
        } else {
            throw C62974ct.m95559i();
        }
    }

    /* renamed from: D */
    public final boolean mo58661D() {
        return this.f169821i == this.f169820h;
    }

    /* renamed from: E */
    public final boolean mo58662E() {
        return mo58705r() != 0;
    }

    /* renamed from: G */
    public final byte[] mo58664G() {
        return mo58665H(mo58675j());
    }

    /* renamed from: a */
    public final byte mo58702a() {
        long j = this.f169821i;
        if (j != this.f169820h) {
            this.f169821i = 1 + j;
            return C63054fs.f170169a.mo59123a(j);
        }
        throw C62974ct.m95559i();
    }

    /* renamed from: b */
    public final double mo58667b() {
        return Double.longBitsToDouble(mo58704q());
    }

    /* renamed from: c */
    public final float mo58668c() {
        return Float.intBitsToFloat(mo58703i());
    }

    /* renamed from: d */
    public final int mo58669d() {
        return (int) (this.f169821i - this.f169822j);
    }

    /* renamed from: e */
    public final int mo58670e(int i) {
        if (i >= 0) {
            int d = i + mo58669d();
            int i2 = this.f169825m;
            if (d <= i2) {
                this.f169825m = d;
                m95072Q();
                return i2;
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
        return mo58703i();
    }

    /* renamed from: h */
    public final int mo58673h() {
        return mo58675j();
    }

    /* renamed from: i */
    public final int mo58703i() {
        long j = this.f169821i;
        if (this.f169820h - j >= 4) {
            this.f169821i = 4 + j;
            return ((C63054fs.f170169a.mo59123a(j + 3) & 255) << 24) | (C63054fs.f170169a.mo59123a(j) & 255) | ((C63054fs.f170169a.mo59123a(1 + j) & 255) << 8) | ((C63054fs.f170169a.mo59123a(2 + j) & 255) << 16);
        }
        throw C62974ct.m95559i();
    }

    /* renamed from: k */
    public final int mo58676k() {
        return mo58703i();
    }

    /* renamed from: l */
    public final int mo58677l() {
        return m95107I(mo58675j());
    }

    /* renamed from: m */
    public final int mo58678m() {
        if (mo58661D()) {
            this.f169824l = 0;
            return 0;
        }
        int j = mo58675j();
        this.f169824l = j;
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
        return mo58704q();
    }

    /* renamed from: p */
    public final long mo58681p() {
        return mo58705r();
    }

    /* renamed from: q */
    public final long mo58704q() {
        long j = this.f169821i;
        if (this.f169820h - j >= 8) {
            this.f169821i = 8 + j;
            return ((((long) C63054fs.f170169a.mo59123a(j + 7)) & 255) << 56) | (((long) C63054fs.f170169a.mo59123a(j)) & 255) | ((((long) C63054fs.f170169a.mo59123a(1 + j)) & 255) << 8) | ((((long) C63054fs.f170169a.mo59123a(2 + j)) & 255) << 16) | ((((long) C63054fs.f170169a.mo59123a(3 + j)) & 255) << 24) | ((((long) C63054fs.f170169a.mo59123a(4 + j)) & 255) << 32) | ((((long) C63054fs.f170169a.mo59123a(5 + j)) & 255) << 40) | ((((long) C63054fs.f170169a.mo59123a(6 + j)) & 255) << 48);
        }
        throw C62974ct.m95559i();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public final long mo58706s() {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            byte a = mo58702a();
            j |= ((long) (a & Byte.MAX_VALUE)) << i;
            if ((a & 128) == 0) {
                return j;
            }
        }
        throw C62974ct.m95554d();
    }

    /* renamed from: t */
    public final long mo58685t() {
        return mo58704q();
    }

    /* renamed from: u */
    public final long mo58686u() {
        return m95109K(mo58705r());
    }

    /* renamed from: v */
    public final long mo58687v() {
        return mo58705r();
    }

    /* renamed from: w */
    public final C63088z mo58688w() {
        int j = mo58675j();
        if (j > 0 && j <= m95071P()) {
            byte[] bArr = new byte[j];
            long j2 = (long) j;
            C63054fs.f170169a.mo59126d(this.f169821i, bArr, 0, j2);
            this.f169821i += j2;
            return C63088z.m96145G(bArr);
        } else if (j == 0) {
            return C63088z.f170246b;
        } else {
            if (j < 0) {
                throw C62974ct.m95555e();
            }
            throw C62974ct.m95559i();
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
        int i = this.f169825m;
        if (i == Integer.MAX_VALUE || i - mo58669d() != 0) {
            throw C62974ct.m95559i();
        }
        this.f169825m = e;
        m95072Q();
        return messageLite;
    }

    /* renamed from: y */
    public final String mo58690y() {
        int j = mo58675j();
        if (j > 0 && j <= m95071P()) {
            byte[] bArr = new byte[j];
            long j2 = (long) j;
            C63054fs.f170169a.mo59126d(this.f169821i, bArr, 0, j2);
            String str = new String(bArr, C62972cr.f170009a);
            this.f169821i += j2;
            return str;
        } else if (j == 0) {
            return BuildConfig.FLAVOR;
        } else {
            if (j < 0) {
                throw C62974ct.m95555e();
            }
            throw C62974ct.m95559i();
        }
    }

    /* renamed from: z */
    public final String mo58691z() {
        int j = mo58675j();
        if (j > 0 && j <= m95071P()) {
            String c = C63059fx.f170178a.mo59145c(this.f169818a, (int) (this.f169821i - this.f169819b), j);
            this.f169821i += (long) j;
            return c;
        } else if (j == 0) {
            return BuildConfig.FLAVOR;
        } else {
            if (j <= 0) {
                throw C62974ct.m95555e();
            }
            throw C62974ct.m95559i();
        }
    }

    /* renamed from: H */
    public final byte[] mo58665H(int i) {
        if (i >= 0 && i <= m95071P()) {
            byte[] bArr = new byte[i];
            long j = this.f169821i;
            long j2 = (long) i;
            long j3 = j + j2;
            int position = this.f169818a.position();
            int limit = this.f169818a.limit();
            ByteBuffer byteBuffer = this.f169818a;
            try {
                byteBuffer.position((int) (j - this.f169819b));
                byteBuffer.limit((int) (j3 - this.f169819b));
                ByteBuffer slice = this.f169818a.slice();
                byteBuffer.position(position);
                byteBuffer.limit(limit);
                slice.get(bArr);
                this.f169821i += j2;
                return bArr;
            } catch (IllegalArgumentException e) {
                C62974ct i2 = C62974ct.m95559i();
                i2.initCause(e);
                throw i2;
            } catch (Throwable th) {
                byteBuffer.position(position);
                byteBuffer.limit(limit);
                throw th;
            }
        } else if (i > 0) {
            throw C62974ct.m95559i();
        } else if (i == 0) {
            return C62972cr.f170010b;
        } else {
            throw C62974ct.m95555e();
        }
    }

    /* renamed from: F */
    public final boolean mo58663F(int i) {
        int m;
        int i2 = i & 7;
        int i3 = 0;
        if (i2 == 0) {
            if (m95071P() >= 10) {
                while (i3 < 10) {
                    long j = this.f169821i;
                    this.f169821i = 1 + j;
                    if (C63054fs.f170169a.mo59123a(j) < 0) {
                        i3++;
                    }
                }
                throw C62974ct.m95554d();
            }
            while (i3 < 10) {
                if (mo58702a() < 0) {
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

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0096, code lost:
        if (com.google.protobuf.C63054fs.f170169a.mo59123a(r4) >= 0) goto L_0x0098;
     */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo58675j() {
        /*
            r10 = this;
            long r0 = r10.f169821i
            long r2 = r10.f169820h
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 != 0) goto L_0x000a
            goto L_0x009b
        L_0x000a:
            r2 = 1
            long r4 = r0 + r2
            com.google.protobuf.fr r6 = com.google.protobuf.C63054fs.f170169a
            byte r0 = r6.mo59123a(r0)
            if (r0 < 0) goto L_0x0019
            r10.f169821i = r4
            return r0
        L_0x0019:
            long r6 = r10.f169820h
            long r6 = r6 - r4
            r8 = 9
            int r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r1 < 0) goto L_0x009b
            long r6 = r4 + r2
            com.google.protobuf.fr r1 = com.google.protobuf.C63054fs.f170169a
            byte r1 = r1.mo59123a(r4)
            int r1 = r1 << 7
            r0 = r0 ^ r1
            if (r0 >= 0) goto L_0x0032
            r0 = r0 ^ -128(0xffffffffffffff80, float:NaN)
            goto L_0x0098
        L_0x0032:
            long r4 = r6 + r2
            com.google.protobuf.fr r1 = com.google.protobuf.C63054fs.f170169a
            byte r1 = r1.mo59123a(r6)
            int r1 = r1 << 14
            r0 = r0 ^ r1
            if (r0 < 0) goto L_0x0043
            r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
        L_0x0041:
            r6 = r4
            goto L_0x0098
        L_0x0043:
            long r6 = r4 + r2
            com.google.protobuf.fr r1 = com.google.protobuf.C63054fs.f170169a
            byte r1 = r1.mo59123a(r4)
            int r1 = r1 << 21
            r0 = r0 ^ r1
            if (r0 >= 0) goto L_0x0055
            r1 = -2080896(0xffffffffffe03f80, float:NaN)
            r0 = r0 ^ r1
            goto L_0x0098
        L_0x0055:
            long r4 = r6 + r2
            com.google.protobuf.fr r1 = com.google.protobuf.C63054fs.f170169a
            byte r1 = r1.mo59123a(r6)
            int r6 = r1 << 28
            r0 = r0 ^ r6
            r6 = 266354560(0xfe03f80, float:2.2112565E-29)
            r0 = r0 ^ r6
            if (r1 >= 0) goto L_0x0041
            long r6 = r4 + r2
            com.google.protobuf.fr r1 = com.google.protobuf.C63054fs.f170169a
            byte r1 = r1.mo59123a(r4)
            if (r1 >= 0) goto L_0x0098
            long r4 = r6 + r2
            com.google.protobuf.fr r1 = com.google.protobuf.C63054fs.f170169a
            byte r1 = r1.mo59123a(r6)
            if (r1 >= 0) goto L_0x0041
            long r6 = r4 + r2
            com.google.protobuf.fr r1 = com.google.protobuf.C63054fs.f170169a
            byte r1 = r1.mo59123a(r4)
            if (r1 >= 0) goto L_0x0098
            long r4 = r6 + r2
            com.google.protobuf.fr r1 = com.google.protobuf.C63054fs.f170169a
            byte r1 = r1.mo59123a(r6)
            if (r1 >= 0) goto L_0x0041
            long r6 = r4 + r2
            com.google.protobuf.fr r1 = com.google.protobuf.C63054fs.f170169a
            byte r1 = r1.mo59123a(r4)
            if (r1 < 0) goto L_0x009b
        L_0x0098:
            r10.f169821i = r6
            return r0
        L_0x009b:
            long r0 = r10.mo58706s()
            int r1 = (int) r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C62896ad.mo58675j():int");
    }

    /* renamed from: r */
    public final long mo58705r() {
        long j;
        long j2;
        long j3;
        byte b;
        long j4 = this.f169821i;
        if (this.f169820h != j4) {
            long j5 = j4 + 1;
            byte a = C63054fs.f170169a.mo59123a(j4);
            if (a >= 0) {
                this.f169821i = j5;
                return (long) a;
            } else if (this.f169820h - j5 >= 9) {
                long j6 = j5 + 1;
                byte a2 = a ^ (C63054fs.f170169a.mo59123a(j5) << 7);
                if (a2 < 0) {
                    b = a2 ^ Byte.MIN_VALUE;
                } else {
                    long j7 = j6 + 1;
                    byte a3 = a2 ^ (C63054fs.f170169a.mo59123a(j6) << 14);
                    if (a3 >= 0) {
                        j = (long) (a3 ^ 16256);
                    } else {
                        j6 = j7 + 1;
                        byte a4 = a3 ^ (C63054fs.f170169a.mo59123a(j7) << 21);
                        if (a4 < 0) {
                            b = a4 ^ -2080896;
                        } else {
                            j7 = j6 + 1;
                            long a5 = ((long) a4) ^ (((long) C63054fs.f170169a.mo59123a(j6)) << 28);
                            if (a5 >= 0) {
                                j3 = 266354560;
                            } else {
                                long j8 = j7 + 1;
                                long a6 = a5 ^ (((long) C63054fs.f170169a.mo59123a(j7)) << 35);
                                if (a6 < 0) {
                                    j2 = -34093383808L;
                                } else {
                                    j7 = j8 + 1;
                                    a5 = a6 ^ (((long) C63054fs.f170169a.mo59123a(j8)) << 42);
                                    if (a5 >= 0) {
                                        j3 = 4363953127296L;
                                    } else {
                                        j8 = j7 + 1;
                                        a6 = a5 ^ (((long) C63054fs.f170169a.mo59123a(j7)) << 49);
                                        if (a6 < 0) {
                                            j2 = -558586000294016L;
                                        } else {
                                            j7 = j8 + 1;
                                            j = (a6 ^ (((long) C63054fs.f170169a.mo59123a(j8)) << 56)) ^ 71499008037633920L;
                                            if (j < 0) {
                                                long j9 = 1 + j7;
                                                if (((long) C63054fs.f170169a.mo59123a(j7)) >= 0) {
                                                    j6 = j9;
                                                    this.f169821i = j6;
                                                    return j;
                                                }
                                            }
                                        }
                                    }
                                }
                                j = a6 ^ j2;
                                j6 = j8;
                                this.f169821i = j6;
                                return j;
                            }
                            j = a5 ^ j3;
                        }
                    }
                    j6 = j7;
                    this.f169821i = j6;
                    return j;
                }
                j = (long) b;
                this.f169821i = j6;
                return j;
            }
        }
        return mo58706s();
    }
}
