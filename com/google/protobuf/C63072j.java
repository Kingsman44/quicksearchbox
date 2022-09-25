package com.google.protobuf;

import com.evernote.android.state.BuildConfig;

/* renamed from: com.google.protobuf.j */
/* compiled from: PG */
final class C63072j {
    /* renamed from: a */
    static int m96012a(byte[] bArr, int i, C63071i iVar) {
        int r = m96029r(bArr, i, iVar);
        int i2 = iVar.f170219a;
        if (i2 < 0) {
            throw C62974ct.m95555e();
        } else if (i2 > bArr.length - r) {
            throw C62974ct.m95559i();
        } else if (i2 == 0) {
            iVar.f170221c = C63088z.f170246b;
            return r;
        } else {
            iVar.f170221c = C63088z.m96142D(bArr, r, i2);
            return r + i2;
        }
    }

    /* renamed from: b */
    static int m96013b(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    /* renamed from: c */
    static int m96014c(C63022en enVar, byte[] bArr, int i, int i2, int i3, C63071i iVar) {
        C63003dv dvVar = (C63003dv) enVar;
        Object a = C63006dy.m95677a(dvVar.f170063a);
        int c = dvVar.mo58994c(a, bArr, i, i2, i3, iVar);
        dvVar.mo58996f(a);
        iVar.f170221c = a;
        return c;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static int m96015d(com.google.protobuf.C63022en r6, byte[] r7, int r8, int r9, com.google.protobuf.C63071i r10) {
        /*
            int r0 = r8 + 1
            byte r8 = r7[r8]
            if (r8 >= 0) goto L_0x000c
            int r0 = m96030s(r8, r7, r0, r10)
            int r8 = r10.f170219a
        L_0x000c:
            r3 = r0
            if (r8 < 0) goto L_0x0025
            int r9 = r9 - r3
            if (r8 > r9) goto L_0x0025
            java.lang.Object r9 = r6.mo58995e()
            int r8 = r8 + r3
            r0 = r6
            r1 = r9
            r2 = r7
            r4 = r8
            r5 = r10
            r0.mo58999i(r1, r2, r3, r4, r5)
            r6.mo58996f(r9)
            r10.f170221c = r9
            return r8
        L_0x0025:
            com.google.protobuf.ct r6 = com.google.protobuf.C62974ct.m95559i()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C63072j.m96015d(com.google.protobuf.en, byte[], int, int, com.google.protobuf.i):int");
    }

    /* renamed from: e */
    static int m96016e(C63022en enVar, int i, byte[] bArr, int i2, int i3, C62971cq cqVar, C63071i iVar) {
        int d = m96015d(enVar, bArr, i2, i3, iVar);
        cqVar.add(iVar.f170221c);
        while (d < i3) {
            int r = m96029r(bArr, d, iVar);
            if (i != iVar.f170219a) {
                break;
            }
            d = m96015d(enVar, bArr, r, i3, iVar);
            cqVar.add(iVar.f170221c);
        }
        return d;
    }

    /* renamed from: f */
    static int m96017f(byte[] bArr, int i, C62971cq cqVar, C63071i iVar) {
        C63078p pVar = (C63078p) cqVar;
        int r = m96029r(bArr, i, iVar);
        int i2 = iVar.f170219a + r;
        while (r < i2) {
            r = m96032u(bArr, r, iVar);
            pVar.mo58923f(iVar.f170220b != 0);
        }
        if (r == i2) {
            return r;
        }
        throw C62974ct.m95559i();
    }

    /* renamed from: g */
    static int m96018g(byte[] bArr, int i, C62971cq cqVar, C63071i iVar) {
        C62908ap apVar = (C62908ap) cqVar;
        int r = m96029r(bArr, i, iVar);
        int i2 = iVar.f170219a + r;
        while (r < i2) {
            apVar.mo58801g(Double.longBitsToDouble(m96034w(bArr, r)));
            r += 8;
        }
        if (r == i2) {
            return r;
        }
        throw C62974ct.m95559i();
    }

    /* renamed from: h */
    static int m96019h(byte[] bArr, int i, C62971cq cqVar, C63071i iVar) {
        C62954ca caVar = (C62954ca) cqVar;
        int r = m96029r(bArr, i, iVar);
        int i2 = iVar.f170219a + r;
        while (r < i2) {
            caVar.mo58916g(m96013b(bArr, r));
            r += 4;
        }
        if (r == i2) {
            return r;
        }
        throw C62974ct.m95559i();
    }

    /* renamed from: i */
    static int m96020i(byte[] bArr, int i, C62971cq cqVar, C63071i iVar) {
        C62989dh dhVar = (C62989dh) cqVar;
        int r = m96029r(bArr, i, iVar);
        int i2 = iVar.f170219a + r;
        while (r < i2) {
            dhVar.mo58929f(m96034w(bArr, r));
            r += 8;
        }
        if (r == i2) {
            return r;
        }
        throw C62974ct.m95559i();
    }

    /* renamed from: j */
    static int m96021j(byte[] bArr, int i, C62971cq cqVar, C63071i iVar) {
        C62929bi biVar = (C62929bi) cqVar;
        int r = m96029r(bArr, i, iVar);
        int i2 = iVar.f170219a + r;
        while (r < i2) {
            biVar.mo58861g(Float.intBitsToFloat(m96013b(bArr, r)));
            r += 4;
        }
        if (r == i2) {
            return r;
        }
        throw C62974ct.m95559i();
    }

    /* renamed from: k */
    static int m96022k(byte[] bArr, int i, C62971cq cqVar, C63071i iVar) {
        C62954ca caVar = (C62954ca) cqVar;
        int r = m96029r(bArr, i, iVar);
        int i2 = iVar.f170219a + r;
        while (r < i2) {
            r = m96029r(bArr, r, iVar);
            caVar.mo58916g(C62897ae.m95107I(iVar.f170219a));
        }
        if (r == i2) {
            return r;
        }
        throw C62974ct.m95559i();
    }

    /* renamed from: l */
    static int m96023l(byte[] bArr, int i, C62971cq cqVar, C63071i iVar) {
        C62989dh dhVar = (C62989dh) cqVar;
        int r = m96029r(bArr, i, iVar);
        int i2 = iVar.f170219a + r;
        while (r < i2) {
            r = m96032u(bArr, r, iVar);
            dhVar.mo58929f(C62897ae.m95109K(iVar.f170220b));
        }
        if (r == i2) {
            return r;
        }
        throw C62974ct.m95559i();
    }

    /* renamed from: m */
    static int m96024m(byte[] bArr, int i, C62971cq cqVar, C63071i iVar) {
        C62954ca caVar = (C62954ca) cqVar;
        int r = m96029r(bArr, i, iVar);
        int i2 = iVar.f170219a + r;
        while (r < i2) {
            r = m96029r(bArr, r, iVar);
            caVar.mo58916g(iVar.f170219a);
        }
        if (r == i2) {
            return r;
        }
        throw C62974ct.m95559i();
    }

    /* renamed from: n */
    static int m96025n(byte[] bArr, int i, C62971cq cqVar, C63071i iVar) {
        C62989dh dhVar = (C62989dh) cqVar;
        int r = m96029r(bArr, i, iVar);
        int i2 = iVar.f170219a + r;
        while (r < i2) {
            r = m96032u(bArr, r, iVar);
            dhVar.mo58929f(iVar.f170220b);
        }
        if (r == i2) {
            return r;
        }
        throw C62974ct.m95559i();
    }

    /* renamed from: o */
    static int m96026o(byte[] bArr, int i, C63071i iVar) {
        int r = m96029r(bArr, i, iVar);
        int i2 = iVar.f170219a;
        if (i2 < 0) {
            throw C62974ct.m95555e();
        } else if (i2 == 0) {
            iVar.f170221c = BuildConfig.FLAVOR;
            return r;
        } else {
            iVar.f170221c = new String(bArr, r, i2, C62972cr.f170009a);
            return r + i2;
        }
    }

    /* renamed from: p */
    static int m96027p(byte[] bArr, int i, C63071i iVar) {
        int r = m96029r(bArr, i, iVar);
        int i2 = iVar.f170219a;
        if (i2 < 0) {
            throw C62974ct.m95555e();
        } else if (i2 == 0) {
            iVar.f170221c = BuildConfig.FLAVOR;
            return r;
        } else {
            iVar.f170221c = C63059fx.f170178a.mo59146d(bArr, r, i2);
            return r + i2;
        }
    }

    /* renamed from: r */
    static int m96029r(byte[] bArr, int i, C63071i iVar) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b < 0) {
            return m96030s(b, bArr, i2, iVar);
        }
        iVar.f170219a = b;
        return i2;
    }

    /* renamed from: s */
    static int m96030s(int i, byte[] bArr, int i2, C63071i iVar) {
        int i3 = i & 127;
        int i4 = i2 + 1;
        byte b = bArr[i2];
        if (b >= 0) {
            iVar.f170219a = i3 | (b << 7);
            return i4;
        }
        int i5 = i3 | ((b & Byte.MAX_VALUE) << 7);
        int i6 = i4 + 1;
        byte b2 = bArr[i4];
        if (b2 >= 0) {
            iVar.f170219a = i5 | (b2 << 14);
            return i6;
        }
        int i7 = i5 | ((b2 & Byte.MAX_VALUE) << 14);
        int i8 = i6 + 1;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            iVar.f170219a = i7 | (b3 << 21);
            return i8;
        }
        int i9 = i7 | ((b3 & Byte.MAX_VALUE) << 21);
        int i10 = i8 + 1;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            iVar.f170219a = i9 | (b4 << 28);
            return i10;
        }
        int i11 = i9 | ((b4 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] < 0) {
                i10 = i12;
            } else {
                iVar.f170219a = i11;
                return i12;
            }
        }
    }

    /* renamed from: t */
    static int m96031t(int i, byte[] bArr, int i2, int i3, C62971cq cqVar, C63071i iVar) {
        C62954ca caVar = (C62954ca) cqVar;
        int r = m96029r(bArr, i2, iVar);
        caVar.mo58916g(iVar.f170219a);
        while (r < i3) {
            int r2 = m96029r(bArr, r, iVar);
            if (i != iVar.f170219a) {
                break;
            }
            r = m96029r(bArr, r2, iVar);
            caVar.mo58916g(iVar.f170219a);
        }
        return r;
    }

    /* renamed from: u */
    static int m96032u(byte[] bArr, int i, C63071i iVar) {
        int i2 = i + 1;
        long j = (long) bArr[i];
        if (j >= 0) {
            iVar.f170220b = j;
            return i2;
        }
        int i3 = i2 + 1;
        byte b = bArr[i2];
        long j2 = (j & 127) | (((long) (b & Byte.MAX_VALUE)) << 7);
        int i4 = 7;
        while (b < 0) {
            int i5 = i3 + 1;
            byte b2 = bArr[i3];
            i4 += 7;
            j2 |= ((long) (b2 & Byte.MAX_VALUE)) << i4;
            int i6 = i5;
            b = b2;
            i3 = i6;
        }
        iVar.f170220b = j2;
        return i3;
    }

    /* renamed from: w */
    static long m96034w(byte[] bArr, int i) {
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }

    /* renamed from: q */
    static int m96028q(int i, byte[] bArr, int i2, int i3, C63045fj fjVar, C63071i iVar) {
        if ((i >>> 3) != 0) {
            int i4 = i & 7;
            if (i4 == 0) {
                int u = m96032u(bArr, i2, iVar);
                fjVar.mo59107d(i, Long.valueOf(iVar.f170220b));
                return u;
            } else if (i4 == 1) {
                fjVar.mo59107d(i, Long.valueOf(m96034w(bArr, i2)));
                return i2 + 8;
            } else if (i4 == 2) {
                int r = m96029r(bArr, i2, iVar);
                int i5 = iVar.f170219a;
                if (i5 < 0) {
                    throw C62974ct.m95555e();
                } else if (i5 <= bArr.length - r) {
                    if (i5 == 0) {
                        fjVar.mo59107d(i, C63088z.f170246b);
                    } else {
                        fjVar.mo59107d(i, C63088z.m96142D(bArr, r, i5));
                    }
                    return r + i5;
                } else {
                    throw C62974ct.m95559i();
                }
            } else if (i4 == 3) {
                C63045fj fjVar2 = new C63045fj();
                int i6 = (i & -8) | 4;
                int i7 = 0;
                while (true) {
                    if (i2 >= i3) {
                        break;
                    }
                    int r2 = m96029r(bArr, i2, iVar);
                    int i8 = iVar.f170219a;
                    if (i8 == i6) {
                        i7 = i8;
                        i2 = r2;
                        break;
                    }
                    i7 = i8;
                    i2 = m96028q(i8, bArr, r2, i3, fjVar2, iVar);
                }
                if (i2 > i3 || i7 != i6) {
                    throw C62974ct.m95556f();
                }
                fjVar.mo59107d(i, fjVar2);
                return i2;
            } else if (i4 == 5) {
                fjVar.mo59107d(i, Integer.valueOf(m96013b(bArr, i2)));
                return i2 + 4;
            } else {
                throw C62974ct.m95552b();
            }
        } else {
            throw C62974ct.m95552b();
        }
    }

    /* renamed from: v */
    static int m96033v(int i, byte[] bArr, int i2, int i3, C63071i iVar) {
        if ((i >>> 3) != 0) {
            int i4 = i & 7;
            if (i4 == 0) {
                return m96032u(bArr, i2, iVar);
            }
            if (i4 == 1) {
                return i2 + 8;
            }
            if (i4 == 2) {
                return m96029r(bArr, i2, iVar) + iVar.f170219a;
            }
            if (i4 == 3) {
                int i5 = (i & -8) | 4;
                int i6 = 0;
                while (i2 < i3) {
                    i2 = m96029r(bArr, i2, iVar);
                    i6 = iVar.f170219a;
                    if (i6 == i5) {
                        break;
                    }
                    i2 = m96033v(i6, bArr, i2, i3, iVar);
                }
                if (i2 <= i3 && i6 == i5) {
                    return i2;
                }
                throw C62974ct.m95556f();
            } else if (i4 == 5) {
                return i2 + 4;
            } else {
                throw C62974ct.m95552b();
            }
        } else {
            throw C62974ct.m95552b();
        }
    }
}
