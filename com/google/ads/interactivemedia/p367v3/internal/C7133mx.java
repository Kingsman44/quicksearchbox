package com.google.ads.interactivemedia.p367v3.internal;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.ads.interactivemedia.v3.internal.mx */
/* compiled from: PG */
public final class C7133mx implements C7053jy, C7070ko {

    /* renamed from: a */
    public static final /* synthetic */ int f23008a = 0;

    /* renamed from: b */
    private final aee f23009b;

    /* renamed from: c */
    private final aee f23010c;

    /* renamed from: d */
    private final aee f23011d;

    /* renamed from: e */
    private final aee f23012e;

    /* renamed from: f */
    private final ArrayDeque f23013f;

    /* renamed from: g */
    private int f23014g;

    /* renamed from: h */
    private int f23015h;

    /* renamed from: i */
    private long f23016i;

    /* renamed from: j */
    private int f23017j;

    /* renamed from: k */
    private aee f23018k;

    /* renamed from: l */
    private int f23019l;

    /* renamed from: m */
    private int f23020m;

    /* renamed from: n */
    private int f23021n;

    /* renamed from: o */
    private int f23022o;

    /* renamed from: p */
    private C7056ka f23023p;

    /* renamed from: q */
    private C7132mw[] f23024q;

    /* renamed from: r */
    private long[][] f23025r;

    /* renamed from: s */
    private int f23026s;

    /* renamed from: t */
    private long f23027t;

    /* renamed from: u */
    private boolean f23028u;

    static {
        int i = C7131mv.f23003b;
    }

    public C7133mx() {
        this((byte[]) null);
    }

    /* renamed from: i */
    private final void m21185i() {
        this.f23014g = 0;
        this.f23017j = 0;
    }

    /* renamed from: j */
    private final void m21186j(long j) {
        C7133mx mxVar;
        C7243qz qzVar;
        long j2;
        int i;
        List list;
        int i2;
        C7133mx mxVar2 = this;
        while (!mxVar2.f23013f.isEmpty() && ((C7112mc) mxVar2.f23013f.peek()).f22907a == j) {
            C7112mc mcVar = (C7112mc) mxVar2.f23013f.pop();
            if (mcVar.f22911d == 1836019574) {
                ArrayList arrayList = new ArrayList();
                C7064ki kiVar = new C7064ki();
                C7113md c = mcVar.mo16169c(1969517665);
                C7243qz qzVar2 = null;
                if (c != null) {
                    C7243qz a = C7121ml.m21146a(c, mxVar2.f23028u);
                    if (a != null) {
                        kiVar.mo16124b(a);
                    }
                    qzVar = a;
                } else {
                    qzVar = null;
                }
                C7112mc d = mcVar.mo16170d(1835365473);
                if (d != null) {
                    qzVar2 = C7121ml.m21147b(d);
                }
                C7243qz qzVar3 = qzVar2;
                List c2 = C7121ml.m21148c(mcVar, kiVar, -9223372036854775807L, (C7031jc) null, mxVar2.f23028u, C7130mu.f23001a);
                C7056ka kaVar = mxVar2.f23023p;
                ary.m19467t(kaVar);
                int size = c2.size();
                long j3 = -9223372036854775807L;
                long j4 = -9223372036854775807L;
                int i3 = 0;
                int i4 = -1;
                while (true) {
                    j2 = 0;
                    if (i3 >= size) {
                        break;
                    }
                    C7141ne neVar = (C7141ne) c2.get(i3);
                    if (neVar.f23069b == 0) {
                        list = c2;
                        i = size;
                    } else {
                        C7138nb nbVar = neVar.f23068a;
                        ArrayList arrayList2 = arrayList;
                        long j5 = nbVar.f23037e;
                        if (j5 == j3) {
                            j5 = neVar.f23075h;
                        }
                        j4 = Math.max(j4, j5);
                        C7132mw mwVar = new C7132mw(nbVar, neVar, kaVar.mo16113ak(i3, nbVar.f23034b));
                        int i5 = neVar.f23072e;
                        list = c2;
                        C6863cx a2 = nbVar.f23038f.mo15636a();
                        a2.mo15621W(i5 + 30);
                        i = size;
                        if (nbVar.f23034b == 2 && j5 > 0 && (i2 = neVar.f23069b) > 1) {
                            a2.mo15614P(((float) i2) / (((float) j5) / 1000000.0f));
                        }
                        int i6 = nbVar.f23034b;
                        int i7 = C7129mt.f23000b;
                        if (i6 == 1) {
                            if (kiVar.mo16123a()) {
                                a2.mo15611M(kiVar.f22617a);
                                a2.mo15612N(kiVar.f22618b);
                            }
                            if (qzVar != null) {
                                a2.mo15622X(qzVar);
                            }
                        } else if (i6 == 2 && qzVar3 != null) {
                            ArrayList arrayList3 = new ArrayList();
                            for (int i8 = 0; i8 < qzVar3.mo16341a(); i8++) {
                                C7242qy b = qzVar3.mo16342b(i8);
                                if (b instanceof C7285sn) {
                                    C7285sn snVar = (C7285sn) b;
                                    if ("com.android.capture.fps".equals(snVar.f23754a) || "com.android.video.temporal_layers_count".equals(snVar.f23754a)) {
                                        arrayList3.add(snVar);
                                    }
                                }
                            }
                            if (!arrayList3.isEmpty()) {
                                a2.mo15622X(new C7243qz((List) arrayList3));
                            }
                        }
                        mwVar.f23006c.mo16102a(a2.mo15625a());
                        if (nbVar.f23034b == 2) {
                            if (i4 == -1) {
                                i4 = arrayList2.size();
                            }
                        }
                        arrayList = arrayList2;
                        arrayList.add(mwVar);
                    }
                    i3++;
                    j3 = -9223372036854775807L;
                    mxVar2 = this;
                    c2 = list;
                    size = i;
                }
                mxVar = mxVar2;
                mxVar.f23026s = i4;
                mxVar.f23027t = j4;
                C7132mw[] mwVarArr = (C7132mw[]) arrayList.toArray(new C7132mw[0]);
                mxVar.f23024q = mwVarArr;
                int length = mwVarArr.length;
                long[][] jArr = new long[length][];
                int[] iArr = new int[length];
                long[] jArr2 = new long[length];
                boolean[] zArr = new boolean[length];
                for (int i9 = 0; i9 < mwVarArr.length; i9++) {
                    jArr[i9] = new long[mwVarArr[i9].f23005b.f23069b];
                    jArr2[i9] = mwVarArr[i9].f23005b.f23073f[0];
                }
                int i10 = 0;
                while (i10 < mwVarArr.length) {
                    long j6 = Long.MAX_VALUE;
                    int i11 = -1;
                    for (int i12 = 0; i12 < mwVarArr.length; i12++) {
                        if (!zArr[i12]) {
                            long j7 = jArr2[i12];
                            if (j7 <= j6) {
                                i11 = i12;
                                j6 = j7;
                            }
                        }
                    }
                    int i13 = iArr[i11];
                    long[] jArr3 = jArr[i11];
                    jArr3[i13] = j2;
                    C7141ne neVar2 = mwVarArr[i11].f23005b;
                    j2 += (long) neVar2.f23071d[i13];
                    int i14 = i13 + 1;
                    iArr[i11] = i14;
                    if (i14 < jArr3.length) {
                        jArr2[i11] = neVar2.f23073f[i14];
                    } else {
                        zArr[i11] = true;
                        i10++;
                    }
                }
                mxVar.f23025r = jArr;
                kaVar.mo16114al();
                kaVar.mo16115am(mxVar);
                mxVar.f23013f.clear();
                mxVar.f23014g = 2;
            } else {
                mxVar = mxVar2;
                if (!mxVar.f23013f.isEmpty()) {
                    ((C7112mc) mxVar.f23013f.peek()).mo16168b(mcVar);
                }
            }
            mxVar2 = mxVar;
        }
        if (mxVar2.f23014g != 2) {
            m21185i();
        }
    }

    /* renamed from: k */
    private static long m21187k(C7141ne neVar, long j, long j2) {
        int l = m21188l(neVar, j);
        if (l == -1) {
            return j2;
        }
        return Math.min(neVar.f23070c[l], j2);
    }

    /* renamed from: l */
    private static int m21188l(C7141ne neVar, long j) {
        int a = neVar.mo16191a(j);
        return a == -1 ? neVar.mo16192b(j) : a;
    }

    /* renamed from: a */
    public final boolean mo16074a() {
        return true;
    }

    /* renamed from: b */
    public final C7068km mo16075b(long j) {
        long j2;
        long j3;
        long j4;
        long j5;
        int b;
        if (((C7132mw[]) ary.m19467t(this.f23024q)).length == 0) {
            C7071kp kpVar = C7071kp.f22629a;
            return new C7068km(kpVar, kpVar);
        }
        int i = this.f23026s;
        if (i != -1) {
            C7141ne neVar = this.f23024q[i].f23005b;
            int l = m21188l(neVar, j);
            if (l == -1) {
                C7071kp kpVar2 = C7071kp.f22629a;
                return new C7068km(kpVar2, kpVar2);
            }
            long j6 = neVar.f23073f[l];
            j2 = neVar.f23070c[l];
            if (j6 >= j || l >= neVar.f23069b - 1 || (b = neVar.mo16192b(j)) == -1 || b == l) {
                j5 = -1;
                j4 = -9223372036854775807L;
            } else {
                j4 = neVar.f23073f[b];
                j5 = neVar.f23070c[b];
            }
            j3 = j5;
            j = j6;
        } else {
            j2 = Long.MAX_VALUE;
            j3 = -1;
            j4 = -9223372036854775807L;
        }
        int i2 = 0;
        while (true) {
            C7132mw[] mwVarArr = this.f23024q;
            if (i2 >= mwVarArr.length) {
                break;
            }
            if (i2 != this.f23026s) {
                C7141ne neVar2 = mwVarArr[i2].f23005b;
                long k = m21187k(neVar2, j, j2);
                if (j4 != -9223372036854775807L) {
                    j3 = m21187k(neVar2, j4, j3);
                }
                j2 = k;
            }
            i2++;
        }
        C7071kp kpVar3 = new C7071kp(j, j2);
        if (j4 == -9223372036854775807L) {
            return new C7068km(kpVar3, kpVar3);
        }
        return new C7068km(kpVar3, new C7071kp(j4, j3));
    }

    /* renamed from: c */
    public final long mo16076c() {
        return this.f23027t;
    }

    /* renamed from: d */
    public final void mo16108d(C7056ka kaVar) {
        this.f23023p = kaVar;
    }

    /* renamed from: e */
    public final void mo16109e(long j, long j2) {
        this.f23013f.clear();
        this.f23017j = 0;
        this.f23019l = -1;
        this.f23020m = 0;
        this.f23021n = 0;
        this.f23022o = 0;
        if (j == 0) {
            m21185i();
            return;
        }
        C7132mw[] mwVarArr = this.f23024q;
        if (mwVarArr != null) {
            for (C7132mw mwVar : mwVarArr) {
                C7141ne neVar = mwVar.f23005b;
                int a = neVar.mo16191a(j2);
                if (a == -1) {
                    a = neVar.mo16192b(j2);
                }
                mwVar.f23007d = a;
            }
        }
    }

    /* renamed from: f */
    public final void mo16110f() {
    }

    /* renamed from: g */
    public final boolean mo16111g(C7050jv jvVar) {
        return C7137na.m21212b(jvVar);
    }

    public C7133mx(byte[] bArr) {
        this.f23012e = new aee(16);
        this.f23013f = new ArrayDeque();
        this.f23009b = new aee(aec.f20417a);
        this.f23010c = new aee(4);
        this.f23011d = new aee();
        this.f23019l = -1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:203:0x008d A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0087  */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo16112h(com.google.ads.interactivemedia.p367v3.internal.C7050jv r30, com.google.ads.interactivemedia.p367v3.internal.C7067kl r31) {
        /*
            r29 = this;
            r0 = r29
            r1 = r30
            r2 = r31
        L_0x0006:
            int r3 = r0.f23014g
            r4 = 1718909296(0x66747970, float:2.8862439E23)
            r5 = 0
            r8 = -1
            r9 = 8
            r10 = 1
            if (r3 == 0) goto L_0x0234
            r13 = 262144(0x40000, double:1.295163E-318)
            if (r3 == r10) goto L_0x01b8
            long r3 = r30.mo16099l()
            int r9 = r0.f23019l
            if (r9 != r8) goto L_0x00ac
            r15 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r17 = r15
            r21 = r17
            r24 = r21
            r9 = 0
            r19 = -1
            r20 = 1
            r23 = 1
            r26 = -1
        L_0x0034:
            com.google.ads.interactivemedia.v3.internal.mw[] r7 = r0.f23024q
            java.lang.Object r7 = com.google.ads.interactivemedia.p367v3.internal.aeu.m18536f(r7)
            com.google.ads.interactivemedia.v3.internal.mw[] r7 = (com.google.ads.interactivemedia.p367v3.internal.C7132mw[]) r7
            int r7 = r7.length
            if (r9 >= r7) goto L_0x0091
            com.google.ads.interactivemedia.v3.internal.mw[] r7 = r0.f23024q
            r7 = r7[r9]
            int r12 = r7.f23007d
            com.google.ads.interactivemedia.v3.internal.ne r7 = r7.f23005b
            int r11 = r7.f23069b
            if (r12 != r11) goto L_0x004c
            goto L_0x008d
        L_0x004c:
            long[] r7 = r7.f23070c
            r27 = r7[r12]
            long[][] r7 = r0.f23025r
            java.lang.Object r7 = com.google.ads.interactivemedia.p367v3.internal.aeu.m18536f(r7)
            long[][] r7 = (long[][]) r7
            r7 = r7[r9]
            r11 = r7[r12]
            long r27 = r27 - r3
            int r7 = (r27 > r5 ? 1 : (r27 == r5 ? 0 : -1))
            if (r7 < 0) goto L_0x0069
            int r7 = (r27 > r13 ? 1 : (r27 == r13 ? 0 : -1))
            if (r7 < 0) goto L_0x0067
            goto L_0x0069
        L_0x0067:
            r7 = 0
            goto L_0x006a
        L_0x0069:
            r7 = 1
        L_0x006a:
            if (r7 != 0) goto L_0x0070
            if (r23 != 0) goto L_0x0078
            r10 = 0
            goto L_0x0072
        L_0x0070:
            r10 = r23
        L_0x0072:
            if (r7 != r10) goto L_0x0081
            int r23 = (r27 > r21 ? 1 : (r27 == r21 ? 0 : -1))
            if (r23 >= 0) goto L_0x0081
        L_0x0078:
            r23 = r7
            r19 = r9
            r24 = r11
            r21 = r27
            goto L_0x0083
        L_0x0081:
            r23 = r10
        L_0x0083:
            int r10 = (r11 > r17 ? 1 : (r11 == r17 ? 0 : -1))
            if (r10 >= 0) goto L_0x008d
            r20 = r7
            r26 = r9
            r17 = r11
        L_0x008d:
            int r9 = r9 + 1
            r10 = 1
            goto L_0x0034
        L_0x0091:
            int r7 = (r17 > r15 ? 1 : (r17 == r15 ? 0 : -1))
            if (r7 == 0) goto L_0x00a4
            if (r20 == 0) goto L_0x00a4
            r9 = 10485760(0xa00000, double:5.180654E-317)
            long r17 = r17 + r9
            int r7 = (r24 > r17 ? 1 : (r24 == r17 ? 0 : -1))
            if (r7 >= 0) goto L_0x00a1
            goto L_0x00a4
        L_0x00a1:
            r7 = r26
            goto L_0x00a6
        L_0x00a4:
            r7 = r19
        L_0x00a6:
            r0.f23019l = r7
            if (r7 != r8) goto L_0x00ac
            goto L_0x01b7
        L_0x00ac:
            com.google.ads.interactivemedia.v3.internal.mw[] r7 = r0.f23024q
            java.lang.Object r7 = com.google.ads.interactivemedia.p367v3.internal.aeu.m18536f(r7)
            com.google.ads.interactivemedia.v3.internal.mw[] r7 = (com.google.ads.interactivemedia.p367v3.internal.C7132mw[]) r7
            int r9 = r0.f23019l
            r7 = r7[r9]
            com.google.ads.interactivemedia.v3.internal.kr r15 = r7.f23006c
            int r9 = r7.f23007d
            com.google.ads.interactivemedia.v3.internal.ne r10 = r7.f23005b
            long[] r11 = r10.f23070c
            r13 = r11[r9]
            int[] r10 = r10.f23071d
            r10 = r10[r9]
            long r3 = r13 - r3
            int r11 = r0.f23020m
            long r11 = (long) r11
            long r3 = r3 + r11
            int r11 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r11 < 0) goto L_0x01b4
            r5 = 262144(0x40000, double:1.295163E-318)
            int r11 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r11 < 0) goto L_0x00d9
            goto L_0x01b4
        L_0x00d9:
            com.google.ads.interactivemedia.v3.internal.nb r2 = r7.f23004a
            int r2 = r2.f23039g
            r5 = 1
            if (r2 != r5) goto L_0x00e5
            r5 = 8
            long r3 = r3 + r5
            int r10 = r10 + -8
        L_0x00e5:
            int r2 = (int) r3
            r1.mo16091d(r2)
            com.google.ads.interactivemedia.v3.internal.nb r2 = r7.f23004a
            int r3 = r2.f23042j
            if (r3 == 0) goto L_0x0153
            com.google.ads.interactivemedia.v3.internal.aee r2 = r0.f23010c
            byte[] r2 = r2.mo14555i()
            r3 = 0
            r2[r3] = r3
            r4 = 1
            r2[r4] = r3
            r4 = 2
            r2[r4] = r3
            com.google.ads.interactivemedia.v3.internal.nb r3 = r7.f23004a
            int r3 = r3.f23042j
            int r4 = 4 - r3
        L_0x0104:
            int r5 = r0.f23021n
            if (r5 >= r10) goto L_0x0190
            int r5 = r0.f23022o
            if (r5 != 0) goto L_0x013e
            r1.mo16090c(r2, r4, r3)
            int r5 = r0.f23020m
            int r5 = r5 + r3
            r0.f23020m = r5
            com.google.ads.interactivemedia.v3.internal.aee r5 = r0.f23010c
            r6 = 0
            r5.mo14554h(r6)
            com.google.ads.interactivemedia.v3.internal.aee r5 = r0.f23010c
            int r5 = r5.mo14568v()
            if (r5 < 0) goto L_0x0136
            r0.f23022o = r5
            com.google.ads.interactivemedia.v3.internal.aee r5 = r0.f23009b
            r5.mo14554h(r6)
            com.google.ads.interactivemedia.v3.internal.aee r5 = r0.f23009b
            r6 = 4
            r15.mo16105d(r5, r6)
            int r5 = r0.f23021n
            int r5 = r5 + r6
            r0.f23021n = r5
            int r10 = r10 + r4
            goto L_0x0104
        L_0x0136:
            com.google.ads.interactivemedia.v3.internal.dt r1 = new com.google.ads.interactivemedia.v3.internal.dt
            java.lang.String r2 = "Invalid NAL length"
            r1.<init>((java.lang.String) r2)
            throw r1
        L_0x013e:
            r6 = 0
            int r5 = r15.mo16104c(r1, r5, r6)
            int r6 = r0.f23020m
            int r6 = r6 + r5
            r0.f23020m = r6
            int r6 = r0.f23021n
            int r6 = r6 + r5
            r0.f23021n = r6
            int r6 = r0.f23022o
            int r6 = r6 - r5
            r0.f23022o = r6
            goto L_0x0104
        L_0x0153:
            com.google.ads.interactivemedia.v3.internal.cy r2 = r2.f23038f
            java.lang.String r2 = r2.f21812l
            java.lang.String r3 = "audio/ac4"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0175
            int r2 = r0.f23021n
            if (r2 != 0) goto L_0x0173
            com.google.ads.interactivemedia.v3.internal.aee r2 = r0.f23011d
            com.google.ads.interactivemedia.p367v3.internal.C6965gr.m20522b(r10, r2)
            com.google.ads.interactivemedia.v3.internal.aee r2 = r0.f23011d
            r3 = 7
            r15.mo16105d(r2, r3)
            int r2 = r0.f23021n
            int r2 = r2 + r3
            r0.f23021n = r2
        L_0x0173:
            int r10 = r10 + 7
        L_0x0175:
            int r2 = r0.f23021n
            if (r2 >= r10) goto L_0x0190
            int r2 = r10 - r2
            r3 = 0
            int r2 = r15.mo16104c(r1, r2, r3)
            int r3 = r0.f23020m
            int r3 = r3 + r2
            r0.f23020m = r3
            int r3 = r0.f23021n
            int r3 = r3 + r2
            r0.f23021n = r3
            int r3 = r0.f23022o
            int r3 = r3 - r2
            r0.f23022o = r3
            goto L_0x0175
        L_0x0190:
            r19 = r10
            com.google.ads.interactivemedia.v3.internal.ne r1 = r7.f23005b
            long[] r2 = r1.f23073f
            r16 = r2[r9]
            int[] r1 = r1.f23074g
            r18 = r1[r9]
            r20 = 0
            r21 = 0
            r15.mo16103b(r16, r18, r19, r20, r21)
            int r1 = r7.f23007d
            r2 = 1
            int r1 = r1 + r2
            r7.f23007d = r1
            r0.f23019l = r8
            r1 = 0
            r0.f23020m = r1
            r0.f23021n = r1
            r0.f23022o = r1
            r8 = 0
            goto L_0x01b7
        L_0x01b4:
            r2.f22624a = r13
            r8 = 1
        L_0x01b7:
            return r8
        L_0x01b8:
            long r5 = r0.f23016i
            int r3 = r0.f23017j
            long r7 = (long) r3
            long r5 = r5 - r7
            long r7 = r30.mo16099l()
            long r7 = r7 + r5
            com.google.ads.interactivemedia.v3.internal.aee r3 = r0.f23018k
            if (r3 == 0) goto L_0x0213
            byte[] r10 = r3.mo14555i()
            int r11 = r0.f23017j
            int r6 = (int) r5
            r1.mo16090c(r10, r11, r6)
            int r5 = r0.f23015h
            if (r5 != r4) goto L_0x01f8
            r3.mo14554h(r9)
            int r4 = r3.mo14568v()
            r5 = 1903435808(0x71742020, float:1.2088509E30)
            if (r4 != r5) goto L_0x01e3
        L_0x01e1:
            r3 = 1
            goto L_0x01f5
        L_0x01e3:
            r4 = 4
            r3.mo14557k(r4)
        L_0x01e7:
            int r4 = r3.mo14550d()
            if (r4 <= 0) goto L_0x01f4
            int r4 = r3.mo14568v()
            if (r4 != r5) goto L_0x01e7
            goto L_0x01e1
        L_0x01f4:
            r3 = 0
        L_0x01f5:
            r0.f23028u = r3
            goto L_0x021e
        L_0x01f8:
            java.util.ArrayDeque r4 = r0.f23013f
            boolean r4 = r4.isEmpty()
            if (r4 != 0) goto L_0x021e
            java.util.ArrayDeque r4 = r0.f23013f
            java.lang.Object r4 = r4.peek()
            com.google.ads.interactivemedia.v3.internal.mc r4 = (com.google.ads.interactivemedia.p367v3.internal.C7112mc) r4
            com.google.ads.interactivemedia.v3.internal.md r5 = new com.google.ads.interactivemedia.v3.internal.md
            int r6 = r0.f23015h
            r5.<init>(r6, r3)
            r4.mo16167a(r5)
            goto L_0x021e
        L_0x0213:
            r3 = 262144(0x40000, double:1.295163E-318)
            int r9 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r9 >= 0) goto L_0x0220
            int r3 = (int) r5
            r1.mo16091d(r3)
        L_0x021e:
            r11 = 0
            goto L_0x0228
        L_0x0220:
            long r3 = r30.mo16099l()
            long r3 = r3 + r5
            r2.f22624a = r3
            r11 = 1
        L_0x0228:
            r0.m21186j(r7)
            if (r11 == 0) goto L_0x0006
            int r3 = r0.f23014g
            r4 = 2
            if (r3 == r4) goto L_0x0006
            r3 = 1
            return r3
        L_0x0234:
            r3 = 1
            int r7 = r0.f23017j
            if (r7 != 0) goto L_0x025e
            com.google.ads.interactivemedia.v3.internal.aee r7 = r0.f23012e
            byte[] r7 = r7.mo14555i()
            r10 = 0
            boolean r7 = r1.mo16089b(r7, r10, r9, r3)
            if (r7 != 0) goto L_0x0247
            return r8
        L_0x0247:
            r0.f23017j = r9
            com.google.ads.interactivemedia.v3.internal.aee r3 = r0.f23012e
            r3.mo14554h(r10)
            com.google.ads.interactivemedia.v3.internal.aee r3 = r0.f23012e
            long r7 = r3.mo14566t()
            r0.f23016i = r7
            com.google.ads.interactivemedia.v3.internal.aee r3 = r0.f23012e
            int r3 = r3.mo14568v()
            r0.f23015h = r3
        L_0x025e:
            long r7 = r0.f23016i
            r10 = 1
            int r3 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r3 != 0) goto L_0x027d
            com.google.ads.interactivemedia.v3.internal.aee r3 = r0.f23012e
            byte[] r3 = r3.mo14555i()
            r1.mo16090c(r3, r9, r9)
            int r3 = r0.f23017j
            int r3 = r3 + r9
            r0.f23017j = r3
            com.google.ads.interactivemedia.v3.internal.aee r3 = r0.f23012e
            long r5 = r3.mo14540D()
            r0.f23016i = r5
            goto L_0x02a8
        L_0x027d:
            int r3 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r3 != 0) goto L_0x02a8
            long r5 = r30.mo16100m()
            r7 = -1
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 != 0) goto L_0x0299
            java.util.ArrayDeque r3 = r0.f23013f
            java.lang.Object r3 = r3.peek()
            com.google.ads.interactivemedia.v3.internal.mc r3 = (com.google.ads.interactivemedia.p367v3.internal.C7112mc) r3
            if (r3 == 0) goto L_0x0298
            long r5 = r3.f22907a
            goto L_0x0299
        L_0x0298:
            r5 = r7
        L_0x0299:
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 == 0) goto L_0x02a8
            long r7 = r30.mo16099l()
            long r5 = r5 - r7
            int r3 = r0.f23017j
            long r7 = (long) r3
            long r5 = r5 + r7
            r0.f23016i = r5
        L_0x02a8:
            long r5 = r0.f23016i
            int r3 = r0.f23017j
            long r7 = (long) r3
            int r10 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r10 < 0) goto L_0x03bc
            int r5 = r0.f23015h
            r6 = 1836019574(0x6d6f6f76, float:4.631354E27)
            r7 = 1751411826(0x68646c72, float:4.3148E24)
            r8 = 1835365473(0x6d657461, float:4.4382975E27)
            if (r5 == r6) goto L_0x0366
            r6 = 1953653099(0x7472616b, float:7.681346E31)
            if (r5 == r6) goto L_0x0366
            r6 = 1835297121(0x6d646961, float:4.4181236E27)
            if (r5 == r6) goto L_0x0366
            r6 = 1835626086(0x6d696e66, float:4.515217E27)
            if (r5 == r6) goto L_0x0366
            r6 = 1937007212(0x7374626c, float:1.9362132E31)
            if (r5 == r6) goto L_0x0366
            r6 = 1701082227(0x65647473, float:6.742798E22)
            if (r5 == r6) goto L_0x0366
            if (r5 != r8) goto L_0x02db
            goto L_0x0366
        L_0x02db:
            r6 = 1835296868(0x6d646864, float:4.418049E27)
            if (r5 == r6) goto L_0x0332
            r6 = 1836476516(0x6d766864, float:4.7662196E27)
            if (r5 == r6) goto L_0x0332
            if (r5 == r7) goto L_0x0332
            r6 = 1937011556(0x73747364, float:1.9367383E31)
            if (r5 == r6) goto L_0x0332
            r6 = 1937011827(0x73747473, float:1.9367711E31)
            if (r5 == r6) goto L_0x0332
            r6 = 1937011571(0x73747373, float:1.9367401E31)
            if (r5 == r6) goto L_0x0332
            r6 = 1668576371(0x63747473, float:4.5093966E21)
            if (r5 == r6) goto L_0x0332
            r6 = 1701606260(0x656c7374, float:6.9788014E22)
            if (r5 == r6) goto L_0x0332
            r6 = 1937011555(0x73747363, float:1.9367382E31)
            if (r5 == r6) goto L_0x0332
            r6 = 1937011578(0x7374737a, float:1.936741E31)
            if (r5 == r6) goto L_0x0332
            r6 = 1937013298(0x73747a32, float:1.9369489E31)
            if (r5 == r6) goto L_0x0332
            r6 = 1937007471(0x7374636f, float:1.9362445E31)
            if (r5 == r6) goto L_0x0332
            r6 = 1668232756(0x636f3634, float:4.4126776E21)
            if (r5 == r6) goto L_0x0332
            r6 = 1953196132(0x746b6864, float:7.46037E31)
            if (r5 == r6) goto L_0x0332
            if (r5 == r4) goto L_0x0332
            r4 = 1969517665(0x75647461, float:2.8960062E32)
            if (r5 == r4) goto L_0x0332
            r4 = 1801812339(0x6b657973, float:2.7741754E26)
            if (r5 == r4) goto L_0x0332
            r4 = 1768715124(0x696c7374, float:1.7865732E25)
            if (r5 != r4) goto L_0x0330
            goto L_0x0332
        L_0x0330:
            r3 = 0
            goto L_0x035f
        L_0x0332:
            if (r3 != r9) goto L_0x0336
            r3 = 1
            goto L_0x0337
        L_0x0336:
            r3 = 0
        L_0x0337:
            com.google.ads.interactivemedia.p367v3.internal.ary.m19464q(r3)
            long r3 = r0.f23016i
            r5 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 > 0) goto L_0x0345
            r3 = 1
            goto L_0x0346
        L_0x0345:
            r3 = 0
        L_0x0346:
            com.google.ads.interactivemedia.p367v3.internal.ary.m19464q(r3)
            com.google.ads.interactivemedia.v3.internal.aee r3 = new com.google.ads.interactivemedia.v3.internal.aee
            long r4 = r0.f23016i
            int r5 = (int) r4
            r3.<init>((int) r5)
            com.google.ads.interactivemedia.v3.internal.aee r4 = r0.f23012e
            byte[] r4 = r4.mo14555i()
            byte[] r5 = r3.mo14555i()
            r6 = 0
            java.lang.System.arraycopy(r4, r6, r5, r6, r9)
        L_0x035f:
            r0.f23018k = r3
            r3 = 1
            r0.f23014g = r3
            goto L_0x0006
        L_0x0366:
            long r3 = r30.mo16099l()
            long r5 = r0.f23016i
            int r10 = r0.f23017j
            long r10 = (long) r10
            long r3 = r3 + r5
            long r3 = r3 - r10
            int r12 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r12 == 0) goto L_0x039d
            int r5 = r0.f23015h
            if (r5 != r8) goto L_0x039d
            com.google.ads.interactivemedia.v3.internal.aee r5 = r0.f23011d
            r5.mo14547a(r9)
            com.google.ads.interactivemedia.v3.internal.aee r5 = r0.f23011d
            byte[] r5 = r5.mo14555i()
            r6 = 0
            r1.mo16094g(r5, r6, r9)
            com.google.ads.interactivemedia.v3.internal.aee r5 = r0.f23011d
            r6 = 4
            r5.mo14557k(r6)
            com.google.ads.interactivemedia.v3.internal.aee r5 = r0.f23011d
            int r5 = r5.mo14568v()
            if (r5 != r7) goto L_0x039a
            r30.mo16097j()
            goto L_0x039d
        L_0x039a:
            r1.mo16091d(r6)
        L_0x039d:
            java.util.ArrayDeque r5 = r0.f23013f
            com.google.ads.interactivemedia.v3.internal.mc r6 = new com.google.ads.interactivemedia.v3.internal.mc
            int r7 = r0.f23015h
            r6.<init>(r7, r3)
            r5.push(r6)
            long r5 = r0.f23016i
            int r7 = r0.f23017j
            long r7 = (long) r7
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 != 0) goto L_0x03b7
            r0.m21186j(r3)
            goto L_0x0006
        L_0x03b7:
            r29.m21185i()
            goto L_0x0006
        L_0x03bc:
            com.google.ads.interactivemedia.v3.internal.dt r1 = new com.google.ads.interactivemedia.v3.internal.dt
            java.lang.String r2 = "Atom size less than header length (unsupported)."
            r1.<init>((java.lang.String) r2)
            goto L_0x03c5
        L_0x03c4:
            throw r1
        L_0x03c5:
            goto L_0x03c4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p367v3.internal.C7133mx.mo16112h(com.google.ads.interactivemedia.v3.internal.jv, com.google.ads.interactivemedia.v3.internal.kl):int");
    }
}
