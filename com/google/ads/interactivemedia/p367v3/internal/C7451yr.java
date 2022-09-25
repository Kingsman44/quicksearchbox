package com.google.ads.interactivemedia.p367v3.internal;

import android.net.Uri;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.ads.interactivemedia.v3.internal.yr */
/* compiled from: PG */
public final class C7451yr implements C7320tv, C7459yz, C7486zz {

    /* renamed from: a */
    private final C7449yp f24438a;

    /* renamed from: b */
    private final aad f24439b;

    /* renamed from: c */
    private final adh f24440c;

    /* renamed from: d */
    private final C7036jh f24441d;

    /* renamed from: e */
    private final C7033je f24442e;

    /* renamed from: f */
    private final C7332ug f24443f;

    /* renamed from: g */
    private final IdentityHashMap f24444g = new IdentityHashMap();

    /* renamed from: h */
    private final C7469zi f24445h = new C7469zi();

    /* renamed from: i */
    private final int f24446i;

    /* renamed from: j */
    private C7319tu f24447j;

    /* renamed from: k */
    private int f24448k;

    /* renamed from: l */
    private C7362vj f24449l;

    /* renamed from: m */
    private C7463zc[] f24450m = new C7463zc[0];

    /* renamed from: n */
    private C7463zc[] f24451n = new C7463zc[0];

    /* renamed from: o */
    private C7356vd f24452o = aqd.m19292t(new C7356vd[0]);

    /* renamed from: p */
    private final C7440yg f24453p;

    /* renamed from: q */
    private final acj f24454q;

    /* renamed from: r */
    private final acc f24455r;

    /* renamed from: s */
    private final aqd f24456s;

    public C7451yr(C7449yp ypVar, aad aad, C7440yg ygVar, adh adh, C7036jh jhVar, C7033je jeVar, acj acj, C7332ug ugVar, acc acc, aqd aqd, int i, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f24438a = ypVar;
        this.f24439b = aad;
        this.f24453p = ygVar;
        this.f24440c = adh;
        this.f24441d = jhVar;
        this.f24442e = jeVar;
        this.f24454q = acj;
        this.f24443f = ugVar;
        this.f24455r = acc;
        this.f24456s = aqd;
        this.f24446i = i;
    }

    /* renamed from: t */
    private final C7463zc m22542t(int i, Uri[] uriArr, C6864cy[] cyVarArr, C6864cy cyVar, List list, Map map, long j) {
        return new C7463zc(i, this, new C7448yo(this.f24438a, this.f24439b, uriArr, cyVarArr, this.f24453p, this.f24440c, this.f24445h, list), map, this.f24455r, j, cyVar, this.f24441d, this.f24442e, this.f24454q, this.f24443f, this.f24446i);
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0097  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo16497a(com.google.ads.interactivemedia.p367v3.internal.C7319tu r21, long r22) {
        /*
            r20 = this;
            r9 = r20
            r0 = r21
            r9.f24447j = r0
            com.google.ads.interactivemedia.v3.internal.aad r0 = r9.f24439b
            r0.mo14306c(r9)
            com.google.ads.interactivemedia.v3.internal.aad r0 = r9.f24439b
            com.google.ads.interactivemedia.v3.internal.zr r0 = r0.mo14308e()
            com.google.ads.interactivemedia.p367v3.internal.ary.m19467t(r0)
            java.util.Map r10 = java.util.Collections.emptyMap()
            java.util.List r1 = r0.f24604c
            boolean r1 = r1.isEmpty()
            java.util.List r11 = r0.f24605d
            java.util.List r12 = r0.f24606e
            r13 = 0
            r9.f24448k = r13
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            r7 = 1
            r1 = r1 ^ r7
            if (r1 == 0) goto L_0x00e1
            java.util.List r1 = r0.f24604c
            int r1 = r1.size()
            int[] r2 = new int[r1]
            r3 = 0
            r4 = 0
            r5 = 0
        L_0x003e:
            java.util.List r6 = r0.f24604c
            int r6 = r6.size()
            r8 = 2
            if (r3 >= r6) goto L_0x0077
            java.util.List r6 = r0.f24604c
            java.lang.Object r6 = r6.get(r3)
            com.google.ads.interactivemedia.v3.internal.zq r6 = (com.google.ads.interactivemedia.p367v3.internal.C7477zq) r6
            com.google.ads.interactivemedia.v3.internal.cy r6 = r6.f24597b
            int r13 = r6.f21818r
            if (r13 > 0) goto L_0x006f
            java.lang.String r13 = r6.f21809i
            java.lang.String r13 = com.google.ads.interactivemedia.p367v3.internal.aeu.m18502T(r13, r8)
            if (r13 == 0) goto L_0x005e
            goto L_0x006f
        L_0x005e:
            java.lang.String r6 = r6.f21809i
            java.lang.String r6 = com.google.ads.interactivemedia.p367v3.internal.aeu.m18502T(r6, r7)
            if (r6 == 0) goto L_0x006b
            r2[r3] = r7
            int r5 = r5 + 1
            goto L_0x0073
        L_0x006b:
            r6 = -1
            r2[r3] = r6
            goto L_0x0073
        L_0x006f:
            r2[r3] = r8
            int r4 = r4 + 1
        L_0x0073:
            int r3 = r3 + 1
            r13 = 0
            goto L_0x003e
        L_0x0077:
            if (r4 <= 0) goto L_0x007c
            r1 = 1
        L_0x007a:
            r3 = 0
            goto L_0x0086
        L_0x007c:
            if (r5 >= r1) goto L_0x0083
            int r1 = r1 - r5
            r4 = r1
            r1 = 0
            r3 = 1
            goto L_0x0086
        L_0x0083:
            r4 = r1
            r1 = 0
            goto L_0x007a
        L_0x0086:
            android.net.Uri[] r5 = new android.net.Uri[r4]
            com.google.ads.interactivemedia.v3.internal.cy[] r6 = new com.google.ads.interactivemedia.p367v3.internal.C6864cy[r4]
            int[] r13 = new int[r4]
            r4 = 0
            r16 = 0
        L_0x008f:
            java.util.List r7 = r0.f24604c
            int r7 = r7.size()
            if (r4 >= r7) goto L_0x00c3
            if (r1 == 0) goto L_0x00a0
            r7 = r2[r4]
            if (r7 != r8) goto L_0x009e
            goto L_0x00a0
        L_0x009e:
            r8 = 1
            goto L_0x00bf
        L_0x00a0:
            if (r3 == 0) goto L_0x00a8
            r7 = r2[r4]
            r8 = 1
            if (r7 == r8) goto L_0x00bf
            goto L_0x00a9
        L_0x00a8:
            r8 = 1
        L_0x00a9:
            java.util.List r7 = r0.f24604c
            java.lang.Object r7 = r7.get(r4)
            com.google.ads.interactivemedia.v3.internal.zq r7 = (com.google.ads.interactivemedia.p367v3.internal.C7477zq) r7
            android.net.Uri r8 = r7.f24596a
            r5[r16] = r8
            com.google.ads.interactivemedia.v3.internal.cy r7 = r7.f24597b
            r6[r16] = r7
            int r7 = r16 + 1
            r13[r16] = r4
            r16 = r7
        L_0x00bf:
            int r4 = r4 + 1
            r8 = 2
            goto L_0x008f
        L_0x00c3:
            r4 = 0
            r1 = r6[r4]
            java.lang.String r1 = r1.f21809i
            r1 = 0
            com.google.ads.interactivemedia.v3.internal.cy r4 = r0.f24607f
            java.util.List r7 = r0.f24608g
            r0 = r20
            r2 = r5
            r3 = r6
            r5 = r7
            r6 = r10
            r9 = 1
            r7 = r22
            com.google.ads.interactivemedia.v3.internal.zc r0 = r0.m22542t(r1, r2, r3, r4, r5, r6, r7)
            r14.add(r0)
            r15.add(r13)
            goto L_0x00e2
        L_0x00e1:
            r9 = 1
        L_0x00e2:
            java.util.ArrayList r13 = new java.util.ArrayList
            int r0 = r11.size()
            r13.<init>(r0)
            java.util.ArrayList r7 = new java.util.ArrayList
            int r0 = r11.size()
            r7.<init>(r0)
            java.util.ArrayList r8 = new java.util.ArrayList
            int r0 = r11.size()
            r8.<init>(r0)
            java.util.HashSet r6 = new java.util.HashSet
            r6.<init>()
            r5 = 0
        L_0x0103:
            int r0 = r11.size()
            if (r5 >= r0) goto L_0x01a1
            java.lang.Object r0 = r11.get(r5)
            com.google.ads.interactivemedia.v3.internal.zp r0 = (com.google.ads.interactivemedia.p367v3.internal.C7476zp) r0
            java.lang.String r0 = r0.f24595c
            boolean r1 = r6.add(r0)
            if (r1 != 0) goto L_0x0121
            r17 = r5
            r16 = r6
            r18 = r7
            r19 = r8
            goto L_0x0197
        L_0x0121:
            r13.clear()
            r7.clear()
            r8.clear()
            r1 = 0
        L_0x012b:
            int r2 = r11.size()
            if (r1 >= r2) goto L_0x015b
            java.lang.Object r2 = r11.get(r1)
            com.google.ads.interactivemedia.v3.internal.zp r2 = (com.google.ads.interactivemedia.p367v3.internal.C7476zp) r2
            java.lang.String r2 = r2.f24595c
            boolean r2 = com.google.ads.interactivemedia.p367v3.internal.aeu.m18533c(r0, r2)
            if (r2 == 0) goto L_0x0158
            java.lang.Object r2 = r11.get(r1)
            com.google.ads.interactivemedia.v3.internal.zp r2 = (com.google.ads.interactivemedia.p367v3.internal.C7476zp) r2
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
            r8.add(r3)
            android.net.Uri r3 = r2.f24593a
            r13.add(r3)
            com.google.ads.interactivemedia.v3.internal.cy r3 = r2.f24594b
            r7.add(r3)
            com.google.ads.interactivemedia.v3.internal.cy r2 = r2.f24594b
        L_0x0158:
            int r1 = r1 + 1
            goto L_0x012b
        L_0x015b:
            r1 = 0
            android.net.Uri[] r0 = new android.net.Uri[r1]
            java.lang.Object[] r0 = com.google.ads.interactivemedia.p367v3.internal.aeu.m18537g(r0)
            android.net.Uri[] r0 = (android.net.Uri[]) r0
            java.lang.Object[] r0 = r13.toArray(r0)
            r2 = r0
            android.net.Uri[] r2 = (android.net.Uri[]) r2
            com.google.ads.interactivemedia.v3.internal.cy[] r0 = new com.google.ads.interactivemedia.p367v3.internal.C6864cy[r1]
            java.lang.Object[] r0 = r7.toArray(r0)
            r3 = r0
            com.google.ads.interactivemedia.v3.internal.cy[] r3 = (com.google.ads.interactivemedia.p367v3.internal.C6864cy[]) r3
            java.util.List r16 = java.util.Collections.emptyList()
            r1 = 1
            r4 = 0
            r0 = r20
            r17 = r5
            r5 = r16
            r16 = r6
            r6 = r10
            r18 = r7
            r19 = r8
            r7 = r22
            com.google.ads.interactivemedia.v3.internal.zc r0 = r0.m22542t(r1, r2, r3, r4, r5, r6, r7)
            int[] r1 = com.google.ads.interactivemedia.p367v3.internal.aqd.m19285m(r19)
            r15.add(r1)
            r14.add(r0)
        L_0x0197:
            int r5 = r17 + 1
            r6 = r16
            r7 = r18
            r8 = r19
            goto L_0x0103
        L_0x01a1:
            r11 = 0
        L_0x01a2:
            int r0 = r12.size()
            if (r11 >= r0) goto L_0x01ed
            java.lang.Object r0 = r12.get(r11)
            r13 = r0
            com.google.ads.interactivemedia.v3.internal.zp r13 = (com.google.ads.interactivemedia.p367v3.internal.C7476zp) r13
            android.net.Uri[] r2 = new android.net.Uri[r9]
            android.net.Uri r0 = r13.f24593a
            r1 = 0
            r2[r1] = r0
            com.google.ads.interactivemedia.v3.internal.cy[] r3 = new com.google.ads.interactivemedia.p367v3.internal.C6864cy[r9]
            com.google.ads.interactivemedia.v3.internal.cy r0 = r13.f24594b
            r3[r1] = r0
            r1 = 3
            r4 = 0
            java.util.List r5 = java.util.Collections.emptyList()
            r0 = r20
            r6 = r10
            r7 = r22
            com.google.ads.interactivemedia.v3.internal.zc r0 = r0.m22542t(r1, r2, r3, r4, r5, r6, r7)
            int[] r1 = new int[r9]
            r2 = 0
            r1[r2] = r11
            r15.add(r1)
            r14.add(r0)
            com.google.ads.interactivemedia.v3.internal.vh[] r1 = new com.google.ads.interactivemedia.p367v3.internal.C7360vh[r9]
            com.google.ads.interactivemedia.v3.internal.vh r3 = new com.google.ads.interactivemedia.v3.internal.vh
            com.google.ads.interactivemedia.v3.internal.cy[] r4 = new com.google.ads.interactivemedia.p367v3.internal.C6864cy[r9]
            com.google.ads.interactivemedia.v3.internal.cy r5 = r13.f24594b
            r4[r2] = r5
            r3.<init>((com.google.ads.interactivemedia.p367v3.internal.C6864cy[]) r4)
            r1[r2] = r3
            int[] r3 = new int[r2]
            r0.mo16850H(r1, r3)
            int r11 = r11 + 1
            goto L_0x01a2
        L_0x01ed:
            r2 = 0
            com.google.ads.interactivemedia.v3.internal.zc[] r0 = new com.google.ads.interactivemedia.p367v3.internal.C7463zc[r2]
            java.lang.Object[] r0 = r14.toArray(r0)
            com.google.ads.interactivemedia.v3.internal.zc[] r0 = (com.google.ads.interactivemedia.p367v3.internal.C7463zc[]) r0
            r3 = 1
            r1 = r20
            r1.f24450m = r0
            int[][] r0 = new int[r2][]
            java.lang.Object[] r0 = r15.toArray(r0)
            int[][] r0 = (int[][]) r0
            com.google.ads.interactivemedia.v3.internal.zc[] r0 = r1.f24450m
            int r4 = r0.length
            r1.f24448k = r4
            r0 = r0[r2]
            r0.mo16860s(r3)
            com.google.ads.interactivemedia.v3.internal.zc[] r0 = r1.f24450m
            int r3 = r0.length
            r13 = 0
        L_0x0211:
            if (r13 >= r3) goto L_0x021b
            r2 = r0[r13]
            r2.mo16851d()
            int r13 = r13 + 1
            goto L_0x0211
        L_0x021b:
            com.google.ads.interactivemedia.v3.internal.zc[] r0 = r1.f24450m
            r1.f24451n = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p367v3.internal.C7451yr.mo16497a(com.google.ads.interactivemedia.v3.internal.tu, long):void");
    }

    /* renamed from: b */
    public final void mo16498b() {
        for (C7463zc e : this.f24450m) {
            e.mo16852e();
        }
    }

    /* renamed from: c */
    public final C7362vj mo16499c() {
        C7362vj vjVar = this.f24449l;
        ary.m19467t(vjVar);
        return vjVar;
    }

    /* renamed from: d */
    public final long mo16500d(aba[] abaArr, boolean[] zArr, C7354vb[] vbVarArr, boolean[] zArr2, long j) {
        int length;
        C7463zc[] zcVarArr;
        int i;
        aba[] abaArr2 = abaArr;
        C7354vb[] vbVarArr2 = vbVarArr;
        int length2 = abaArr2.length;
        int[] iArr = new int[length2];
        int[] iArr2 = new int[length2];
        int i2 = 0;
        while (true) {
            length = abaArr2.length;
            if (i2 >= length) {
                break;
            }
            C7354vb vbVar = vbVarArr2[i2];
            if (vbVar == null) {
                i = -1;
            } else {
                i = ((Integer) this.f24444g.get(vbVar)).intValue();
            }
            iArr[i2] = i;
            iArr2[i2] = -1;
            aba aba = abaArr2[i2];
            if (aba != null) {
                C7360vh k = aba.mo14331k();
                int i3 = 0;
                while (true) {
                    C7463zc[] zcVarArr2 = this.f24450m;
                    if (i3 >= zcVarArr2.length) {
                        break;
                    } else if (zcVarArr2[i3].mo16853g().mo16657b(k) != -1) {
                        iArr2[i2] = i3;
                        break;
                    } else {
                        i3++;
                    }
                }
            }
            i2++;
        }
        this.f24444g.clear();
        C7354vb[] vbVarArr3 = new C7354vb[length];
        C7354vb[] vbVarArr4 = new C7354vb[length];
        aba[] abaArr3 = new aba[length];
        C7463zc[] zcVarArr3 = new C7463zc[this.f24450m.length];
        int i4 = 0;
        int i5 = 0;
        boolean z = false;
        while (i5 < this.f24450m.length) {
            for (int i6 = 0; i6 < abaArr2.length; i6++) {
                aba aba2 = null;
                vbVarArr4[i6] = iArr[i6] == i5 ? vbVarArr2[i6] : null;
                if (iArr2[i6] == i5) {
                    aba2 = abaArr2[i6];
                }
                abaArr3[i6] = aba2;
            }
            C7463zc zcVar = this.f24450m[i5];
            C7463zc zcVar2 = zcVar;
            int i7 = i4;
            int i8 = length;
            int i9 = i5;
            aba[] abaArr4 = abaArr3;
            C7463zc[] zcVarArr4 = zcVarArr3;
            C7354vb[] vbVarArr5 = vbVarArr4;
            boolean k2 = zcVar.mo16856k(abaArr3, zArr, vbVarArr4, zArr2, j, z);
            int i10 = 0;
            boolean z2 = false;
            while (true) {
                boolean z3 = true;
                if (i10 >= abaArr2.length) {
                    break;
                }
                C7354vb vbVar2 = vbVarArr5[i10];
                if (iArr2[i10] == i9) {
                    ary.m19467t(vbVar2);
                    vbVarArr3[i10] = vbVar2;
                    this.f24444g.put(vbVar2, Integer.valueOf(i9));
                    z2 = true;
                } else if (iArr[i10] == i9) {
                    if (vbVar2 != null) {
                        z3 = false;
                    }
                    ary.m19464q(z3);
                }
                i10++;
            }
            if (z2) {
                zcVarArr = zcVarArr4;
                zcVarArr[i7] = zcVar2;
                i4 = i7 + 1;
                if (i7 == 0) {
                    zcVar2.mo16860s(true);
                    if (!k2) {
                        C7463zc[] zcVarArr5 = this.f24451n;
                        if (zcVarArr5.length != 0) {
                            if (zcVar2 == zcVarArr5[0]) {
                            }
                            this.f24445h.mo16879b();
                            z = true;
                        }
                    }
                    this.f24445h.mo16879b();
                    z = true;
                } else {
                    zcVar2.mo16860s(false);
                }
            } else {
                zcVarArr = zcVarArr4;
                i4 = i7;
            }
            i5 = i9 + 1;
            vbVarArr2 = vbVarArr;
            zcVarArr3 = zcVarArr;
            length = i8;
            abaArr3 = abaArr4;
            vbVarArr4 = vbVarArr5;
        }
        System.arraycopy(vbVarArr3, 0, vbVarArr2, 0, length);
        C7463zc[] zcVarArr6 = (C7463zc[]) aeu.m18538h(zcVarArr3, i4);
        this.f24451n = zcVarArr6;
        this.f24452o = aqd.m19292t(zcVarArr6);
        return j;
    }

    /* renamed from: e */
    public final void mo16501e(long j, boolean z) {
        for (C7463zc p : this.f24451n) {
            p.mo16857p(j, false);
        }
    }

    /* renamed from: f */
    public final void mo16502f(long j) {
        this.f24452o.mo16502f(j);
    }

    /* renamed from: g */
    public final long mo16503g() {
        return -9223372036854775807L;
    }

    /* renamed from: h */
    public final long mo16504h() {
        return this.f24452o.mo16504h();
    }

    /* renamed from: i */
    public final long mo16505i(long j) {
        C7463zc[] zcVarArr = this.f24451n;
        if (zcVarArr.length > 0) {
            boolean q = zcVarArr[0].mo16858q(j, false);
            int i = 1;
            while (true) {
                C7463zc[] zcVarArr2 = this.f24451n;
                if (i >= zcVarArr2.length) {
                    break;
                }
                zcVarArr2[i].mo16858q(j, q);
                i++;
            }
            if (q) {
                this.f24445h.mo16879b();
            }
        }
        return j;
    }

    /* renamed from: j */
    public final long mo16506j(long j, C6900eg egVar) {
        return j;
    }

    /* renamed from: k */
    public final void mo16828k() {
        this.f24439b.mo14307d(this);
        for (C7463zc r : this.f24450m) {
            r.mo16859r();
        }
        this.f24447j = null;
    }

    /* renamed from: l */
    public final long mo16507l() {
        return this.f24452o.mo16507l();
    }

    /* renamed from: m */
    public final /* bridge */ /* synthetic */ void mo15598m(C7356vd vdVar) {
        this.f24447j.mo15598m(this);
    }

    /* renamed from: n */
    public final boolean mo16508n(long j) {
        if (this.f24449l != null) {
            return this.f24452o.mo16508n(j);
        }
        for (C7463zc d : this.f24450m) {
            d.mo16851d();
        }
        return false;
    }

    /* renamed from: o */
    public final boolean mo16509o() {
        return this.f24452o.mo16509o();
    }

    /* renamed from: p */
    public final void mo16829p() {
        int i = this.f24448k - 1;
        this.f24448k = i;
        if (i <= 0) {
            int i2 = 0;
            for (C7463zc g : this.f24450m) {
                i2 += g.mo16853g().f24052b;
            }
            C7360vh[] vhVarArr = new C7360vh[i2];
            int i3 = 0;
            for (C7463zc zcVar : this.f24450m) {
                int i4 = zcVar.mo16853g().f24052b;
                int i5 = 0;
                while (i5 < i4) {
                    vhVarArr[i3] = zcVar.mo16853g().mo16656a(i5);
                    i5++;
                    i3++;
                }
            }
            this.f24449l = new C7362vj(vhVarArr);
            this.f24447j.mo15597k(this);
        }
    }

    /* renamed from: q */
    public final void mo16830q(Uri uri) {
        this.f24439b.mo14314k(uri);
    }

    /* renamed from: r */
    public final void mo16831r() {
        this.f24447j.mo15598m(this);
    }

    /* renamed from: s */
    public final boolean mo16832s(Uri uri, long j) {
        boolean z = true;
        for (C7463zc t : this.f24450m) {
            z &= t.mo16861t(uri, j);
        }
        this.f24447j.mo15598m(this);
        return z;
    }
}
