package com.google.ads.interactivemedia.p367v3.internal;

import android.net.Uri;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.ads.interactivemedia.v3.internal.yo */
/* compiled from: PG */
final class C7448yo {

    /* renamed from: a */
    private final C7449yp f24393a;

    /* renamed from: b */
    private final abx f24394b;

    /* renamed from: c */
    private final abx f24395c;

    /* renamed from: d */
    private final C7469zi f24396d;

    /* renamed from: e */
    private final Uri[] f24397e;

    /* renamed from: f */
    private final C6864cy[] f24398f;

    /* renamed from: g */
    private final aad f24399g;

    /* renamed from: h */
    private final C7360vh f24400h;

    /* renamed from: i */
    private final List f24401i;

    /* renamed from: j */
    private final C7443yj f24402j = new C7443yj();

    /* renamed from: k */
    private boolean f24403k;

    /* renamed from: l */
    private byte[] f24404l = aeu.f20471f;

    /* renamed from: m */
    private IOException f24405m;

    /* renamed from: n */
    private Uri f24406n;

    /* renamed from: o */
    private boolean f24407o;

    /* renamed from: p */
    private aba f24408p;

    /* renamed from: q */
    private long f24409q = -9223372036854775807L;

    /* renamed from: r */
    private boolean f24410r;

    public C7448yo(C7449yp ypVar, aad aad, Uri[] uriArr, C6864cy[] cyVarArr, C7440yg ygVar, adh adh, C7469zi ziVar, List list) {
        this.f24393a = ypVar;
        this.f24399g = aad;
        this.f24397e = uriArr;
        this.f24398f = cyVarArr;
        this.f24396d = ziVar;
        this.f24401i = list;
        abx a = ygVar.mo16804a();
        this.f24394b = a;
        if (adh != null) {
            a.mo14402b(adh);
        }
        this.f24395c = ygVar.mo16804a();
        this.f24400h = new C7360vh(cyVarArr);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < uriArr.length; i++) {
            if ((cyVarArr[i].f21805e & 16384) == 0) {
                arrayList.add(Integer.valueOf(i));
            }
        }
        this.f24408p = new C7447yn(this.f24400h, aqd.m19285m(arrayList));
    }

    /* renamed from: o */
    private final C7372vt m22515o(Uri uri, int i) {
        if (uri == null) {
            return null;
        }
        byte[] b = this.f24402j.mo16808b(uri);
        if (b != null) {
            this.f24402j.mo16809c(uri, b);
            return null;
        }
        aca aca = new aca();
        aca.mo14431g(uri);
        aca.mo14426b(1);
        return new C7444yk(this.f24395c, aca.mo14425a(), this.f24398f[i], this.f24408p.mo14320b(), this.f24408p.mo14321c(), this.f24404l);
    }

    /* renamed from: p */
    private static Uri m22516p(C7480zt ztVar, C7479zs zsVar) {
        String str;
        if (zsVar == null || (str = zsVar.f24617g) == null) {
            return null;
        }
        return atv.m19617i(ztVar.f24637p, str);
    }

    /* renamed from: a */
    public final void mo16812a() {
        IOException iOException = this.f24405m;
        if (iOException == null) {
            Uri uri = this.f24406n;
            if (uri != null && this.f24410r) {
                this.f24399g.mo14313j(uri);
                return;
            }
            return;
        }
        throw iOException;
    }

    /* renamed from: b */
    public final C7360vh mo16813b() {
        return this.f24400h;
    }

    /* renamed from: c */
    public final void mo16814c(aba aba) {
        this.f24408p = aba;
    }

    /* renamed from: d */
    public final aba mo16815d() {
        return this.f24408p;
    }

    /* renamed from: e */
    public final void mo16816e() {
        this.f24405m = null;
    }

    /* renamed from: f */
    public final void mo16817f(boolean z) {
        this.f24403k = z;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0091  */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo16818g(long r29, long r31, java.util.List r33, boolean r34, com.google.ads.interactivemedia.p367v3.internal.C7445yl r35) {
        /*
            r28 = this;
            r8 = r28
            r6 = r31
            r9 = r35
            boolean r0 = r33.isEmpty()
            r11 = -1
            if (r0 == 0) goto L_0x0011
            r1 = r33
            r4 = 0
            goto L_0x001f
        L_0x0011:
            int r0 = r33.size()
            int r0 = r0 + r11
            r1 = r33
            java.lang.Object r0 = r1.get(r0)
            com.google.ads.interactivemedia.v3.internal.yq r0 = (com.google.ads.interactivemedia.p367v3.internal.C7450yq) r0
            r4 = r0
        L_0x001f:
            if (r4 != 0) goto L_0x0023
            r5 = -1
            goto L_0x002c
        L_0x0023:
            com.google.ads.interactivemedia.v3.internal.vh r0 = r8.f24400h
            com.google.ads.interactivemedia.v3.internal.cy r2 = r4.f24091f
            int r0 = r0.mo16649b(r2)
            r5 = r0
        L_0x002c:
            long r2 = r6 - r29
            long r12 = r8.f24409q
            r18 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r12 > r18 ? 1 : (r12 == r18 ? 0 : -1))
            if (r0 == 0) goto L_0x003c
            long r12 = r12 - r29
            goto L_0x003e
        L_0x003c:
            r12 = r18
        L_0x003e:
            if (r4 == 0) goto L_0x005c
            boolean r0 = r8.f24407o
            if (r0 != 0) goto L_0x005c
            long r14 = r4.f24095j
            long r10 = r4.f24094i
            long r14 = r14 - r10
            long r2 = r2 - r14
            r10 = 0
            long r2 = java.lang.Math.max(r10, r2)
            int r0 = (r12 > r18 ? 1 : (r12 == r18 ? 0 : -1))
            if (r0 == 0) goto L_0x005c
            long r12 = r12 - r14
            long r10 = java.lang.Math.max(r10, r12)
            r13 = r2
            r15 = r10
            goto L_0x005e
        L_0x005c:
            r15 = r12
            r13 = r2
        L_0x005e:
            r8.mo16822k(r4, r6)
            com.google.ads.interactivemedia.v3.internal.aba r12 = r8.f24408p
            r17 = r33
            r12.mo14322d(r13, r15, r17)
            com.google.ads.interactivemedia.v3.internal.aba r0 = r8.f24408p
            int r10 = r0.mo14338r()
            r11 = 0
            r12 = 1
            if (r5 == r10) goto L_0x0074
            r13 = 1
            goto L_0x0075
        L_0x0074:
            r13 = 0
        L_0x0075:
            android.net.Uri[] r0 = r8.f24397e
            r14 = r0[r10]
            com.google.ads.interactivemedia.v3.internal.aad r0 = r8.f24399g
            boolean r0 = r0.mo14311h(r14)
            if (r0 != 0) goto L_0x0091
            r9.f24391c = r14
            boolean r0 = r8.f24410r
            android.net.Uri r1 = r8.f24406n
            boolean r1 = r14.equals(r1)
            r0 = r0 & r1
            r8.f24410r = r0
            r8.f24406n = r14
            return
        L_0x0091:
            com.google.ads.interactivemedia.v3.internal.aad r0 = r8.f24399g
            com.google.ads.interactivemedia.v3.internal.zt r15 = r0.mo14309f(r14, r12)
            com.google.ads.interactivemedia.p367v3.internal.ary.m19467t(r15)
            boolean r0 = r15.f24639r
            r8.f24407o = r0
            boolean r0 = r15.f24631j
            if (r0 == 0) goto L_0x00a3
            goto L_0x00af
        L_0x00a3:
            long r0 = r15.mo16889b()
            com.google.ads.interactivemedia.v3.internal.aad r2 = r8.f24399g
            long r2 = r2.mo14310g()
            long r18 = r0 - r2
        L_0x00af:
            r0 = r18
            r8.f24409q = r0
            long r0 = r15.f24624c
            com.google.ads.interactivemedia.v3.internal.aad r2 = r8.f24399g
            long r2 = r2.mo14310g()
            long r16 = r0 - r2
            r0 = r28
            r1 = r4
            r2 = r13
            r3 = r15
            r25 = r4
            r18 = r5
            r4 = r16
            r6 = r31
            long r0 = r0.m22514n(r1, r2, r3, r4, r6)
            long r2 = r15.f24627f
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 >= 0) goto L_0x00f9
            if (r25 == 0) goto L_0x00f9
            if (r13 == 0) goto L_0x00f9
            android.net.Uri[] r0 = r8.f24397e
            r0 = r0[r18]
            com.google.ads.interactivemedia.v3.internal.aad r1 = r8.f24399g
            com.google.ads.interactivemedia.v3.internal.zt r1 = r1.mo14309f(r0, r12)
            com.google.ads.interactivemedia.p367v3.internal.ary.m19467t(r1)
            long r2 = r1.f24624c
            com.google.ads.interactivemedia.v3.internal.aad r4 = r8.f24399g
            long r4 = r4.mo14310g()
            long r2 = r2 - r4
            long r4 = r25.mo16702i()
            r15 = r2
            r3 = r0
            r2 = r1
            r0 = r4
            r5 = r18
            goto L_0x00fe
        L_0x00f9:
            r5 = r10
            r3 = r14
            r2 = r15
            r15 = r16
        L_0x00fe:
            long r6 = r2.f24627f
            int r4 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r4 >= 0) goto L_0x010c
            com.google.ads.interactivemedia.v3.internal.st r0 = new com.google.ads.interactivemedia.v3.internal.st
            r0.<init>()
            r8.f24405m = r0
            return
        L_0x010c:
            long r0 = r0 - r6
            int r1 = (int) r0
            java.util.List r0 = r2.f24634m
            int r0 = r0.size()
            if (r1 < r0) goto L_0x0135
            boolean r1 = r2.f24631j
            if (r1 == 0) goto L_0x0125
            if (r34 != 0) goto L_0x0122
            if (r0 != 0) goto L_0x011f
            goto L_0x0122
        L_0x011f:
            r1 = -1
            int r0 = r0 + r1
            goto L_0x0136
        L_0x0122:
            r9.f24390b = r12
            return
        L_0x0125:
            r9.f24391c = r3
            boolean r0 = r8.f24410r
            android.net.Uri r1 = r8.f24406n
            boolean r1 = r3.equals(r1)
            r0 = r0 & r1
            r8.f24410r = r0
            r8.f24406n = r3
            return
        L_0x0135:
            r0 = r1
        L_0x0136:
            r8.f24410r = r11
            r1 = 0
            r8.f24406n = r1
            java.util.List r1 = r2.f24634m
            java.lang.Object r1 = r1.get(r0)
            com.google.ads.interactivemedia.v3.internal.zs r1 = (com.google.ads.interactivemedia.p367v3.internal.C7479zs) r1
            com.google.ads.interactivemedia.v3.internal.zs r4 = r1.f24612b
            android.net.Uri r4 = m22516p(r2, r4)
            com.google.ads.interactivemedia.v3.internal.vt r6 = r8.m22515o(r4, r5)
            r9.f24389a = r6
            com.google.ads.interactivemedia.v3.internal.vt r6 = r9.f24389a
            if (r6 == 0) goto L_0x0154
            return
        L_0x0154:
            android.net.Uri r1 = m22516p(r2, r1)
            com.google.ads.interactivemedia.v3.internal.vt r6 = r8.m22515o(r1, r5)
            r9.f24389a = r6
            com.google.ads.interactivemedia.v3.internal.vt r6 = r9.f24389a
            if (r6 == 0) goto L_0x0163
            return
        L_0x0163:
            com.google.ads.interactivemedia.v3.internal.yp r12 = r8.f24393a
            com.google.ads.interactivemedia.v3.internal.abx r13 = r8.f24394b
            com.google.ads.interactivemedia.v3.internal.cy[] r6 = r8.f24398f
            r14 = r6[r5]
            java.util.List r5 = r8.f24401i
            com.google.ads.interactivemedia.v3.internal.aba r6 = r8.f24408p
            int r21 = r6.mo14320b()
            com.google.ads.interactivemedia.v3.internal.aba r6 = r8.f24408p
            java.lang.Object r22 = r6.mo14321c()
            boolean r6 = r8.f24403k
            com.google.ads.interactivemedia.v3.internal.zi r7 = r8.f24396d
            com.google.ads.interactivemedia.v3.internal.yj r10 = r8.f24402j
            byte[] r26 = r10.mo16807a(r1)
            com.google.ads.interactivemedia.v3.internal.yj r1 = r8.f24402j
            byte[] r27 = r1.mo16807a(r4)
            r17 = r2
            r18 = r0
            r19 = r3
            r20 = r5
            r23 = r6
            r24 = r7
            com.google.ads.interactivemedia.v3.internal.yq r0 = com.google.ads.interactivemedia.p367v3.internal.C7450yq.m22531a(r12, r13, r14, r15, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            r9.f24389a = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p367v3.internal.C7448yo.mo16818g(long, long, java.util.List, boolean, com.google.ads.interactivemedia.v3.internal.yl):void");
    }

    /* renamed from: h */
    public final void mo16819h(C7372vt vtVar) {
        if (vtVar instanceof C7444yk) {
            C7444yk ykVar = (C7444yk) vtVar;
            this.f24404l = ykVar.mo16709a();
            this.f24402j.mo16809c(ykVar.f24089d.f20241a, (byte[]) ary.m19467t(ykVar.mo16810e()));
        }
    }

    /* renamed from: i */
    public final boolean mo16820i(C7372vt vtVar, long j) {
        aba aba = this.f24408p;
        return aba.mo14339s(aba.mo14336p(this.f24400h.mo16649b(vtVar.f24091f)), j);
    }

    /* renamed from: j */
    public final boolean mo16821j(Uri uri, long j) {
        int p;
        int i = 0;
        while (true) {
            Uri[] uriArr = this.f24397e;
            if (i < uriArr.length) {
                if (uriArr[i].equals(uri)) {
                    break;
                }
                i++;
            } else {
                i = -1;
                break;
            }
        }
        if (i == -1 || (p = this.f24408p.mo14336p(i)) == -1) {
            return true;
        }
        this.f24410r = uri.equals(this.f24406n) | this.f24410r;
        if (j == -9223372036854775807L || this.f24408p.mo14339s(p, j)) {
            return true;
        }
        return false;
    }

    /* renamed from: l */
    public final int mo16823l(long j, List list) {
        if (this.f24405m != null || this.f24408p.mo14332l() < 2) {
            return list.size();
        }
        return this.f24408p.mo14327i(j, list);
    }

    /* renamed from: m */
    public final boolean mo16824m(long j, C7372vt vtVar, List list) {
        if (this.f24405m != null) {
            return false;
        }
        return this.f24408p.mo14341u();
    }

    /* renamed from: n */
    private final long m22514n(C7450yq yqVar, boolean z, C7480zt ztVar, long j, long j2) {
        long al;
        long j3;
        if (yqVar != null && !z) {
            return yqVar.mo16703j() ? yqVar.mo16702i() : yqVar.f24145l;
        }
        long j4 = ztVar.f24635n + j;
        if (yqVar != null && !this.f24407o) {
            j2 = yqVar.f24094i;
        }
        if (ztVar.f24631j || j2 < j4) {
            List list = ztVar.f24634m;
            Long valueOf = Long.valueOf(j2 - j);
            boolean z2 = true;
            if (this.f24399g.mo14315l() && yqVar != null) {
                z2 = false;
            }
            al = (long) aeu.m18521al(list, valueOf, z2);
            j3 = ztVar.f24627f;
        } else {
            al = ztVar.f24627f;
            j3 = (long) ztVar.f24634m.size();
        }
        return al + j3;
    }

    /* renamed from: k */
    public final C7384we[] mo16822k(C7450yq yqVar, long j) {
        int i;
        C7450yq yqVar2 = yqVar;
        if (yqVar2 == null) {
            i = -1;
        } else {
            i = this.f24400h.mo16649b(yqVar2.f24091f);
        }
        int l = this.f24408p.mo14332l();
        C7384we[] weVarArr = new C7384we[l];
        for (int i2 = 0; i2 < l; i2++) {
            int n = this.f24408p.mo14334n(i2);
            Uri uri = this.f24397e[n];
            if (!this.f24399g.mo14311h(uri)) {
                weVarArr[i2] = C7384we.f24146a;
            } else {
                C7480zt f = this.f24399g.mo14309f(uri, false);
                ary.m19467t(f);
                long n2 = m22514n(yqVar, n != i, f, f.f24624c - this.f24399g.mo14310g(), j);
                long j2 = f.f24627f;
                if (n2 < j2) {
                    weVarArr[i2] = C7384we.f24146a;
                } else {
                    weVarArr[i2] = new C7446ym(f, (int) (n2 - j2));
                }
            }
        }
        return weVarArr;
    }
}
