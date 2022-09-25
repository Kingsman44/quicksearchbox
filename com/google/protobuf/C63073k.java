package com.google.protobuf;

import com.evernote.android.state.BuildConfig;
import java.nio.ByteBuffer;
import java.util.List;

/* renamed from: com.google.protobuf.k */
/* compiled from: PG */
final class C63073k extends C63074l {

    /* renamed from: a */
    private final byte[] f170223a;

    /* renamed from: b */
    private int f170224b;

    /* renamed from: c */
    private int f170225c;

    /* renamed from: d */
    private int f170226d;

    /* renamed from: e */
    private int f170227e;

    public C63073k(ByteBuffer byteBuffer) {
        this.f170223a = byteBuffer.array();
        this.f170224b = byteBuffer.arrayOffset() + byteBuffer.position();
        this.f170225c = byteBuffer.arrayOffset() + byteBuffer.limit();
    }

    /* renamed from: V */
    private final byte m96035V() {
        int i = this.f170224b;
        if (i != this.f170225c) {
            byte[] bArr = this.f170223a;
            this.f170224b = i + 1;
            return bArr[i];
        }
        throw C62974ct.m95559i();
    }

    /* renamed from: W */
    private final int m96036W() {
        m96045af(4);
        return m96037X();
    }

    /* renamed from: X */
    private final int m96037X() {
        int i = this.f170224b;
        byte[] bArr = this.f170223a;
        this.f170224b = i + 4;
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    /* renamed from: Y */
    private final int m96038Y() {
        byte b;
        int i = this.f170224b;
        int i2 = this.f170225c;
        if (i2 != i) {
            byte[] bArr = this.f170223a;
            int i3 = i + 1;
            byte b2 = bArr[i];
            if (b2 >= 0) {
                this.f170224b = i3;
                return b2;
            } else if (i2 - i3 < 9) {
                return (int) m96041ab();
            } else {
                int i4 = i3 + 1;
                byte b3 = b2 ^ (bArr[i3] << 7);
                if (b3 < 0) {
                    b = b3 ^ Byte.MIN_VALUE;
                } else {
                    int i5 = i4 + 1;
                    byte b4 = b3 ^ (bArr[i4] << 14);
                    if (b4 >= 0) {
                        b = b4 ^ 16256;
                    } else {
                        i4 = i5 + 1;
                        byte b5 = b4 ^ (bArr[i5] << 21);
                        if (b5 < 0) {
                            b = b5 ^ -2080896;
                        } else {
                            i5 = i4 + 1;
                            byte b6 = bArr[i4];
                            b = (b5 ^ (b6 << 28)) ^ 266354560;
                            if (b6 < 0) {
                                i4 = i5 + 1;
                                if (bArr[i5] < 0) {
                                    i5 = i4 + 1;
                                    if (bArr[i4] < 0) {
                                        i4 = i5 + 1;
                                        if (bArr[i5] < 0) {
                                            i5 = i4 + 1;
                                            if (bArr[i4] < 0) {
                                                i4 = i5 + 1;
                                                if (bArr[i5] < 0) {
                                                    throw C62974ct.m95554d();
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    i4 = i5;
                }
                this.f170224b = i4;
                return b;
            }
        } else {
            throw C62974ct.m95559i();
        }
    }

    /* renamed from: Z */
    private final long m96039Z() {
        m96045af(8);
        return m96040aa();
    }

    /* renamed from: aa */
    private final long m96040aa() {
        int i = this.f170224b;
        byte[] bArr = this.f170223a;
        this.f170224b = i + 8;
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }

    /* renamed from: ab */
    private final long m96041ab() {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            byte V = m96035V();
            j |= ((long) (V & Byte.MAX_VALUE)) << i;
            if ((V & 128) == 0) {
                return j;
            }
        }
        throw C62974ct.m95554d();
    }

    /* renamed from: ac */
    private final Object m96042ac(C63066gd gdVar, Class cls, C62921ba baVar) {
        C63066gd gdVar2 = C63066gd.DOUBLE;
        switch (gdVar.ordinal()) {
            case 0:
                return Double.valueOf(mo58728a());
            case 1:
                return Float.valueOf(mo58729b());
            case 2:
                return Long.valueOf(mo58739l());
            case 3:
                return Long.valueOf(mo58742o());
            case 4:
                return Integer.valueOf(mo58734g());
            case 5:
                return Long.valueOf(mo58738k());
            case 6:
                return Integer.valueOf(mo58733f());
            case 7:
                return Boolean.valueOf(mo58726T());
            case 8:
                return mo59155w(true);
            case 10:
                return mo58746t(cls, baVar);
            case 11:
                return mo58743q();
            case 12:
                return Integer.valueOf(mo58737j());
            case 13:
                return Integer.valueOf(mo58732e());
            case 14:
                return Integer.valueOf(mo58735h());
            case 15:
                return Long.valueOf(mo58740m());
            case 16:
                return Integer.valueOf(mo58736i());
            case 17:
                return Long.valueOf(mo58741n());
            default:
                throw new RuntimeException("unsupported field type.");
        }
    }

    /* renamed from: ad */
    private final Object m96043ad(C63022en enVar, C62921ba baVar) {
        int i = this.f170227e;
        this.f170227e = ((this.f170226d >>> 3) << 3) | 4;
        try {
            Object e = enVar.mo58995e();
            enVar.mo58998h(e, this, baVar);
            enVar.mo58996f(e);
            if (this.f170226d == this.f170227e) {
                return e;
            }
            throw C62974ct.m95556f();
        } finally {
            this.f170227e = i;
        }
    }

    /* renamed from: ae */
    private final Object m96044ae(C63022en enVar, C62921ba baVar) {
        int Y = m96038Y();
        m96045af(Y);
        int i = this.f170225c;
        int i2 = this.f170224b + Y;
        this.f170225c = i2;
        try {
            Object e = enVar.mo58995e();
            enVar.mo58998h(e, this, baVar);
            enVar.mo58996f(e);
            if (this.f170224b == i2) {
                return e;
            }
            throw C62974ct.m95556f();
        } finally {
            this.f170225c = i;
        }
    }

    /* renamed from: af */
    private final void m96045af(int i) {
        if (i < 0 || i > this.f170225c - this.f170224b) {
            throw C62974ct.m95559i();
        }
    }

    /* renamed from: ag */
    private final void m96046ag(int i) {
        if (this.f170224b != i) {
            throw C62974ct.m95559i();
        }
    }

    /* renamed from: ah */
    private final void m96047ah(int i) {
        if ((this.f170226d & 7) != i) {
            throw new C62973cs();
        }
    }

    /* renamed from: ai */
    private final void m96048ai(int i) {
        m96045af(i);
        this.f170224b += i;
    }

    /* renamed from: aj */
    private final void m96049aj(int i) {
        m96045af(i);
        if ((i & 3) != 0) {
            throw C62974ct.m95556f();
        }
    }

    /* renamed from: ak */
    private final void m96050ak(int i) {
        m96045af(i);
        if ((i & 7) != 0) {
            throw C62974ct.m95556f();
        }
    }

    /* renamed from: al */
    private final boolean m96051al() {
        return this.f170224b == this.f170225c;
    }

    /* renamed from: A */
    public final void mo58708A(List list) {
        int i;
        int i2;
        if (list instanceof C62908ap) {
            C62908ap apVar = (C62908ap) list;
            int i3 = this.f170226d & 7;
            if (i3 == 1) {
                do {
                    apVar.mo58801g(mo58728a());
                    if (!m96051al()) {
                        i2 = this.f170224b;
                    } else {
                        return;
                    }
                } while (m96038Y() == this.f170226d);
                this.f170224b = i2;
            } else if (i3 == 2) {
                int Y = m96038Y();
                m96050ak(Y);
                int i4 = this.f170224b + Y;
                while (this.f170224b < i4) {
                    apVar.mo58801g(Double.longBitsToDouble(m96040aa()));
                }
            } else {
                throw new C62973cs();
            }
        } else {
            int i5 = this.f170226d & 7;
            if (i5 == 1) {
                do {
                    list.add(Double.valueOf(mo58728a()));
                    if (!m96051al()) {
                        i = this.f170224b;
                    } else {
                        return;
                    }
                } while (m96038Y() == this.f170226d);
                this.f170224b = i;
            } else if (i5 == 2) {
                int Y2 = m96038Y();
                m96050ak(Y2);
                int i6 = this.f170224b + Y2;
                while (this.f170224b < i6) {
                    list.add(Double.valueOf(Double.longBitsToDouble(m96040aa())));
                }
            } else {
                throw new C62973cs();
            }
        }
    }

    /* renamed from: B */
    public final void mo58709B(List list) {
        int i;
        int i2;
        if (list instanceof C62954ca) {
            C62954ca caVar = (C62954ca) list;
            int i3 = this.f170226d & 7;
            if (i3 == 0) {
                do {
                    caVar.mo58916g(mo58732e());
                    if (!m96051al()) {
                        i2 = this.f170224b;
                    } else {
                        return;
                    }
                } while (m96038Y() == this.f170226d);
                this.f170224b = i2;
            } else if (i3 == 2) {
                int Y = this.f170224b + m96038Y();
                while (this.f170224b < Y) {
                    caVar.mo58916g(m96038Y());
                }
            } else {
                throw new C62973cs();
            }
        } else {
            int i4 = this.f170226d & 7;
            if (i4 == 0) {
                do {
                    list.add(Integer.valueOf(mo58732e()));
                    if (!m96051al()) {
                        i = this.f170224b;
                    } else {
                        return;
                    }
                } while (m96038Y() == this.f170226d);
                this.f170224b = i;
            } else if (i4 == 2) {
                int Y2 = this.f170224b + m96038Y();
                while (this.f170224b < Y2) {
                    list.add(Integer.valueOf(m96038Y()));
                }
            } else {
                throw new C62973cs();
            }
        }
    }

    /* renamed from: C */
    public final void mo58710C(List list) {
        int i;
        int i2;
        if (list instanceof C62954ca) {
            C62954ca caVar = (C62954ca) list;
            int i3 = this.f170226d & 7;
            if (i3 == 2) {
                int Y = m96038Y();
                m96049aj(Y);
                int i4 = this.f170224b + Y;
                while (this.f170224b < i4) {
                    caVar.mo58916g(m96037X());
                }
            } else if (i3 == 5) {
                do {
                    caVar.mo58916g(mo58733f());
                    if (!m96051al()) {
                        i2 = this.f170224b;
                    } else {
                        return;
                    }
                } while (m96038Y() == this.f170226d);
                this.f170224b = i2;
            } else {
                throw new C62973cs();
            }
        } else {
            int i5 = this.f170226d & 7;
            if (i5 == 2) {
                int Y2 = m96038Y();
                m96049aj(Y2);
                int i6 = this.f170224b + Y2;
                while (this.f170224b < i6) {
                    list.add(Integer.valueOf(m96037X()));
                }
            } else if (i5 == 5) {
                do {
                    list.add(Integer.valueOf(mo58733f()));
                    if (!m96051al()) {
                        i = this.f170224b;
                    } else {
                        return;
                    }
                } while (m96038Y() == this.f170226d);
                this.f170224b = i;
            } else {
                throw new C62973cs();
            }
        }
    }

    /* renamed from: D */
    public final void mo58711D(List list) {
        int i;
        int i2;
        if (list instanceof C62989dh) {
            C62989dh dhVar = (C62989dh) list;
            int i3 = this.f170226d & 7;
            if (i3 == 1) {
                do {
                    dhVar.mo58929f(mo58738k());
                    if (!m96051al()) {
                        i2 = this.f170224b;
                    } else {
                        return;
                    }
                } while (m96038Y() == this.f170226d);
                this.f170224b = i2;
            } else if (i3 == 2) {
                int Y = m96038Y();
                m96050ak(Y);
                int i4 = this.f170224b + Y;
                while (this.f170224b < i4) {
                    dhVar.mo58929f(m96040aa());
                }
            } else {
                throw new C62973cs();
            }
        } else {
            int i5 = this.f170226d & 7;
            if (i5 == 1) {
                do {
                    list.add(Long.valueOf(mo58738k()));
                    if (!m96051al()) {
                        i = this.f170224b;
                    } else {
                        return;
                    }
                } while (m96038Y() == this.f170226d);
                this.f170224b = i;
            } else if (i5 == 2) {
                int Y2 = m96038Y();
                m96050ak(Y2);
                int i6 = this.f170224b + Y2;
                while (this.f170224b < i6) {
                    list.add(Long.valueOf(m96040aa()));
                }
            } else {
                throw new C62973cs();
            }
        }
    }

    /* renamed from: E */
    public final void mo58712E(List list) {
        int i;
        int i2;
        if (list instanceof C62929bi) {
            C62929bi biVar = (C62929bi) list;
            int i3 = this.f170226d & 7;
            if (i3 == 2) {
                int Y = m96038Y();
                m96049aj(Y);
                int i4 = this.f170224b + Y;
                while (this.f170224b < i4) {
                    biVar.mo58861g(Float.intBitsToFloat(m96037X()));
                }
            } else if (i3 == 5) {
                do {
                    biVar.mo58861g(mo58729b());
                    if (!m96051al()) {
                        i2 = this.f170224b;
                    } else {
                        return;
                    }
                } while (m96038Y() == this.f170226d);
                this.f170224b = i2;
            } else {
                throw new C62973cs();
            }
        } else {
            int i5 = this.f170226d & 7;
            if (i5 == 2) {
                int Y2 = m96038Y();
                m96049aj(Y2);
                int i6 = this.f170224b + Y2;
                while (this.f170224b < i6) {
                    list.add(Float.valueOf(Float.intBitsToFloat(m96037X())));
                }
            } else if (i5 == 5) {
                do {
                    list.add(Float.valueOf(mo58729b()));
                    if (!m96051al()) {
                        i = this.f170224b;
                    } else {
                        return;
                    }
                } while (m96038Y() == this.f170226d);
                this.f170224b = i;
            } else {
                throw new C62973cs();
            }
        }
    }

    @Deprecated
    /* renamed from: F */
    public final void mo58713F(List list, C63022en enVar, C62921ba baVar) {
        int i;
        int i2 = this.f170226d;
        if ((i2 & 7) == 3) {
            do {
                list.add(m96043ad(enVar, baVar));
                if (!m96051al()) {
                    i = this.f170224b;
                } else {
                    return;
                }
            } while (m96038Y() == i2);
            this.f170224b = i;
            return;
        }
        throw new C62973cs();
    }

    /* renamed from: G */
    public final void mo58714G(List list) {
        int i;
        int i2;
        if (list instanceof C62954ca) {
            C62954ca caVar = (C62954ca) list;
            int i3 = this.f170226d & 7;
            if (i3 == 0) {
                do {
                    caVar.mo58916g(mo58734g());
                    if (!m96051al()) {
                        i2 = this.f170224b;
                    } else {
                        return;
                    }
                } while (m96038Y() == this.f170226d);
                this.f170224b = i2;
            } else if (i3 == 2) {
                int Y = this.f170224b + m96038Y();
                while (this.f170224b < Y) {
                    caVar.mo58916g(m96038Y());
                }
                m96046ag(Y);
            } else {
                throw new C62973cs();
            }
        } else {
            int i4 = this.f170226d & 7;
            if (i4 == 0) {
                do {
                    list.add(Integer.valueOf(mo58734g()));
                    if (!m96051al()) {
                        i = this.f170224b;
                    } else {
                        return;
                    }
                } while (m96038Y() == this.f170226d);
                this.f170224b = i;
            } else if (i4 == 2) {
                int Y2 = this.f170224b + m96038Y();
                while (this.f170224b < Y2) {
                    list.add(Integer.valueOf(m96038Y()));
                }
                m96046ag(Y2);
            } else {
                throw new C62973cs();
            }
        }
    }

    /* renamed from: H */
    public final void mo58715H(List list) {
        int i;
        int i2;
        if (list instanceof C62989dh) {
            C62989dh dhVar = (C62989dh) list;
            int i3 = this.f170226d & 7;
            if (i3 == 0) {
                do {
                    dhVar.mo58929f(mo58739l());
                    if (!m96051al()) {
                        i2 = this.f170224b;
                    } else {
                        return;
                    }
                } while (m96038Y() == this.f170226d);
                this.f170224b = i2;
            } else if (i3 == 2) {
                int Y = this.f170224b + m96038Y();
                while (this.f170224b < Y) {
                    dhVar.mo58929f(mo59154p());
                }
                m96046ag(Y);
            } else {
                throw new C62973cs();
            }
        } else {
            int i4 = this.f170226d & 7;
            if (i4 == 0) {
                do {
                    list.add(Long.valueOf(mo58739l()));
                    if (!m96051al()) {
                        i = this.f170224b;
                    } else {
                        return;
                    }
                } while (m96038Y() == this.f170226d);
                this.f170224b = i;
            } else if (i4 == 2) {
                int Y2 = this.f170224b + m96038Y();
                while (this.f170224b < Y2) {
                    list.add(Long.valueOf(mo59154p()));
                }
                m96046ag(Y2);
            } else {
                throw new C62973cs();
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:19|20|(2:22|35)(3:30|23|24)) */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0052, code lost:
        if (mo58727U() != false) goto L_0x0054;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x005a, code lost:
        throw new com.google.protobuf.C62974ct("Unable to parse map entry.");
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x004e */
    /* renamed from: I */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo58716I(java.util.Map r8, com.google.protobuf.C62993dl r9, com.google.protobuf.C62921ba r10) {
        /*
            r7 = this;
            r0 = 2
            r7.m96047ah(r0)
            int r1 = r7.m96038Y()
            r7.m96045af(r1)
            int r2 = r7.f170225c
            int r3 = r7.f170224b
            int r3 = r3 + r1
            r7.f170225c = r3
            java.lang.Object r1 = r9.f170053b     // Catch:{ all -> 0x005b }
            java.lang.Object r3 = r9.f170055d     // Catch:{ all -> 0x005b }
        L_0x0016:
            int r4 = r7.mo58730c()     // Catch:{ all -> 0x005b }
            r5 = 2147483647(0x7fffffff, float:NaN)
            if (r4 != r5) goto L_0x0025
            r8.put(r1, r3)     // Catch:{ all -> 0x005b }
            r7.f170225c = r2
            return
        L_0x0025:
            r5 = 1
            java.lang.String r6 = "Unable to parse map entry."
            if (r4 == r5) goto L_0x0046
            if (r4 == r0) goto L_0x0039
            boolean r4 = r7.mo58727U()     // Catch:{ cs -> 0x004e }
            if (r4 == 0) goto L_0x0033
            goto L_0x0016
        L_0x0033:
            com.google.protobuf.ct r4 = new com.google.protobuf.ct     // Catch:{ cs -> 0x004e }
            r4.<init>((java.lang.String) r6)     // Catch:{ cs -> 0x004e }
            throw r4     // Catch:{ cs -> 0x004e }
        L_0x0039:
            com.google.protobuf.gd r4 = r9.f170054c     // Catch:{ cs -> 0x004e }
            java.lang.Object r5 = r9.f170055d     // Catch:{ cs -> 0x004e }
            java.lang.Class r5 = r5.getClass()     // Catch:{ cs -> 0x004e }
            java.lang.Object r3 = r7.m96042ac(r4, r5, r10)     // Catch:{ cs -> 0x004e }
            goto L_0x0016
        L_0x0046:
            com.google.protobuf.gd r4 = r9.f170052a     // Catch:{ cs -> 0x004e }
            r5 = 0
            java.lang.Object r1 = r7.m96042ac(r4, r5, r5)     // Catch:{ cs -> 0x004e }
            goto L_0x0016
        L_0x004e:
            boolean r4 = r7.mo58727U()     // Catch:{ all -> 0x005b }
            if (r4 == 0) goto L_0x0055
            goto L_0x0016
        L_0x0055:
            com.google.protobuf.ct r8 = new com.google.protobuf.ct     // Catch:{ all -> 0x005b }
            r8.<init>((java.lang.String) r6)     // Catch:{ all -> 0x005b }
            throw r8     // Catch:{ all -> 0x005b }
        L_0x005b:
            r8 = move-exception
            r7.f170225c = r2
            goto L_0x0060
        L_0x005f:
            throw r8
        L_0x0060:
            goto L_0x005f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C63073k.mo58716I(java.util.Map, com.google.protobuf.dl, com.google.protobuf.ba):void");
    }

    /* renamed from: J */
    public final void mo58717J(List list, C63022en enVar, C62921ba baVar) {
        int i;
        int i2 = this.f170226d;
        if ((i2 & 7) == 2) {
            do {
                list.add(m96044ae(enVar, baVar));
                if (!m96051al()) {
                    i = this.f170224b;
                } else {
                    return;
                }
            } while (m96038Y() == i2);
            this.f170224b = i;
            return;
        }
        throw new C62973cs();
    }

    /* renamed from: K */
    public final void mo58718K(List list) {
        int i;
        int i2;
        if (list instanceof C62954ca) {
            C62954ca caVar = (C62954ca) list;
            int i3 = this.f170226d & 7;
            if (i3 == 2) {
                int Y = m96038Y();
                m96049aj(Y);
                int i4 = this.f170224b + Y;
                while (this.f170224b < i4) {
                    caVar.mo58916g(m96037X());
                }
            } else if (i3 == 5) {
                do {
                    caVar.mo58916g(mo58735h());
                    if (!m96051al()) {
                        i2 = this.f170224b;
                    } else {
                        return;
                    }
                } while (m96038Y() == this.f170226d);
                this.f170224b = i2;
            } else {
                throw new C62973cs();
            }
        } else {
            int i5 = this.f170226d & 7;
            if (i5 == 2) {
                int Y2 = m96038Y();
                m96049aj(Y2);
                int i6 = this.f170224b + Y2;
                while (this.f170224b < i6) {
                    list.add(Integer.valueOf(m96037X()));
                }
            } else if (i5 == 5) {
                do {
                    list.add(Integer.valueOf(mo58735h()));
                    if (!m96051al()) {
                        i = this.f170224b;
                    } else {
                        return;
                    }
                } while (m96038Y() == this.f170226d);
                this.f170224b = i;
            } else {
                throw new C62973cs();
            }
        }
    }

    /* renamed from: L */
    public final void mo58719L(List list) {
        int i;
        int i2;
        if (list instanceof C62989dh) {
            C62989dh dhVar = (C62989dh) list;
            int i3 = this.f170226d & 7;
            if (i3 == 1) {
                do {
                    dhVar.mo58929f(mo58740m());
                    if (!m96051al()) {
                        i2 = this.f170224b;
                    } else {
                        return;
                    }
                } while (m96038Y() == this.f170226d);
                this.f170224b = i2;
            } else if (i3 == 2) {
                int Y = m96038Y();
                m96050ak(Y);
                int i4 = this.f170224b + Y;
                while (this.f170224b < i4) {
                    dhVar.mo58929f(m96040aa());
                }
            } else {
                throw new C62973cs();
            }
        } else {
            int i5 = this.f170226d & 7;
            if (i5 == 1) {
                do {
                    list.add(Long.valueOf(mo58740m()));
                    if (!m96051al()) {
                        i = this.f170224b;
                    } else {
                        return;
                    }
                } while (m96038Y() == this.f170226d);
                this.f170224b = i;
            } else if (i5 == 2) {
                int Y2 = m96038Y();
                m96050ak(Y2);
                int i6 = this.f170224b + Y2;
                while (this.f170224b < i6) {
                    list.add(Long.valueOf(m96040aa()));
                }
            } else {
                throw new C62973cs();
            }
        }
    }

    /* renamed from: M */
    public final void mo58720M(List list) {
        int i;
        int i2;
        if (list instanceof C62954ca) {
            C62954ca caVar = (C62954ca) list;
            int i3 = this.f170226d & 7;
            if (i3 == 0) {
                do {
                    caVar.mo58916g(mo58736i());
                    if (!m96051al()) {
                        i2 = this.f170224b;
                    } else {
                        return;
                    }
                } while (m96038Y() == this.f170226d);
                this.f170224b = i2;
            } else if (i3 == 2) {
                int Y = this.f170224b + m96038Y();
                while (this.f170224b < Y) {
                    caVar.mo58916g(C62897ae.m95107I(m96038Y()));
                }
            } else {
                throw new C62973cs();
            }
        } else {
            int i4 = this.f170226d & 7;
            if (i4 == 0) {
                do {
                    list.add(Integer.valueOf(mo58736i()));
                    if (!m96051al()) {
                        i = this.f170224b;
                    } else {
                        return;
                    }
                } while (m96038Y() == this.f170226d);
                this.f170224b = i;
            } else if (i4 == 2) {
                int Y2 = this.f170224b + m96038Y();
                while (this.f170224b < Y2) {
                    list.add(Integer.valueOf(C62897ae.m95107I(m96038Y())));
                }
            } else {
                throw new C62973cs();
            }
        }
    }

    /* renamed from: N */
    public final void mo58721N(List list) {
        int i;
        int i2;
        if (list instanceof C62989dh) {
            C62989dh dhVar = (C62989dh) list;
            int i3 = this.f170226d & 7;
            if (i3 == 0) {
                do {
                    dhVar.mo58929f(mo58741n());
                    if (!m96051al()) {
                        i2 = this.f170224b;
                    } else {
                        return;
                    }
                } while (m96038Y() == this.f170226d);
                this.f170224b = i2;
            } else if (i3 == 2) {
                int Y = this.f170224b + m96038Y();
                while (this.f170224b < Y) {
                    dhVar.mo58929f(C62897ae.m95109K(mo59154p()));
                }
            } else {
                throw new C62973cs();
            }
        } else {
            int i4 = this.f170226d & 7;
            if (i4 == 0) {
                do {
                    list.add(Long.valueOf(mo58741n()));
                    if (!m96051al()) {
                        i = this.f170224b;
                    } else {
                        return;
                    }
                } while (m96038Y() == this.f170226d);
                this.f170224b = i;
            } else if (i4 == 2) {
                int Y2 = this.f170224b + m96038Y();
                while (this.f170224b < Y2) {
                    list.add(Long.valueOf(C62897ae.m95109K(mo59154p())));
                }
            } else {
                throw new C62973cs();
            }
        }
    }

    /* renamed from: O */
    public final void mo58722O(List list) {
        mo59153P(list, false);
    }

    /* renamed from: P */
    public final void mo59153P(List list, boolean z) {
        int i;
        int i2;
        if ((this.f170226d & 7) != 2) {
            throw new C62973cs();
        } else if ((list instanceof C62983db) && !z) {
            C62983db dbVar = (C62983db) list;
            do {
                dbVar.mo58969i(mo58743q());
                if (!m96051al()) {
                    i2 = this.f170224b;
                } else {
                    return;
                }
            } while (m96038Y() == this.f170226d);
            this.f170224b = i2;
        } else {
            do {
                list.add(mo59155w(z));
                if (!m96051al()) {
                    i = this.f170224b;
                } else {
                    return;
                }
            } while (m96038Y() == this.f170226d);
            this.f170224b = i;
        }
    }

    /* renamed from: Q */
    public final void mo58723Q(List list) {
        mo59153P(list, true);
    }

    /* renamed from: R */
    public final void mo58724R(List list) {
        int i;
        int i2;
        if (list instanceof C62954ca) {
            C62954ca caVar = (C62954ca) list;
            int i3 = this.f170226d & 7;
            if (i3 == 0) {
                do {
                    caVar.mo58916g(mo58737j());
                    if (!m96051al()) {
                        i2 = this.f170224b;
                    } else {
                        return;
                    }
                } while (m96038Y() == this.f170226d);
                this.f170224b = i2;
            } else if (i3 == 2) {
                int Y = this.f170224b + m96038Y();
                while (this.f170224b < Y) {
                    caVar.mo58916g(m96038Y());
                }
            } else {
                throw new C62973cs();
            }
        } else {
            int i4 = this.f170226d & 7;
            if (i4 == 0) {
                do {
                    list.add(Integer.valueOf(mo58737j()));
                    if (!m96051al()) {
                        i = this.f170224b;
                    } else {
                        return;
                    }
                } while (m96038Y() == this.f170226d);
                this.f170224b = i;
            } else if (i4 == 2) {
                int Y2 = this.f170224b + m96038Y();
                while (this.f170224b < Y2) {
                    list.add(Integer.valueOf(m96038Y()));
                }
            } else {
                throw new C62973cs();
            }
        }
    }

    /* renamed from: S */
    public final void mo58725S(List list) {
        int i;
        int i2;
        if (list instanceof C62989dh) {
            C62989dh dhVar = (C62989dh) list;
            int i3 = this.f170226d & 7;
            if (i3 == 0) {
                do {
                    dhVar.mo58929f(mo58742o());
                    if (!m96051al()) {
                        i2 = this.f170224b;
                    } else {
                        return;
                    }
                } while (m96038Y() == this.f170226d);
                this.f170224b = i2;
            } else if (i3 == 2) {
                int Y = this.f170224b + m96038Y();
                while (this.f170224b < Y) {
                    dhVar.mo58929f(mo59154p());
                }
                m96046ag(Y);
            } else {
                throw new C62973cs();
            }
        } else {
            int i4 = this.f170226d & 7;
            if (i4 == 0) {
                do {
                    list.add(Long.valueOf(mo58742o()));
                    if (!m96051al()) {
                        i = this.f170224b;
                    } else {
                        return;
                    }
                } while (m96038Y() == this.f170226d);
                this.f170224b = i;
            } else if (i4 == 2) {
                int Y2 = this.f170224b + m96038Y();
                while (this.f170224b < Y2) {
                    list.add(Long.valueOf(mo59154p()));
                }
                m96046ag(Y2);
            } else {
                throw new C62973cs();
            }
        }
    }

    /* renamed from: T */
    public final boolean mo58726T() {
        m96047ah(0);
        if (m96038Y() != 0) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x002f A[LOOP:0: B:18:0x002f->B:21:0x003c, LOOP_START] */
    /* renamed from: U */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo58727U() {
        /*
            r7 = this;
            boolean r0 = r7.m96051al()
            r1 = 0
            if (r0 != 0) goto L_0x0086
            int r0 = r7.f170226d
            int r2 = r7.f170227e
            if (r0 != r2) goto L_0x000f
            goto L_0x0086
        L_0x000f:
            r3 = r0 & 7
            r4 = 1
            if (r3 == 0) goto L_0x005a
            if (r3 == r4) goto L_0x0054
            r1 = 2
            if (r3 == r1) goto L_0x004c
            r1 = 4
            r5 = 3
            if (r3 == r5) goto L_0x002a
            r0 = 5
            if (r3 != r0) goto L_0x0024
            r7.m96048ai(r1)
            return r4
        L_0x0024:
            com.google.protobuf.cs r0 = new com.google.protobuf.cs
            r0.<init>()
            throw r0
        L_0x002a:
            int r0 = r0 >>> r5
            int r0 = r0 << r5
            r0 = r0 | r1
            r7.f170227e = r0
        L_0x002f:
            int r0 = r7.mo58730c()
            r1 = 2147483647(0x7fffffff, float:NaN)
            if (r0 == r1) goto L_0x003e
            boolean r0 = r7.mo58727U()
            if (r0 != 0) goto L_0x002f
        L_0x003e:
            int r0 = r7.f170226d
            int r1 = r7.f170227e
            if (r0 != r1) goto L_0x0047
            r7.f170227e = r2
            return r4
        L_0x0047:
            com.google.protobuf.ct r0 = com.google.protobuf.C62974ct.m95556f()
            throw r0
        L_0x004c:
            int r0 = r7.m96038Y()
            r7.m96048ai(r0)
            return r4
        L_0x0054:
            r0 = 8
            r7.m96048ai(r0)
            return r4
        L_0x005a:
            int r0 = r7.f170225c
            int r2 = r7.f170224b
            int r0 = r0 - r2
            r3 = 10
            if (r0 < r3) goto L_0x0075
            byte[] r0 = r7.f170223a
            r5 = 0
        L_0x0066:
            if (r5 >= r3) goto L_0x0075
            int r6 = r2 + 1
            byte r2 = r0[r2]
            if (r2 < 0) goto L_0x0071
            r7.f170224b = r6
            goto L_0x0080
        L_0x0071:
            int r5 = r5 + 1
            r2 = r6
            goto L_0x0066
        L_0x0075:
            if (r1 >= r3) goto L_0x0081
            byte r0 = r7.m96035V()
            if (r0 >= 0) goto L_0x0080
            int r1 = r1 + 1
            goto L_0x0075
        L_0x0080:
            return r4
        L_0x0081:
            com.google.protobuf.ct r0 = com.google.protobuf.C62974ct.m95554d()
            throw r0
        L_0x0086:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C63073k.mo58727U():boolean");
    }

    /* renamed from: a */
    public final double mo58728a() {
        m96047ah(1);
        return Double.longBitsToDouble(m96039Z());
    }

    /* renamed from: b */
    public final float mo58729b() {
        m96047ah(5);
        return Float.intBitsToFloat(m96036W());
    }

    /* renamed from: c */
    public final int mo58730c() {
        if (m96051al()) {
            return Integer.MAX_VALUE;
        }
        int Y = m96038Y();
        this.f170226d = Y;
        if (Y == this.f170227e) {
            return Integer.MAX_VALUE;
        }
        return Y >>> 3;
    }

    /* renamed from: d */
    public final int mo58731d() {
        return this.f170226d;
    }

    /* renamed from: e */
    public final int mo58732e() {
        m96047ah(0);
        return m96038Y();
    }

    /* renamed from: f */
    public final int mo58733f() {
        m96047ah(5);
        return m96036W();
    }

    /* renamed from: g */
    public final int mo58734g() {
        m96047ah(0);
        return m96038Y();
    }

    /* renamed from: h */
    public final int mo58735h() {
        m96047ah(5);
        return m96036W();
    }

    /* renamed from: i */
    public final int mo58736i() {
        m96047ah(0);
        return C62897ae.m95107I(m96038Y());
    }

    /* renamed from: j */
    public final int mo58737j() {
        m96047ah(0);
        return m96038Y();
    }

    /* renamed from: k */
    public final long mo58738k() {
        m96047ah(1);
        return m96039Z();
    }

    /* renamed from: l */
    public final long mo58739l() {
        m96047ah(0);
        return mo59154p();
    }

    /* renamed from: m */
    public final long mo58740m() {
        m96047ah(1);
        return m96039Z();
    }

    /* renamed from: n */
    public final long mo58741n() {
        m96047ah(0);
        return C62897ae.m95109K(mo59154p());
    }

    /* renamed from: o */
    public final long mo58742o() {
        m96047ah(0);
        return mo59154p();
    }

    /* renamed from: p */
    public final long mo59154p() {
        long j;
        long j2;
        long j3;
        long j4;
        byte b;
        int i = this.f170224b;
        int i2 = this.f170225c;
        if (i2 != i) {
            byte[] bArr = this.f170223a;
            int i3 = i + 1;
            byte b2 = bArr[i];
            if (b2 >= 0) {
                this.f170224b = i3;
                return (long) b2;
            } else if (i2 - i3 < 9) {
                return m96041ab();
            } else {
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
                                                    this.f170224b = i4;
                                                    return j;
                                                }
                                                throw C62974ct.m95554d();
                                            }
                                        }
                                    }
                                }
                                j = j3 ^ j6;
                                i4 = i6;
                                this.f170224b = i4;
                                return j;
                            }
                            j2 = j5 ^ j4;
                        }
                    }
                    i4 = i5;
                    j = j2;
                    this.f170224b = i4;
                    return j;
                }
                j = (long) b;
                this.f170224b = i4;
                return j;
            }
        } else {
            throw C62974ct.m95559i();
        }
    }

    /* renamed from: q */
    public final C63088z mo58743q() {
        m96047ah(2);
        int Y = m96038Y();
        if (Y == 0) {
            return C63088z.f170246b;
        }
        m96045af(Y);
        C63088z H = C63088z.m96146H(this.f170223a, this.f170224b, Y);
        this.f170224b += Y;
        return H;
    }

    @Deprecated
    /* renamed from: r */
    public final Object mo58744r(Class cls, C62921ba baVar) {
        m96047ah(3);
        return m96043ad(C63013ee.f170090a.mo59017a(cls), baVar);
    }

    @Deprecated
    /* renamed from: s */
    public final Object mo58745s(C63022en enVar, C62921ba baVar) {
        m96047ah(3);
        return m96043ad(enVar, baVar);
    }

    /* renamed from: t */
    public final Object mo58746t(Class cls, C62921ba baVar) {
        m96047ah(2);
        return m96044ae(C63013ee.f170090a.mo59017a(cls), baVar);
    }

    /* renamed from: u */
    public final Object mo58747u(C63022en enVar, C62921ba baVar) {
        m96047ah(2);
        return m96044ae(enVar, baVar);
    }

    /* renamed from: v */
    public final String mo58748v() {
        return mo59155w(false);
    }

    /* renamed from: w */
    public final String mo59155w(boolean z) {
        m96047ah(2);
        int Y = m96038Y();
        if (Y == 0) {
            return BuildConfig.FLAVOR;
        }
        m96045af(Y);
        if (z) {
            byte[] bArr = this.f170223a;
            int i = this.f170224b;
            if (!C63059fx.f170178a.mo59150h(bArr, i, i + Y)) {
                throw C62974ct.m95553c();
            }
        }
        String str = new String(this.f170223a, this.f170224b, Y, C62972cr.f170009a);
        this.f170224b += Y;
        return str;
    }

    /* renamed from: x */
    public final String mo58750x() {
        return mo59155w(true);
    }

    /* renamed from: y */
    public final void mo58751y(List list) {
        int i;
        int i2;
        if (list instanceof C63078p) {
            C63078p pVar = (C63078p) list;
            int i3 = this.f170226d & 7;
            if (i3 == 0) {
                do {
                    pVar.mo58923f(mo58726T());
                    if (!m96051al()) {
                        i2 = this.f170224b;
                    } else {
                        return;
                    }
                } while (m96038Y() == this.f170226d);
                this.f170224b = i2;
            } else if (i3 == 2) {
                int Y = this.f170224b + m96038Y();
                while (this.f170224b < Y) {
                    pVar.mo58923f(m96038Y() != 0);
                }
                m96046ag(Y);
            } else {
                throw new C62973cs();
            }
        } else {
            int i4 = this.f170226d & 7;
            if (i4 == 0) {
                do {
                    list.add(Boolean.valueOf(mo58726T()));
                    if (!m96051al()) {
                        i = this.f170224b;
                    } else {
                        return;
                    }
                } while (m96038Y() == this.f170226d);
                this.f170224b = i;
            } else if (i4 == 2) {
                int Y2 = this.f170224b + m96038Y();
                while (this.f170224b < Y2) {
                    list.add(Boolean.valueOf(m96038Y() != 0));
                }
                m96046ag(Y2);
            } else {
                throw new C62973cs();
            }
        }
    }

    /* renamed from: z */
    public final void mo58752z(List list) {
        int i;
        if ((this.f170226d & 7) == 2) {
            do {
                list.add(mo58743q());
                if (!m96051al()) {
                    i = this.f170224b;
                } else {
                    return;
                }
            } while (m96038Y() == this.f170226d);
            this.f170224b = i;
            return;
        }
        throw new C62973cs();
    }
}
