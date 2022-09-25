package com.google.p4272br;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.br.q */
/* compiled from: PG */
final class C56448q {

    /* renamed from: f */
    private static final int[][] f150769f = {new int[]{0, 1114111, 1}};

    /* renamed from: a */
    public final String f150770a;

    /* renamed from: b */
    public int f150771b;

    /* renamed from: c */
    public final C56446o f150772c = new C56446o();

    /* renamed from: d */
    public int f150773d = 0;

    /* renamed from: e */
    public final Map f150774e = new HashMap();

    /* renamed from: g */
    private C56455x f150775g;

    public C56448q(String str) {
        this.f150770a = str;
        this.f150771b = 212;
    }

    /* renamed from: a */
    public static int m88157a(C56447p pVar, int i) {
        if (!pVar.mo54396g()) {
            throw new C56450s("missing closing ]", pVar.mo54392c(i));
        } else if (pVar.mo54395f('\\')) {
            return m88158b(pVar);
        } else {
            return pVar.mo54391b();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x004a, code lost:
        if (r6.mo54390a() <= 55) goto L_0x004c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x004c, code lost:
        r1 = r1 - 48;
        r4 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0051, code lost:
        if (r4 >= 3) goto L_0x0077;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0057, code lost:
        if (r6.mo54396g() == false) goto L_0x0077;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x005d, code lost:
        if (r6.mo54390a() < 48) goto L_0x0077;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0063, code lost:
        if (r6.mo54390a() <= 55) goto L_0x0066;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0066, code lost:
        r1 = ((r1 * 8) + r6.mo54390a()) - 48;
        r6.f150767a++;
        r4 = r4 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0077, code lost:
        return r1;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m88158b(com.google.p4272br.C56447p r6) {
        /*
            int r0 = r6.f150767a
            int r1 = r0 + 1
            r6.f150767a = r1
            boolean r1 = r6.mo54396g()
            if (r1 == 0) goto L_0x00e1
            int r1 = r6.mo54391b()
            r2 = 97
            if (r1 == r2) goto L_0x00df
            r2 = 102(0x66, float:1.43E-43)
            if (r1 == r2) goto L_0x00dc
            r2 = 110(0x6e, float:1.54E-43)
            if (r1 == r2) goto L_0x00d9
            r2 = 114(0x72, float:1.6E-43)
            if (r1 == r2) goto L_0x00d6
            r2 = 116(0x74, float:1.63E-43)
            if (r1 == r2) goto L_0x00d3
            r2 = 118(0x76, float:1.65E-43)
            if (r1 == r2) goto L_0x00d0
            r2 = 120(0x78, float:1.68E-43)
            if (r1 == r2) goto L_0x0078
            r2 = 55
            r3 = 48
            switch(r1) {
                case 48: goto L_0x004c;
                case 49: goto L_0x003a;
                case 50: goto L_0x003a;
                case 51: goto L_0x003a;
                case 52: goto L_0x003a;
                case 53: goto L_0x003a;
                case 54: goto L_0x003a;
                case 55: goto L_0x003a;
                default: goto L_0x0033;
            }
        L_0x0033:
            boolean r2 = com.google.p4272br.C56432ab.m88121e(r1)
            if (r2 != 0) goto L_0x00c4
            return r1
        L_0x003a:
            boolean r4 = r6.mo54396g()
            if (r4 == 0) goto L_0x00c4
            int r4 = r6.mo54390a()
            if (r4 < r3) goto L_0x00c4
            int r4 = r6.mo54390a()
            if (r4 > r2) goto L_0x00c4
        L_0x004c:
            int r1 = r1 + -48
            r0 = 1
            r4 = 1
        L_0x0050:
            r5 = 3
            if (r4 >= r5) goto L_0x0077
            boolean r5 = r6.mo54396g()
            if (r5 == 0) goto L_0x0077
            int r5 = r6.mo54390a()
            if (r5 < r3) goto L_0x0077
            int r5 = r6.mo54390a()
            if (r5 <= r2) goto L_0x0066
            goto L_0x0077
        L_0x0066:
            int r1 = r1 * 8
            int r5 = r6.mo54390a()
            int r1 = r1 + r5
            int r1 = r1 + -48
            int r5 = r6.f150767a
            int r5 = r5 + r0
            r6.f150767a = r5
            int r4 = r4 + 1
            goto L_0x0050
        L_0x0077:
            return r1
        L_0x0078:
            boolean r1 = r6.mo54396g()
            if (r1 == 0) goto L_0x00c4
            int r1 = r6.mo54391b()
            r2 = 123(0x7b, float:1.72E-43)
            if (r1 != r2) goto L_0x00aa
            r1 = 0
            r2 = 0
        L_0x0088:
            boolean r3 = r6.mo54396g()
            if (r3 == 0) goto L_0x00c4
            int r3 = r6.mo54391b()
            r4 = 125(0x7d, float:1.75E-43)
            if (r3 != r4) goto L_0x0099
            if (r1 == 0) goto L_0x00c4
            return r2
        L_0x0099:
            int r3 = com.google.p4272br.C56432ab.m88118b(r3)
            if (r3 < 0) goto L_0x00c4
            int r2 = r2 * 16
            int r2 = r2 + r3
            r3 = 1114111(0x10ffff, float:1.561202E-39)
            if (r2 > r3) goto L_0x00c4
            int r1 = r1 + 1
            goto L_0x0088
        L_0x00aa:
            int r1 = com.google.p4272br.C56432ab.m88118b(r1)
            boolean r2 = r6.mo54396g()
            if (r2 == 0) goto L_0x00c4
            int r2 = r6.mo54391b()
            int r2 = com.google.p4272br.C56432ab.m88118b(r2)
            if (r1 < 0) goto L_0x00c4
            if (r2 < 0) goto L_0x00c4
            int r1 = r1 * 16
            int r1 = r1 + r2
            return r1
        L_0x00c4:
            com.google.br.s r1 = new com.google.br.s
            java.lang.String r2 = "invalid escape sequence"
            java.lang.String r6 = r6.mo54392c(r0)
            r1.<init>(r2, r6)
            throw r1
        L_0x00d0:
            r6 = 11
            return r6
        L_0x00d3:
            r6 = 9
            return r6
        L_0x00d6:
            r6 = 13
            return r6
        L_0x00d9:
            r6 = 10
            return r6
        L_0x00dc:
            r6 = 12
            return r6
        L_0x00df:
            r6 = 7
            return r6
        L_0x00e1:
            com.google.br.s r6 = new com.google.br.s
            r6.<init>()
            goto L_0x00e8
        L_0x00e7:
            throw r6
        L_0x00e8:
            goto L_0x00e7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.p4272br.C56448q.m88158b(com.google.br.p):int");
    }

    /* renamed from: c */
    public static int m88159c(C56447p pVar) {
        int i = pVar.f150767a;
        while (pVar.mo54396g() && (r1 = pVar.mo54390a()) >= 48 && r1 <= 57) {
            pVar.f150767a++;
        }
        String c = pVar.mo54392c(i);
        if (c.isEmpty()) {
            return -1;
        }
        if (c.length() > 1 && c.charAt(0) == '0') {
            return -1;
        }
        if (c.length() > 8) {
            return -2;
        }
        return Integer.valueOf(c, 10).intValue();
    }

    /* renamed from: k */
    static C56455x[] m88160k(C56455x[] xVarArr, int i, int i2) {
        C56455x[] xVarArr2 = new C56455x[(i2 - i)];
        for (int i3 = i; i3 < i2; i3++) {
            xVarArr2[i3 - i] = xVarArr[i3];
        }
        return xVarArr2;
    }

    /* renamed from: q */
    private final C56455x m88161q(C56455x xVar, int i) {
        int i2 = xVar.f150800j;
        if (i2 == 18) {
            C56455x[] xVarArr = xVar.f150793c;
            if (xVarArr.length > 0) {
                C56455x q = m88161q(xVarArr[0], i);
                xVar.f150793c[0] = q;
                if (q.f150800j != 2) {
                    return xVar;
                }
                mo54401g(q);
                C56455x[] xVarArr2 = xVar.f150793c;
                int length = xVarArr2.length;
                if (length == 0 || length == 1) {
                    xVar.f150800j = 2;
                    xVar.f150793c = null;
                    return xVar;
                } else if (length != 2) {
                    xVar.f150793c = m88160k(xVarArr2, 1, length);
                    return xVar;
                } else {
                    C56455x xVar2 = xVarArr2[1];
                    mo54401g(xVar);
                    return xVar2;
                }
            }
        } else if (i2 == 3) {
            int[] iArr = xVar.f150794d;
            xVar.f150794d = C56432ab.m88122f(iArr, i, iArr.length);
            if (xVar.f150794d.length == 0) {
                xVar.f150800j = 2;
            }
        }
        return xVar;
    }

    /* renamed from: r */
    private static void m88162r(C56455x xVar, C56455x xVar2) {
        int i = xVar.f150800j;
        int i2 = i - 1;
        if (i != 0) {
            int i3 = 0;
            if (i2 == 2) {
                int i4 = xVar2.f150794d[0];
                int i5 = xVar.f150794d[0];
                if (i4 != i5 || xVar2.f150792b != xVar.f150792b) {
                    xVar.f150800j = 4;
                    C56430a aVar = new C56430a();
                    aVar.mo54372j(i5, xVar.f150792b);
                    aVar.mo54372j(xVar2.f150794d[0], xVar2.f150792b);
                    xVar.f150794d = aVar.mo54364b();
                }
            } else if (i2 != 3) {
                if (i2 == 4) {
                    int i6 = xVar2.f150800j;
                    int i7 = i6 - 1;
                    if (i6 != 0) {
                        if (i7 == 2) {
                            int[] iArr = xVar2.f150794d;
                            if (iArr.length != 1 || iArr[0] != 10) {
                                return;
                            }
                        } else if (i7 == 3) {
                            while (true) {
                                int[] iArr2 = xVar2.f150794d;
                                if (i3 < iArr2.length) {
                                    if (iArr2[i3] <= 10 && iArr2[i3 + 1] >= 10) {
                                        break;
                                    }
                                    i3 += 2;
                                } else {
                                    return;
                                }
                            }
                        } else if (i7 != 5) {
                            return;
                        }
                        xVar.f150800j = 6;
                        return;
                    }
                    throw null;
                }
            } else if (xVar2.f150800j == 3) {
                C56430a aVar2 = new C56430a(xVar.f150794d);
                aVar2.mo54372j(xVar2.f150794d[0], xVar2.f150792b);
                xVar.f150794d = aVar2.mo54364b();
            } else {
                C56430a aVar3 = new C56430a(xVar.f150794d);
                aVar3.mo54365c(xVar2.f150794d);
                xVar.f150794d = aVar3.mo54364b();
            }
        } else {
            throw null;
        }
    }

    /* renamed from: s */
    private static boolean m88163s(C56455x xVar) {
        int i = xVar.f150800j;
        if (i == 3) {
            if (xVar.f150794d.length != 1) {
                i = 3;
            }
        }
        return i == 4 || i == 5 || i == 6;
    }

    /* renamed from: t */
    private final boolean m88164t(int i, int i2) {
        int size = this.f150772c.size();
        if (size < 2) {
            return false;
        }
        C56455x xVar = (C56455x) this.f150772c.get(size - 1);
        C56455x xVar2 = (C56455x) this.f150772c.get(size - 2);
        if (xVar.f150800j == 3 && xVar2.f150800j == 3 && (xVar.f150792b & 1) == (xVar2.f150792b & 1)) {
            int[] iArr = xVar2.f150794d;
            int[] iArr2 = xVar.f150794d;
            int length = iArr.length;
            int length2 = iArr2.length;
            int[] iArr3 = new int[(length + length2)];
            System.arraycopy(iArr, 0, iArr3, 0, length);
            System.arraycopy(iArr2, 0, iArr3, length, length2);
            xVar2.f150794d = iArr3;
            if (i >= 0) {
                xVar.f150794d = new int[]{i};
                xVar.f150792b = i2;
                return true;
            }
            mo54398d();
            mo54401g(xVar);
        }
        return false;
    }

    /* renamed from: u */
    private final C56455x[] m88165u() {
        int size = this.f150772c.size();
        int i = size;
        while (i > 0) {
            int i2 = i - 1;
            if (C56454w.m88187a(((C56455x) this.f150772c.get(i2)).f150800j)) {
                break;
            }
            i = i2;
        }
        C56455x[] xVarArr = (C56455x[]) this.f150772c.subList(i, size).toArray(new C56455x[(size - i)]);
        this.f150772c.removeRange(i, size);
        return xVarArr;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:66:0x010b, code lost:
        if (r7.f150800j == 2) goto L_0x00fb;
     */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x0230  */
    /* renamed from: v */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.p4272br.C56455x m88166v(com.google.p4272br.C56455x[] r17, int r18) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            int r3 = r1.length
            r4 = 0
            r5 = 1
            if (r3 == r5) goto L_0x0270
            r6 = 0
            r7 = 0
        L_0x000d:
            if (r6 >= r3) goto L_0x001e
            r8 = r1[r6]
            int r9 = r8.f150800j
            if (r9 != r2) goto L_0x0019
            com.google.br.x[] r8 = r8.f150793c
            int r8 = r8.length
            goto L_0x001a
        L_0x0019:
            r8 = 1
        L_0x001a:
            int r7 = r7 + r8
            int r6 = r6 + 1
            goto L_0x000d
        L_0x001e:
            com.google.br.x[] r3 = new com.google.p4272br.C56455x[r7]
            int r6 = r1.length
            r7 = 0
            r8 = 0
        L_0x0023:
            if (r7 >= r6) goto L_0x0041
            r9 = r1[r7]
            int r10 = r9.f150800j
            if (r10 != r2) goto L_0x0039
            com.google.br.x[] r10 = r9.f150793c
            int r11 = r10.length
            java.lang.System.arraycopy(r10, r4, r3, r8, r11)
            com.google.br.x[] r10 = r9.f150793c
            int r10 = r10.length
            int r8 = r8 + r10
            r0.mo54401g(r9)
            goto L_0x003e
        L_0x0039:
            int r10 = r8 + 1
            r3[r8] = r9
            r8 = r10
        L_0x003e:
            int r7 = r7 + 1
            goto L_0x0023
        L_0x0041:
            com.google.br.x r1 = r0.mo54405l(r2)
            r1.f150793c = r3
            r3 = 19
            if (r2 != r3) goto L_0x026f
            com.google.br.x[] r2 = r1.f150793c
            int r6 = r2.length
            r7 = 2
            if (r6 >= r7) goto L_0x0053
            goto L_0x0261
        L_0x0053:
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
        L_0x0059:
            r15 = 18
            if (r9 > r6) goto L_0x00ec
            r8 = 3
            if (r9 >= r6) goto L_0x0091
            r7 = r2[r9]
            int r3 = r7.f150800j
            if (r3 != r15) goto L_0x006d
            com.google.br.x[] r3 = r7.f150793c
            int r15 = r3.length
            if (r15 <= 0) goto L_0x006d
            r7 = r3[r4]
        L_0x006d:
            int r3 = r7.f150800j
            if (r3 != r8) goto L_0x0078
            int[] r3 = r7.f150794d
            int r15 = r3.length
            int r7 = r7.f150792b
            r7 = r7 & r5
            goto L_0x007b
        L_0x0078:
            r3 = 0
            r7 = 0
            r15 = 0
        L_0x007b:
            if (r7 != r10) goto L_0x0094
            r5 = 0
        L_0x007e:
            if (r5 >= r13) goto L_0x008d
            if (r5 >= r15) goto L_0x008d
            r4 = r12[r5]
            r8 = r3[r5]
            if (r4 != r8) goto L_0x008d
            int r5 = r5 + 1
            r4 = 0
            r8 = 3
            goto L_0x007e
        L_0x008d:
            if (r5 <= 0) goto L_0x0094
            r13 = r5
            goto L_0x00e3
        L_0x0091:
            r3 = 0
            r7 = 0
            r15 = 0
        L_0x0094:
            if (r9 != r14) goto L_0x0097
            goto L_0x00df
        L_0x0097:
            int r4 = r14 + 1
            if (r9 != r4) goto L_0x00a3
            int r4 = r11 + 1
            r5 = r2[r14]
            r2[r11] = r5
        L_0x00a1:
            r11 = r4
            goto L_0x00df
        L_0x00a3:
            r4 = 3
            com.google.br.x r4 = r0.mo54405l(r4)
            r4.f150792b = r10
            r5 = 0
            int[] r8 = com.google.p4272br.C56432ab.m88122f(r12, r5, r13)
            r4.f150794d = r8
            r5 = r14
        L_0x00b2:
            if (r5 >= r9) goto L_0x00bf
            r8 = r2[r5]
            com.google.br.x r8 = r0.m88161q(r8, r13)
            r2[r5] = r8
            int r5 = r5 + 1
            goto L_0x00b2
        L_0x00bf:
            com.google.br.x[] r5 = m88160k(r2, r14, r9)
            r8 = 19
            com.google.br.x r5 = r0.m88166v(r5, r8)
            r8 = 18
            com.google.br.x r8 = r0.mo54405l(r8)
            r10 = 2
            com.google.br.x[] r12 = new com.google.p4272br.C56455x[r10]
            r10 = 0
            r12[r10] = r4
            r4 = 1
            r12[r4] = r5
            r8.f150793c = r12
            int r4 = r11 + 1
            r2[r11] = r8
            goto L_0x00a1
        L_0x00df:
            r12 = r3
            r10 = r7
            r14 = r9
            r13 = r15
        L_0x00e3:
            int r9 = r9 + 1
            r3 = 19
            r4 = 0
            r5 = 1
            r7 = 2
            goto L_0x0059
        L_0x00ec:
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
        L_0x00f0:
            if (r5 > r11) goto L_0x01be
            if (r5 >= r11) goto L_0x0139
            r7 = r2[r5]
            int r8 = r7.f150800j
            r9 = 2
            if (r8 != r9) goto L_0x00fd
        L_0x00fb:
            r7 = 0
            goto L_0x010e
        L_0x00fd:
            r10 = 18
            if (r8 != r10) goto L_0x010e
            com.google.br.x[] r8 = r7.f150793c
            int r10 = r8.length
            if (r10 <= 0) goto L_0x010e
            r10 = 0
            r7 = r8[r10]
            int r8 = r7.f150800j
            if (r8 != r9) goto L_0x010e
            goto L_0x00fb
        L_0x010e:
            if (r6 == 0) goto L_0x013a
            boolean r8 = r6.equals(r7)
            if (r8 == 0) goto L_0x013a
            boolean r8 = m88163s(r6)
            if (r8 != 0) goto L_0x0133
            int r8 = r6.f150800j
            r9 = 17
            if (r8 != r9) goto L_0x013a
            int r8 = r6.f150795e
            int r9 = r6.f150796f
            if (r8 != r9) goto L_0x013a
            com.google.br.x[] r8 = r6.f150793c
            r9 = 0
            r8 = r8[r9]
            boolean r8 = m88163s(r8)
            if (r8 == 0) goto L_0x013a
        L_0x0133:
            r8 = 19
            r9 = 18
            goto L_0x01ba
        L_0x0139:
            r7 = 0
        L_0x013a:
            if (r5 != r4) goto L_0x0142
        L_0x013c:
            r8 = 19
            r9 = 18
            goto L_0x01b8
        L_0x0142:
            int r8 = r4 + 1
            if (r5 != r8) goto L_0x014e
            int r6 = r3 + 1
            r4 = r2[r4]
            r2[r3] = r4
            r3 = r6
            goto L_0x013c
        L_0x014e:
            r8 = r4
        L_0x014f:
            if (r8 >= r5) goto L_0x0198
            r9 = r2[r8]
            int r10 = r9.f150800j
            r12 = 18
            if (r10 != r12) goto L_0x0189
            com.google.br.x[] r10 = r9.f150793c
            int r12 = r10.length
            if (r12 <= 0) goto L_0x0189
            if (r8 == r4) goto L_0x0166
            r12 = 0
            r10 = r10[r12]
            r0.mo54401g(r10)
        L_0x0166:
            com.google.br.x[] r10 = r9.f150793c
            int r12 = r10.length
            r13 = 1
            com.google.br.x[] r10 = m88160k(r10, r13, r12)
            r9.f150793c = r10
            com.google.br.x[] r10 = r9.f150793c
            int r12 = r10.length
            if (r12 == 0) goto L_0x0181
            if (r12 == r13) goto L_0x0178
            goto L_0x017f
        L_0x0178:
            r12 = 0
            r10 = r10[r12]
            r0.mo54401g(r9)
            r9 = r10
        L_0x017f:
            r10 = 2
            goto L_0x0193
        L_0x0181:
            r10 = 2
            r9.f150800j = r10
            com.google.br.x[] r12 = com.google.p4272br.C56455x.f150791a
            r9.f150793c = r12
            goto L_0x0193
        L_0x0189:
            r10 = 2
            if (r8 == r4) goto L_0x018f
            r0.mo54401g(r9)
        L_0x018f:
            com.google.br.x r9 = r0.mo54405l(r10)
        L_0x0193:
            r2[r8] = r9
            int r8 = r8 + 1
            goto L_0x014f
        L_0x0198:
            r10 = 2
            com.google.br.x[] r4 = m88160k(r2, r4, r5)
            r8 = 19
            com.google.br.x r4 = r0.m88166v(r4, r8)
            r9 = 18
            com.google.br.x r12 = r0.mo54405l(r9)
            com.google.br.x[] r13 = new com.google.p4272br.C56455x[r10]
            r10 = 0
            r13[r10] = r6
            r6 = 1
            r13[r6] = r4
            r12.f150793c = r13
            int r4 = r3 + 1
            r2[r3] = r12
            r3 = r4
        L_0x01b8:
            r4 = r5
            r6 = r7
        L_0x01ba:
            int r5 = r5 + 1
            goto L_0x00f0
        L_0x01be:
            r4 = 0
            r5 = 0
            r6 = 0
        L_0x01c1:
            if (r5 > r3) goto L_0x023c
            if (r5 >= r3) goto L_0x01d0
            r7 = r2[r5]
            boolean r7 = m88163s(r7)
            if (r7 == 0) goto L_0x01d0
            r8 = 0
            goto L_0x0239
        L_0x01d0:
            if (r5 == r4) goto L_0x022d
            int r7 = r4 + 1
            if (r5 != r7) goto L_0x01de
            int r7 = r6 + 1
            r4 = r2[r4]
            r2[r6] = r4
            r6 = r7
            goto L_0x022d
        L_0x01de:
            r9 = r4
            r8 = r7
        L_0x01e0:
            if (r8 >= r5) goto L_0x0206
            r10 = r2[r9]
            r11 = r2[r8]
            int r12 = r10.f150800j
            int r13 = r12 + -1
            if (r12 == 0) goto L_0x0204
            int r14 = r11.f150800j
            int r15 = r14 + -1
            if (r14 == 0) goto L_0x0202
            if (r13 < r15) goto L_0x01fe
            if (r12 != r14) goto L_0x01ff
            int[] r10 = r10.f150794d
            int r10 = r10.length
            int[] r11 = r11.f150794d
            int r11 = r11.length
            if (r10 >= r11) goto L_0x01ff
        L_0x01fe:
            r9 = r8
        L_0x01ff:
            int r8 = r8 + 1
            goto L_0x01e0
        L_0x0202:
            r8 = 0
            throw r8
        L_0x0204:
            r8 = 0
            throw r8
        L_0x0206:
            r8 = 0
            r10 = r2[r4]
            r11 = r2[r9]
            r2[r4] = r11
            r2[r9] = r10
        L_0x020f:
            if (r7 >= r5) goto L_0x0220
            r9 = r2[r4]
            r10 = r2[r7]
            m88162r(r9, r10)
            r9 = r2[r7]
            r0.mo54401g(r9)
            int r7 = r7 + 1
            goto L_0x020f
        L_0x0220:
            r7 = r2[r4]
            m88167w(r7)
            int r7 = r6 + 1
            r4 = r2[r4]
            r2[r6] = r4
            r6 = r7
            goto L_0x022e
        L_0x022d:
            r8 = 0
        L_0x022e:
            if (r5 >= r3) goto L_0x0237
            int r4 = r6 + 1
            r7 = r2[r5]
            r2[r6] = r7
            r6 = r4
        L_0x0237:
            int r4 = r5 + 1
        L_0x0239:
            int r5 = r5 + 1
            goto L_0x01c1
        L_0x023c:
            r3 = 0
            r5 = 0
        L_0x023e:
            if (r5 >= r6) goto L_0x025c
            int r4 = r5 + 1
            if (r4 >= r6) goto L_0x0252
            r7 = r2[r5]
            int r7 = r7.f150800j
            r8 = 2
            if (r7 != r8) goto L_0x0253
            r7 = r2[r4]
            int r7 = r7.f150800j
            if (r7 == r8) goto L_0x025a
            goto L_0x0253
        L_0x0252:
            r8 = 2
        L_0x0253:
            int r7 = r3 + 1
            r5 = r2[r5]
            r2[r3] = r5
            r3 = r7
        L_0x025a:
            r5 = r4
            goto L_0x023e
        L_0x025c:
            r4 = 0
            com.google.br.x[] r2 = m88160k(r2, r4, r3)
        L_0x0261:
            r1.f150793c = r2
            com.google.br.x[] r2 = r1.f150793c
            int r3 = r2.length
            r5 = 1
            if (r3 != r5) goto L_0x026f
            r2 = r2[r4]
            r0.mo54401g(r1)
            return r2
        L_0x026f:
            return r1
        L_0x0270:
            r1 = r1[r4]
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.p4272br.C56448q.m88166v(com.google.br.x[], int):com.google.br.x");
    }

    /* renamed from: w */
    private static final void m88167w(C56455x xVar) {
        if (xVar.f150800j == 4) {
            C56430a aVar = new C56430a(xVar.f150794d);
            aVar.mo54369g();
            xVar.f150794d = aVar.mo54364b();
            int[] iArr = xVar.f150794d;
            int length = iArr.length;
            if (length == 2) {
                if (iArr[0] == 0 && iArr[1] == 1114111) {
                    xVar.f150794d = null;
                    xVar.f150800j = 6;
                }
            } else if (length == 4 && iArr[0] == 0 && iArr[1] == 9 && iArr[2] == 11 && iArr[3] == 1114111) {
                xVar.f150794d = null;
                xVar.f150800j = 5;
            }
        }
    }

    /* renamed from: d */
    public final C56455x mo54398d() {
        C56446o oVar = this.f150772c;
        return (C56455x) oVar.remove(oVar.size() - 1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0034, code lost:
        if (r0 == 4) goto L_0x0036;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0059, code lost:
        if (com.google.p4272br.C56457z.m88193a(r7) == r10.f150794d[0]) goto L_0x0080;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x007e, code lost:
        if (com.google.p4272br.C56457z.m88193a(r3) == r10.f150794d[0]) goto L_0x0080;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x008b, code lost:
        if (m88164t(r10.f150794d[0], r9.f150771b | 1) == false) goto L_0x008e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x008d, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x008e, code lost:
        r10.f150800j = 3;
        r10.f150794d = new int[]{r10.f150794d[0]};
        r10.f150792b = r9.f150771b | 1;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.p4272br.C56455x mo54399e(com.google.p4272br.C56455x r10) {
        /*
            r9 = this;
            int r0 = r10.f150800j
            r1 = 0
            r2 = 3
            r3 = 2
            r4 = 1
            r5 = 0
            r6 = 4
            if (r0 != r6) goto L_0x0034
            int[] r0 = r10.f150794d
            int r7 = r0.length
            if (r7 != r3) goto L_0x0036
            r7 = r0[r5]
            r0 = r0[r4]
            if (r7 != r0) goto L_0x0036
            int r0 = r9.f150771b
            r0 = r0 & -2
            boolean r0 = r9.m88164t(r7, r0)
            if (r0 == 0) goto L_0x0020
            return r1
        L_0x0020:
            r10.f150800j = r2
            int[] r0 = new int[r4]
            int[] r1 = r10.f150794d
            r1 = r1[r5]
            r0[r5] = r1
            r10.f150794d = r0
            int r0 = r9.f150771b
            r0 = r0 & -2
            r10.f150792b = r0
            goto L_0x00a4
        L_0x0034:
            if (r0 != r6) goto L_0x005b
        L_0x0036:
            int[] r0 = r10.f150794d
            int r7 = r0.length
            if (r7 != r6) goto L_0x005b
            r7 = r0[r5]
            r8 = r0[r4]
            if (r7 != r8) goto L_0x005b
            r8 = r0[r3]
            r0 = r0[r2]
            if (r8 != r0) goto L_0x005b
            int r0 = com.google.p4272br.C56457z.m88193a(r7)
            int[] r7 = r10.f150794d
            r7 = r7[r3]
            if (r0 != r7) goto L_0x005b
            int r0 = com.google.p4272br.C56457z.m88193a(r7)
            int[] r7 = r10.f150794d
            r7 = r7[r5]
            if (r0 == r7) goto L_0x0080
        L_0x005b:
            int r0 = r10.f150800j
            if (r0 != r6) goto L_0x00a0
            int[] r0 = r10.f150794d
            int r6 = r0.length
            if (r6 != r3) goto L_0x00a0
            r3 = r0[r5]
            int r6 = r3 + 1
            r0 = r0[r4]
            if (r6 != r0) goto L_0x00a0
            int r0 = com.google.p4272br.C56457z.m88193a(r3)
            int[] r3 = r10.f150794d
            r3 = r3[r4]
            if (r0 != r3) goto L_0x00a0
            int r0 = com.google.p4272br.C56457z.m88193a(r3)
            int[] r3 = r10.f150794d
            r3 = r3[r5]
            if (r0 != r3) goto L_0x00a0
        L_0x0080:
            int[] r0 = r10.f150794d
            r0 = r0[r5]
            int r3 = r9.f150771b
            r3 = r3 | r4
            boolean r0 = r9.m88164t(r0, r3)
            if (r0 == 0) goto L_0x008e
            return r1
        L_0x008e:
            r10.f150800j = r2
            int[] r0 = new int[r4]
            int[] r1 = r10.f150794d
            r1 = r1[r5]
            r0[r5] = r1
            r10.f150794d = r0
            int r0 = r9.f150771b
            r0 = r0 | r4
            r10.f150792b = r0
            goto L_0x00a4
        L_0x00a0:
            r0 = -1
            r9.m88164t(r0, r5)
        L_0x00a4:
            com.google.br.o r0 = r9.f150772c
            r0.add(r10)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.p4272br.C56448q.mo54399e(com.google.br.x):com.google.br.x");
    }

    /* renamed from: f */
    public final void mo54400f(int i) {
        int i2 = this.f150771b;
        C56455x l = mo54405l(3);
        l.f150792b = i2;
        if ((i2 & 1) != 0 && i >= 65 && i <= 66639) {
            int i3 = i;
            for (int a = C56457z.m88193a(i); a != i; a = C56457z.m88193a(a)) {
                if (i3 > a) {
                    i3 = a;
                }
            }
            i = i3;
        }
        l.f150794d = new int[]{i};
        mo54399e(l);
    }

    /* renamed from: g */
    public final void mo54401g(C56455x xVar) {
        C56455x[] xVarArr = xVar.f150793c;
        if (xVarArr != null && xVarArr.length > 0) {
            xVarArr[0] = this.f150775g;
        }
        this.f150775g = xVar;
    }

    /* renamed from: h */
    public final boolean mo54402h(C56447p pVar, C56430a aVar) {
        int i = pVar.f150767a;
        boolean z = false;
        if ((this.f150771b & 64) == 0 || !pVar.mo54396g() || pVar.mo54391b() != 92 || !pVar.mo54396g()) {
            return false;
        }
        pVar.mo54391b();
        C56433b bVar = (C56433b) C56433b.f150707a.get(pVar.mo54392c(i));
        if (bVar == null) {
            return false;
        }
        if (1 == (this.f150771b & 1)) {
            z = true;
        }
        aVar.mo54366d(bVar, z);
        return true;
    }

    /* renamed from: i */
    public final boolean mo54403i(C56447p pVar, C56430a aVar) {
        String str;
        C56445n nVar;
        C56445n nVar2;
        int i = pVar.f150767a;
        if ((this.f150771b & 128) == 0 || (!pVar.mo54393d().startsWith("\\p") && !pVar.mo54393d().startsWith("\\P"))) {
            return false;
        }
        pVar.f150767a++;
        int i2 = pVar.mo54391b() == 80 ? -1 : 1;
        if (pVar.mo54396g()) {
            int b = pVar.mo54391b();
            if (b != 123) {
                char c = (char) b;
                str = b == c ? String.valueOf(c) : new String(Character.toChars(c));
            } else {
                String d = pVar.mo54393d();
                int indexOf = d.indexOf(125);
                if (indexOf >= 0) {
                    str = d.substring(0, indexOf);
                    pVar.mo54394e(str);
                    pVar.f150767a++;
                } else {
                    pVar.f150767a = i;
                    throw new C56450s("invalid character class range", pVar.mo54393d());
                }
            }
            if (!str.isEmpty() && str.charAt(0) == '^') {
                i2 = -i2;
                str = str.substring(1);
            }
            if (str.equals("Any")) {
                int[][] iArr = f150769f;
                nVar = new C56445n(iArr, iArr);
            } else {
                int[][] iArr2 = (int[][]) C56431aa.f150645bD.get(str);
                if (iArr2 != null) {
                    nVar2 = new C56445n(iArr2, (int[][]) C56431aa.f150648bG.get(str));
                } else {
                    int[][] iArr3 = (int[][]) C56431aa.f150646bE.get(str);
                    if (iArr3 != null) {
                        nVar2 = new C56445n(iArr3, (int[][]) C56431aa.f150647bF.get(str));
                    } else {
                        nVar = null;
                    }
                }
                nVar = nVar2;
            }
            if (nVar != null) {
                int[][] iArr4 = (int[][]) nVar.f150765a;
                int[][] iArr5 = (int[][]) nVar.f150766b;
                if ((this.f150771b & 1) != 0 && iArr5 != null) {
                    C56430a aVar2 = new C56430a();
                    aVar2.mo54368f(iArr4);
                    aVar2.mo54368f(iArr5);
                    aVar2.mo54369g();
                    aVar.mo54370h(aVar2.mo54364b(), i2);
                } else if (i2 < 0) {
                    int i3 = 0;
                    for (int[] iArr6 : iArr4) {
                        int i4 = iArr6[0];
                        int i5 = iArr6[1];
                        int i6 = iArr6[2];
                        if (i6 == 1) {
                            int i7 = i4 - 1;
                            if (i3 <= i7) {
                                aVar.mo54367e(i3, i7);
                            }
                            i3 = i5 + 1;
                        } else {
                            while (i4 <= i5) {
                                int i8 = i4 - 1;
                                if (i3 <= i8) {
                                    aVar.mo54367e(i3, i8);
                                }
                                i3 = i4 + 1;
                                i4 += i6;
                            }
                        }
                    }
                    if (i3 <= 1114111) {
                        aVar.mo54367e(i3, 1114111);
                    }
                } else {
                    aVar.mo54368f(iArr4);
                }
                return true;
            }
            throw new C56450s("invalid character class range", pVar.mo54392c(i));
        }
        pVar.f150767a = i;
        throw new C56450s("invalid character class range", pVar.mo54393d());
    }

    /* renamed from: j */
    public final boolean mo54404j() {
        int size = this.f150772c.size();
        if (size >= 3 && ((C56455x) this.f150772c.get(size - 2)).f150800j == 21) {
            int i = size - 1;
            if (m88163s((C56455x) this.f150772c.get(i))) {
                int i2 = size - 3;
                if (m88163s((C56455x) this.f150772c.get(i2))) {
                    C56455x xVar = (C56455x) this.f150772c.get(i);
                    C56455x xVar2 = (C56455x) this.f150772c.get(i2);
                    int i3 = xVar.f150800j;
                    int i4 = i3 - 1;
                    if (i3 != 0) {
                        int i5 = xVar2.f150800j;
                        int i6 = i5 - 1;
                        if (i5 != 0) {
                            if (i4 > i6) {
                                this.f150772c.set(i2, xVar);
                            } else {
                                C56455x xVar3 = xVar2;
                                xVar2 = xVar;
                                xVar = xVar3;
                            }
                            m88162r(xVar, xVar2);
                            mo54401g(xVar2);
                            mo54398d();
                            return true;
                        }
                        throw null;
                    }
                    throw null;
                }
            }
        }
        if (size < 2) {
            return false;
        }
        int i7 = size - 1;
        C56455x xVar4 = (C56455x) this.f150772c.get(i7);
        int i8 = size - 2;
        C56455x xVar5 = (C56455x) this.f150772c.get(i8);
        if (xVar5.f150800j != 21) {
            return false;
        }
        if (size >= 3) {
            m88167w((C56455x) this.f150772c.get(size - 3));
        }
        this.f150772c.set(i8, xVar4);
        this.f150772c.set(i7, xVar5);
        return true;
    }

    /* renamed from: m */
    public final C56455x mo54406m(int i) {
        C56455x l = mo54405l(i);
        l.f150792b = this.f150771b;
        return mo54399e(l);
    }

    /* renamed from: n */
    public final void mo54407n(int i, int i2, int i3, int i4, C56447p pVar, int i5) {
        int i6 = this.f150771b;
        if ((i6 & 64) != 0) {
            if (pVar.mo54396g() && pVar.mo54395f('?')) {
                pVar.f150767a++;
                i6 ^= 32;
            }
            if (i5 != -1) {
                throw new C56450s("invalid nested repetition operator", pVar.mo54392c(i5));
            }
        }
        int size = this.f150772c.size();
        if (size != 0) {
            int i7 = size - 1;
            C56455x xVar = (C56455x) this.f150772c.get(i7);
            if (!C56454w.m88187a(xVar.f150800j)) {
                C56455x l = mo54405l(i);
                l.f150795e = i2;
                l.f150796f = i3;
                l.f150792b = i6;
                l.f150793c = new C56455x[]{xVar};
                this.f150772c.set(i7, l);
                return;
            }
            throw new C56450s("missing argument to repetition operator", pVar.mo54392c(i4));
        }
        throw new C56450s("missing argument to repetition operator", pVar.mo54392c(i4));
    }

    /* renamed from: o */
    public final void mo54408o() {
        C56455x[] u = m88165u();
        int length = u.length;
        if (length > 0) {
            m88167w(u[length - 1]);
            mo54399e(m88166v(u, 19));
            return;
        }
        mo54399e(mo54405l(1));
    }

    /* renamed from: p */
    public final void mo54409p() {
        m88164t(-1, 0);
        C56455x[] u = m88165u();
        if (u.length == 0) {
            mo54399e(mo54405l(2));
        } else {
            mo54399e(m88166v(u, 18));
        }
    }

    /* renamed from: l */
    public final C56455x mo54405l(int i) {
        C56455x[] xVarArr;
        C56455x xVar = this.f150775g;
        if (xVar == null || (xVarArr = xVar.f150793c) == null || xVarArr.length <= 0) {
            return new C56455x(i);
        }
        this.f150775g = xVarArr[0];
        xVar.f150792b = 0;
        xVar.f150793c = C56455x.f150791a;
        xVar.f150794d = null;
        xVar.f150796f = 0;
        xVar.f150795e = 0;
        xVar.f150797g = 0;
        xVar.f150798h = null;
        xVar.f150800j = i;
        return xVar;
    }
}
