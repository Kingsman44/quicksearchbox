package com.google.ads.interactivemedia.p367v3.internal;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.ads.interactivemedia.v3.internal.xc */
/* compiled from: PG */
public final class C7409xc implements C7386wg {

    /* renamed from: a */
    protected final C7407xa[] f24251a;

    /* renamed from: b */
    private final adb f24252b;

    /* renamed from: c */
    private final int[] f24253c;

    /* renamed from: d */
    private final int f24254d;

    /* renamed from: e */
    private final abx f24255e;

    /* renamed from: f */
    private final long f24256f;

    /* renamed from: g */
    private final int f24257g = 1;

    /* renamed from: h */
    private final C7413xg f24258h;

    /* renamed from: i */
    private aba f24259i;

    /* renamed from: j */
    private C7416xj f24260j;

    /* renamed from: k */
    private int f24261k;

    /* renamed from: l */
    private IOException f24262l;

    /* renamed from: m */
    private boolean f24263m;

    public C7409xc(adb adb, C7416xj xjVar, int i, int[] iArr, aba aba, int i2, abx abx, long j, int i3, boolean z, List list, C7413xg xgVar) {
        aba aba2 = aba;
        this.f24252b = adb;
        this.f24260j = xjVar;
        this.f24253c = iArr;
        this.f24259i = aba2;
        this.f24254d = i2;
        this.f24255e = abx;
        this.f24261k = i;
        this.f24256f = j;
        this.f24258h = xgVar;
        long e = xjVar.mo16764e(i);
        ArrayList k = m22366k();
        this.f24251a = new C7407xa[aba.mo14332l()];
        for (int i4 = 0; i4 < this.f24251a.length; i4++) {
            this.f24251a[i4] = new C7407xa(e, i2, (C7426xt) k.get(aba2.mo14334n(i4)), z, list, xgVar);
        }
    }

    /* renamed from: k */
    private final ArrayList m22366k() {
        List list = this.f24260j.mo16762c(this.f24261k).f24329c;
        ArrayList arrayList = new ArrayList();
        for (int i : this.f24253c) {
            arrayList.addAll(((C7415xi) list.get(i)).f24291c);
        }
        return arrayList;
    }

    /* renamed from: l */
    private final long m22367l(long j) {
        C7416xj xjVar = this.f24260j;
        return j - C6821bi.m19755b(xjVar.f24295a + xjVar.mo16762c(this.f24261k).f24328b);
    }

    /* renamed from: m */
    private static final long m22368m(C7407xa xaVar, C7382wc wcVar, long j, long j2, long j3) {
        if (wcVar != null) {
            return wcVar.mo16702i();
        }
        return aeu.m18491I(xaVar.mo16746h(j), j2, j3);
    }

    /* renamed from: a */
    public final long mo16694a(long j, C6900eg egVar) {
        for (C7407xa xaVar : this.f24251a) {
            if (xaVar.f24247b != null) {
                long h = xaVar.mo16746h(j);
                long f = xaVar.mo16744f(h);
                return egVar.mo15787a(j, f, (f >= j || h >= ((long) (xaVar.mo16743e() + -1))) ? f : xaVar.mo16744f(h + 1));
            }
        }
        return j;
    }

    /* renamed from: b */
    public final void mo16695b() {
        IOException iOException = this.f24262l;
        if (iOException == null) {
            this.f24252b.mo14468a();
            return;
        }
        throw iOException;
    }

    /* renamed from: c */
    public final int mo16696c(long j, List list) {
        if (this.f24262l != null || this.f24259i.mo14332l() < 2) {
            return list.size();
        }
        return this.f24259i.mo14327i(j, list);
    }

    /* renamed from: d */
    public final boolean mo16697d(long j, C7372vt vtVar, List list) {
        if (this.f24262l != null) {
            return false;
        }
        return this.f24259i.mo14341u();
    }

    /* JADX WARNING: type inference failed for: r4v3, types: [com.google.ads.interactivemedia.v3.internal.vt] */
    /* JADX WARNING: type inference failed for: r24v6, types: [com.google.ads.interactivemedia.v3.internal.vz] */
    /* JADX WARNING: type inference failed for: r24v7, types: [com.google.ads.interactivemedia.v3.internal.wf] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo16698e(long r45, long r47, java.util.List r49, com.google.ads.interactivemedia.p367v3.internal.C7373vu r50) {
        /*
            r44 = this;
            r0 = r44
            r9 = r50
            java.io.IOException r1 = r0.f24262l
            if (r1 == 0) goto L_0x0009
            return
        L_0x0009:
            long r10 = r47 - r45
            com.google.ads.interactivemedia.v3.internal.xj r1 = r0.f24260j
            long r1 = r1.f24295a
            long r1 = com.google.ads.interactivemedia.p367v3.internal.C6821bi.m19755b(r1)
            com.google.ads.interactivemedia.v3.internal.xj r3 = r0.f24260j
            int r4 = r0.f24261k
            com.google.ads.interactivemedia.v3.internal.xo r3 = r3.mo16762c(r4)
            long r3 = r3.f24328b
            long r3 = com.google.ads.interactivemedia.p367v3.internal.C6821bi.m19755b(r3)
            long r1 = r1 + r3
            long r1 = r1 + r47
            com.google.ads.interactivemedia.v3.internal.xg r3 = r0.f24258h
            if (r3 == 0) goto L_0x0032
            com.google.ads.interactivemedia.v3.internal.xh r3 = r3.f24274a
            boolean r1 = r3.mo16755b(r1)
            if (r1 != 0) goto L_0x0031
            goto L_0x0032
        L_0x0031:
            return
        L_0x0032:
            long r1 = r0.f24256f
            long r1 = com.google.ads.interactivemedia.p367v3.internal.aeu.m18518ai(r1)
            long r12 = com.google.ads.interactivemedia.p367v3.internal.C6821bi.m19755b(r1)
            long r14 = r0.m22367l(r12)
            boolean r1 = r49.isEmpty()
            r16 = 0
            if (r1 == 0) goto L_0x004d
            r7 = r49
            r17 = r16
            goto L_0x005d
        L_0x004d:
            int r1 = r49.size()
            int r1 = r1 + -1
            r7 = r49
            java.lang.Object r1 = r7.get(r1)
            com.google.ads.interactivemedia.v3.internal.wc r1 = (com.google.ads.interactivemedia.p367v3.internal.C7382wc) r1
            r17 = r1
        L_0x005d:
            com.google.ads.interactivemedia.v3.internal.aba r1 = r0.f24259i
            int r8 = r1.mo14332l()
            com.google.ads.interactivemedia.v3.internal.we[] r5 = new com.google.ads.interactivemedia.p367v3.internal.C7384we[r8]
            r6 = 0
            r3 = 0
        L_0x0067:
            if (r3 >= r8) goto L_0x00b9
            com.google.ads.interactivemedia.v3.internal.xa[] r1 = r0.f24251a
            r1 = r1[r3]
            com.google.ads.interactivemedia.v3.internal.wx r2 = r1.f24247b
            if (r2 != 0) goto L_0x007f
            com.google.ads.interactivemedia.v3.internal.we r1 = com.google.ads.interactivemedia.p367v3.internal.C7384we.f24146a
            r5[r3] = r1
            r22 = r3
            r23 = r5
            r24 = r8
            r20 = r14
            r9 = 0
            goto L_0x00ab
        L_0x007f:
            long r18 = r1.mo16742d(r12)
            r20 = r14
            long r14 = r1.mo16748j(r12)
            r2 = r17
            r22 = r3
            r3 = r47
            r23 = r5
            r9 = 0
            r5 = r18
            r24 = r8
            r7 = r14
            long r1 = m22368m(r1, r2, r3, r5, r7)
            int r3 = (r1 > r18 ? 1 : (r1 == r18 ? 0 : -1))
            if (r3 >= 0) goto L_0x00a4
            com.google.ads.interactivemedia.v3.internal.we r1 = com.google.ads.interactivemedia.p367v3.internal.C7384we.f24146a
            r23[r22] = r1
            goto L_0x00ab
        L_0x00a4:
            com.google.ads.interactivemedia.v3.internal.xb r3 = new com.google.ads.interactivemedia.v3.internal.xb
            r3.<init>(r1, r14)
            r23[r22] = r3
        L_0x00ab:
            int r3 = r22 + 1
            r7 = r49
            r9 = r50
            r14 = r20
            r5 = r23
            r8 = r24
            r6 = 0
            goto L_0x0067
        L_0x00b9:
            r20 = r14
            r9 = 0
            com.google.ads.interactivemedia.v3.internal.xj r1 = r0.f24260j
            boolean r1 = r1.f24298d
            r14 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r1 != 0) goto L_0x00c9
            r5 = r14
            goto L_0x00ea
        L_0x00c9:
            com.google.ads.interactivemedia.v3.internal.xa[] r1 = r0.f24251a
            r1 = r1[r9]
            long r1 = r1.mo16748j(r12)
            com.google.ads.interactivemedia.v3.internal.xa[] r3 = r0.f24251a
            r3 = r3[r9]
            long r1 = r3.mo16745g(r1)
            long r3 = r0.m22367l(r12)
            long r1 = java.lang.Math.min(r3, r1)
            long r1 = r1 - r45
            r3 = 0
            long r1 = java.lang.Math.max(r3, r1)
            r5 = r1
        L_0x00ea:
            com.google.ads.interactivemedia.v3.internal.aba r2 = r0.f24259i
            r3 = r10
            r7 = r49
            r2.mo14322d(r3, r5, r7)
            com.google.ads.interactivemedia.v3.internal.xa[] r1 = r0.f24251a
            com.google.ads.interactivemedia.v3.internal.aba r2 = r0.f24259i
            int r2 = r2.mo14319a()
            r10 = r1[r2]
            com.google.ads.interactivemedia.v3.internal.vs r1 = r10.f24248c
            if (r1 == 0) goto L_0x0155
            com.google.ads.interactivemedia.v3.internal.xt r2 = r10.f24246a
            com.google.ads.interactivemedia.v3.internal.cy[] r1 = r1.mo16678e()
            if (r1 != 0) goto L_0x010d
            com.google.ads.interactivemedia.v3.internal.xq r1 = r2.mo16785n()
            goto L_0x010f
        L_0x010d:
            r1 = r16
        L_0x010f:
            com.google.ads.interactivemedia.v3.internal.wx r3 = r10.f24247b
            if (r3 != 0) goto L_0x0117
            com.google.ads.interactivemedia.v3.internal.xq r16 = r2.mo16782k()
        L_0x0117:
            r2 = r16
            if (r1 != 0) goto L_0x011d
            if (r2 == 0) goto L_0x0155
        L_0x011d:
            com.google.ads.interactivemedia.v3.internal.abx r3 = r0.f24255e
            com.google.ads.interactivemedia.v3.internal.aba r4 = r0.f24259i
            com.google.ads.interactivemedia.v3.internal.cy r25 = r4.mo14337q()
            com.google.ads.interactivemedia.v3.internal.aba r4 = r0.f24259i
            int r26 = r4.mo14320b()
            com.google.ads.interactivemedia.v3.internal.aba r4 = r0.f24259i
            java.lang.Object r27 = r4.mo14321c()
            com.google.ads.interactivemedia.v3.internal.xt r4 = r10.f24246a
            if (r1 == 0) goto L_0x013e
            java.lang.String r5 = r4.f24345c
            com.google.ads.interactivemedia.v3.internal.xq r2 = r1.mo16778c(r2, r5)
            if (r2 != 0) goto L_0x013e
            goto L_0x013f
        L_0x013e:
            r1 = r2
        L_0x013f:
            com.google.ads.interactivemedia.v3.internal.acb r24 = com.google.ads.interactivemedia.p367v3.internal.aqd.m19291s(r4, r1, r9)
            com.google.ads.interactivemedia.v3.internal.wb r1 = new com.google.ads.interactivemedia.v3.internal.wb
            com.google.ads.interactivemedia.v3.internal.vs r2 = r10.f24248c
            r22 = r1
            r23 = r3
            r28 = r2
            r22.<init>(r23, r24, r25, r26, r27, r28)
            r9 = r50
            r9.f24097a = r1
            return
        L_0x0155:
            r9 = r50
            r11 = 0
            long r18 = r10.f24249d
            r7 = 1
            int r1 = (r18 > r14 ? 1 : (r18 == r14 ? 0 : -1))
            if (r1 == 0) goto L_0x0163
            r8 = 1
            goto L_0x0164
        L_0x0163:
            r8 = 0
        L_0x0164:
            int r1 = r10.mo16743e()
            if (r1 != 0) goto L_0x016d
            r9.f24098b = r8
            return
        L_0x016d:
            long r22 = r10.mo16742d(r12)
            long r12 = r10.mo16748j(r12)
            r1 = r10
            r2 = r17
            r3 = r47
            r5 = r22
            r14 = r8
            r11 = 1
            r7 = r12
            long r1 = m22368m(r1, r2, r3, r5, r7)
            int r3 = (r1 > r22 ? 1 : (r1 == r22 ? 0 : -1))
            if (r3 >= 0) goto L_0x018f
            com.google.ads.interactivemedia.v3.internal.st r1 = new com.google.ads.interactivemedia.v3.internal.st
            r1.<init>()
            r0.f24262l = r1
            return
        L_0x018f:
            int r3 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1))
            if (r3 > 0) goto L_0x0299
            boolean r3 = r0.f24263m
            if (r3 == 0) goto L_0x019b
            int r3 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1))
            if (r3 >= 0) goto L_0x0299
        L_0x019b:
            if (r14 == 0) goto L_0x01a9
            long r3 = r10.mo16744f(r1)
            int r5 = (r3 > r18 ? 1 : (r3 == r18 ? 0 : -1))
            if (r5 >= 0) goto L_0x01a6
            goto L_0x01a9
        L_0x01a6:
            r9.f24098b = r11
            return
        L_0x01a9:
            long r12 = r12 - r1
            r3 = 1
            long r12 = r12 + r3
            long r3 = java.lang.Math.min(r3, r12)
            int r4 = (int) r3
            r5 = -1
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r3 = (r18 > r7 ? 1 : (r18 == r7 ? 0 : -1))
            if (r3 == 0) goto L_0x01cd
        L_0x01bd:
            if (r4 <= r11) goto L_0x01cd
            long r7 = (long) r4
            long r7 = r7 + r1
            long r7 = r7 + r5
            long r7 = r10.mo16744f(r7)
            int r3 = (r7 > r18 ? 1 : (r7 == r18 ? 0 : -1))
            if (r3 < 0) goto L_0x01cd
            int r4 = r4 + -1
            goto L_0x01bd
        L_0x01cd:
            boolean r3 = r49.isEmpty()
            if (r11 == r3) goto L_0x01d9
            r34 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L_0x01db
        L_0x01d9:
            r34 = r47
        L_0x01db:
            com.google.ads.interactivemedia.v3.internal.abx r3 = r0.f24255e
            int r7 = r0.f24254d
            com.google.ads.interactivemedia.v3.internal.aba r8 = r0.f24259i
            com.google.ads.interactivemedia.v3.internal.cy r8 = r8.mo14337q()
            com.google.ads.interactivemedia.v3.internal.aba r12 = r0.f24259i
            int r28 = r12.mo14320b()
            com.google.ads.interactivemedia.v3.internal.aba r12 = r0.f24259i
            java.lang.Object r29 = r12.mo14321c()
            com.google.ads.interactivemedia.v3.internal.xt r12 = r10.f24246a
            long r30 = r10.mo16744f(r1)
            com.google.ads.interactivemedia.v3.internal.xq r13 = r10.mo16747i(r1)
            java.lang.String r14 = r12.f24345c
            com.google.ads.interactivemedia.v3.internal.vs r15 = r10.f24248c
            r18 = 8
            if (r15 != 0) goto L_0x022b
            long r32 = r10.mo16745g(r1)
            r4 = r20
            boolean r4 = r10.mo16749k(r1, r4)
            if (r11 == r4) goto L_0x0212
            r6 = 8
            goto L_0x0213
        L_0x0212:
            r6 = 0
        L_0x0213:
            com.google.ads.interactivemedia.v3.internal.acb r26 = com.google.ads.interactivemedia.p367v3.internal.aqd.m19291s(r12, r13, r6)
            com.google.ads.interactivemedia.v3.internal.wf r4 = new com.google.ads.interactivemedia.v3.internal.wf
            r24 = r4
            r25 = r3
            r27 = r8
            r34 = r1
            r36 = r7
            r37 = r8
            r24.<init>(r25, r26, r27, r28, r29, r30, r32, r34, r36, r37)
            r1 = r9
            goto L_0x0296
        L_0x022b:
            r15 = r12
            r11 = r20
            r7 = r13
            r5 = 1
            r13 = 1
        L_0x0231:
            r47 = r8
            if (r13 >= r4) goto L_0x024c
            long r8 = (long) r13
            long r8 = r8 + r1
            com.google.ads.interactivemedia.v3.internal.xq r6 = r10.mo16747i(r8)
            com.google.ads.interactivemedia.v3.internal.xq r6 = r7.mo16778c(r6, r14)
            if (r6 != 0) goto L_0x0242
            goto L_0x024c
        L_0x0242:
            int r5 = r5 + 1
            int r13 = r13 + 1
            r8 = r47
            r9 = r50
            r7 = r6
            goto L_0x0231
        L_0x024c:
            long r8 = (long) r5
            long r8 = r8 + r1
            r13 = -1
            long r8 = r8 + r13
            long r32 = r10.mo16745g(r8)
            long r13 = r10.f24249d
            r16 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r13 > r16 ? 1 : (r13 == r16 ? 0 : -1))
            if (r4 == 0) goto L_0x0269
            int r4 = (r13 > r32 ? 1 : (r13 == r32 ? 0 : -1))
            if (r4 > 0) goto L_0x0269
            r36 = r13
            goto L_0x026b
        L_0x0269:
            r36 = r16
        L_0x026b:
            boolean r4 = r10.mo16749k(r8, r11)
            r6 = 1
            if (r6 == r4) goto L_0x0276
            r4 = r15
            r6 = 8
            goto L_0x0278
        L_0x0276:
            r4 = r15
            r6 = 0
        L_0x0278:
            com.google.ads.interactivemedia.v3.internal.acb r26 = com.google.ads.interactivemedia.p367v3.internal.aqd.m19291s(r4, r7, r6)
            long r6 = r4.f24346d
            com.google.ads.interactivemedia.v3.internal.vz r4 = new com.google.ads.interactivemedia.v3.internal.vz
            r24 = r4
            long r6 = -r6
            r41 = r6
            com.google.ads.interactivemedia.v3.internal.vs r6 = r10.f24248c
            r43 = r6
            r25 = r3
            r27 = r47
            r38 = r1
            r40 = r5
            r24.<init>(r25, r26, r27, r28, r29, r30, r32, r34, r36, r38, r40, r41, r43)
            r1 = r50
        L_0x0296:
            r1.f24097a = r4
            return
        L_0x0299:
            r1 = r9
            r1.f24098b = r14
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p367v3.internal.C7409xc.mo16698e(long, long, java.util.List, com.google.ads.interactivemedia.v3.internal.vu):void");
    }

    /* renamed from: f */
    public final void mo16699f(C7372vt vtVar) {
        C7048jt d;
        if (vtVar instanceof C7381wb) {
            int o = this.f24259i.mo14335o(((C7381wb) vtVar).f24091f);
            C7407xa xaVar = this.f24251a[o];
            if (xaVar.f24247b == null && (d = xaVar.f24248c.mo16677d()) != null) {
                this.f24251a[o] = xaVar.mo16740b(new C7404wy(d, xaVar.f24246a.f24346d));
            }
        }
        C7413xg xgVar = this.f24258h;
        if (xgVar != null) {
            xgVar.f24274a.mo16757d(vtVar);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0029, code lost:
        r8 = r6.f24251a[r6.f24259i.mo14335o(r7.f24091f)];
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo16700g(com.google.ads.interactivemedia.p367v3.internal.C7372vt r7, boolean r8, java.lang.Exception r9, long r10) {
        /*
            r6 = this;
            r0 = 0
            if (r8 != 0) goto L_0x0004
            return r0
        L_0x0004:
            com.google.ads.interactivemedia.v3.internal.xg r8 = r6.f24258h
            r1 = 1
            if (r8 == 0) goto L_0x0013
            com.google.ads.interactivemedia.v3.internal.xh r8 = r8.f24274a
            boolean r8 = r8.mo16756c(r7)
            if (r8 != 0) goto L_0x0012
            goto L_0x0013
        L_0x0012:
            return r1
        L_0x0013:
            com.google.ads.interactivemedia.v3.internal.xj r8 = r6.f24260j
            boolean r8 = r8.f24298d
            if (r8 != 0) goto L_0x0056
            boolean r8 = r7 instanceof com.google.ads.interactivemedia.p367v3.internal.C7382wc
            if (r8 == 0) goto L_0x0056
            boolean r8 = r9 instanceof com.google.ads.interactivemedia.p367v3.internal.aco
            if (r8 == 0) goto L_0x0056
            com.google.ads.interactivemedia.v3.internal.aco r9 = (com.google.ads.interactivemedia.p367v3.internal.aco) r9
            int r8 = r9.f20320a
            r9 = 404(0x194, float:5.66E-43)
            if (r8 != r9) goto L_0x0056
            com.google.ads.interactivemedia.v3.internal.xa[] r8 = r6.f24251a
            com.google.ads.interactivemedia.v3.internal.aba r9 = r6.f24259i
            com.google.ads.interactivemedia.v3.internal.cy r2 = r7.f24091f
            int r9 = r9.mo14335o(r2)
            r8 = r8[r9]
            int r9 = r8.mo16743e()
            r2 = -1
            if (r9 == r2) goto L_0x0056
            if (r9 == 0) goto L_0x0056
            long r2 = r8.mo16741c()
            r8 = r7
            com.google.ads.interactivemedia.v3.internal.wc r8 = (com.google.ads.interactivemedia.p367v3.internal.C7382wc) r8
            long r4 = r8.mo16702i()
            long r8 = (long) r9
            long r2 = r2 + r8
            r8 = -1
            long r2 = r2 + r8
            int r8 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r8 > 0) goto L_0x0053
            goto L_0x0056
        L_0x0053:
            r6.f24263m = r1
            return r1
        L_0x0056:
            r8 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r2 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r2 == 0) goto L_0x006e
            com.google.ads.interactivemedia.v3.internal.aba r8 = r6.f24259i
            com.google.ads.interactivemedia.v3.internal.cy r7 = r7.f24091f
            int r7 = r8.mo14335o(r7)
            boolean r7 = r8.mo14339s(r7, r10)
            if (r7 == 0) goto L_0x006e
            return r1
        L_0x006e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p367v3.internal.C7409xc.mo16700g(com.google.ads.interactivemedia.v3.internal.vt, boolean, java.lang.Exception, long):boolean");
    }

    /* renamed from: h */
    public final void mo16701h() {
        for (C7407xa xaVar : this.f24251a) {
            C7371vs vsVar = xaVar.f24248c;
            if (vsVar != null) {
                vsVar.mo16679f();
            }
        }
    }

    /* renamed from: i */
    public final void mo16712i(C7416xj xjVar, int i) {
        try {
            this.f24260j = xjVar;
            this.f24261k = i;
            long e = xjVar.mo16764e(i);
            ArrayList k = m22366k();
            for (int i2 = 0; i2 < this.f24251a.length; i2++) {
                C7407xa[] xaVarArr = this.f24251a;
                xaVarArr[i2] = xaVarArr[i2].mo16739a(e, (C7426xt) k.get(this.f24259i.mo14334n(i2)));
            }
        } catch (C7291st e2) {
            this.f24262l = e2;
        }
    }

    /* renamed from: j */
    public final void mo16713j(aba aba) {
        this.f24259i = aba;
    }
}
