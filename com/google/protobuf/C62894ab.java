package com.google.protobuf;

import com.evernote.android.state.BuildConfig;
import java.nio.ByteBuffer;
import java.util.Iterator;

/* renamed from: com.google.protobuf.ab */
/* compiled from: PG */
final class C62894ab extends C62897ae {

    /* renamed from: a */
    private final Iterable f169799a;

    /* renamed from: b */
    private final Iterator f169800b;

    /* renamed from: h */
    private ByteBuffer f169801h;

    /* renamed from: i */
    private int f169802i;

    /* renamed from: j */
    private int f169803j;

    /* renamed from: k */
    private int f169804k = Integer.MAX_VALUE;

    /* renamed from: l */
    private int f169805l;

    /* renamed from: m */
    private int f169806m;

    /* renamed from: n */
    private long f169807n;

    /* renamed from: o */
    private long f169808o;

    /* renamed from: p */
    private long f169809p;

    public C62894ab(Iterable iterable, int i) {
        this.f169802i = i;
        this.f169799a = iterable;
        this.f169800b = iterable.iterator();
        this.f169806m = 0;
        if (i == 0) {
            this.f169801h = C62972cr.f170011c;
            this.f169807n = 0;
            this.f169808o = 0;
            this.f169809p = 0;
            return;
        }
        m94995S();
    }

    /* renamed from: P */
    private final int m94992P() {
        return (int) ((((long) (this.f169802i - this.f169806m)) - this.f169807n) + this.f169808o);
    }

    /* renamed from: Q */
    private final void m94993Q() {
        if (this.f169800b.hasNext()) {
            m94995S();
            return;
        }
        throw C62974ct.m95559i();
    }

    /* renamed from: R */
    private final void m94994R() {
        int i = this.f169802i + this.f169803j;
        this.f169802i = i;
        int i2 = this.f169804k;
        if (i > i2) {
            int i3 = i - i2;
            this.f169803j = i3;
            this.f169802i = i - i3;
            return;
        }
        this.f169803j = 0;
    }

    /* renamed from: S */
    private final void m94995S() {
        ByteBuffer byteBuffer = (ByteBuffer) this.f169800b.next();
        this.f169801h = byteBuffer;
        this.f169806m += (int) (this.f169807n - this.f169808o);
        long position = (long) byteBuffer.position();
        this.f169807n = position;
        this.f169808o = position;
        this.f169809p = (long) this.f169801h.limit();
        long a = C63054fs.m95962a(this.f169801h);
        this.f169807n += a;
        this.f169808o += a;
        this.f169809p += a;
    }

    /* renamed from: T */
    private final void m94996T(byte[] bArr, int i) {
        if (i <= m94992P()) {
            int i2 = i;
            while (i2 > 0) {
                if (this.f169809p - this.f169807n == 0) {
                    m94993Q();
                }
                int min = Math.min(i2, (int) (this.f169809p - this.f169807n));
                long j = (long) min;
                C63054fs.f170169a.mo59126d(this.f169807n, bArr, (long) (i - i2), j);
                i2 -= min;
                this.f169807n += j;
            }
        } else if (i > 0) {
            throw C62974ct.m95559i();
        }
    }

    /* renamed from: A */
    public final void mo58658A(int i) {
        if (this.f169805l != i) {
            throw C62974ct.m95551a();
        }
    }

    /* renamed from: B */
    public final void mo58659B(int i) {
        this.f169804k = i;
        m94994R();
    }

    /* renamed from: D */
    public final boolean mo58661D() {
        return (((long) this.f169806m) + this.f169807n) - this.f169808o == ((long) this.f169802i);
    }

    /* renamed from: E */
    public final boolean mo58662E() {
        return mo58695r() != 0;
    }

    /* renamed from: G */
    public final byte[] mo58664G() {
        return mo58665H(mo58675j());
    }

    /* renamed from: H */
    public final byte[] mo58665H(int i) {
        if (i >= 0) {
            long j = (long) i;
            long j2 = this.f169809p;
            long j3 = this.f169807n;
            if (j <= j2 - j3) {
                byte[] bArr = new byte[i];
                C63054fs.f170169a.mo59126d(j3, bArr, 0, j);
                this.f169807n += j;
                return bArr;
            }
        }
        if (i >= 0 && i <= m94992P()) {
            byte[] bArr2 = new byte[i];
            m94996T(bArr2, i);
            return bArr2;
        } else if (i > 0) {
            throw C62974ct.m95559i();
        } else if (i == 0) {
            return C62972cr.f170010b;
        } else {
            throw C62974ct.m95555e();
        }
    }

    /* renamed from: a */
    public final byte mo58692a() {
        if (this.f169809p - this.f169807n == 0) {
            m94993Q();
        }
        long j = this.f169807n;
        this.f169807n = 1 + j;
        return C63054fs.f170169a.mo59123a(j);
    }

    /* renamed from: b */
    public final double mo58667b() {
        return Double.longBitsToDouble(mo58694q());
    }

    /* renamed from: c */
    public final float mo58668c() {
        return Float.intBitsToFloat(mo58693i());
    }

    /* renamed from: d */
    public final int mo58669d() {
        return (int) ((((long) this.f169806m) + this.f169807n) - this.f169808o);
    }

    /* renamed from: e */
    public final int mo58670e(int i) {
        if (i >= 0) {
            int d = i + mo58669d();
            int i2 = this.f169804k;
            if (d <= i2) {
                this.f169804k = d;
                m94994R();
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
        return mo58693i();
    }

    /* renamed from: h */
    public final int mo58673h() {
        return mo58675j();
    }

    /* renamed from: i */
    public final int mo58693i() {
        byte a;
        byte a2;
        long j = this.f169809p;
        long j2 = this.f169807n;
        if (j - j2 >= 4) {
            this.f169807n = 4 + j2;
            a = (C63054fs.f170169a.mo59123a(j2) & 255) | ((C63054fs.f170169a.mo59123a(1 + j2) & 255) << 8) | ((C63054fs.f170169a.mo59123a(2 + j2) & 255) << 16);
            a2 = C63054fs.f170169a.mo59123a(j2 + 3);
        } else {
            a = (mo58692a() & 255) | ((mo58692a() & 255) << 8) | ((mo58692a() & 255) << 16);
            a2 = mo58692a();
        }
        return a | ((a2 & 255) << 24);
    }

    /* renamed from: k */
    public final int mo58676k() {
        return mo58693i();
    }

    /* renamed from: l */
    public final int mo58677l() {
        return m95107I(mo58675j());
    }

    /* renamed from: m */
    public final int mo58678m() {
        if (mo58661D()) {
            this.f169805l = 0;
            return 0;
        }
        int j = mo58675j();
        this.f169805l = j;
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
        return mo58694q();
    }

    /* renamed from: p */
    public final long mo58681p() {
        return mo58695r();
    }

    /* renamed from: q */
    public final long mo58694q() {
        long a;
        byte a2;
        long j = this.f169809p;
        long j2 = this.f169807n;
        if (j - j2 >= 8) {
            this.f169807n = 8 + j2;
            a = (((long) C63054fs.f170169a.mo59123a(j2)) & 255) | ((((long) C63054fs.f170169a.mo59123a(j2 + 1)) & 255) << 8) | ((((long) C63054fs.f170169a.mo59123a(2 + j2)) & 255) << 16) | ((((long) C63054fs.f170169a.mo59123a(3 + j2)) & 255) << 24) | ((((long) C63054fs.f170169a.mo59123a(4 + j2)) & 255) << 32) | ((((long) C63054fs.f170169a.mo59123a(5 + j2)) & 255) << 40) | ((((long) C63054fs.f170169a.mo59123a(6 + j2)) & 255) << 48);
            a2 = C63054fs.f170169a.mo59123a(j2 + 7);
        } else {
            a = (((long) mo58692a()) & 255) | ((((long) mo58692a()) & 255) << 8) | ((((long) mo58692a()) & 255) << 16) | ((((long) mo58692a()) & 255) << 24) | ((((long) mo58692a()) & 255) << 32) | ((((long) mo58692a()) & 255) << 40) | ((((long) mo58692a()) & 255) << 48);
            a2 = mo58692a();
        }
        return a | ((((long) a2) & 255) << 56);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public final long mo58696s() {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            byte a = mo58692a();
            j |= ((long) (a & Byte.MAX_VALUE)) << i;
            if ((a & 128) == 0) {
                return j;
            }
        }
        throw C62974ct.m95554d();
    }

    /* renamed from: t */
    public final long mo58685t() {
        return mo58694q();
    }

    /* renamed from: u */
    public final long mo58686u() {
        return m95109K(mo58695r());
    }

    /* renamed from: v */
    public final long mo58687v() {
        return mo58695r();
    }

    /* renamed from: w */
    public final C63088z mo58688w() {
        int j = mo58675j();
        if (j > 0) {
            long j2 = (long) j;
            long j3 = this.f169809p;
            long j4 = this.f169807n;
            if (j2 <= j3 - j4) {
                byte[] bArr = new byte[j];
                C63054fs.f170169a.mo59126d(j4, bArr, 0, j2);
                this.f169807n += j2;
                return C63088z.m96145G(bArr);
            }
        }
        if (j > 0 && j <= m94992P()) {
            byte[] bArr2 = new byte[j];
            m94996T(bArr2, j);
            return C63088z.m96145G(bArr2);
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
        int i = this.f169804k;
        if (i == Integer.MAX_VALUE || i - mo58669d() != 0) {
            throw C62974ct.m95559i();
        }
        this.f169804k = e;
        m94994R();
        return messageLite;
    }

    /* renamed from: y */
    public final String mo58690y() {
        int j = mo58675j();
        if (j > 0) {
            long j2 = (long) j;
            long j3 = this.f169809p;
            long j4 = this.f169807n;
            if (j2 <= j3 - j4) {
                byte[] bArr = new byte[j];
                C63054fs.f170169a.mo59126d(j4, bArr, 0, j2);
                String str = new String(bArr, C62972cr.f170009a);
                this.f169807n += j2;
                return str;
            }
        }
        if (j > 0 && j <= m94992P()) {
            byte[] bArr2 = new byte[j];
            m94996T(bArr2, j);
            return new String(bArr2, C62972cr.f170009a);
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
        if (j > 0) {
            long j2 = (long) j;
            long j3 = this.f169809p;
            long j4 = this.f169807n;
            if (j2 <= j3 - j4) {
                String c = C63059fx.f170178a.mo59145c(this.f169801h, (int) (j4 - this.f169808o), j);
                this.f169807n += j2;
                return c;
            }
        }
        if (j >= 0 && j <= m94992P()) {
            byte[] bArr = new byte[j];
            m94996T(bArr, j);
            return C63059fx.f170178a.mo59146d(bArr, 0, j);
        } else if (j == 0) {
            return BuildConfig.FLAVOR;
        } else {
            if (j <= 0) {
                throw C62974ct.m95555e();
            }
            throw C62974ct.m95559i();
        }
    }

    /* renamed from: C */
    public final void mo58660C(int i) {
        if (i >= 0 && ((long) i) <= (((long) (this.f169802i - this.f169806m)) - this.f169807n) + this.f169808o) {
            while (i > 0) {
                if (this.f169809p - this.f169807n == 0) {
                    m94993Q();
                }
                int min = Math.min(i, (int) (this.f169809p - this.f169807n));
                i -= min;
                this.f169807n += (long) min;
            }
        } else if (i < 0) {
            throw C62974ct.m95555e();
        } else {
            throw C62974ct.m95559i();
        }
    }

    /* renamed from: F */
    public final boolean mo58663F(int i) {
        int m;
        int i2 = i & 7;
        if (i2 == 0) {
            for (int i3 = 0; i3 < 10; i3++) {
                if (mo58692a() >= 0) {
                    return true;
                }
            }
            throw C62974ct.m95554d();
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

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x009b, code lost:
        if (com.google.protobuf.C63054fs.f170169a.mo59123a(r4) >= 0) goto L_0x009d;
     */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo58675j() {
        /*
            r10 = this;
            long r0 = r10.f169807n
            long r2 = r10.f169809p
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 != 0) goto L_0x000a
            goto L_0x00a0
        L_0x000a:
            r2 = 1
            long r4 = r0 + r2
            com.google.protobuf.fr r6 = com.google.protobuf.C63054fs.f170169a
            byte r0 = r6.mo59123a(r0)
            if (r0 < 0) goto L_0x001c
            long r4 = r10.f169807n
            long r4 = r4 + r2
            r10.f169807n = r4
            return r0
        L_0x001c:
            long r6 = r10.f169809p
            long r8 = r10.f169807n
            long r6 = r6 - r8
            r8 = 10
            int r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r1 < 0) goto L_0x00a0
            long r6 = r4 + r2
            com.google.protobuf.fr r1 = com.google.protobuf.C63054fs.f170169a
            byte r1 = r1.mo59123a(r4)
            int r1 = r1 << 7
            r0 = r0 ^ r1
            if (r0 >= 0) goto L_0x0037
            r0 = r0 ^ -128(0xffffffffffffff80, float:NaN)
            goto L_0x009d
        L_0x0037:
            long r4 = r6 + r2
            com.google.protobuf.fr r1 = com.google.protobuf.C63054fs.f170169a
            byte r1 = r1.mo59123a(r6)
            int r1 = r1 << 14
            r0 = r0 ^ r1
            if (r0 < 0) goto L_0x0048
            r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
        L_0x0046:
            r6 = r4
            goto L_0x009d
        L_0x0048:
            long r6 = r4 + r2
            com.google.protobuf.fr r1 = com.google.protobuf.C63054fs.f170169a
            byte r1 = r1.mo59123a(r4)
            int r1 = r1 << 21
            r0 = r0 ^ r1
            if (r0 >= 0) goto L_0x005a
            r1 = -2080896(0xffffffffffe03f80, float:NaN)
            r0 = r0 ^ r1
            goto L_0x009d
        L_0x005a:
            long r4 = r6 + r2
            com.google.protobuf.fr r1 = com.google.protobuf.C63054fs.f170169a
            byte r1 = r1.mo59123a(r6)
            int r6 = r1 << 28
            r0 = r0 ^ r6
            r6 = 266354560(0xfe03f80, float:2.2112565E-29)
            r0 = r0 ^ r6
            if (r1 >= 0) goto L_0x0046
            long r6 = r4 + r2
            com.google.protobuf.fr r1 = com.google.protobuf.C63054fs.f170169a
            byte r1 = r1.mo59123a(r4)
            if (r1 >= 0) goto L_0x009d
            long r4 = r6 + r2
            com.google.protobuf.fr r1 = com.google.protobuf.C63054fs.f170169a
            byte r1 = r1.mo59123a(r6)
            if (r1 >= 0) goto L_0x0046
            long r6 = r4 + r2
            com.google.protobuf.fr r1 = com.google.protobuf.C63054fs.f170169a
            byte r1 = r1.mo59123a(r4)
            if (r1 >= 0) goto L_0x009d
            long r4 = r6 + r2
            com.google.protobuf.fr r1 = com.google.protobuf.C63054fs.f170169a
            byte r1 = r1.mo59123a(r6)
            if (r1 >= 0) goto L_0x0046
            long r6 = r4 + r2
            com.google.protobuf.fr r1 = com.google.protobuf.C63054fs.f170169a
            byte r1 = r1.mo59123a(r4)
            if (r1 < 0) goto L_0x00a0
        L_0x009d:
            r10.f169807n = r6
            return r0
        L_0x00a0:
            long r0 = r10.mo58696s()
            int r1 = (int) r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C62894ab.mo58675j():int");
    }

    /* renamed from: r */
    public final long mo58695r() {
        long j;
        long j2;
        long j3;
        byte b;
        long j4 = this.f169807n;
        if (this.f169809p != j4) {
            long j5 = j4 + 1;
            byte a = C63054fs.f170169a.mo59123a(j4);
            if (a >= 0) {
                this.f169807n++;
                return (long) a;
            } else if (this.f169809p - this.f169807n >= 10) {
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
                                                    this.f169807n = j6;
                                                    return j;
                                                }
                                            }
                                        }
                                    }
                                }
                                j = a6 ^ j2;
                                j6 = j8;
                                this.f169807n = j6;
                                return j;
                            }
                            j = a5 ^ j3;
                        }
                    }
                    j6 = j7;
                    this.f169807n = j6;
                    return j;
                }
                j = (long) b;
                this.f169807n = j6;
                return j;
            }
        }
        return mo58696s();
    }
}
